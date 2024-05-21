# Exercice 3.3 : Les nombres suivants

Écrire un algorithme qui demande un nombre de départ, et qui ensuite affiche les dix nombres suivants.

Par exemple, si l’utilisateur entre le nombre 17, le programme affichera :

```
Les 10 nombres après 17 sont:
18, 19 ,20 ,21 ,22 ,23 ,24 ,25 ,26 ,27
```

Écrire cet algorithme dans un premier temps avec une boucle tant que, puis écrivez une 2nde version avec une boucle pour.

## VERSION TANT QUE

```
VARIABLES

x est un ENTIER
y est un ENTIER
compteur est un ENTIER


TRAITEMENT

ECRIRE "3.3 : Les nombres suivants."
ECRIRE "Saisissez un nombre de départ"
LIRE nombre
ECRIRE "Les 10 nombres après ", x, " sont  :"
compteur <-- 1
		
		TANT QUE (compteur <=10)
		y <-- x + compteur
			ECRIRE y
		compteur <-- ++
		FIN TANT QUE
```

## VERSION POUR

```
VARIABLES

x est un ENTIER
y est un ENTIER
i est un ENTIER


TRAITEMENT

ECRIRE "3.3 : Les nombres suivants."
ECRIRE "Saisissez un nombre de départ"
LIRE nombre
ECRIRE "Les 10 nombres après ", x, " sont  :"

	POUR i = 10, i <=10, i++
	y <-- x + i
		ECRIRE y
	FIN POUR
```
