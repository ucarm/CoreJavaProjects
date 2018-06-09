package sort3integers;

import javax.swing.JOptionPane;

public class sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        //Prompt user to enter three integers

		        String stringNum1 = JOptionPane.showInputDialog(null, "Please enter 1st Integer: ");
		        String stringNum2 = JOptionPane.showInputDialog(null, "Please enter 2nd Integer: ");
		        String stringNum3 = JOptionPane.showInputDialog(null, "Please enter 3rd Integer: ");

		        int num1 = Integer.parseInt(stringNum1);
		        int num2 = Integer.parseInt(stringNum2);
		        int num3 = Integer.parseInt(stringNum3);

		        if ((num1 > num2 && num1 > num3))
		        {
		            if(num2 > num3)
		            {
		                System.out.print(num3 + " " + num2 + " " + num1);
		            }
		            else
		                System.out.print(num2 + " " + num3 + " " + num1);
		        }
		        else if ((num2 > num1 && num2 > num3))
		        {
		            if(num1 > num3)
		            {
		                System.out.print(num3 + " " + num1 + " " + num1);
		            }
		            else
		                {
		                System.out.print(num1 + " " + num3 + " " + num2);
		                }
		        }
		        else if ((num3 > num1 && num3 > num2))
		        {
		            if(num1 > num2)
		            {
		                System.out.print(num2 + " " + num1 + " " + num3);
		            }
		            else
		                System.out.print(num1 + " " + num2 + " " + num3);
		        }
		        else
		        {
		            System.out.println("ERROR!");
		        }

		    }

		}
		

