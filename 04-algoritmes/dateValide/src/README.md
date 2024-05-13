# Exercice 2.8 : Validité d’une date

Écrivez un algorithme qui demande à l’utilisateur de saisir 3 nombres entiers

Un numéro de jour
Un numéro de mois
Un numéro d’année
L’algorithme indique ensuite s’il s’agit ou non d’une date valide.

Cet exercice est certes d’un manque d’originalité affligeant, mais après tout, en algorithmique comme ailleurs, il faut connaître ses classiques ! Et quand on a fait cela une fois dans sa vie, on apprécie pleinement l’existence d’un type « Date » dans certains langages…).

Il n’est sans doute pas inutile de rappeler rapidement que le mois de février compte 28 jours, sauf si l’année est bissextile, auquel cas il en compte 29.

L’année est bissextile si elle est divisible par quatre. Toutefois, les années divisibles par 100 ne sont pas bissextiles, mais les années divisibles par 400 le sont. Ouf !

```
VARIABLES
jour est un ENTIER
mois est un ENTIER
annee est un ENTIER


TRAITEMENT
ECRIRE "Veuillez saisir le jour"
LIRE jour

ECRIRE "Veuillez saisir le mois"
LIRE mois

ECRIRE "Vouillez saisir l'année"
LIRE annee

	SI jour > 31 ALORS
		ECRIRE "Cette date n'est pas valide"
	
	SINON SI jour > 29 ET mois = 2 ALORS
		ECRIRE "Cette date n'est pas valide"
	
	SINON SI jour = 29 ET mois = 2 ET (annee % 4 = 0) ALORS
		ECRIRE "Cette date n'est pas valide"
	
	SINON SI jour = 31 ET (mois = 4 ou mois = 6 ou mois = 9 ou mois = 11) ALORS
		ECRIRE "Cette date n'est pas valide"
	
	SINON
		ECRIRE "Cette date est valide"
		
	FIN SI

```

