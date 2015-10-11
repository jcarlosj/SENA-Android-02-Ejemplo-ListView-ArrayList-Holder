package co.jce.sena.listviewpersonalizadaarrayadapterholder;

import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by jce on 11/10/15.
 */

//-> Creamos la clase "Holder" para mantener los datos.
//   Este será el contenedor de las referencias a los contenedores
public class AnimalesHolder {

    //-> Atributos (Componentes)
    private ImageView ivAnimal;
    private TextView tvNombreAnimal,
                     tvDescripcionAnimal;

    public ImageView getIvAnimal() {
        return ivAnimal;
    }

    public void setIvAnimal(ImageView ivAnimal) {
        this.ivAnimal = ivAnimal;
    }

    public TextView getTvNombreAnimal() {
        return tvNombreAnimal;
    }

    public void setTvNombreAnimal(TextView tvNombreAnimal) {
        this.tvNombreAnimal = tvNombreAnimal;
    }

    public TextView getTvDescripcionAnimal() {
        return tvDescripcionAnimal;
    }

    public void setTvDescripcionAnimal(TextView tvDescripcionAnimal) {
        this.tvDescripcionAnimal = tvDescripcionAnimal;
    }
}
