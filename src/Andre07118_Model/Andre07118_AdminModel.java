/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Andre07118_Model;
import Andre07118_Entity.Andre07118_Admin;
import java.util.ArrayList;

public class Andre07118_AdminModel implements Andre07118_ModelInterfaces{
    
    public ArrayList <Andre07118_Admin> Andre07118_admindata;
    
     public Andre07118_AdminModel(){
        Andre07118_admindata = new ArrayList<Andre07118_Admin>();
    } 
     
    public void Andre07118_insert(Andre07118_Admin admin)
    {
        Andre07118_admindata.add(admin);
        
    } 
    
   
    
    public Andre07118_Admin getDataAdmin(int index){
        return Andre07118_admindata.get(index);
    }
    
    public void view(){
        for(Andre07118_Admin admin : Andre07118_admindata){
            System.out.println("Nama: " + admin.Andre07118_nama);
            System.out.println("Password: " + admin.Andre07118_password);
            System.out.println("Umur: " + admin.Andre07118_umur);
        }
    }
     @Override
     public int Andre07118_Cekdata(String nama, String password){
        int loop = 0;
        for(Andre07118_Admin adminEntity07118 : Andre07118_admindata){
            if(adminEntity07118.getNama().equals(nama) && adminEntity07118.getPassword().equals(password))
            {
                break;
            }else{
                loop++;
            }
        }
        
        return loop;
    }
     
     public ArrayList<Andre07118_Admin> getadmin() {
        return Andre07118_admindata;
    }
     
    
}

 