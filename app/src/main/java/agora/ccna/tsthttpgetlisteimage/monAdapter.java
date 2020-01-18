package agora.ccna.tsthttpgetlisteimage;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/*classe pour personnaliser l'adapter,
    template : la classe qui fabrique la vue
 */
public class monAdapter extends RecyclerView.Adapter<vieilleVue> {

    //liste qui contient tous les éléments à gérer dans le recyclerView
    ArrayList<String> lst;
    monAdapter(ArrayList<String> l){
        lst = l;
        Log.i("ADAP" , "Constructeur adapteur nb element= " + lst.size());
    }
    //gestionnaire evenement pour une cellule
    private View.OnClickListener onItemClickListener;
    public void setOnItemClickListener(View.OnClickListener c)
    {
        this.onItemClickListener = c;
    }
    @NonNull
    @Override
    public vieilleVue onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //on fabrique la vue via l'IHM (malisteitem.xml)
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.malisteitem,parent,false);
        Log.i("ADAP" , "Creation vue ancienne" );
        //on céee puis on retourne la vue
        return new vieilleVue(view , onItemClickListener);
    }
    //appelée pour toutes les cellules à afficher.
    @Override
    public void onBindViewHolder(@NonNull vieilleVue holder, int position) {
        //on récupère le texte de la liste
        String text = lst.get(position);
        //on le transmet à l'objet 'vue' pour l'afficher dans le textView correspondant à la position
        holder.bind(text);
        Log.i("ADAP" , "bind adapteur position= " + position);
    }

    @Override
    public int getItemCount() {
        Log.i("ADAP" , "GEt item count = " + lst.size());
        return lst.size();
    }
}
