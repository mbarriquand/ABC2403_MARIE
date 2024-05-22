# Exercice 3.6 : Et le plus grand est…

Écrire un algorithme qui demande successivement 20 nombres à l’utilisateur, et qui lui indique ensuite quel est le plus grand parmi ces 20 nombres.

Exemple de fonctionnement du programme :

```
Entrez le nombre numéro 1 : 12
Entrez le nombre numéro 2 : 14
etc...
Entrez le nombre numéro 20: 6

Résultat : 
Le plus grand des nombres saisis est : 14.
14 était le nombre numéro 2.

```


```
VARIABLES
x est un ENTIER
y est un ENTIER
ligne est un ENTIER
i est un ENTIER

ECRIRE "3.6 : Et le plus grand est..."

i <-- 0
	POUR (i = 1; 1 <= 20; i++)
		ECRIRE "Entrez le nombre numéro", i, "."
		LIRE x
		
		SI (x > y) ALORS
		y <-- x
		ligne <-- i
		FIN SI
	ECRIRE "Le plus grand des nombres saisis est ", y, ". ", y, " était le nombre numéro ", ligne, "."