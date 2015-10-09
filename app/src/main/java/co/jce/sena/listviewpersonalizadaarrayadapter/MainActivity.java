package co.jce.sena.listviewpersonalizadaarrayadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    //-> Atributos (Componentes)
    private ListView lvAnimales;

    //-> Atributos (Colecciones)
    private ArrayList< Animal > alAnimales;

    //-> Atributos (Especiales)
    private AnimalesAdapter adaptadorAnimales;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private void agregarAnimales() {

        alAnimales = new ArrayList< Animal >();

        alAnimales .add( new Animal( R .drawable .ic_horse, "Caballo", "Descripción" ) );
        alAnimales .add( new Animal( R .drawable .ic_snail, "Caracol", "Descripción" ) );
        alAnimales .add( new Animal( R .drawable .ic_rabbit, "Conejo", "Descripción" ) );
        alAnimales .add( new Animal( R .drawable .ic_elephant, "Elefante", "Descripción" ) );
        alAnimales .add( new Animal( R .drawable .ic_cat, "Gato", "Descripción" ) );
        alAnimales .add( new Animal( R .drawable .ic_lobster, "Langosta", "Descripción" ) );
        alAnimales .add( new Animal( R .drawable .ic_lion, "León", "Descripción" ) );
        alAnimales .add( new Animal( R .drawable .ic_leopard, "Leopardo", "Descripción" ) );
        alAnimales .add( new Animal( R .drawable .ic_ladybug, "Mariquita", "Descripción" ) );
        alAnimales .add( new Animal( R .drawable .ic_bird, "Pájaro", "Descripción" ) );
        alAnimales .add( new Animal( R .drawable .ic_duck, "Pato", "Descripción" ) );
        alAnimales .add( new Animal( R .drawable .ic_dog, "Perro", "Descripción" ) );
        alAnimales .add( new Animal( R .drawable .ic_fish, "Pez", "Descripción" ) );
        alAnimales .add( new Animal( R .drawable .ic_bull, "Toro", "Descripción" ) );
        alAnimales .add( new Animal( R .drawable .ic_turtle, "Tortuga", "Descripción" ) );
        alAnimales .add( new Animal( R .drawable .ic_cow, "Vaca", "Descripción" ) );
    }

    private void init() {
        //-> Accedemos a los componentes del "Activity".
        lvAnimales = ( ListView ) findViewById( R .id .lvAnimales );        //: ListView

        agregarAnimales();

        //-> Instanciamos el Adaptador.
        //   Asociamos el "Adapter" al "ArrayList".
        adaptadorAnimales = new AnimalesAdapter( this, alAnimales );

        //-> Asociamos el "Adapter" con el "ListView".
        lvAnimales .setAdapter( adaptadorAnimales );
    }

}
