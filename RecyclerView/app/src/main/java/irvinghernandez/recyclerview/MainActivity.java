package irvinghernandez.recyclerview;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Titular> datos;
    RecyclerView RecView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        datos=new ArrayList<>();
        datos.add(new Titular("DATO 1 "));
        datos.add(new Titular("DATO 2 "));
        datos.add(new Titular("DATO 3 "));
        datos.add(new Titular("DATO 4 "));
        datos.add(new Titular("DATO 5 "));
        datos.add(new Titular("DATO 6 "));
        datos.add(new Titular("DATO 7 "));
        datos.add(new Titular("DATO 8 "));
        datos.add(new Titular("DATO 9 "));
        datos.add(new Titular("DATO 10 "));
        datos.add(new Titular("DATO 11 "));
        datos.add(new Titular("DATO 12 "));
        datos.add(new Titular("DATO 13 "));
        datos.add(new Titular("DATO 14 "));
        datos.add(new Titular("DATO 15 "));
        datos.add(new Titular("DATO 16 "));
        datos.add(new Titular("DATO 17 "));
        datos.add(new Titular("DATO 18 "));
        datos.add(new Titular("DATO 19 "));
        datos.add(new Titular("DATO 20 "));
        datos.add(new Titular("DATO 21 "));
        datos.add(new Titular("DATO 22 "));
        datos.add(new Titular("DATO 23 "));
        datos.add(new Titular("DATO 24 "));
        datos.add(new Titular("DATO 25 "));
        datos.add(new Titular("DATO 26 "));
        datos.add(new Titular("DATO 27 "));
        RecView=(RecyclerView)findViewById(R.id.RecView);
        RecView.setAdapter(new AdaptadorTitulares(datos));
        RecView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    public class AdaptadorTitulares extends
            RecyclerView.Adapter<AdaptadorTitulares.TitularesViewHolder>{
        private ArrayList<Titular>datos;
        public AdaptadorTitulares(ArrayList<Titular> datos){
            this.datos=datos;
        }
        @Override
        public TitularesViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType){
            View itemView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.listitem_titular, viewGroup,false);
            return new TitularesViewHolder(itemView);
        }
        @Override
        public void onBindViewHolder(TitularesViewHolder viewHolder, int pos){
            viewHolder.bindTitular(datos.get(pos));
        }
        @Override
        public int getItemCount(){
            return datos.size();
        }
        public class TitularesViewHolder extends RecyclerView.ViewHolder{
            private TextView txtTitulo;
            public TitularesViewHolder(View itemView){
                super(itemView);
                txtTitulo=(TextView) itemView.findViewById(R.id.LblTitulo);
            }
            public void bindTitular(Titular t){
                txtTitulo.setText(t.getTitulo());
            }


        }

    }

    public class Titular {
        private String titulo;

        public Titular(String titulo) {
            this.titulo = titulo;
        }

        public String getTitulo() {
            return titulo;
        }

    }
}
