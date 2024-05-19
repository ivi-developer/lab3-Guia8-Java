package punto5;

public class Publicacion {
    private String titulo;
    private String fotoDescription;
    public Publicacion(String titulo, String fotoDescription) {
        this.titulo = titulo;
        this.fotoDescription = fotoDescription;
    }
    public String getTitulo(){return titulo;}
    public void setTitulo(String titulo){this.titulo = titulo;}
    public String getFotoDescription(){return fotoDescription;}
    public void setFotoDescription(String fotoDescription){this.fotoDescription = fotoDescription;}
    @Override
    public String toString() {
        return "Publicacion{" +
                "titulo='" + titulo + '\'' +
                ", fotoDescription='" + fotoDescription + '\'' +
                '}';
    }
}
