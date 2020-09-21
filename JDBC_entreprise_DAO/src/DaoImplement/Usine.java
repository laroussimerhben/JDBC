package DaoImplement;

	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.SQLException;

	//import javax.swing.JOptionPane;//


	import dao.DaoUsine;

	public class Usine implements DaoUsine {
	
		private int NumU;
		private String  NomU, ville;
	




	public int getNumU() {
			return NumU;
		}

		public void setNumU(int numU) {
			NumU = numU;
		}

		public String getNomU() {
			return NomU;
		}

		public void setNomU(String nomU) {
			NomU = nomU;
		}

		public String getVille() {
			return ville;
		}

		public void setVille(String ville) {
			this.ville = ville;
		}

	

		public Usine(int NumU, String NomU, String ville) {
		super();
		this.NumU = NumU;
		this.NomU = NomU;
		this.ville = ville;
		
	}


		@Override
		public void creer_usine() {
			// TODO Auto-generated method stub
			
				// TODO add your handling code here:
				Connexion c= new Connexion();
				java.sql.PreparedStatement statement;
				try {
					statement = c.conn.prepareStatement("INSERT INTO `usine`(`NU`, `NomU`, `ville`) VALUES ("+this.getNumU()+",'"+ this.getNomU()+"','"+this.getVille()+"')");
					statement.executeUpdate();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
			
		}

		@Override
		public void sup_usine() {
			// TODO Auto-generated method stub
			
				// TODO add your handling code here:
				Connexion c= new Connexion();
				String sql = "DELETE FROM `usine` WHERE `NU`=?";
				java.sql.PreparedStatement statement;
				try {
					statement = c.conn.prepareStatement(sql);
					statement.setInt(1, this.getNumU());
					statement.execute();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
				//JOptionPane.showMessageDialog(null,"Supprime avec succe","",JOptionPane.INFORMATION_MESSAGE);//
				try {
					aff();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				 
		}



		@Override
		public void aff() throws SQLException {
			// TODO Auto-generated method stub

			Connexion c=new Connexion();
			PreparedStatement pst;
			pst = (PreparedStatement) c.conn.prepareStatement("SELECT * FROM usine");
			pst.executeQuery();
			ResultSet rs = (ResultSet) pst.executeQuery();
			while(rs.next())
			{
				System.out.println(rs.getString("nomU"));
			}
		}


	}


