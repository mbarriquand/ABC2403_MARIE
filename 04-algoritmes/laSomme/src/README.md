# Exercice 3.4 : La somme

Écrire un algorithme qui demande un nombre de départ, et qui calcule et affiche la somme des entiers jusqu’à ce nombre.

Par exemple, si l’utilisateur saisit le nombre 5, le programme doit afficher :

```
La somme des nombres jusque 5 est: 15

```

NB : on souhaite afficher uniquement le résultat, pas la décomposition du calcul.

```
VARIABLES

x est un ENTIER
somme est un ENTIER


TRAITEMENT

ECRIRE "3.4 : La somme."
ECRIRE "Saisissez un nombre"
LIRE x
somme <-- 0
	POUR 
	i = 1, i <= x, i++
	somme <-- += i
	FIN POUR
	
ECRIRE "La sommes des nombres jusqu'à ", x, " est : ", somme

```
