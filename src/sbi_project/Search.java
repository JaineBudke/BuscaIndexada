package sbi_project;

import java.util.ArrayList;

// Classe abstrata com os metodos e atributos necessarios para realizar uma busca/pesquisa
public abstract class Search {

	// Banco de dados (com arvores e listas)
	private DataBase db;
	// Dado a ser buscado
	private String data;
	// Lista com ocorrencias da palavra buscada
	protected ArrayList<String> ocorrencias;

	/**
	 *Metodo construtor
	 * @param db Banco de dados do sistema
	 */
	public Search( DataBase db ){
		this.db = db;
		ocorrencias = new ArrayList<>();
	}
		
	
	/**
	 * Metodo usado para realizar uma busca
	 * @param data Palavra a ser buscada
	 * @return Ocorrencia em que palavra(s)-chave foi encontrada
	 */
	public abstract ArrayList<String> search( String data );
	
}