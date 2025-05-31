package modelo;

public class Livros {
	private String titulo;
	private String autor;
	private String editora;
	private int isbn;
	private int ano;
	private int quantidade;
	public Livros(String titulo, String autor, String editora, int isbn, int ano, int quantidade) {
		
		this.titulo = titulo;
		this.autor = autor;
		this.editora = editora;
		this.isbn = isbn;
		this.ano = ano;
		this.quantidade = quantidade;
	}
	@Override
	public String toString() {
		String relatorio ="\nTitulo"+this.titulo;
		relatorio += "\nQTD:"+this.quantidade;
		return relatorio;
	}
	
	
	
	
	
	
	
	
	

}
