import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class FilmeDAO {

    // Cadastra um novo filme
    public static void cadastraFilme(Filme l) throws Exception {
        String sql = "INSERT INTO tb_filme (titulo, autor, sinopse, ano, categoria, usuario_cadastro) VALUES (?, ?, ?, ?, ?, ?)";
        try (Connection conn = ConexaoBD.obtemConexao();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, l.getTitulo());
            ps.setString(2, l.getAutor());
            ps.setString(3, l.getSinopse());
            ps.setString(4, l.getAno());
            ps.setString(5, l.getCateg());
            ps.setString(6, l.getUsuarioCadastro());
            ps.execute();
        }
    }

    // Verifica se o filme já existe no banco pelo título
    public static boolean existe(Filme l) throws Exception {
        String sql = "SELECT * FROM tb_filme WHERE titulo = ?";
        try (Connection conn = ConexaoBD.obtemConexao();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, l.getTitulo());
            try (ResultSet rs = ps.executeQuery()) {
                return rs.next();
            }
        }
    }

    // Altera os dados do filme
    public static void alteraLivro(Filme l) throws Exception {
        String sql = "UPDATE tb_filme SET autor = ?, ano = ?, titulo = ?, sinopse = ?, categoria = ?, WHERE titulo = ?";
        try (Connection conn = ConexaoBD.obtemConexao();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, l.getAutor());
            ps.setString(2, l.getAno());
            ps.setString(3, l.getTitulo());
            ps.setString(4, l.getSinopse());
            ps.setString(5, l.getCateg());
            ps.executeUpdate();
        }
    }

    // Remove o filme do banco
    public static void removeLivro(Filme l) throws Exception {
        String sql = "DELETE FROM tb_filme WHERE titulo = ?";
        try (Connection conn = ConexaoBD.obtemConexao();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, l.getTitulo());
            ps.executeUpdate();
        }
    }

    // Consulta um filme e carrega autor e ano
    public static boolean consultaLivro(Filme l) throws Exception {
        String sql = "SELECT * FROM tb_filme WHERE titulo = ?";
        try (Connection conn = ConexaoBD.obtemConexao();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, l.getTitulo());
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    l.setAutor(rs.getString("autor"));
                    l.setAno(rs.getString("tipo"));
                    return true;
                } else {
                    return false;
                }
            }
        }
    }
}
    

