# Exercice 2.5
Un magasin proposant un service de Réprographie facture 0.10€ les 10 premières photocopies, 0.09€ les vingt suivants et 0.08 au delà.

Écrire l’algorithme qui demande à l’utilisateur de saisir le nombre de photocopies effectuées et affiche le montant de la facture correspondante.


```
CONSTANTES

P1 est un REEL <-- 0.10
P2 est un REEL <-- 0.09
P3 est un REEL <-- 0.08


VARIABLES

nombreDeCopies est un NOMBRE
montantDeLaFacture est un NOMBRE REEL


TRAITEMENT

ECRIRE "Saisissez le nombre de photocopies: "
LIRE nombreDeCopies

	SI nombredeCopies <= 10
	ALORS
		montantDeLaFacture <-- nombreDeCopies * P1

	SINON SI nombredeCopies <= 30
	ALORS
		montantDeLaFacture <-- 10 * P1 + (nombreDeCopies - 10) * P2

	SINON 
 		montantDeLaFacture <-- 10 * P1 + 20 * P2 + 		(nombreDeCopies - 30) * P
	FIN SI

RESULTAT

	ECRIRE "A payer: ", montantDeLaFacture, "€"

```
