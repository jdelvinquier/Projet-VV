# Projet-Validation & Vérification
Test des fonctionnalités Undo-Redo

##Pour que le programme de test fonctionne parfaitement :
  - Il faut être en résolution 1920*1080 sur Windows 7 pour que tout soit fonctionnel
  
  (Le UIanalyzer n'arrive pas à capturer les boutons "Grille perso", "Grille standard" et "Aucune grille", ces positions sont codées "en dur", le reste des boutons est bien analysé)
  
  - Modifier la variable projectPath dans la classe Launcher (chemin absolue vers le dossier projet)
  - Lancer une première fois le .jar de LaTeXDraw et le mettre en plein écran
  - Lancer le programme dans le package test, vous pouvez essayer différentes longueurs avec différents nombres de Undo/Redo
  
##Objectifs initiaux du projet :

L'objectif principal de ce projet était d'automatiser au maximum le test d'une Interface Graphique Utilisateur pour une application codée en Java Swing. Plus précisément, la fonctionnalités Undo-Redo d'une de ces applications. C'est-à-dire qu'il fallait valider le fait que :
	- Le Undo amène l'application dans l'état où elle se trouvait précédemment
	- Le Redo ramène l'application dans l'état où elle se trouvait avant le Undo

La première étape a été de découvrir manuellement tous les boutons qui interagissent avec les fonctionnalités Undo-Redo de LaTeXDraw. En effet, la plupart des contrôles n'ont aucun effet sur le Undo-Redo, il a donc fallu dans un premier temps lister cet ensemble.

##Architecture du projet :

On peut compter 5 classes principales JAVA pour ce projet:
- ActionPerformer
- AbstractButton
- ActionList
- Sequence
- UIanalyzer
	
La classe ActionPerformer est celle qui va effectuée les actions sur la GUI, elle étend donc la classe java.awt.Robot. C'est donc cette classe qui se charge d'exécuter les séquences tests ainsi que de capturer l'état de l'application via des captures d'écran. Les captures sont prises dans le dossier "/states/" du projet, elles permettent la comparaison entre le résultat attendu (tag "_Expected") et celui véritable qui à lieu après un Undo ou un Redo (tag "_Result").
	
La classe AbstractButton est la classe représentant les boutons ainsi que toutes leurs informations associées. En effet, chaque bouton peut demander une interaction totalement différente avec l'UI. Par exemple, le bouton "Point" demande un simple clique dans le canvas de dessin alors que le bouton "Rectangle" requiert un drag-and-drop. Ainsi, l'ensemble des contrôles que l'ont souhaite tester implémentent cette classe abstraite afin que l'ActionPerformer sache quelles actions correspondent à quels contrôles. Cette classe contient les méthodes abstraites bool needCanvasDND() et int needCanvasClick() qui indiquent au Robot quoi faire.

La classe ActionList est la classe contenant l'ensemble des actions qu'il est possible de réaliser sur la GUI, elle contient donc surtout une liste d'AbstractButton. Cette classe est modifiée par l'UIanalyzer et aide à la construction de séquences aléatoires.

La classe Sequence contient également une liste d'actions. A partir des paramètres fournis à son constructeur et à la méthode .buildNew(int,int) elle va générer une séquence cohérente de test pour les fonctionnalités Undo-Redo. Cette génération se fait à l'aide de la classe ActionList en sélectionnant des indices aléatoires. Cette classe est ensuite passée en paramètre à la méthode .execute(Sequence) de la classe ActionPerformer.

L'UIanalyzer est la classe transmettant les informations sur les coordonnées des boutons à l'écran. Elle explore les composants que l'on souhaite dans une instance JFrame de LaTeXDraw et règle les coordonnées des différentes classes qui étendent AbstractButton. Cependant, nous n'avons pas réussi à capturer ces positions pour le WidgetMiniToolBar pour les actions "Grille personnalisée" "Grille standard" et "None", ces positions sont donc codées "en dur" dans ces classes respectives. L'inconvénient est que cela réduit la portabilité de l'application en la rendant uniquement fonctionnelle pour une résolution donnée.

##Phases de test automatisées :

Nous avons réussi à automatiser :
- L'analyse du GUI : capture de la position des boutons que l'on souhaite sur la GUI
- La génération de cas test cohérents pour les fonctionnalités que l'on souhaite tester (dans ce cas, Undo-Redo)
- L'exécution des séquences de test sur le GUI
- La capture des états de l'application aux bons moments

Cependant, malgrè de nombreux essais nous n'avons pas réussi à mettre en place l'automatisation de la comparaison entre l'état attendu et l'état résultant. En effet, bien qu'il existe des librairies de comparaison d'image, il y a quasiment systématiquement un offset de quelques pixels entre la capture résultante et celle attendue ce qui rend la comparaison pixel à pixel impossible.

##Objectifs validés du projet :

Nous avons remplit une majorité des objectifs du projet, cependant certains aspects peuvent être améliorés :

- Par exemple, notre UIanalyzer ne parcours pas les WidgetMiniToolBar, ce qui nuit à la portabilité de notre programme test ou bien à la complétude de nos tests.
- De la même manière, la génération des séquences de test est automatique mais elle pourrait comprendre plus d'options, actuellement on ne peut que préciser la longueur du test et le nombre de Undo-Redo successifs que l'on souhaite exécuter, à partir de ce générateur on peut facilement mettre en place de longues séquences totalement aléatoires mais toujours cohérentes en "appendant" plusieurs séquences successives généré par la classe actuelle.
- Et comme précisé ci-dessus, nous souhaitions comparer les états via la comparaison des screenshots, mais nous nous sommes rendus compte de la difficulté de cette étape après coup

Par contre ces aspects du projets sont remplis :

- Exploration de la JFrame et récupération de la position des composants voulus
- Simulation des actions identique au comportement d'un utilisateur réel
- Génération de tests case cohérents avec les fonctionnalités testées
- Capture des états au bon moment et ces états sont écrits dans des fichier
- Comparaison "manuelle" des états attendus & résultants  très aisée (car visuelle)

##Ce que l'on a retenu du projet :

Lors de ce projet, nous nous sommes rendus compte de la difficulté d'adapter le comportement de notre programme test à celui attendu par le programme testé. Chaque bouton peut demander un comportement de l'utilisateur différent, ce qui rend laborieux la programmation du Robot simulant les actions sur la GUI.
De plus, il est difficile d'avoir un programme de test de GUI complet fonctionnant sur toutes les configurations possibles. En effet, comme dit précédemment si certaines actions du Robot sont codées en dur, alors ces actions deviennent incompatibles avec une résolution autre.
Une autre difficulté dont nous nous sommes rendus compte est le fait que dans une GUI, certaines actions ne peuvent être déclenchées uniquement après une certaine séquence d'action, ce qui rend la génération automatique de test beaucoup plus complexe qu'un programme en ligne de commande par exemple.
