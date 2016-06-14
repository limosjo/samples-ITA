
public class Machine implements Info, IStartable{
	int id;

	public Machine(int id) {
		this.id = id;
	}

	@Override
	public void showInfo() {
		System.out.println("My id is " + id);
		
	}

	@Override
	public void start() {
		System.out.println("Machine1 start");
		
	}

	@Override
	public void stop() {
		System.out.println("Machine1 stop");
		
	}
}
