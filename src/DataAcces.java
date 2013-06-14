import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.mysql.jdbc.Connection;

import com.mysql.jdbc.Connection;


public class DataAcces {
	
	private String server;
	private String database;
	private String user;
	private String password;
	private String txtEngine;
	Connection conexion;
	
	public DataAcces(String BDEngine){
		this.txtEngine=BDEngine;
		
			try {
				if(BDEngine.equalsIgnoreCase("MYSQL")){
					Class.forName("com.mysql.jbdc.Driver").newInstance();
				}else if(BDEngine.equalsIgnoreCase("ORACLE")){
					Class.forName("oracle.jdbc.driver.OracleDriver").newInstance();
				}
				
			} catch(InstantiationException e) {
			
			} catch (IllegalAccessException e) {
				
			} catch (ClassNotFoundException e) {
				
		}
	}
	
	public Connection conectar(){
		try{
		if(this.txtEngine.equalsIgnoreCase("MYSQL")){
		return this.conexion= (Connection) DriverManager.getConnection("jdbc:mysql://"+this.server+"/"+this.database+""+this.user,this.password);
		}else if(this.txtEngine.equalsIgnoreCase("ORACLE")){
			return this.conexion=(Connection) DriverManager.getConnection("jdbc:oracle:oci:@ORACLEBD","user","passw");
		}
		}catch(SQLException ex){
			
		}
		return conexion;
	}

	public String getServer() {
		return server;
	}

	public void setServer(String server) {
		this.server = server;
	}

	public String getDatabase() {
		return database;
	}

	public void setDatabase(String database) {
		this.database = database;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	


}
