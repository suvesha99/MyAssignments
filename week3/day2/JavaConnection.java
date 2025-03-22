package week3.day2;

public class JavaConnection extends MySqlConnection implements DatabaseConnection{

	public void connect() {
		System.out.println("Connect");
		
	}

	public void disconnect() {
		System.out.println("Disconect");
		
	}

	public void executeUpdate() {
		System.out.println("Execute Update");
		
	}

	@Override
	public void executeQuery() {
		System.out.println("Execute Query");
		
	}
	public static void main(String[] args) {
		JavaConnection j=new JavaConnection();
		j.connect();
		j.executeQuery();
		j.executeUpdate();
		j.disconnect();
	}

}
