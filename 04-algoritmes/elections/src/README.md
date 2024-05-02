# Exercice 2.6 : Elections

Les élections législatives, en Guignolerie Septentrionale, obéissent à la règle suivante :

Lorsque l’un des candidats obtient plus de 50% des suffrages, il est élu dès le premier tour.

En cas de deuxième tour, peuvent participer uniquement les candidats ayant obtenu au moins 12.5% des voix au premier tour.
Vous devez écrire un algorithme qui permet la saisie des scores de quatre candidats au premier tour.

Cet algorithme traitera ensuite le candidat numéro 1 (et uniquement lui) : il dira s’il est élu, battu, s’il se trouve en ballottage favorable (il participe au second tour en étant arrivé en tête à l’issue du premier tour) ou défavorable (il participe au second tour sans avoir été en tête au premier tour).



```
VARIABLES

c1 est un REEL
c2 est un REEL
c3 est un REEL
c4 est un REEL
resultat est un REEL
triche est un REEL

TRAITEMENT
ECRIRE "Saisir le score en pourcentage du candidat numéro 1"
LIRE c1

ECRIRE "Saisir le score en pourcentage du candidat numéro 2"
LIRE c2


ECRIRE "Saisir le score en pourcentage du candidat numéro 3"
LIRE c3


ECRIRE "Saisir le score en pourcentage du candidat numéro 4"
LIRE c4


resultat <-- c1 / 100

SI resultat > 0.5 ALORS
	ECRIRE "Le candidat numéro 1 est élu"

SINON SI resultat < 0.125 ALORS
	ECRIRE "Le candidat numéro 1 est battu"

SINON SI c1 > c2 ET c1 > c3 ET c1 > c4
	ECRIRE "Le candidat numéro 1 va au second tour en ballotage favorable"

SINON
	ECRIRE "Le candidat numéro 1 va au second tour en ballotage défavorable"

FIN SI

SI triche > 100
	ECRIRE "Quelqu'un tente de voler les élections!"
	FIN PROGRAMME
FIN SI


```