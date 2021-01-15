/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Andre07118_Entity;

import java.util.Date;

public class Andre07118_Laporan {
      private String Andre07118_laporan;
      private Andre07118_Pegawai Andre07118_pegawai;
      private boolean Andre07118_approve;
      private Date Andre07118_tgl;

    public Andre07118_Laporan(String Andre07118_laporan, Andre07118_Pegawai Andre07118_pegawai, boolean Andre07118_approve, Date Andre07118_tgl) {
        this.Andre07118_laporan = Andre07118_laporan;
        this.Andre07118_pegawai = Andre07118_pegawai;
        this.Andre07118_approve = Andre07118_approve;
        this.Andre07118_tgl = Andre07118_tgl;
    }
   
    

      
   

    public Andre07118_Pegawai Andre07118_getPegawai() {
        return Andre07118_pegawai;
    }

    public Date Andre07118_gettgl() {
        return Andre07118_tgl;
    }
    
    
    public boolean Andre07118_isApprove() {
        return Andre07118_approve;
    }

    public String Andre07118_getLaporan() {
        return Andre07118_laporan;
    }

    public void setAndre07118_laporan(String Andre07118_laporan) {
        this.Andre07118_laporan = Andre07118_laporan;
    }

    public void setAndre07118_pegawai(Andre07118_Pegawai Andre07118_pegawai) {
        this.Andre07118_pegawai = Andre07118_pegawai;
    }

    public void setAndre07118_approve(boolean Andre07118_approve) {
        this.Andre07118_approve = Andre07118_approve;
    }
    
 
 
}
