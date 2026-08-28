
package javaapplication2;


public class JavaApplication2 {

    
    public static void main(String[] args) {
        LivroBiblioteca livro1 = new LivroBiblioteca();
        
        livro1.setTitulo("Harry Potter");
        livro1.setAutor("Renan");
        System.out.println(livro1.estaDisponivel());
        livro1.pegarEmprestado();
        livro1.pegarEmprestado();
        System.out.println("--------------------------------------------");
        LivroBiblioteca livro2 = new LivroBiblioteca();
        
        livro2.setTitulo("Noites Brancas");
        livro2.setAutor("Roger");
        livro2.getTitulo();
        livro2.getAutor();
        livro2.estaDisponivel();
        livro2.pegarEmprestado();
        livro2.estaDisponivel();
        livro2.pegarEmprestado();
        livro2.estaDisponivel();
        livro2.devolver();
        livro2.estaDisponivel();
        livro2.devolver();
        livro2.estaDisponivel();

    }
    
}
