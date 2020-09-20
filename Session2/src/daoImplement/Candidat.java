package daoImplement;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;


import dao.DaoCandidat;

public class Candidat implements DaoCandidat {
private String nom,tel,adresse,metier;
private int id_candidat,age;




public String getNom() {
	return nom;
}

public void setNom(String nom) {
	this.nom = nom;
}

public String getTel() {
	return tel;
}

public void setTel(String tel) {
	this.tel = tel;
}

public String getAdresse() {
	return adresse;
}

public void setAdresse(String adresse) {
	this.adresse = adresse;
}

public String getMetier() {
	return metier;
}

public void setMetier(String metier) {
	this.metier = metier;
}

public int getId_candidat() {
	return id_candidat;
}

public void setId_candidat(int id_candidat) {
	this.id_candidat = id_candidat;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}




	public Candidat(String nom, String tel, String adresse, String metier, int age) {
	super();
	this.nom = nom;
	this.tel = tel;
	this.adresse = adresse;
	this.metier = metier;
	this.age = age;
}

	public Candidat(String nom, String tel, String adresse, String metier, int id_candidat, int age) {
	super();
	this.nom = nom;
	this.tel = tel;
	this.adresse = adresse;
	this.metier = metier;
	this.id_candidat = id_candidat;
	this.age = age;
}

	@Override
	public void creer_candidat() {
		// TODO Auto-generated method stub
		try {
			// TODO add your handling code here:
			Connexion c= new Connexion();
			java.sql.PreparedStatement statement = c.conn.prepareStatement("INSERT INTO `candidat`(`nom`, `age`, `tel`, `adresse`, `metier`) VALUES ('"+this.getNom()+"','"+ this.getAge()+"','"+this.getTel()+"','"+this.getAdresse()+"','"+this.getMetier()+"')");
			statement.executeUpdate();
			JOptionPane.showMessageDialog(null,"Ajoute avec	succes","",JOptionPane.INFORMATION_MESSAGE);
			} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, ex); }
	}

	@Override
	public void sup_candidat() {
		// TODO Auto-generated method stub
		try {
			// TODO add your handling code here:
			Connexion c= new Connexion();
			String sql = "DELETE FROM `candidat` WHERE `id_candidat`=?";
			java.sql.PreparedStatement statement = c.conn.prepareStatement(sql);
			statement.setInt(1, this.getId_candidat());
			statement.execute();
			JOptionPane.showMessageDialog(null,"Supprime avec succe","",JOptionPane.INFORMATION_MESSAGE);
			aff();
			} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, ex); }
	}



	@Override
	public void aff() throws SQLException {
		// TODO Auto-generated method stub

		Connexion c=new Connexion();
		PreparedStatement pst;
		pst = (PreparedStatement) c.conn.prepareStatement("SELECT * FROM candidat");
		pst.executeQuery();
		ResultSet rs = (ResultSet) pst.executeQuery();
		while(rs.next())
		{
			System.out.println(rs.getString("nom"));
		}
	}


}
