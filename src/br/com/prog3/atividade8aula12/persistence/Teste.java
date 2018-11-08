package br.com.prog3.atividade8aula12.persistence;

import java.sql.Connection;

public class Teste {

	public static void main(String[] args) {
		Connection con = ConnectionFactory.getConnection();
	}

}
