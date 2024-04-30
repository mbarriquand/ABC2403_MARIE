# Exercice 2.3

Cet algorithme est destiné à prévenir l’avenir et il doit être infaillible !

Le programme demande à l’utilisateur de saisir 2 nombres entiers correspondant respectivement à des heures et des minutes. Le programme affichera ensuite l’heure qu’il sera 3 minutes plus tard.

Par exemple, si l’utilisateur saisit 23 puis 12 (correspondant à 23h12), le programme doit afficher Dans 3 minutes, il sera 23h15.

Si les nombres saisis par l’utilisateur sont “hors limite”, le programme affichera “Les données saisies sont invalides”


```
VARIABLES
heure est un NOMBRE ENTIER NON SIGNE
minutes est un NOMBRE ENTIER NON SIGNE
heuresPlus3 est un NOMBRE ENTIER NON SIGNE
minutesPlus3 est un NOMBRE ENTIER NON SIGNE

TRAITEMENT
ECRIRE "Saisissez l'heure (entre 0 et 23):"
LIRE heure
ECRIRE "Saisissez les minutes (entre 0 et 59): "
LIRE minutes

SI heure < 0 OU heure > 23 OU minutes < 0 OU minutes > 59 ALORS
	ECRIRE "Les données saisies sont invalides"
	FIN PROGRAMME
FIN SI

minutesPlus3 <-- minutes +3
heurePlus3 <-- heure	

SI minutesPlus3 >= 60 ALORS
	minutesPlus3 <-- -=60
	heurePlus3 <-- ++
FIN SI

SI heurePlus3 > 23 ALORS
	heurePlus3 <-- -= 24
FIN SI

ECRIRE "Dans trois minutes, il sera ", heurePlus3,"h",minutesPlus3;
```









```
VARIABLES
h est un NOMBRE ENTIER NON SIGNE
m est un NOMBRE ENTIER NON SIGNE
time est une CHAINE DE CARACTERES
pred est une CHAINE DE CARACTERES


TRAITEMENT
ECRIRE "Veuillez saisir l'heure"
LIRE h
SI h>=23 ALORS
	ECRIRE "Les données saisies sont invalides"
SINON
	ECRIRE "Veuillez saisir les minutes"
	LIRE m
SI m<=56 ALORS
	ECRIRE "Il est actuellement ", time, ". Dans trois minutes, il sera ", pred
SINON SI m=57 ALORS
	ECRIRE "Il est actuellement ", time, ". Dans trois minutes, il sera ", h+1, "H00"
SINON SI m=58 ALORS	
	ECRIRE "Il est actuellement ", time, ". Dans trois minutes, il sera ", h+1, "H01"
SINON SI m=59 ALORS
	ECRIRE "Il est actuellement ", time, ". Dans trois minutes, il sera ", h+1, "H02"
SINON SI h = 23 et m = 59
	ECRIRE "Il est actuellement ", time, ". Dans trois minutes, il sera 00H02"
SINON SI h = 23 et m = 58
	ECRIRE "Il est actuellement ", time, ". Dans trois minutes, il sera 00H01"
SINON SI h = 23 et m = 57
	ECRIRE "Il est actuellement ", time, ". Dans trois minutes, il sera 00H00"
SINON
	ECRIRE "Les données saisies sont invalides"
FIN SI

```
