# Exercice 2.1
Écrire un algorithme qui demande à l’utilisateur de saisir 1 nombre entier et l’informe ensuite si le nombre est positif ou négatif.

<i>Pour information, le nombre 0 est considéré positif.</i>

```
VARIABLE
    nombre est un NOMBRE ENTIER

TRAITEMENT
    ECRIRE "Veuillez saisir 1 nombre entier"
    LIRE nombre
        SI nombre.VALEUR ≥ 0 ALORS
        ECRIRE "Le nombre ", nombre,  " est positif."
        SINON
        ECRIRE "Le nombre ", nombre,  " est négatif."
        FIN SI

```