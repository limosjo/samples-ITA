import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class App {

	public static void main(String[] args) {
//		File file = new File("test.txt");
//		try {
//			FileReader fr = new FileReader(file);
//			System.out.println("continuing...");
//		} catch (FileNotFoundException e) {
//			System.out.println("File not found " + file.toString());
//		}
//		System.out.println("Finished");
		openFile("test.txt");
		Test test = new Test();
		try {
			test.run();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void openFile(String filename){
		File file = new File(filename);
		try {
			FileReader fr = new FileReader(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
