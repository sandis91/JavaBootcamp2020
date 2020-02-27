package sef.module8.sample;
// Needs to be completed
//Extending from Exception class makes CustomException a Checked Exception
public class CustomException extends Exception{


	public CustomException() {
		System.out.println("age can not be <0");
		//getMessage();
	}

	//1 - Override the toString method of Exception.
	//This message gets printed as soon as CustomException is thrown.


	@Override
	public String toString() {
		return "impossible1";
	}

	//You can also write more information about this exception in getMessage()
	//2 - Override getMessage()
	public String getMessage() {
		//3 - Enter a message in it and return the same
		String msg="impossible2";
			return msg;
	}
	
	
	
	
	
}
