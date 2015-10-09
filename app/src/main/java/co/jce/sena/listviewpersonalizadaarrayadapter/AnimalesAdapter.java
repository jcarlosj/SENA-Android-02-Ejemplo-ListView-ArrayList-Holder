package co.jce.sena.listviewpersonalizadaarrayadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jce on 8/10/15.
 */
public class AnimalesAdapter extends ArrayAdapter<Animal> {

    //-> Atributos (Colecciones)
    private ArrayList alAnimales;

    //-> Atributos (Especiales)
    private Context cContexto;

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

        //-> Inflamos la vista del "layout" creado para el despliegue de cada "item" del "ListView"
        convertView = LayoutInflater .from( this .cContexto ) .inflate( R .layout .list_item_animal, null );

        //-> Accedemos a los componentes de "list_item_animals.xml"
        ivAnimal = ( ImageView ) convertView .findViewById( R .id .ivAnimal );
        tvNombreAnimal = ( TextView ) convertView .findViewById( R .id .tvNombreAnimal );
        tvDescripcionAnimal = ( TextView ) convertView .findViewById( R .id .tvDescripcionAnimal );

        //-> Pasamos los valores a los componentes de "list_item_animals.xml"
        ivAnimal .setImageResource(animalPosicion.getIdRecursoImagen() );
        tvNombreAnimal .setText( animalPosicion .getNombreAnimal() );
        tvDescripcionAnimal .setText( animalPosicion .getDescripcionAnimal() );

        return convertView;
    }
}
