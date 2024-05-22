# 3.7 : Et le plus grand est... encore

Réécrire l’algorithme précédent, mais cette fois-ci on ne connaît pas d’avance combien l’utilisateur souhaite saisir de nombres. La saisie des nombres s’arrête lorsque l’utilisateur entre un zéro :

Écrire un algorithme qui demande successivement 20 nombres à l’utilisateur, et qui lui indique ensuite quel est le plus grand parmi ces 20 nombres.

```
Exemple de fonctionnement du programme :
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
i est un ENTIER
ligne est un ENTIER
fin est un ENTIER

TRAITEMENT

i <-- 0
x <-- 0

FAIRE
	ECRIRE "Entrez le nombre numéro , (i+1), :"
	LIRE x
	i <-- ++
		SI ( x > fin) ALORS
		fin <-- x
		ligne <-- i
		FIN SI
	TANT QUE ( x != 0)
	FIN TANT QUE
	FIN FAIRE

ECRIRE "Le plus grand des nombres saisis est : , fin, . ", fin, était le nombre numéro, ligne, ."

```
