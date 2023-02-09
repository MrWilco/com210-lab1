import javax.swing.*;

public class q3 {

public static void main(String[] args) {    
        double total = 0;
        boolean isPeas = false;
        Integer amount = Integer.parseInt(JOptionPane.showInputDialog("How many items do you want? "));
        String items[] = new String[amount];
        double prices[] = new double[amount];
        for (int num = 1; num < amount + 1; num = num + 1) { 
            items[num-1] = JOptionPane.showInputDialog("Enter Item " + num + ": ");
            prices[num-1] = Double.parseDouble(JOptionPane.showInputDialog("Enter price for item " + num + ": "));
            total = total + prices[num-1];
            if (items[num-1].equals("peas")) {
                isPeas = true;
            };
        }
        for (int num = amount; num > 0; num = num -1) {
            System.out.print(items[num-1] + ", ");
        }
        total = total / amount;
        if (isPeas == true) {
            System.out.print("Your total is $" + Math.round(total));    
        }
        else {
            System.out.print("No average ouput");
        } 
    }
}
