import javax.swing.*;

public class q1 {

public static void main(String[] args) {    
        String items[] = new String[3];
        double prices[] = new double[3];
        double total = 0;
        for (int num = 1; num < 4; num = num + 1) { 
            items[num-1] = JOptionPane.showInputDialog("Enter Item " + num + ": ");
            prices[num-1] = Double.parseDouble(JOptionPane.showInputDialog("Enter price for item " + num + ": "));
            total = total + prices[num-1];
        }
        total = total / 3;
    System.out.print("Your total is $" + Math.round(total));    
    }
}
