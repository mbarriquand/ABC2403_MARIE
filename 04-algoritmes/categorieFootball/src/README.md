# Exercice 2.3
Écrire un algorithme qui demande à l’utilisateur de saisir un âge et l’informe ensuite à quelle catégorie il appartient :

- Trop jeune : Moins de 5 ans
- Débutant : De 5 à 6 ans
- Poussin : De 7 à 8 ans
- Benjamin : De 9 à 10 ans
- Pupille : De 11 à 12 ans
- Minime : De 13 à 14 ans
- Cadet : De 15 à 16 ans
- Junior : De 17 à 18 ans
- Sénior : De 19 à 34 ans
- Vétéran : 35 ans et +

```
VARIABLES
age est un NOMBRE ENTIER
cat est une CHAINE DE CARACTERE

TRAITEMENT
ECRIRE "Veuillez saisir votre âge."
cat <-- "Vous appartenez à la catégorie: ";
LIRE age
	SI age<5 ALORS
	ECRIRE "Vous êtes trop jeune."
	SI age>5 ALORS
	ECRIRE cat, "'Débutant'."
	SI age>7 ALORS
	ECRIRE cat, "'Poussin'."
	SI age>9 ALORS
	ECRIRE cat, "'Benjamin'."
	SI age>11 ALORS
	ECRIRE cat, "'Pupille'."
	SI age>13 ALORS
	ECRIRE cat, "'Minime'."
	SI age>15 ALORS
	ECRIRE cat, "'Cadet'."
	SI age>17 ALORS
	ECRIRE cat, "'Junior'."
	SI age>19 ALORS
	ECRIRE cat, "'Sénior'."
	SI age>35 ALORS
	ECRIRE cat, "'Vétéran'."
	SINON
	ECRIRE "Vous êtes trop jeune."
	FIN SI
```

Sauf que... ça ne marche ABSOLUMENT PAS ! (ah bah si avec le 'else if')

Deuxième tentative, avec le switch ;


