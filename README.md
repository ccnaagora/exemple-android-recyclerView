# exemple-android-recyclerView
exemple d'utilisation d'un recyclerView sous android

Attention : Projet réalisé avec androidstudio 3.5.3 pour 19 < API < 26

Exemple d’utilisation d’un RecyclerView pour une liste de texte clickable. 
Le RecyclerView, comme les anciennes ListView et GridView nécessite un adapter personnalisé pour définir l’aspect graphique de chaque item.
Cet adapter sera implémenté par un fichier xml (la vue) et une classe (dérivée de RecyclerView.Adapter< T >) dont le template est une classe de gestion des données à stocker dans chacun des items.

Cet exemple met en œuvre aussi un gestionnaire d’événements qui affiche le texte de l’item cliqué.

