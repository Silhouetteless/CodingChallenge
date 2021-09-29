import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
//if we want to import all swing liberary we can do it with an asterisk: import javax.swing.*;
import java.awt.event.KeyListener;

public class ArrowKeysDetector {

  //making a constractor:
  public ArrowKeysDetector() {
    JFrame frame = new JFrame();
    frame.setVisible(true); //sets the GUI to be visible
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //says what happens when you click the close button
    frame.setSize(400,400); //in pixels
    frame.setFocusable(true);

    //setting labels:
    JPanel panel = new JPanel();
    JLabel up = new JLabel();
    JLabel down = new JLabel();
    JLabel left = new JLabel();
    JLabel right = new JLabel();

    panel.add(up);
    panel.add(down);
    panel.add(right);
    panel.add(left);

    up.setText("Up: 0");
    down.setText("Down: 0");
    right.setText("Right: 0");
    left.setText("Left: 0");

    //to detect keys use "key event listener"
    frame.addKeyListener(new KeyListener() {

      int upCount = 0;
      int downCount = 0;
      int rightCount = 0;
      int leftCount = 0;

        @Override 
        public void keyTyped(KeyEvent e) {

        }

        @Override
        public void keyPressed(KeyEvent e) {
              int keyCode = e.getKeyCode();
              //switch case:
              switch(keyCode) {
                case KeyEvent.VK_UP:
                    up.setText("Up: " + Integer.toSTring(upCount++));
                    break;
                case KeyEvent.VK_DOWN:
                    down.setText("Down: " + Integer.toSTring(upCount++));
                    break;
                case KeyEvent.VK_RIGHT:
                    right.setText("Right: " + Integer.toSTring(upCount++));
                    break;
                case KeyEvent.VK_LEFT:
                    left.setText("Left: " + Integer.toSTring(upCount++));
                    break;   
              }
        }

        @Override
        public void keyReleased(KeyEvent e) {
          
        }

    });


    //put the panel on the frame:
    frame.add(panel);

    


  }

  public static void main(String[] args) {
// GUI - graphical user interface; in Java it is Swing (it brings up a new window)
    new ArrowKeysDetector(); //similar to: ArrayList a = new ArrayList();

  }

}