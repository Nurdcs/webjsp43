package modelo;
import java.sql.*;
import controlador.Conexion;
public class LineasDAO {
	Conexion con=new Conexion();
	Connection cnn=con.conexionbd();
	PreparedStatement ps;
	
	public boolean insertarlinea(LineasDTO lin) {
		int r;
		boolean dat=false;
		try {
			ps=cnn.prepareStatement("INSERT INTO lineas Values(?,?)");
			ps.setInt(1, lin.getCodigoline() );
			ps.setString(2, lin.getNombrelinea());
			r=ps.executeUpdate();
			if(r>0) {
				dat=true;
			}
		 } catch (SQLException e) {
			e.printStackTrace();
		}
		return dat;
	}
	
	

}
