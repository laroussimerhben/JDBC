package dao;

import java.sql.SQLException;

public abstract interface DaoCandidat {
//classe mere initialisation des fonctions CRUD//
void creer_candidat();
void sup_candidat();
void aff() throws SQLException;
}
