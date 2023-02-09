import javax.swing.*;

public class q2 {

public static void main(String[] args) {    
        String items[] = new String[3];
        double prices[] = new double[3];
        double total = 0;
        boolean isPeas = false;
        for (int num = 1; num < 4; num = num + 1) { 
            items[num-1] = JOptionPane.showInputDialog("Enter Item " + num + ": ");
            prices[num-1] = Double.parseDouble(JOptionPane.showInputDialog("Enter price for item " + num + ": "));
            total = total + prices[num-1];
            // System.out.print(items[num-1]);
            if (items[num-1].equals("peas")) {
                isPeas = true;
            };
        }
        // System.out.print(isPeas);
        total = total / 3;
        if (isPeas == true) {
            System.out.print("Your total is $" + Math.round(total));    
        }
        else {
            System.out.print("No average ouput");
        } 
    }
}
