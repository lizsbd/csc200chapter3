import javax.swing.JOptionPane;

public class Enum {

    public enum Month { Dec, Jan, Feb, Mar, Apr, May, June, July, Aug, Sep, Oct, Nov}
        public static void main(String[] args){

        Month[] choices = { Month.Dec, Month.Jan, Month.Feb, Month.Mar, Month.Apr, Month.May, Month.June, Month.July, Month.Aug, Month.Sep, Month.Oct, Month.Nov};
        Month input = (Month) JOptionPane.showInputDialog(null, "Select your favorite month", "Month", JOptionPane.INFORMATION_MESSAGE, null, choices, choices[11]);
      
      String output;
      while(input != null){
            switch(input){
                case Dec:
                    output = " Do you want to build a snow man?";
                    break;
                case Jan:
                     output = " Do you want to build a snow man?";
                    break;
                case Feb:
                    output = " Do you want to build a snow man?";
                    break;
                case Mar:
                    output = " Happy Spring days!";
                    break;
                case Apr:
                    output = " Happy Spring days!";
                    break;
                case May:
                    output = " Happy Spring days!";
                    break;
                case June:
                    output = "It's a summer time.";
                    break;
                case July:
                    output = "It's a summer time.";
                    break;
                case Aug:
                    output = "It's a summer time.";
                    break;
                default:
                    output = "Welcome to the foliage season!";
                    break;
            }



            JOptionPane.showMessageDialog(null, output, "Month", JOptionPane.INFORMATION_MESSAGE);
            input = (Month) JOptionPane.showInputDialog(null, "Select your favorite month", "Month", JOptionPane.INFORMATION_MESSAGE, null, choices, choices[11]);
        }

    }
    }

