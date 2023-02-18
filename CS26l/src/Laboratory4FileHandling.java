import java.io.*;
import java.util.Scanner;

import javax.swing.JOptionPane;;
public class Laboratory4FileHandling {
	static String name,address,addresstemp;
	static int numofunits,units;
	static String filepath = "cust.txt";
	static Scanner read;


	public static void main(String[] args) throws IOException {
		// Hindi ko po natapos, prof, though I will still try to submit iyong nasolve na po dahil nahirapan po talaga ako.
		
		PrintWriter storage = new PrintWriter(new FileWriter(filepath,true));
		

		do {
			//ask input
			name = JOptionPane.showInputDialog("Enter Name");
			address = JOptionPane.showInputDialog("Enter address");
			numofunits = Integer.parseInt(JOptionPane.showInputDialog("Enter numofunits"));
			
			// write file
			 storage.printf("%s %s %d %n", name,address, numofunits);
			 JOptionPane.showMessageDialog(null, "saved");
			 
		}while(JOptionPane.showConfirmDialog(null,"More Entries?")==0);
		
		String nameStorage = JOptionPane.showInputDialog("Enter Name");
		Scanner read = new Scanner(new FileReader("cust.txt"));
		
		while(read.hasNext()) {
			String dataN = read.next();
			String dataA = read.next();
			int dataB = read.nextInt();
			read.nextLine();
			if(nameStorage.equalsIgnoreCase(dataN))
				JOptionPane.showMessageDialog(null,dataN+"\n"+dataA+"\n"+dataB);

			
		}

		// update
		
		String nameStorage2 = JOptionPane.showInputDialog("Enter Name");
		Scanner read2 = new Scanner(new FileReader("cust.txt"));

		while(read2.hasNext()) {
			String dataN = read2.next();
			String dataA = read2.next();
			int dataB = read2.nextInt();
			
			if(nameStorage2.equalsIgnoreCase(dataN)) {
				removedrecord(filepath,1);

				if("Ma-A".equalsIgnoreCase(dataA)) {
					int units = Integer.parseInt(JOptionPane.showInputDialog("Enter numofunits"));
					storage.printf("%s %s %d %n", nameStorage2,"Ma-a", units);
					storage.close();
				} if("Buhanging".equalsIgnoreCase(dataA)) {
					int units = Integer.parseInt(JOptionPane.showInputDialog("Enter numofunits"));
					storage.printf("%s %s %d %n", nameStorage2,"Buhanging", units);
					storage.close();
				}else {
					int units = Integer.parseInt(JOptionPane.showInputDialog("Enter numofunits"));
					storage.printf("%s %s %d %n", nameStorage2,"Others", units);
					storage.close();
				}
				
				
		
			
			}
		}
		read.close();

		
	}
	
	
	
	static void removedrecord(String filepath, int  deleteline) {
		String temp = "temp.txt";
		File tempfile = new File(temp);
		File oldfile = new File("cust.txt");
		
		String currentline;
		
		int line=0;
		try {
			FileWriter a = new FileWriter(tempfile,true);
			BufferedWriter b = new BufferedWriter(a);
			PrintWriter c = new PrintWriter(b);
			
			FileReader fr = new FileReader(filepath);
			BufferedReader br = new BufferedReader(fr);

		
			while((currentline=br.readLine()) !=null)
			{
				line++;
				
				if(deleteline != line)
				{
					 c.println(currentline);
				}
			}
			c.flush();
			c.close();
			fr.close();
		br.close();
		b.close();
		a.close();
			
		oldfile.delete();
		if(oldfile.delete()) {
			System.out.print("gusto");

		}else {
			System.out.print("animal");

		}
		File dump = new File("cust.txt");
		tempfile.renameTo(dump);
		}catch(Exception e) {
			System.out.print("error");
			
		}
		}

}