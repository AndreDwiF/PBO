
package Andre07118_Controller;

import Andre07118_Model.*;
import Andre07118_Entity.*;
import java.util.Date;

public class Andre07118_AdminController implements Andre07118_ControllerInterface{
   
    int indxlog=0;
   
    public void Andre07118_dataAdmin()
    {
       String nama[]={"admin1","admin2","admin3"};
        String password[]={"1","2","3"};
        String umur[]={"19tahun","20tahun","21tahun"};
        
        for(int i=0;i<nama.length;i++)
        {
            Andre07118_AllObjectModel.adminModel.Andre07118_insert(new Andre07118_Admin(nama[i],password[i],umur[i]));
        }
    }
    
     public void Andre07118_viewAdmin()
    {
       Andre07118_AllObjectModel.adminModel.view();
    }
     
     public void Andre07118_Listlaporanpegawai()
    {
       Andre07118_AllObjectModel.laporanModel.Andre07118_view();
    }
    
      @Override
    public void Andre07118_login(String nama, String password)
    {
        indxlog=Andre07118_AllObjectModel.adminModel.Andre07118_Cekdata(nama, password);
    }
    
    public Andre07118_Admin Andre07118_Adminentity()
    {
        return Andre07118_AllObjectModel.adminModel.getDataAdmin(indxlog);
    }
     
    public void Andre07118_updateIsVerified(int index,String laporan, Date tgl , Andre07118_Pegawai pegawaiEntity)
    {
        Andre07118_AllObjectModel.laporanModel.Andre07118_Update(index,new Andre07118_Laporan(laporan,pegawaiEntity,true,tgl));
    }
    
    public void Andre07118_delete(String nama)
    {
         Andre07118_AllObjectModel.laporanModel.Andre07118_delete(nama);
    }
    
     
     
}
