import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;



public class livro {
    // atributos    
    private String titulo;
    private String autor;
    private String tipo;
    private int nota;

    // construtor 
    public livro(String titulo, String autor, String tipo, int nota) {
        this.titulo = titulo;
        this.autor = autor;
        this.tipo = tipo;
        this.nota = nota;  
    }
    // getters e setters 
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
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
    public int getNota() {
        return nota;
    }
    public void setNota(int nota) {
        this.nota = nota;
    }
}