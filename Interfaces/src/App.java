
public class App {
	public static void main(String[] args){
		Person person1 = new Person("Mike");
		
		Machine machine1 = new Machine(122);
		
		person1.showInfo();
		machine1.showInfo();
		
		machine1.start();
		machine1.stop();
		
	}
}
