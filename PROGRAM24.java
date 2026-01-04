/*
Create a user defined exception class for handling different types of errors.
Create another class for reading and validating a password based on the certain conditions:
	1. password should be a alphanumeric
	2. At least 1 small letter
	3. At least 1 Upper case letter
	4. Special Characters allowed are @,*,!,{,},(,),[,],&,=
	5. At least 1 Special character should be there 
	6. There should not be any consecutive repetition of letters
	7. Minimum Length = 8
*/

/*PROGRAM 24 PASSWORD VALIDATION
@ALBIN MAMMEN MATHEW
Roll No: 08 
Date: 16/12/2025
*/


import java.util.*;

class UDE extends Exception {
	String strError;

	public UDE() {
		strError = "Unknown Error";
	}

	public UDE(String s) {
		strError = s;
	}

	public String showError() {
		return strError;
	}
}

class Password {
	String s;
	Scanner sc = new Scanner(System.in);

	public void readPass() {
		System.out.print("Enter password :");
		s = sc.nextLine();
	}

	public boolean specialchar(char[] ch) {
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == '@' || ch[i] == '*' || ch[i] == '!' || ch[i] == '{' || ch[i] == '}' || ch[i] == '('
					|| ch[i] == ')' || ch[i] == '[' || ch[i] == ']' || ch[i] == '&' || ch[i] == '=') {
				return true;
			}
		}
		return false;
	}

	public boolean smallalpha(char[] ch) {
		for (int i = 0; i < ch.length; i++) {
			if (Character.isLowerCase(ch[i]))
				return true;
		}
		return false;
	}

	public boolean bigalpha(char[] ch) {
		for (int i = 0; i < ch.length; i++) {
			if (Character.isUpperCase(ch[i]))
				return true;
		}
		return false;
	}

	public boolean numbercheck(char[] ch) {
		for (int i = 0; i < ch.length; i++) {
			if (Character.isDigit(ch[i]))
				return true;
		}
		return false;
	}

	public boolean consecutive(char[] ch) {
		for (int i = 0; i < ch.length - 1; i++) {
			if (ch[i] == (ch[i + 1]))
				return true;
		}
		return false;
	}

	public boolean invalidCharCheck(char[] ch) {
		for (int i = 0; i < ch.length; i++) {
			boolean isSpecial = (ch[i] == '@' || ch[i] == '*' || ch[i] == '!' || ch[i] == '{' || ch[i] == '}'
					|| ch[i] == '(' || ch[i] == ')' || ch[i] == '[' || ch[i] == ']' || ch[i] == '&' || ch[i] == '=');
			if (!Character.isLetterOrDigit(ch[i]) && !isSpecial) {
				return true;
			}
		}
		return false;
	}

	public void validate() {
		char[] ch = s.toCharArray();
		try {
			if (ch.length < 8) {
				throw new UDE("Min length should be 8");
			}
			if (consecutive(ch)) {
				throw new UDE("Consecutive characters cannot be same");
			}
			if (invalidCharCheck(ch)) {
				throw new UDE("Invalid characters found! \n Valid Characters: @,*,!,{,},(,),[,],&,=");
			}
			if (!specialchar(ch)) {
				throw new UDE("Atleast 1 special Character required");
			}
			if (!smallalpha(ch)) {
				throw new UDE("Atleast 1 Lower case alphabet required");
			}
			if (!bigalpha(ch)) {
				throw new UDE("Atleast 1 Upper case alphabet required");
			}
			if (!numbercheck(ch)) {
				throw new UDE("At least 1 digit required");
			}
			System.out.println("Password is valid");
		} catch (UDE e) {
			System.out.println(e.showError());
		}
	}
}

class PROGRAM24 {
	public static void main(String args[]) {
		Password pass = new Password();
		pass.readPass();
		pass.validate();
		pass.sc.close();
	}
}