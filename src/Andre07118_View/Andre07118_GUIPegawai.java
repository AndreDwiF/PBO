
package Andre07118_View;

import Andre07118_Controller.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.*;

public class Andre07118_GUIPegawai {
    
    
    
    private JFrame Pegawai=new JFrame();
    private JButton back,create;
    private JTable tabel=new JTable();
    private JScrollPane scroll=new JScrollPane(tabel);
    private JLabel datadiri,daftarlap,namalabel,tanggallabel;
    private JTextField laporantext,tanggaltext;
    
 
    

    public Andre07118_GUIPegawai()
    {
        
        Pegawai.setSize(720, 600);
        Pegawai.setLayout(null);
        Pegawai.getContentPane().setBackground(Color.LIGHT_GRAY);
        datadiri=new JLabel("Data Laporan Pegawai");
        datadiri.setFont(new Font("Times New Roman",Font.BOLD,30));
        datadiri.setBounds(90,30,600,50);
        Pegawai.add(datadiri);     
      
         scroll.setBounds(30, 100, 370, 200);
         tabel.setModel(Andre07118_allobjctrl.pegawai.daftarlaporanpegawai());
         Pegawai.add(scroll);
        
        daftarlap=new JLabel("Create Laporan");
        daftarlap.setBounds(450, 30, 600, 50);
        daftarlap.setFont(new Font("Times New Roman",Font.BOLD,30));
        Pegawai.add(daftarlap);
        
        
        namalabel= new JLabel("Nama Laporan");
        namalabel.setBounds(460, 100, 100, 30);
        Pegawai.add(namalabel);
    
        laporantext=new JTextField();
        laporantext.setBounds(460, 130, 200, 30);
        Pegawai.add(laporantext);
    
        tanggallabel=new JLabel("Tanggal");
        tanggallabel.setBounds(460, 160, 200, 30);
        Pegawai.add(tanggallabel);
    
        tanggaltext= new JTextField();
        tanggaltext.setBounds(460, 190, 200, 30);
        Pegawai.add(tanggaltext);
        
        create=new JButton("Create");
        create.setBounds(460, 230, 100, 30);
        create.setBackground(Color.ORANGE);
        Pegawai.add(create);
      
        back=new JButton("Kembali");
        back.setBounds(30,500,100,30);
        back.setBackground(Color.WHITE);
        Pegawai.add(back);
        
        Pegawai.setVisible(true);
        Pegawai.setLocationRelativeTo(null);
        Pegawai.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
      
         tabel.setModel(Andre07118_allobjctrl.pegawai.daftarlaporanpegawai());
        
        
         create.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae)
            {
                
              String lap=laporantext.getText();
              Date tgl=new Date(tanggaltext.getText());
              
              Andre07118_allobjctrl.pegawai.Andre07118_laporan(lap,Andre07118_allobjctrl.pegawai.getData(), false, tgl);   
                         tabel.setModel(Andre07118_allobjctrl.pegawai.daftarlaporanpegawai());
                Andre07118_kosong();
                
           }
        });    
         
         
         back.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae)
            {
                Pegawai.dispose();
                Andre07118_GUI gui=new Andre07118_GUI();
                
            }
        });
    }
   
     
    
    
    void Andre07118_kosong()
    {
         laporantext.setText(null);
         tanggaltext.setText(null);
    }
}
