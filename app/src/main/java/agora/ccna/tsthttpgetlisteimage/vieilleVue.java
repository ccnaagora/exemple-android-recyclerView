package agora.ccna.tsthttpgetlisteimage;

import android.util.Log;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
/*
classe de gestion de la vue
 */
public class vieilleVue extends RecyclerView.ViewHolder {

    private TextView textView;

    //itemView est la vue correspondante à 1 cellule
    public vieilleVue(View v , View.OnClickListener onItemClickListener) {
        super(v);
        //c'est ici que l'on fait nos findView
        textView = (TextView) itemView.findViewById(R.id.celluleText);//celluletext est l'id du textView dans malisteitem.xml
        Log.i("ADAP" , "Constructeur vieillevue = " );
        //crée un tag avec les données de la vue, nécessaire car toutes les vues (item) auront le même gestonnaire d'événements.
        //il sera donc nécessaire de récupérer grace au tag (appel de getTag dans le gestionnaire d'événements) la position de la vue
        v.setTag(this);
        v.setOnClickListener(onItemClickListener);

        //imageView = (ImageView) itemView.findViewById(R.id.image);
    }

    //Remplir la cellule avec le texte
    public void bind(String texte){
        textView.setText(texte);
        Log.i("ADAP" , "bind vieillevue = " + texte);
        //Picasso.with(imageView.getContext()).load(myObject.getImageUrl()).centerCrop().fit().into(imageView);
    }
    public String getText(){
        return textView.getText().toString();
    }
}
