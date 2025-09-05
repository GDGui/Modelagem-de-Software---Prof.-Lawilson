
public class Avaliacao {
    private String titulo;
     private String login;
    private String autor;
    private String tipo;
    private String nota;
    private String comentario;

    public Avaliacao(String titulo, String login, String autor, String tipo, String nota, String comentario) {
        this.titulo = titulo;
        this.titulo = login;
        this.autor = autor;
        this.tipo = tipo;
        this.nota = nota;
        this.comentario = comentario;
    }

    public Avaliacao() {
        
    }
    
    public Avaliacao(String titulo, String login, String autor, String nota, String comentario){
        this.titulo = titulo;
        this.login = login;
        this.autor = autor;
        this.nota = nota;
        this.comentario = comentario;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
    
    
}
