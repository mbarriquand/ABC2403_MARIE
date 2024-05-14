#Exercice 3.1 : La bonne plage de sable

Écrire un algorithme qui demande à l’utilisateur de saisir un nombre compris entre 1 et 3 jusqu’à ce que la réponse convienne.

Lorsque la réponse convient, afficher le nombre saisi suivi de “Bravo, vous avez réussi !”.

```
VARIABLES

n est un ENTIER

TRAITEMENT
ECRIRE "3.1 : La bonne plage de sable"
ECRIRE "Saisissez un nombre"
LIRE n
	SI n >=1 ET n<=3 ALORS
	ECRIRE "Bravo, vous avez réussi!"
	SINON
	ECRIRE "Saisissez un autre nombre"
	LIRE n
	FIN SI
```
