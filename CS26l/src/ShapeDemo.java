import javax.swing.JOptionPane;

public class ShapeDemo {

	public static void main(String[] args) {
		Rectangle myRect = new Rectangle(30,20);
		JOptionPane.showMessageDialog(null, "Dimensions of Rectangle \n"+myRect);
		JOptionPane.showMessageDialog(null, "Area of Rectangle :\n"+myRect.area());
		
		Box myBox = new Box(40,50,60);
		JOptionPane.showMessageDialog(null, "Dimensions of Box \n"+myBox);
		JOptionPane.showMessageDialog(null, "Volume of Box :\n"+myBox.volume());



	}

}
