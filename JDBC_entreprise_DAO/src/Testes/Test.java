package Testes;

import java.sql.SQLException;
import DaoImplement.Usine;

public class Test {

	public static void main(String[] args) throws SQLException {
		Usine cd=new Usine(18,"Peugeot","geneve");
		
cd.creer_usine();
//cd.sup_usine();//
cd.aff();
	}
	
}
