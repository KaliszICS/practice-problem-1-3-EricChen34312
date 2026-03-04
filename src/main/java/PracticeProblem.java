import java.io.*;
import java.io.IOException;

public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static String readFile(String filename){
		//Initiate bufferedreader or something (and the output string)
		BufferedReader reader = null;
		String out = "";

		try {

			//make the thing be able to read the file
			reader = new BufferedReader(new FileReader(filename));
			String line;

			//if there is a line then output that line plus a new line character
			while((line = reader.readLine()) != null){
				out += line + '\n';
			}
		}
		catch (IOException e){
			System.out.println("uh oh");
		}
		finally {
			try {
				//close the darn thing
				if(reader != null){
					reader.close();
				}
			}
			catch(IOException e){
				//how does this even happen
				System.out.println("super uh oh");
			}
		}

		return out;
	}

	public static String backwardsReadFile(String filename){
		//initiate the thing but use filereader instead for variety fr
		FileReader reader = null;
		String out = "";

		try{

			//try to read the thing and store char 
			reader = new FileReader(filename);
			int c;

			//append the output string to the char if not null
			while((c = reader.read()) != -1){
				out = ((char) c) + out;
			}
		} 
		catch (IOException e){
			System.out.println("uh oh");
		}
		finally {
			try{
				//close reader if ever opened
				if(reader != null){
					reader.close();
				}
			}
			catch(IOException e) {
				System.out.println("super uh oh");
			}
		}

		return out;
	}
}
