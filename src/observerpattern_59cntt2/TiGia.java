/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerpattern_59cntt2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DangHoaiPhong
 */
public class TiGia {
    float tiGia;
    List<OnTiGiaThayDoiListener> observer = new ArrayList<>();

    public TiGia(float tiGia) {
        this.tiGia = tiGia;
    }

    public void dangKy(OnTiGiaThayDoiListener listener)
    {
        if(!observer.contains(listener))
        {
        observer.add(listener);
        listener.capNhatTiGia(tiGia);
        }
            
    }
    
    public void huyDangKy(OnTiGiaThayDoiListener listener)
    {
        if(observer.contains(listener))
        observer.remove(listener);
    }
    
    public void thayDoiTiGia(float delta)
    {
        tiGia += delta;
        for(OnTiGiaThayDoiListener listener: observer)
        {
            listener.capNhatTiGia(tiGia);
        }
    }
    public static interface OnTiGiaThayDoiListener
    {
        public void capNhatTiGia(float tiGiaMoi);
    }
}
