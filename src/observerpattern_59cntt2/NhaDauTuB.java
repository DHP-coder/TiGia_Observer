/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerpattern_59cntt2;

/**
 *
 * @author DangHoaiPhong
 */
public class NhaDauTuB implements TiGia.OnTiGiaThayDoiListener{
    float tiGia;
    boolean dangKy = false;
    //TiGia dichVu;
    
//    public NhaDauTuB(float tiGia) {
//        this.tiGia = tiGia;
//    }
    
    public void dangKy(TiGia dichVu)
    {
        dichVu.dangKy(this);
    }
    public void huyDangKy(TiGia dichVu)
    {
        dichVu.huyDangKy(this);
        dangKy = false;
    }
    @Override
    public void capNhatTiGia(float tiGiaMoi) {
    
        if(dangKy)
        {
        if(tiGiaMoi>tiGia)
            System.out.println("Nha dau tu B: Mua vao");
        else
            if(tiGiaMoi==tiGia)
                System.out.println("Nha dau tu B: Mua vao it");
        else
                System.out.println("Nha dau tu B: Ban ra");
        tiGia = tiGiaMoi;
    }
        else
        {
        dangKy=true;
        tiGia= tiGiaMoi;
        }
    }
}
