import javax.swing.JOptionPane;

public class example2Darray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[][] names = new String[2][3];
		
		//store
		for(int row = 0; row<names.length;row++) {
			for(int col = 0;col<names[row].length;col++)
				names[row][col] =JOptionPane.showInputDialog("Enter the name in Row"+row+" and Column "+col);
			
		}
		
		//Print 
		for(int row=0;row<names.length;row++) {
			for(int col = 0;col<names[row].length;col++) 
				JOptionPane.showMessageDialog(null, names[row][col]+" ");
			
			
			
		}
		

	}

}
