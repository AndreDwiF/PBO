
package Andre07118_Controller;
import Andre07118_Entity.*;
import Andre07118_Model.*;
import java.util.Date;
import javax.swing.table.DefaultTableModel;

public class Andre07118_PegawaiController implements Andre07118_ControllerInterface{
    int indxlog=0;
   
    
    public Andre07118_Pegawai getData()
    {
        return 
                Andre07118_AllObjectModel.pegawaiModel.Andre07118_getdatapegawai(indxlog);
    }
    
     public void Andre07118_laporan(String laporan,Andre07118_Pegawai pegawaiEntity,boolean Approve,Date tgl)
    {
        Andre07118_AllObjectModel.laporanModel.Andre07118_insert(new Andre07118_Laporan(laporan,pegawaiEntity,Approve,tgl));
    }
    
   public void viewpegawai()
   {
       Andre07118_AllObjectModel.laporanModel.Andre07118_view();
   }
    
    @Override
    public void Andre07118_login(String nama, String password)
    {
        indxlog=Andre07118_AllObjectModel.pegawaiModel.Andre07118_Cekdata(nama, password);
    }
    
    public void Andre07118_insert(String nama,String password,String umur)
    {
        Andre07118_AllObjectModel.pegawaiModel.Andre07118_insert(new Andre07118_Pegawai(nama,password,umur));
    }
    
    public Andre07118_Pegawai pegawaiEntity()
    {
        return Andre07118_AllObjectModel.pegawaiModel.Andre07118_getdatapegawai(indxlog);
    }
    
    public int Andre07118_cekDaftarlaporan(String nama)
    {
        int cek=Andre07118_AllObjectModel.laporanModel.Andre07118_Cekdata(nama,null);
        return cek;
    } 
    
    public Andre07118_Laporan Andre07118_showDaftarlap(int index)
    {
        return Andre07118_AllObjectModel.laporanModel.Andre07118_showDaftarlap(index);
    }
    
    
    
     public DefaultTableModel daftarlaporanpegawai()
    {
        DefaultTableModel daftarpegawai = new  DefaultTableModel();
        Object[]kolom={"Nama","Umur","Laporan","Tanggal","Status"};
        daftarpegawai.setColumnIdentifiers(kolom);
        
        int size=Andre07118_AllObjectModel.laporanModel.alldatalap().size();
        String verif=null;
        
        for(int i=0;i<size;i++)
        {
            if(Andre07118_AllObjectModel.laporanModel.alldatalap().get(i).Andre07118_isApprove()==false)
            {
                verif="Not Approved";}
            else if(Andre07118_AllObjectModel.laporanModel.alldatalap().get(i).Andre07118_isApprove()==true)
            {
                verif="Approved";
            }
            else
            {
                
            }
            
            Object[] data= new Object[5];
            data[0]=Andre07118_AllObjectModel.laporanModel.alldatalap().get(i).Andre07118_getPegawai().Andre07118_getNama();
            data[1]=Andre07118_AllObjectModel.laporanModel.alldatalap().get(i).Andre07118_getPegawai().Andre07118_getUmur();
            data[2]=Andre07118_AllObjectModel.laporanModel.alldatalap().get(i).Andre07118_getLaporan();
            data[3]=Andre07118_AllObjectModel.laporanModel.alldatalap().get(i).Andre07118_gettgl();
            data[4]=verif;
           
            daftarpegawai.addRow(data);
        }
        return daftarpegawai;
        }
}
