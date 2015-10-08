package co.jce.sena.listviewpersonalizadaarrayadapter;

/**
 * Created by jce on 8/10/15.
 */
public class Animal {

    //-> Atributos (Comunes)
    private int idRecursoImagen;
    private String nombreAnimal,
                   descripcionAnimal;

    //-> Constructor
    public Animal(int idRecursoImagen, String nombreAnimal, String descripcionAnimal) {
        this.idRecursoImagen = idRecursoImagen;
        this.nombreAnimal = nombreAnimal;
        this.descripcionAnimal = descripcionAnimal;
    }

    //-> Getters and Setters
    public int getIdRecursoImagen() {
        return idRecursoImagen;
    }

    public void setIdRecursoImagen(int idRecursoImagen) {
        this.idRecursoImagen = idRecursoImagen;
    }

    public String getNombreAnimal() {
        return nombreAnimal;
    }

    public void setNombreAnimal(String nombreAnimal) {
        this.nombreAnimal = nombreAnimal;
    }

    public String getDescripcionAnimal() {
        return descripcionAnimal;
    }

    public void setDescripcionAnimal(String descripcionAnimal) {
        this.descripcionAnimal = descripcionAnimal;
    }

}
