import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class usuario {
    // atributos da classe 
    private String nome;
    private String senha;
    // construtor 
    public usuario(String nome, String senha) {
        this.nome = nome;
        this.senha = senha;
    }
    // getters e setters 
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
}
// cadastrar um livro
/**
 * @param livro
 */
public void cadastrarLivro(livro livro) {
    Conecction conexao = null;
    try {
        // definindo conexao 
        String url = "jdbc:mysql://localhost:3306/biblioteca";
        String usuario = "root";
        String senha = "1234";
        // conexao 
        DriverManager.getConnection(url, usuario, senha);
        PreparedStatement ps = conexao.prepareStatement("INSERT INTO livros (titulo, autor, tipo, nota) VALUES (?, ?, ?, ?)");
        // atributos do livro 
        ps.setString(1, livro.getTitulo());
        ps.setString(2, livro.getAutor());
        ps.setString(3, livro.getTipo());
        ps.setInt(4, livro.getNota());

        int resultado = ps.executeUpdate();
        if (resultado > 0) {
          System.out.println("Livro cadastrado com sucesso!");
        } else {
          System.out.println("Erro ao cadastrar o livro!");
        }
          ps.close();

    } catch (SQLException e) {
      // exceções
      e.printStackTrace();
    } finally {
      // fechando a conexão 
      if (conexao != null) {
        try {
          conexao.close();
        } catch (SQLException e) {
          e.printStackTrace();
        }
      }
    }
}
  

    
