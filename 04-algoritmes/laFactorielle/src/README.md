# Exercice 3.5 : La factorielle

Écrire un algorithme qui demande à l’utilisateur de saisir un nombre, et qui calcule et affiche sa factorielle.

Par exemple, si l’utilisateur saisit le nombre 8, le programme doit afficher :

```
La factorielle de 8 est: 40320
```

NB : la factorielle de 8, notée 8!, vaut 1 x 2 x 3 x 4 x 5 x 6 x 7 x 8


```
VARIABLES

x est un LONG
produit est un LONG
i est un ENTIER

TRAITEMENT

ECRIRE "3.5 : La factorielle."
ECRIRE "Saisissez un nombre :"
LIRE x

factorielle <-- 1
	POUR i = 1, i <= x, i++
	factorielle <-- *= i
	FIN POUR
ECRIRE "La factorielle de ", x , " est : ", factorielle	

```
