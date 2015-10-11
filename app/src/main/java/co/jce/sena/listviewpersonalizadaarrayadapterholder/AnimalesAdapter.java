package co.jce.sena.listviewpersonalizadaarrayadapterholder;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by jce on 8/10/15.
 */
public class AnimalesAdapter extends ArrayAdapter<Animal> {

    //-> Atributos (Colecciones)
    private ArrayList alAnimales;

    //-> Atributos (Especiales)
    private Context cContexto;
    private AnimalesHolder animalesHolder;

    //-> Atributos (Personalizados)
    private Animal animalPosicion;

    //-> Atributos (Componentes)
    private ImageView ivAnimal;
    private TextView tvNombreAnimal,
                     tvDescripcionAnimal;

    //-> Constructor
    public AnimalesAdapter( Context contexto, ArrayList< Animal > animales ) {
        super( contexto, 0, animales );        //: super( contexto, recurso, coleccion de objetos );
        this .cContexto = contexto;
        this .alAnimales = animales;
    }

    @Override
    public View getView( int position, View convertView, ViewGroup parent ) {

        //-> Accedemos al objeto "Animal" contenido en el indice indicado del ArrayList
        animalPosicion = ( Animal ) this .alAnimales .get( position );

        //-> Valida si el "View" del "item" del "ListView" NO existe.
        //   En caso de NO existir infla la "View" para el "layout" del "item" nuevo para el "ListView"
        if( convertView == null ) {

            //-> Inflamos la vista del "layout" creado para el despliegue de cada "item" del "ListView" y lo asignamos a la vista.
            convertView = LayoutInflater .from( this .cContexto ) .inflate( R .layout .list_item_animal, null );

            //-> Instanciamos el "holder" para mantener los datos.
            this .animalesHolder = new AnimalesHolder();

            //-> Accedemos a los componentes de "list_item_animals.xml"
            //   y se los asignamos al "Holder" para mantenerlos disponibles
            //   Este será el contenedor de las referencias a los componentes de "list_item_animals.xml"
            this .animalesHolder .setIvAnimal( ( ImageView ) convertView .findViewById( R .id .ivAnimal) );
            this .animalesHolder .setTvNombreAnimal( ( TextView ) convertView .findViewById( R .id .tvNombreAnimal ) );
            this .animalesHolder .setTvDescripcionAnimal( ( TextView )  convertView .findViewById( R .id .tvDescripcionAnimal ) );
            convertView .setTag( this .animalesHolder );    //: Guardamos el "Holder" dentro del "View" para luego poder recuperarlo
        }

        //-> Reasignamos la referencia de los componentes contenidos en el "View" al "Holder"
        animalesHolder = ( AnimalesHolder ) convertView .getTag();

        //-> Asignamos los valores al los componentes del "list_item_animals.xml" contenidos en el "Holder"
        this .animalesHolder .getIvAnimal() .setImageResource( animalPosicion .getIdRecursoImagen() );
        this .animalesHolder .getTvNombreAnimal() .setText( animalPosicion .getNombreAnimal() );
        this .animalesHolder .getTvDescripcionAnimal() .setText( animalPosicion .getDescripcionAnimal() );

        return convertView;
    }
}
