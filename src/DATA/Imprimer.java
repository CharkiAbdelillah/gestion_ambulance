
package DATA;

import static java.awt.image.ImageObserver.ERROR;
import java.text.MessageFormat;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import javax.swing.JTable;


public class Imprimer {
        public static void imprimerJtable(JTable jt,String text) {
                MessageFormat header=new MessageFormat(text);
                MessageFormat footer=new MessageFormat("Page{0,number,integer}");
                try{
                jt.print(JTable.PrintMode.NORMAL,header,footer);
            }catch(java.awt.print.PrinterException e){
                JOptionPane.showMessageDialog(null, e.getMessage(),"Error",ERROR_MESSAGE);
            }
        }
}
