# Exercice 3.1 : La bonne plage de sable

Écrire un algorithme qui demande à l’utilisateur de saisir un nombre compris entre 1 et 3 jusqu’à ce que la réponse convienne.

Lorsque la réponse convient, afficher le nombre saisi suivi de “Bravo, vous avez réussi !”.

```
VARIABLES

nombre est un ENTIER
compteur est un ENTIER

TRAITEMENT

ECRIRE "3.1 : La bonne plage de sable"

	FAIRE
		SI compteur <=1
			ECRIRE "Saisissez un nombre entre 1 et 3"
			LIRE nombre 
		SINON
			ECRIRE "Erreur ! Resaisissez un nombre entre 1 et 3"
			LIRE nombre
		FIN SI
	TANT QUE nombre < 1 OU nombre > 3 
	FIN FAIRE
		
ECRIRE "Bravo, vous avez réussi!"

```
