# Exercice 3.2 : La bonne plage de galets

Écrire un algorithme qui demande un nombre compris entre 10 et 20, jusqu’à ce que la réponse convienne.

En cas de réponse supérieure à 20, on fera apparaître un message : « Plus petit ! », et inversement, « Plus grand ! » si le nombre est inférieur à 10.

Lorsque la réponse convient, afficher le nombre saisi suivi de “Yes, you did it !”.

```
VARIABLES

nombre est un ENTIER

TRAITEMENT

ECRIRE "La bonne plage de galets"

	FAIRE
		ECRIRE "Saisissez un nombre"
		LIRE nombre
			SI nombre < 10 ALORS
				ECRIRE "Plus grand !"
			SINON
				ECRIRE "Plus petit !"
			FIN SI
	TANT QUE nombre < 10 ET nombre > 20

ECRIRE "Yes, you did it !"
```


