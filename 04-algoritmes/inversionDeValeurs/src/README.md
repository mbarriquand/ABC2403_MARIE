# Exercice 1.6

- Lire 2 nombres entier A et B.

- Afficher la valeur de A puis la valeur de B.

- Mettre le contenu de A dans B et celui de B dans A.

- Afficher à nouveau la valeur de A puis la valeur de B.

```
VARIABLE
    A est un NOMBRE ENTIER
    B est un NOMBRE ENTIER
    C est un NOMBRE ENTIER
    

TRAITEMENT
ECRIRE "Veuillez saisir un nombre entier";
LIRE A
ECRIRE "Veuillez saisir un autre nombre entier";
LIRE B
ECRIRE "Les valeurs sont ", A, " et ", B, "."
C <-- A
A <-- B
B <-- A
ECRIRE "Les valeurs inversées sont ", A, " et ", B, "."
```