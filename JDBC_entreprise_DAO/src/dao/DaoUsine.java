package dao;
import java.sql.SQLException;

public interface DaoUsine {
	
	//classe mere initialisation des fonctions CRUD//
	void creer_usine();
	void sup_usine();
	void aff() throws SQLException;
}
