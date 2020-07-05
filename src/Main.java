import java.io.File;

/**
 * 
 */

/**
 * @author Prasanga Fernando
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		File fileObject = new File("C:/Users/Prasanga Fernando/Desktop/fff/My new folder");
		
		if(fileObject.mkdir()) {
			System.out.println("Folder created.");
		}
		//boolean folderExists = true;
		else if(fileObject.exists()){
			System.out.println("Folder already exists.");
		}
		else {
			System.out.println("Folder not created. an error occured.");
		}
		
	}

}
