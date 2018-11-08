package br.com.prog3.atividade8aula12.persistence;

import java.sql.Connection;

import br.com.prog3.atividade8aula12.model.Aluno;

public class Teste {

	public static void main(String[] args) {
		Connection con = ConnectionFactory.getConnection();
		AlunoDaoImp ad = new AlunoDaoImp();
		Aluno a = new Aluno();
		a.setMatricula(6);
		a.setNome("Maria Paula");
		a.setRa("Taguatinga");
		System.out.println(ad.save(a));
	}

}
