# Etats de la lumière d'un habitacle

La lumière d'un véhicule s'éclaire si une des deux portes avant est ouverte (capteurs pd et pg à coupure de circuit) ou si l'interrupteur du plafonnier est appuyé.

Présentez :
•	Les propositions
•	La table de vérité
•	L'expression booléenne simplifiée

-	La lumière est allumée
-	La lumière est éteinte
-	La portière droite est ouverte
-	La portière droite est fermée
-	La portière gauche est ouverte
-	La portière gauche est fermée
-	L’interrupteur est appuyé
-	L'interrupteur n’est pas appuyé

P1 : la lumière est allumée

P2 : la portière gauche est ouverte

P3 : la portière droite est ouverte

P4 : on appuie sur l’interrupteur

<br>
<br>

| Entrée | Entrée | Entrée | Sortie |
| --- | --- | --- | --- |
| P1 | P2 | P3 | P4 |
| 0 | 0 | 0 | 0 | 
| 1 | 1	| 0 | 0 |
| 1	| 0	| 1	| 0 |
| 1	| 0	| 0	| 1 |
|1	| 1 | 1	| 0 |
| 1	| 1	| 1	| 1 |
|1	| 0 | 1 | 1 |
| 1 | 1 | 0 | 1 |


<i>La lumière du véhicule est allumée si (la porte gauche est ouverte OU la porte droite est ouverte) OU si l’interrupteur est appuyé.<i>

P1 = (P2+P3)+P4
