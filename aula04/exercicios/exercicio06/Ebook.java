package exercicios.exercicio06;

public class Ebook {
    private String titulo, autor;
    private int totalPaginas, paginaAtual;

    public Ebook(String titulo, String autor, int totalPaginas, int paginaAtual){
        this.titulo = titulo;
        this.autor = autor;
        this.totalPaginas = totalPaginas;
        this.paginaAtual = paginaAtual;
    }

    public void mostrarCapa(){
        this.paginaAtual = 1;
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Total de Páginas: " + totalPaginas);
        System.out.println("Página atual: " + paginaAtual);
    }

    public void avancarPagina(){
        if ((this.paginaAtual) < this.totalPaginas){
            this.paginaAtual = this.paginaAtual + 1;
            System.out.println("Página: " + this.paginaAtual);
        }else{
            System.out.println("Você já esta na última página");
        }
    }

    public void retrocederPagina(){
        if ((this.paginaAtual) > 1){
            this.paginaAtual = this.paginaAtual - 1;
            System.out.println("Página: " + this.paginaAtual);
        }else{
            System.out.println("Você já esta na capa");
        }

    }    

    public void irParaPagina(int pagina){
        if ((pagina < this.totalPaginas) && (pagina > 0)){
            this.paginaAtual = pagina;
            System.out.println("Página: " + this.paginaAtual);
        }else{
            System.out.println("Página inválida");
        }

    }   
    
    public int exibirPagina(){
        return paginaAtual;
    }     
}
