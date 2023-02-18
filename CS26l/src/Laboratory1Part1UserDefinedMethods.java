import javax.swing.JOptionPane;

public class Laboratory1Part1UserDefinedMethods {
	
	static double balance=0;
	
	public static void main(String[] args) {
		// ATM
		welcome();

		do {
			String[] process = {"Deposit","Withdraw","Display"};
			String choices = (String)JOptionPane.showInputDialog(null,"Please select an option","Main Menu",
					JOptionPane.QUESTION_MESSAGE,null,process,process[0]);
			switch(choices) {
			case "Deposit":
				double dep = 0;
				deposit(dep);
				break;
			case "Withdraw":
				double wit = 0;
				withdraw(wit);
				break;
			case "Display":
				display();
				break;
			default: return;
			}
			
		}while(1==1);
		
	}
	static void welcome() {
		JOptionPane.showMessageDialog(null,"Welcome to HXH Bank","ATM-Bancnet",JOptionPane.DEFAULT_OPTION);

	}
	static double deposit(double x) {
		x = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter the amount:","DEPOSIT",JOptionPane.QUESTION_MESSAGE));
		double orig = balance;
		balance = x+balance;
		JOptionPane.showMessageDialog(null,"Original Balance:"+orig+"\nDeposited :"+x+"\nNew Balance : "+balance
				,"Transaction Successful", JOptionPane.DEFAULT_OPTION);
		return x;
		
	}
	static double withdraw(double x) {
		x = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter the amount:","WITHDRAW",JOptionPane.QUESTION_MESSAGE));
		double orig = balance;
		if(x<=balance) {
		balance = balance-x;
		JOptionPane.showMessageDialog(null,"Original Balance:"+orig+"\nWithdrawn :"+x+"\nNew Balance : "+balance
				,"Transaction Successful", JOptionPane.DEFAULT_OPTION);
		}else {
		JOptionPane.showMessageDialog(null,"Not Enough Balance", "Transaction Failed", JOptionPane.INFORMATION_MESSAGE);
		}
		return x;
	}
	static void display() {
		JOptionPane.showMessageDialog(null," Current Balance:"+balance
				,"Check Savings", JOptionPane.DEFAULT_OPTION);
	}

}
