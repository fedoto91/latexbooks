import java.awt.*;
import javax.swing.*;

/**
 * Graphical User Interface for a
 * University student database.
 * 
 * @author (sdb) 
 * @version (Apr 2014)
 */
public class UniversityGUI
{
   private JFrame frame = new JFrame ("State U");
   private Container contentPane;
   
   public UniversityGUI()
   {  
       frame.setVisible(true);
      contentPane = frame.getContentPane();
      makeFrame();
   }
   
   private void makeFrame()
   {  contentPane.add (new JLabel ("hi there")); 
frame.pack();
    }
   
}
