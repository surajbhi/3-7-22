package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test1 {

	public static void main(String[] args) {

		try {
			FileInputStream fis = new FileInputStream("D:/Factorial3.txt");
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}

	}

}
