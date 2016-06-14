
public class Robot {
	double id;

	class Brain{
		public void think(){
			System.out.println("Robot " + id + " is thinking");
		}
	}
	public Robot(double id) {
		this.id = id;
	}
	public void play(){
		Brain brain = new Brain();
		brain.think();
		System.out.println("finished");
		class Temp{
			public void doSomething(){
				System.out.println("did something");
			}
		}
		Temp temp = new Temp();
		temp.doSomething();
	}
	
}
