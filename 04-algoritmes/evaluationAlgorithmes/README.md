# Evaluation Algorithmes

Décrivez et codez l'algorithme (pseudo-code ou organigramme + code JAVA) répondant à la problématique ci-dessous.

Soit le tableau suivant :

```
int[] numbers = [2,4,1,8,6,14,23,25,7,42];
```

Créez un programme qui calcule et affiche :

- La moyenne des valeurs du taleau.
- La valeur la plus grande dans le tableau, élevée au carré.

Résultat attendu :

```
Bienvenue dans le programme de calcul du tableau d'entier
Moyenne des valeurs du tableau : 13.2
Valeur la plus grand (42) élevée au carré : 1764
```

## PSEUDO-CODE

```
DEBUT PROGRAMME


VARIABLES

numbers est un TABLEAU D'ENTIER
total est un ENTIER
moyenne est un REEL
plusGrand est un ENTIER
carre est un ENTIER

TRAITEMENT

numbers [] <-- [2,4,1,8,6,14,23,25,7,42]
tri numbers

ECRIRE "Bienvenue dans le programme de calcul du tableau d'entier"
	POUR (i = 0, i < numbers.length, incrémentation)
	total <-- += numbers[i]
	moyenne <-- total / numbers.length
	FIN POUR
	
plusGrand = numbers[9]
carre = plusGrand * plusGrand
	
ECRIRE "Moyenne des valeurs du tableau :", moyenne
ECRIRE "Valeur la plus grande ", plusGrand, " élevée au carré :", carre
FIN PROGRAMME
```


```
