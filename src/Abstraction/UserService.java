package Abstraction;

public interface UserService extends CommonService{
	
	void addUser();
	void deleteUser();
	
	
	default void editUser() {
		
	}
	
	static void updateUser() {
		
		System.out.println(".........update");
	}
	
	
}
