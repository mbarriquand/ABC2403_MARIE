# Exercice 2.2
Écrire un algorithme qui demande à l’utilisateur de saisir 2 nombres entiers et l’informe ensuite si leur produit est positif ou négatif.

```
VARIABLES
	A est un NOMBRE ENTIER
	B est un NOMBRE ENTIER
	C est un NOMBRE REEL

TRAITEMENT
ECRIRE "Veuillez saisir un nombre entier"
LIRE A
ECRIRE "Veuillez saisir un nombre entier"
LIRE B
C <-- A * B
	SI C>0 ALORS
	ECRIRE "Le produit de ", A, " et ", B, " est positif."
	SINON
	ECRIRE "Le produit de ", A, " et ", B, " est négatif."
	FIN SI
```