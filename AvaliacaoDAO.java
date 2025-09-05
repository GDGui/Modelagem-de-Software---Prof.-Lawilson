import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AvaliacaoDAO {

    // Cadastrar nova avaliação
    public static void cadastraAvaliacao(Avaliacao a) throws Exception {
        String sql = "INSERT INTO tb_avaliacao (titulo, autor, tipo, nota, comentario) VALUES (?, ?, ?, ?, ?)";

        try (Connection conn = ConexaoBD.obtemConexao();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, a.getTitulo());
            ps.setString(2, a.getAutor());
            ps.setString(3, a.getTipo());
            ps.setInt(4, Integer.parseInt(a.getNota()));
            ps.setString(5, a.getComentario());

            ps.executeUpdate();
        }
    }

    // Verificar se usuário já avaliou (você pode mudar a lógica aqui se quiser limitar por filme depois)
    public static boolean consultaAvaliacao(Avaliacao a) throws Exception {
        String sql = "SELECT * FROM tb_avaliacao WHERE titulo = ?";

        try (Connection conn = ConexaoBD.obtemConexao();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, a.getTitulo());

            ResultSet rs = ps.executeQuery();
            return rs.next();
        }
    }
}