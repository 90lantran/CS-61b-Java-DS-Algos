import java.io.*;
class Nuke {
	public static void main(String[] arg) throws Exception {
	  int i;
	  System.out.println("Enter String");
          BufferedReader text = new BufferedReader(new InputStreamReader(System.in));
	  String text_input = new String(text.readLine());
	  System.out.println("string is " + text_input);
	  char[] text_input_char = new char[50];
	  text_input_char = text_input.toCharArray();
	  System.out.println("\n");
          char[] text_input_nuked = new char[50];
	  text_input_nuked[0] = text_input_char[0];
	  for(i=1; i<(text_input_char.length-1);i++)
	  {
		text_input_nuked[i] = text_input_char[i+1];
 	  }
	  String text_output = new String(text_input_nuked);
	  System.out.println("Formatted output => " + text_output);	
	  }
}
