
package Andre07118_View;

import java.awt.Color;
import java.awt.Font;
import java.text.AttributedCharacterIterator;
import java.util.Map;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Andre07118_Loading {
    
    private JFrame Log= new JFrame();
     private JLabel txttime,loading;
    public Andre07118_Loading()
    {
        
    Log.setSize(700, 700);
    Log.setLayout(null);
    Log.getContentPane().setBackground(Color.lightGray);
        
    loading=new JLabel("Loading");
    loading.setBounds(250, 500, 300, 40);
    loading.setFont(new Font("Agency FB",Font.BOLD,36));
    Log.add(loading);
    
    
    txttime=new JLabel("99%");
    txttime.setBounds(350, 500, 100, 40);
    txttime.setFont(new Font("Agency FB",Font.BOLD,36));
    Log.add(txttime);
    
     Log.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Log.setVisible(true);
    Log.setLocationRelativeTo(null);
    
    
     try {
            for (int i = 0; i<=100; i++) {
                Thread.sleep(i);
                txttime.setText(Integer.toString(i)+"%");
               
            }
            Log.dispose();
            Andre07118_GUI gui=new Andre07118_GUI();
        } 
         catch (Exception ex){
        }
    }
}
