import java.util.*;

import javax.swing.JOptionPane;
public class Laboratory5ArraylistsandVectors {

	public static void main(String[] args) {
		//Program 1: ArrayList

		ArrayList<String> brands = new ArrayList<String>(); //1
		
		brands.add("Hp"); //2
		brands.add("Acer");
		brands.add("Apple");
		JOptionPane.showMessageDialog(null, brands.size());//3
		
		brands.remove(1); //4
		
		brands.sort(null); //5

		JOptionPane.showMessageDialog(null, brands.size()); //6
		
		brands.removeAll(brands); //7
		
		JOptionPane.showMessageDialog(null, brands.size()); //8
		
		//Program 2: Vector
		
		Vector<Integer> magtanggol = new Vector<Integer>(5,2); //1
			
		for(int i = 0;i<magtanggol.capacity();i++) {
			int value =Integer.parseInt(JOptionPane.showInputDialog("Enter the value"));
			magtanggol.add(value);
		}
		
		JOptionPane.showMessageDialog(null, magtanggol);

		magtanggol.remove(0);
		
		JOptionPane.showMessageDialog(null, magtanggol+" Size :"+magtanggol.size()+" Capacity :"+magtanggol.capacity());
		
		int value = Integer.parseInt(JOptionPane.showInputDialog("Enter the value"));
		
		JOptionPane.showMessageDialog(null,magtanggol.indexOf(value));
		
        LinkedHashSet<Integer> duplicate = new LinkedHashSet<Integer>(magtanggol);
        magtanggol.clear();
        magtanggol.addAll(duplicate);
        
		JOptionPane.showMessageDialog(null, magtanggol);
		
	}

		
	}


