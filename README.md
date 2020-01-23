# exemple-android-recyclerView
exemple d'utilisation d'un recyclerView sous android

Attention : Projet réalisé avec androidstudio 3.5.3 pour 19 < API < 26

Exemple d’utilisation d’un RecyclerView pour une liste de texte clickable. 
Le RecyclerView, comme les anciennes ListView et GridView nécessite un adapter personnalisé pour définir l’aspect graphique de chaque item.
Cet adapter sera implémenté par un fichier xml (la vue) et une classe (dérivée de RecyclerView.Adapter< T >) dont le template est une classe de gestion des données à stocker dans chacun des items.

Cet exemple met en œuvre aussi un gestionnaire d’événements qui affiche le texte de l’item cliqué.

Pour passer d'une liste à une grille, il suffit lors de la création du RecyclerView de changer de layout comme ci-dessous:

EXTRAIT DE MainActivity
         String[] urls = {"0" , "1" , "2" , "3" , "4" , "5" , "6" , "7" , "8" , "9" , "0"};
        //****************************
        //instanciation du textView qui affichera le texte de l'item clické
        tv = findViewById(R.id.tv);
        lst = new ArrayList<String>();
        for(int i=0 ; i< urls.length ; i++){
            lst.add(urls[i]);
        }
        //instanciation du recyclerView
        liste = findViewById(R.id.liste);
        //création du layout
        //LinearLayoutManager manager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        /*
                On remplace le LinearLayoutManager ci-dessus par un GridLayoutManager auquel on précise le nombre de colonnes.
                il faut bien sur modifier le xml afin d'adapter l'aspect graphique.
        */
        GridLayoutManager manager = new GridLayoutManager(getApplicationContext() , 4);  // 4 est le nombre de colonnes.

