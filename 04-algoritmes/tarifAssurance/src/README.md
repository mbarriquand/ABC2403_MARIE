# Exercice 2.7 : Tarif Assurance
Une compagnie d’assurance automobile propose à ses clients quatre familles de tarifs identifiables par une couleur, du moins au plus onéreux :

- Tarifs bleu, vert, orange et rouge.

Le tarif dépend de la situation du conducteur :

- Un conducteur de moins de 25 ans et titulaire du permis depuis moins de deux ans, se voit attribuer le tarif rouge, si toutefois il n’a jamais été responsable d’accident. Sinon, la compagnie refuse de l’assurer.

- Un conducteur de moins de 25 ans et titulaire du permis depuis plus de deux ans, ou de plus de 25 ans mais titulaire du permis depuis moins de deux ans a le droit au tarif orange s’il n’a jamais provoqué d’accident, ou le tarif rouge s’il a été repsonsable d’un accident, sinon il est refusé.

- Un conducteur de plus de 25 ans titulaire du permis depuis plus de deux ans bénéficie du tarif vert s’il n’est à l’origine d’aucun accident et du tarif orange pour un accident, du tarif rouge pour deux accidents, et refusé au-delà

De plus, pour encourager la fidélité des clients acceptés, la compagnie propose un contrat de la couleur immédiatement la plus avantageuse s’il est assuré depuis plus de cinq ans. Ainsi, s’il satisfait à cette exigence, un client normalement “vert” devient “bleu”, un client normalement “orange” devient “vert”, et le “rouge” devient orange.

Ecrire l’algorithme permettant de saisir les données nécessaires (sans contrôle de saisie) et de traiter ce problème. Avant de se lancer à corps perdu dans cet exercice, on pourra réfléchir un peu et s’apercevoir qu’il est plus simple qu’il n’en a l’air (cela s’appelle faire une analyse !)…

```
VARIABLES

age est un ENTIER
permis est un ENTIER
accident est un ENTIER
fidelite est un ENTIER
tarif est une CHAINE DE CARACTERE
bleu est une CHAINE DE CARACTERE
vert est une CHAINE DE CARACTERE
orange est une CHAINE DE CARACTERE
rouge est une CHAINE DE CARACTERE


TRAITEMENT

ECRIRE "Saisissez votre âge :"
LIRE age

ECRIRE "Depuis combien de temps êtes-vous titulaire du permis de conduire ?"
LIRE permis

ECRIRE "Avez-vous déjà provoqué un accident de voiture ?"
LIRE accident

ECRIRE "Depuis combien de temps êtes-vous assuré-e ?"
LIRE fidelite

tarif <-- "Vous bénéficiez du tarif "

SI fidelite > 5
orange <-- rouge
vert <-- orange
bleu <-- vert
FIN SI

SI age < 25 ET permis < 2 ET accident > 1
	ECRIRE "Nous ne pouvons pas vous assurer."
	
SINON SI age < 25 ET permis < 2 ET accident = 0 ALORS
	ECRIRE tarif, rouge "."
	
SINON SI (age < 25 ET permis > 2 OU age > 25 ET permis < 2) ET accident = 1 ALORS
	ECRIRE tarif, rouge "."
	
SINON SI (age < 25 ET permis > 2 ET OU age > 25 ET permis < 2) ET accident = 0 ALORS
	ECRIRE tarif, orange "."
	
SINON SI age > 25 ET permis > 2 ET accident = 0
	ECRIRE tarif, vert "."
	
SINON SI age > 25 ET permis > 2 ET accident = 1
	ECRIRE tarif, orange "."
	
SINON SI age > 25 ET permis > 2 ET accident = 2
	ECRIRE tarif, rouge "."	
	
SINON SI age > 25 ET permis > 2 ET accident > 2
	ECRIRE "Nous ne pouvons pas vous assurer."
FIN SI


```
