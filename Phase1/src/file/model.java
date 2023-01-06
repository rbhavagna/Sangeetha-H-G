package file;
import java.io.*;
import java.util.*;

public class model {
	private static final char[] s = null;
	public void createfolder( ) {
		String foldername;
		System.out.println("enter the folder name to be created");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		foldername = sc.nextLine();
		String path = "C:\\Sangeetha\\ELCOT\\";
		File folder=new File(path+foldername);
		boolean present = folder.exists();
		System.out.println("folder present"+present);
		if(present == false) {
			folder.mkdir();
			present= folder.exists();
		System.out.println("folder present"+present);
		                     }
	                           }
	public void createsubfolder() {
		String foldername;
		System.out.println("enter the folder name where you want me to create a sub folder");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		foldername = sc.nextLine();
		String path = "C:\\Sangeetha\\ELCOT\\";
		System.out.println("enter the subfolder name you want to create");
		String subfolder;
		@SuppressWarnings("resource")
		Scanner sm = new Scanner(System.in);
		subfolder = sm.nextLine();
		String symbol = "\\";
		File folder=new File(path+foldername+symbol+subfolder);
		boolean present = folder.exists();
		System.out.println("folder present"+present);
		if(present == false) {
			folder.mkdirs();
			present= folder.exists();
		System.out.println("folder present"+present);
		                     }
		
	}
	public void createfileinsidefolder() {
		System.out.println("enter the folder name in which you want to create the file");
		String foldername;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		foldername = sc.nextLine();
		System.out.println("enter the file name with its type eg file.txt");
		String filename;
		@SuppressWarnings("resource")
		Scanner sm = new Scanner(System.in);
		filename = sm.nextLine();
		String path = "C:\\Sangeetha\\ELCOT\\";
		String symbol = "\\";
		File file = new File(path+foldername+symbol+filename);
		boolean present = file.exists();
		System.out.println("folder present"+present);
		if(present == false) {
		try {
			
			boolean created =file.createNewFile();
			System.out.println("file created"+created);
		}catch(IOException e) {
			e.printStackTrace();
		}
		}
		
	}
	public void rename() throws IOException {
		File file = new File("c:\\Sangeetha\\ELCOT\\filemanager\\term.txt");
		file.createNewFile();
		File newname = new File("c:\\Sangeetha\\ELCOT\\filemanager\\term.txt");
		//oldname.renameto(newname)
		boolean succesfull = file.renameTo(newname);
		System.out.println("rename completed"+succesfull);
	}
	public void nameoffile() {
		// name of the object example file newname
		//obj name.getname()
		File file = new File("c:\\Sangeetha\\ELCOT\\filemanager\\term.txt");
		System.out.println("filename"+file.getName());
	}
	public void fileprop() {
		File file = new File("c:\\Sangeetha\\ELCOT\\filemanager\\term.txt");
		System.out.println(file.canExecute());
		System.out.println(file.canRead());
		System.out.println(file.canWrite());
	}
	// name alone
	public void listall() {
		 File file = new File ("c:\\Sangeetha\\ELCOT");
		 String[]listof = file.list();
		 for(String s:listof )
			 System.err.println(s);
	}
	// with location
		public void listfilefol() {
			File file = new File ("c:\\Sangeetha\\ELCOT");
			 File []listof = file.listFiles();
			 for(@SuppressWarnings("unused") File s:listof );
				 System.err.println(s);
			 //for printing file alone
			 for(File s:listof )
				 if(s.isFile())
				 System.err.println(s);
			 // for printing folder
			 for(File s:listof )
				 if(s.isDirectory())
				 System.err.println(s);
		}
		public void checkExten() {
			File file = new File("c:\\Sangeetha\\ELCOT\\filemanager");
			File[] filefolder= file.listFiles();
			for(File f : filefolder) {
				if(f.isFile()) {//to get file alone and to avoid folder
				String s = f.getName();
				// s is file name t is extension name
				int lastdot = s.lastIndexOf(".");
				// to get all extension alone with 
				String t=s.substring(lastdot+1);
				if(t.equals("txt"))
				System.out.println(s);
				}
			}
		}
		public void listbysize() {
			// f.length()>size in bytes
			File file = new File("c:\\Sangeetha\\ELCOT");
			File[] filefolder=file.listFiles();
			for(File f: filefolder) {
				if(f.length()<50000)
					System.out.println(f.getName());
			}
		}
		// write by file writer
		public void write() throws IOException {
			File file = new File("c:\\Sangeetha\\ELCOT\\filemanager\\rio.txt");
			file.createNewFile();
			FileWriter write = new FileWriter(file);
			write.write("hi");
			write.flush();
			write.close();
		}
		// read by file reader 
				public void read() throws IOException {
					File file = new File("c:\\Sangeetha\\ELCOT\\filemanager\\rio.txt");
					file.createNewFile();
					 FileReader f2 = new FileReader(file);
					    int x = f2.read();
					    while(x != -1){
					        System.out.println((char)x);
					        x = f2.read();
					    }
					    f2.close();
				}
				public void createfile() {
					System.out.println("enter the file name with its type eg file.txt");
					String filename;
					@SuppressWarnings("resource")
					Scanner sm = new Scanner(System.in);
					filename = sm.nextLine();
					String path = "C:\\Sangeetha\\ELCOT\\";
					String symbol = "\\";
					File file = new File(path+symbol+filename);
					boolean present = file.exists();
					System.out.println("folder present"+present);
					if(present == false) {
					try {
						boolean created =file.createNewFile();
						System.out.println("file created"+created);
					}catch(IOException e) {
						e.printStackTrace();
					}
					}
				}
				public void searchfiler() {
					System.out.println("enter the filename you want to search with its format eg text.txt");
					String filename;
					@SuppressWarnings("resource")
					Scanner sm = new Scanner(System.in);
					filename = sm.nextLine();
					String path = "C:\\Sangeetha\\ELCOT\\";
					@SuppressWarnings("unused")
					String symbol = "\\";
					File file = new File(path);
					File[] filefolder=file.listFiles();
					int i=50;
					boolean check = true;
					for(File f: filefolder) {
						String s = filefolder[i].getName();
						//System.out.println(s);
						 check = s.equalsIgnoreCase(filename);
						if(check == true ) {
							System.out.println("found"+"    "+f.getName());
							break;
						}
							i++;
						
					}
					if(check == false)
						System.out.println("file not found");
				}
				public void delete() {
					System.out.println("enter the filename you want to delete");
					String filename = new String();
					@SuppressWarnings("resource")
					Scanner sc = new Scanner(System.in);
					filename = sc.nextLine();
					String path = "C:\\Sangeetha\\ELCOT\\";
					String symbol = "\\";
					File file = new File(path+symbol+filename);
					System.out.println(file.getName());
			    if (file.delete()) {
			        System.out.println("File deleted successfully");
			    }
			    else {
			        System.out.println("Failed to delete the file");
			    }
					
				}
				public static void main(String[] args) throws IOException {
					// TODO Auto-generated method stub

				}
				public void display() {
					// TODO Auto-generated method stub
					System.out.println("========================================================");
					System.out.println("WELCOME TO YOUR FILE MANAGER");
					System.out.println("DEVELOPER NAME =======> SANGEETHA H G");
					System.out.println("========================================================");

				}


			}