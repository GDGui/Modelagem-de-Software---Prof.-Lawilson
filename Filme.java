public class Filme {
    private int id; // este campo será gerado pelo banco
    private String titulo;
    private String autor;
    private String ano;
    private String categoria;
    private String sinopse;
    private String usuarioCadastro;

    // Construtor sem ID - para cadastro
    public Filme(String titulo, String autor, String ano, String categoria, String sinopse, String usuarioCadastro){ 
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.categoria = categoria;
        this.sinopse = sinopse;
        this.usuarioCadastro = usuarioCadastro;
    }

    // Construtor com ID - para consulta/listagem
    public Filme(int id, String titulo, String autor, String ano, String categoria, String sinopse, String usuarioCadastro) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.categoria = categoria;
        this.sinopse = sinopse;
        this.usuarioCadastro = usuarioCadastro;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getAno() {
        return ano;
    }
    
     public String getCateg() {
        return categoria;
    }
     
      public String getSinopse() {
        return sinopse;
    }
      
    public String getUsuarioCadastro() {
        return usuarioCadastro;
    }

    // Setters (opcional)
    public void setId(int id) {
        this.id = id;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }
    
     public void setCateg(String categoria) {
        this.categoria = categoria;
    }
     
      public void setSinopse (String sinopse) {
        this.sinopse = sinopse;
    }

    public void setUsuarioCadastro(String usuarioCadastro) {
        this.usuarioCadastro = usuarioCadastro;
    }
}
