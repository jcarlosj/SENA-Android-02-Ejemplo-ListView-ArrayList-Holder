package co.jce.sena.listviewpersonalizadaarrayadapterholder;

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

        alAnimales .add( new Animal( R .drawable .ic_horse, "Caballo", "Mamífero perisodáctilo domesticado de la familia de los équidos. Es un herbívoro solípedo de gran porte, cuello largo y arqueado, poblado por largas crines." ) );
        alAnimales .add( new Animal( R .drawable .ic_snail, "Caracol", "Molusco gasterópodo provisto de una concha espiral. Hay caracoles marinos (a veces denominados caracolas), dulceacuícolas y terrestres." ) );
        alAnimales .add( new Animal( R .drawable .ic_rabbit, "Conejo", "Especie de mamífero lagomorfo de la familia Leporidae, y el único miembro actual del género Oryctolagus. Está incluido en la lista 100 de las especies exóticas invasoras más dañinas del mundo" ) );
        alAnimales .add( new Animal( R .drawable .ic_elephant, "Elefante", "Mamíferos placentarios del orden Proboscidea. Antiguamente se clasificaban, junto con otros mamíferos de piel gruesa, en el orden, ahora inválido, de los paquidermos (Pachydermata)." ) );
        alAnimales .add( new Animal( R .drawable .ic_cat, "Gato", "Subespecie de mamífero carnívoro de la familia Felidae. El gato está en convivencia cercana al ser humano desde hace unos 9500 años" ) );
        alAnimales .add( new Animal( R .drawable .ic_lobster, "Langosta", "Langosta suelen ser conocidos varios crustáceos del orden de los decápodos pero de distintos infraordenes y familias:" ) );
        alAnimales .add( new Animal( R .drawable .ic_lion, "León", "Mamífero carnívoro de la familia de los félidos y una de las 5 especies del género Panthera. Algunos machos, excepcionalmente grandes, llegan a pesar hasta 250 kg." ) );
        alAnimales .add( new Animal( R .drawable .ic_leopard, "Leopardo", "Mamífero carnívoro de la familia de los félidos. Felinos del género Panthera como: el león, el tigre y el jaguar, están caracterizados por una modificación en el hueso hioides que les permite rugir." ) );
        alAnimales .add( new Animal( R .drawable .ic_ladybug, "Mariquita", "Coccinélidos (Coccinellidae) son una familia de insectos coleópteros de la superfamilia Cucujoidea. Reciben diferentes nombres vulgares según el lugar, siendo el mas común mariquita." ) );
        alAnimales .add( new Animal( R .drawable .ic_bird, "Pájaro", "Animales vertebrados, de sangre caliente, que caminan, saltan o se mantienen solo sobre las extremidades posteriores, mientras que las extremidades anteriores están modificadas como alas." ) );
        alAnimales .add( new Animal( R .drawable .ic_duck, "Pato", "Pato nombre común para ciertas aves de la familia Anatidae, principalmente de la subfamilia Anatinae y dentro de ella del género Anas" ) );
        alAnimales .add( new Animal( R .drawable .ic_dog, "Perro", "Mamífero carnívoro de la familia de los cánidos, que constituye una subespecie del lobo (Canis lupus). Su vida en promedio es alrededor de los 15 años." ) );
        alAnimales .add( new Animal( R .drawable .ic_fish, "Pez", "Animales vertebrados acuáticos, generalmente ectotérmicos (regulan su temperatura a partir del medio ambiente). La mayoría de ellos están recubiertos por escamas, y dotados de aletas." ) );
        alAnimales .add( new Animal( R .drawable .ic_bull, "Toro", "Mamífero artiodáctilo de la familia de los bóvidos. El nombre científico es el que se le asignó al animal vacuno doméstico europeo y norasiático, un conjunto de bóvidos domésticos descendientes de la subespecie de uro salvaje euroasiático." ) );
        alAnimales .add( new Animal( R .drawable .ic_turtle, "Tortuga", "Forman un orden de reptiles (Sauropsida) caracterizados por tener un tronco ancho y corto, y un caparazón o envoltura que protege los órganos internos de su cuerpo." ) );
        alAnimales .add( new Animal( R .drawable .ic_cow, "Vaca", "Nombre científico es el que se le asignó al animal vacuno doméstico europeo y norasiático, un conjunto de bóvidos domésticos descendientes de la subespecie de uro salvaje euroasiático" ) );
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
