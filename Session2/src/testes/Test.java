package testes;

import java.sql.SQLException;
import daoImplement.Candidat;

public class Test {

	public static void main(String[] args) throws SQLException {
		Candidat cd=new Candidat("laroussi","20744351","Aucune","formateur",30);
cd.creer_candidat();
cd.sup_candidat();
cd.aff();
	}
	
}
