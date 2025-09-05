
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UsuarioDAO {

    public static boolean existe(Usuario u) throws Exception {
        String sql = "select * from tb_usuario where " + "nome = ? and senha = ?";
        try (Connection conn = ConexaoBD.obtemConexao(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, u.getNome());
            ps.setString(2, u.getSenha());
            try (ResultSet rs = ps.executeQuery()) {
                return rs.next();
            }
        }
    }

    public static void cadastraUsuario(Usuario u) throws Exception {
        //primeiro definir a sua string sql
        String sql = "insert into tb_usuario values (?, ?, ?)";
        //Compilando
        try (Connection conn = ConexaoBD.obtemConexao(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, u.getNome());
            ps.setString(2, u.getSenha());
            ps.setString(3, u.getTipo());
            ps.execute();

        }

    }

    public static boolean consultaUsuario(Usuario u) throws Exception {
        String sql = "select * from tb_usuario where " + "nome = ? and senha = ?";
        
        try (Connection conn = ConexaoBD.obtemConexao(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, u.getNome());
            ps.setString(2, u.getSenha());
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {                    
                    u.setTipo(rs.getString(3));
                    //Passo 1. if abaixo foi o primeiro passo do botão consultar
                    if (u.getTipo().equals("comum")){
                    }
                    return true;

                } else {
                    return false;
                }

            }
        }
    }
}
