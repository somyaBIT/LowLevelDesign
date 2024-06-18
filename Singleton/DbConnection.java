package Singleton;
public class DbConnection{
//	Eager Intialization
//	private static final DbConnection Instance = new DbConnection() ;
	private DbConnection() {
		
	}
	
//	lazy Intialization
//	private static  DbConnection Instance;
//	public static DbConnection getInstance() {
//		if(Instance == null) {
//			Instance = new DbConnection();
//		}
//		return Instance;
//	}
	
	
//	Multithreading
//	public synchronized static DbConnection getInstance() {
//		if(Instance == null) {
//			Instance = new DbConnection();
//		}
//		return Instance;
//	}
	
//	double locking
//	private static volatile DbConnection Instance;
//	public  static DbConnection getInstance() {
//		if(Instance == null) {
//			synchronized(DbConnection.class) {
//				if(Instance == null)
//					Instance = new DbConnection();
//			}
//			
//		}
//		return Instance;
//	}

//	Bill pugh solution-better solution fro eager intialization
	public static class DbConnectionHelper{
		private static final DbConnection Instance = new DbConnection() ;
	}
	public static DbConnection getInstance() {
		return DbConnectionHelper.Instance;
	}

}
