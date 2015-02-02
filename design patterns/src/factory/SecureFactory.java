package factory;

public class SecureFactory extends ConnectioFactory {

  public Connection createConnection(String type) {
  
    if (type.equals("Oracle")) 
      return new SecureOracleConnection();
    else if (type.equals("SQL Server") 
      return new SQLServerConnection();
    else if (type.equals("MySQL") 
      return new SecureMySqlConnection();	    

  }

}

