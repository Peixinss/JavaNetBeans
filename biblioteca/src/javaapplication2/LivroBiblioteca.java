
package javaapplication2;


public class LivroBiblioteca {
    private String  titulo;
    private String autor;
    private boolean  disponivel = true;
        
    public String getTitulo (){
        System.out.println(titulo);
        return titulo;
    }
    
    public void setTitulo(String titulo){
        if(titulo!= null && !titulo.isEmpty()){
            this.titulo = titulo;
        }else{
            System.out.println("Titulo Invalido");
        }
    }
    
    public String getAutor (){
        System.out.println(autor);
        return autor;
    }
    
    public void setAutor (String autor){
        if(autor!= null && !autor.isEmpty()){
            this.autor = autor;
        }else{
            System.out.println("Autor Invalido");
        }    
    }
    
    public boolean estaDisponivel(){
        System.out.println(disponivel);
        return disponivel;
    }
    
    public void pegarEmprestado(){
        if(disponivel){
            disponivel = false;
            System.out.println("Voce pegou emprestado o livro: "+ titulo);
        }else{
            System.out.println("O livro "+ titulo +" nao esta disponivel!");
        }
    }
    
    public void devolver(){
        if(!disponivel){
            disponivel = true;
            System.out.println("Voce devolveu o livro: " + titulo);
        }else{
            System.out.println("O livro: "+titulo+" esta diponivel");
        }
    }   
    
}