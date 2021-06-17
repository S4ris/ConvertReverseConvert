package ConverterProject;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        JPanel panel = new JPanel();
        Converter convert = new Converter();
        Reverse reverse = new Reverse();
        Decimal decimal = new Decimal();

        Object[] options = {"Reverse and convert to decimal", "Close"};

        //Getting input form user
        String input = JOptionPane.showInputDialog("Type a number to convert: ");
        int num = Integer.parseInt(input);

        JOptionPane.showOptionDialog(null, "Binary version of " + num + " is: " + convert.toBinary(num),
                "Converter", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, null);

        JOptionPane.showMessageDialog(null, "Reversed binary number: " + reverse.reverseBinary(convert.toBinary(num))
                + " and here is the decimal version " + decimal.toDecimal(reverse.reverseBinary(convert.toBinary(num))));


    }
}

