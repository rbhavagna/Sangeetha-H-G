package file;
import java.io.*;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.*;

public class Main {

	public static void main(String[] args)throws IOException
	{
		try (Scanner sc = new Scanner(System.in)){
	
		int option;
		int suboption;
		model object = new model();
		object.display();
		
		label:do
		{
			System.out.println("Choose your option");
			System.out.println("1 - ALL The Files In The Current Folder");
			System.out.println("2 - Display The Options In Our Filemanager");
			System.out.println("3 - EXIT......>");
			option=sc.nextInt();
			switch(option)
			{
			case 1:
				// you need to write the logic to display the 
					// current file name 
				System.out.println("Here the files in this folder are listed down");
				object.listfilefol();
				Iterable<Path> dirs = FileSystems.getDefault().getRootDirectories();
				for (Path name: dirs) {
				    System.err.println(name);
				}
				break;
		 
			case 2: 
				
				//you need to write the logic to display the user
					//interface to perform various operations of file
				label2:do {
					suboption=0;
				System.out.println("=======================================");
				System.out.println("Here You Can Do Some File Operations");
				System.out.println("=======================================");
				System.out.println("Choose the operation to do...");
				System.out.println("11 - Add File");
				System.out.println("12 - Delete File");
				System.out.println("13 - Search File");
				System.out.println("15 - For More Operations");
				System.out.println("14 - Back to Main Menu");
				suboption=sc.nextInt();
				switch(suboption)
				{
				
				case 11:
					object.createfile();
					continue label2;
					// you need to write a logic to add a file
				case 12:
					
					object.delete();
					continue label2;
				
					// you need to write a logic to delete a file
				case 13: 
					
					object.searchfiler();
					continue label2;
					// you need to write a logic to search a file
				case 15:
					// for more operations
					System.out.println("21-- To change path");
					System.out.println("22--To create new folder");
					System.out.println("23--To create new subfolder");
					System.out.println("24--To create new file inside specific folder");
					System.out.println("25--To change name of a file ");
					System.out.println("26--To check fileproperties ");
					System.out.println("27--To list down all text files alone");
					System.out.println("28--To list down files by size");
					int i;
					i = sc.nextInt();
					switch(i) {
					
					case 21:
						object.createfile();
						continue label2;
					case 22:
						object.createfolder();
						continue label2;
					case 23:
						object.createsubfolder();
						continue label2;
					case 24:
						object.createfileinsidefolder();
						continue label2;
					case 25:
						object.rename();
						continue label2;
					case 26:
						object.fileprop();
						continue label2;
					case 27:
						object.checkExten();
						continue label2;
					case 28:
						object.listbysize();
						continue label2;
						default:
						{if((i>28)||(i<21))
						System.err.println("Please enter a valid number");	
						continue label2;
						}
						
						}
						
						
					case 14:
						// you need to write a logic to return to main menu
						continue label;
						
						default:
						{if((suboption<11)||(suboption>15))
						System.err.println("Please enter the no between 11to 15");
						continue label2;
						}
					}
					}while(true);
				case 3: 
					System.out.println("=======================================");
					System.out.println("You are now exited from file manager ");
					System.out.println("=======================================");
					break label;
					
				default:
				{if ((option!=1)||(option!=2)||(option!=3))
				System.err.println("kindly enter 1 or 2 or 3");
				continue label;
				
				}
				
				}sc.close();
			return;	
			}while(true);
		}
		catch(InputMismatchException e)
		{
			System.err.println("===================================");
			System.err.println("OOPS!");
			System.err.println("kindly enter numbers alone");
			System.err.println("YOU ARE NOW EXITED FROM OUR APP");
			System.err.println("YOU Need to restart the application");
			System.err.println("===================================");
		}
	}
	
			
	}
	

			
	
		

	
	
	
	
	
	
	
	
	


