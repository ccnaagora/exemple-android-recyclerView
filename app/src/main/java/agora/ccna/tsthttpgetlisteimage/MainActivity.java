package agora.ccna.tsthttpgetlisteimage;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView liste;
    ArrayList<String> lst ;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //tableau de string pour remplir la liste: leur valeur n'a pas d'importance.
        String[] urls = {"http://192.168.1.13/listeNom.json" , "http://192.168.1.13/aaaa.json" , "http://192.168.1.13/bbbbbb.json" ,
                "http://192.168.1.13/ccccc.json", "http://192.168.1.13/ddddd.json" , "http://192.168.1.13/eeeeeee.json"
                , "http://192.168.1.13/gggggg.json" , "http://192.168.1.13/pppppp.json","http://192.168.1.13/xxxxxxxxxx.json",
                "http://192.168.1.13/hhhhhhhhh.json" , "http://192.168.1.13/listeNom.json"
                , "http://192.168.1.13/rrrrrrrrr.json" , "http://192.168.1.13/kkkkkkkkk.json",
                "http://192.168.1.13/hhhhhh.json", "http://192.168.1.13/nnnnn.json" , "http://192.168.1.13/mmmmmm.json"
                , "http://192.168.1.13/ggggggg.json" , "http://192.168.1.13/fffff.json"};
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
        LinearLayoutManager manager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        liste.setLayoutManager(manager);
        //création de l'adapter personnalisé : voir la classe correspondante
        monAdapter adapter = new monAdapter(lst);    //this.getApplicationContext() , lst, android.R.layout.simple_list_item_1);
        liste.setAdapter(adapter);
        adapter.setOnItemClickListener(onItemClickListener);
    }
    //***gestionnaire evenement
    private View.OnClickListener onItemClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            //récupérer la vue via getTag afin 'accéder à la position dans la liste
            RecyclerView.ViewHolder viewHolder = (RecyclerView.ViewHolder) view.getTag();
            int position = viewHolder.getAdapterPosition();
            // on récupère le texte puis on l'affiche dans le textView
            String texte = lst.get(position);
            tv.setText(texte);
            //message dans les log pour le debugage
            //Log.i("ADAP" , "1) texte clické : " + texte);
            //Log.i("ADAP" , "2) texte clické : " + ((vieilleVue)viewHolder).getText() + "     position=" + ((vieilleVue)viewHolder).getPosition());
        }
    };
}
