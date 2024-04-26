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

TRAITEMENT
ECRIRE "Veuillez saisir votre âge."
LIRE age
	SI age<5 ALORS
	ECRIRE "Vous êtes trop jeune."
	SI 5<age<6 ALORS
	ECRIRE "Vous appartenez à la catégorie 'Débutant'."
	SI 7<age<8 ALORS
	ECRIRE "Vous appartenez à la catégorie 'Poussin'."
	SI 9<age<10 ALORS
	ECRIRE "Vous appartenez à la catégorie 'Benjamin'."
	SI 11<age<12 ALORS
	ECRIRE "Vous appartenez à la catégorie 'Pupille'."
	SI 13<age<14 ALORS
	ECRIRE "Vous appartenez à la catégorie 'Minime'."
	SI 15<age<16 ALORS
	ECRIRE "Vous appartenez à la catégorie 'Cadet'."
	SI 17<age<18 ALORS
	ECRIRE "Vous appartenez à la catégorie 'Junior'."
	SI 19<age<34 ALORS
	ECRIRE "Vous appartenez à la catégorie 'Sénior'."
	SINON
	ECRIRE "Vous appartenez à la catégorie 'Vétéran'."
	FIN SI
```
