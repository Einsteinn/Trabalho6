package br.com.prog3.atividade8aula12.persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import br.com.prog3.atividade8aula12.model.Aluno;

public class AlunoDaoImp implements AlunoDao {
	@Override
	public String save(Aluno aluno) {
		String sql = "insert into aluno values(?,?,?)";
		Connection con = ConnectionFactory.getConnection();
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setInt(1, aluno.getMatricula());
			pst.setString(2, aluno.getNome());
			pst.setString(3, aluno.getRa());
			int res = pst.executeUpdate();
			if (res > 0) {
				return "Inserido com sucesso.";
			} else {
				return "Erro ao inserir.";
			}
		} catch (SQLException e) {
			return e.getMessage();
		} finally {
			ConnectionFactory.close(con);
		}
	}

	@Override
	public String delete(int matricula) {
		String sql = "delete from aluno where matricula=?";
		Connection con = ConnectionFactory.getConnection();
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setInt(1, matricula);
			int res = pst.executeUpdate();
			if (res > 0) {
				return "Excluído com sucesso.";
			} else {
				return "Erro ao excluir.";
			}
		} catch (SQLException e) {
			return e.getMessage();
		} finally {
			ConnectionFactory.close(con);
		}
	}

	@Override
	public String update(Aluno aluno) {
		String sql = "update aluno set nome=?,ra=? where matricula=?";
		Connection con = ConnectionFactory.getConnection();
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, aluno.getNome());
			pst.setString(2, aluno.getRa());
			pst.setInt(3, aluno.getMatricula());
			int res = pst.executeUpdate();
			if (res > 0) {
				return "Alterado com sucesso.";
			} else {
				return "Erro ao alterar.";
			}
		} catch (SQLException e) {
			return e.getMessage();
		} finally {
			ConnectionFactory.close(con);
		}
	}

	@Override
	public List<Aluno> list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Aluno findByMatricula(int matricula) {
		// TODO Auto-generated method stub
		return null;
	}
}