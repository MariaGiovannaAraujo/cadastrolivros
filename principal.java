public class principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // nome e senha do usuario 
        System.out.println("Digite o seu nome: ");
        String nome = scanner.nextLine ();
        System.out.println("Digite sua senha: ");
        String senha = scanner.nextLine();

        Usuario usuario = new Usuario(nome, senha);

        // dados do livro 
        System.out.println("Digite o título do livro: ");
        String titulo = scaner.nextLine();
        System.out.println("Digite o autor do livro: ");
        String autor = scanner.nextLine();
        System.out.println("Digite o tipo do livro: ");
        String tipo = scanner.nextLine();
        System.out.println("Digite a nota que você deu para o livro (de 0 a 10): ");
        int nota = scanner.nextInt();

        Livro livro = new Livro(titulo, autor, tipo, nota);

    
        usuario.cadastrarLivro(livro);

        scanner.close();
    }
}
