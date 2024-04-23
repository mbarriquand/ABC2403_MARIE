# Ecercice 1.1 : Hello World
Ecrire un programme qui affaiche "Hello World !".

```
ECRIRE "Hello World !"
```

# Exercice 1.2 : Hello You
L'utilisateur est invité à saisir son prénom dans la console.

Le programme affiche "Bonjour" suivi du prénom saisi.

```
VARIABLES
    prenom est une CHAINE DE CARACTERES

TRAITEMENT
    ECRIRE "Saisissez votre prénom"
    LIRE prenom
    ECRIRE "bonjour ", prenom, "."
```
Alternative avec contrôle sur la longueur du prénom

```
VARIABLES
    prenom est une CHAINE DE CARACTERES

TRAITEMENT
    ECRIRE "Saisissez votre prénom"
    LIRE prenom
    SI prenom.LONGUEUR > 2 ALORS
        ECRIRE "bonjour ", prenom, "."
    ECRIRE "bonjour ", prenom, "."
    SINON
        ECRIRE "Prénom invalide"
    FIN SI
```

# Exercice 1.3
L’utilisateur est invité à saisir 2 nombres entier.

Le programme calcule la moyenne des 2 nombres et affiche le résultat sous forme de nombre décimal.

Exemple de fonctionnement du programme en mode Console :

```
VARIABLES
    nombre1 est un ENTIER
    nombre2 est un ENTIER
    moyenne est un NOMBRE REEL

TRAITEMENT
    ECRIRE "Saisir 1 nombre entier"
    LIRE nombre1
    ECRIRE "Saisir 1 autre nombre entier"
    LIRE nombre2
    moyenne <-- (nombre1 + nombre2) / 2
    ECRIRE "La moyenne de ", nombre1, " et ", nombre2, " est ", moyenne // "la moyenne de 12 et 81 est 46,5"
```


# Exercice 1.4
Lire le rayon R d’une sphère puis calculer et afficher :

Son aire = 4 π R²
Son volume = (4 π R³)/3

```
VARIABLE
    rayon est un NOMBRE REEL
    aire est un NOMBRE REEL
    volume est un NOMBRE REEL

TRAITEMENT
```