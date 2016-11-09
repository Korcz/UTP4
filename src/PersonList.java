import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PersonList
{
	private static List<Person> lista = new ArrayList<>();
	
	public void fillList(String fileName) throws FileNotFoundException
	{
		File file = new File(fileName);
		Scanner input = new Scanner(file);
		
		while (input.hasNextLine())
		{
			//String[] napTab
		}
	}
}
