# Exercice 1.3

- L’utilisateur est invité à saisir 2 nombres entier.

- Le programme calcule la moyenne des 2 nombres et affiche le résultat sous forme de nombre décimal.

- Exemple de fonctionnement du programme en mode Console :

```
Le programme affiche "Veuillez saisir un 1er nombre"
L'utilisateur saisit un nombre
Le nombre saisi est stocké dans une variable
Le programme affiche "Veuillez saisir un 2nd nombre"
L'utilisateur saisit un nombre
Le nombre saisi est stocké dans une autre variable
Le programme calcule la moyenne des 2 nombres
Le résultat est stocké dans une variable
Le programme affiche le résultat du calcul
```


```
VARIABLES
    nombre1 est un ENTIER
    nombre2 est un ENTIER
    moyenne est un NOMBRE REEL

TRAITEMENT
    ECRIRE "Veuillez saisir un 1er nombre"
    LIRE nombre1
    ECRIRE "Veuillez saisir un 2nd nombre"
    LIRE nombre2
    moyenne <-- (nombre1 + nombre2) / 2
    ECRIRE "La moyenne de ", nombre1, " et ", nombre2, " est ", moyenne // "la moyenne de 12 et 81 est 46,5"
```