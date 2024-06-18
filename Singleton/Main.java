package Singleton;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			DbConnection dbconnection1 = DbConnection.getInstance();
			DbConnection dbconnection2 = DbConnection.getInstance();
			System.out.print(dbconnection1 == dbconnection2);
			
	}

}
