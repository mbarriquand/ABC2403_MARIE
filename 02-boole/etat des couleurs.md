# Etat des couleurs

Soient 3 couleurs : 


Cb 	= 	couleur de base 

Cad1 	= 	1ère couleur additionnelle  

Cad2 	= 	2ème couleur additionnelle  

Cr 	= 	couleur résultat 

 

Pour chacune des affirmations suivantes, vous présenterez : 

La table de vérité à partir des propositions données 

L'expression booléenne simplifiée. Pour cet énoncé, vous disposez des fonctions logiques ET (.), OU (+) et NON () 

## Le résultat attendu est Cr = couleur très claire. 

Cr est de type "très claire" si les 2 couleurs additionnelles sont blanches. Le blanc étant exclu de cette catégorie, la couleur de base ne doit pas être blanche. 

Les propositions sont : 

P1 : Cr = très claire 

P2 : Cb = bleu 

P3 : Cad1 = blanc 

P4 : Cad2 = blanc 

| Entrée | Entrée | Entrée | Sortie |
| --- | --- | --- | --- |
| P4 | P2 | P3 | P1 |
| 1 | 1 | 1 | 1 |
| 0 | 0 | 0 | 0 |
| 0 | 1 | 1 | 0 |
| 1 | 1 | 0 | 0 |
| 0 | 0 | 1 | 0 |
| 0 | 1 | 0 | 0 |
 

`Cr = Cb.Cad1.Cad2`

` P1 = P2.P3.P4 ` 

## Algoritme simplifié

<b>VARIABLE</b>

P1 est un booleen

P2 est un booleen

P3 est un booleen

<b>TRAITEMENT</b>

SI P3 est VRAI ET P4 est VRAI ALORS :

    ECRIRE 'la couleur est très claire'

SINON :

    ECRIRE 'la couleur n'est pas très claire'



## Le résultat attendu est Cr = couleur claire. 

Cr est clair si une seule des 2 couleurs additionnelles est blanche. Le blanc étant exclu de cette catégorie, la couleur de base ne doit pas être blanche.  

Les propositions sont : 

P1 : Cr = claire 

P2 : Cb = rouge 

P3 : Cad1 = blanc 

P4 : Cad2 = blanc 

 

| Entrée | Entrée | Entrée | Sortie |
| --- | --- | --- | --- |
| P4 | P2 | P3 | P1 |
| 1 | 1 | 0 | 1 | 
| 1 | 1 | 1 | 0 |
| 0 | 0 | 1 | 1 |
| 0 | 0 | 0 | 1 |
| 0 | 1 | 1 | 1 |
| 0 | 1 | 0 | 1 |
 

`Cr = Cb.(Cad1+Cad2)`

`P1 = P2.(P3+P4)`

  ## Le résultat attendu est Cr = mauve. 

Cr est mauve si Cb est bleue et si l'une des 2 couleurs additionnelles est rouge et l'autre blanche. Lors de cette opération de mélange, les couleurs additionnelles ne peuvent être que rouges ou blanches.  

Les propositions sont : 

P1 : Cr = mauve 

P2 : Cb = bleu 

P3 : Cad1 = blanc 

P4 : Cad2 = rouge 

| Entrée | Entrée | Entrée | Sortie |
| --- | --- | --- | --- |
| P4 | P2 | P3 | P1 |
| 1 | 1 | 1 | 1 |
| 0 | 1 | 0 | 0 |
| 0 | 1 | 1 | 0 |
| 0 | 1 | 0 | 1 |
| 0 | 0 | 1 | 1 |
| 0 | 0 | 0 | 1 |
| 0 | 0 | 1 | 0 |
| 0 | 0 | 0 | 0 |

`Cr = Cb.Cad1.Cad2`

`P1 = P2.P3.P4 `


## Le résultat attendu est Cr = violet. 

Cr est violet si Cb est bleue et si les 2 couleurs additionnelles sont rouges ou bleues, mais pas toutes les 2 bleues. Lors de cette opération de mélange, les couleurs additionnelles ne peuvent être que rouges ou bleues.  

Les propositions sont : 

P1 : Cr = violet 

P2 : Cb = bleu 

P3 : Cad1 = bleu 

P4 : Cad2 = rouge 

 

| Entrée | Entrée | Entrée | Sortie |
| --- | --- | --- | --- |
| P4 | P2 | P3 | P1 |
| 1 | 1 | 0 | 1 | 
| 1 | 0 | 1 | 1 |
| 0 | 0 | 0 | 0 |
| 0 | 1 | 1 | 1 |
| 0 | 1 | 1 | 0 |
| 0 | 0 | 0 | 1 |

`Cr = Cad2.(Cad1+Cb)`

`P1 = P4.(P2+P3) `
