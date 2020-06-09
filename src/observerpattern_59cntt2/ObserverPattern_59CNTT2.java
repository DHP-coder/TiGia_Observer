/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerpattern_59cntt2;

import java.util.Scanner;

/**
 *
 * @author DangHoaiPhong
 */
public class ObserverPattern_59CNTT2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TiGia dichVu = new TiGia(100);
        NhaDauTuA ndtA = new NhaDauTuA();
        NhaDauTuB ndtB = new NhaDauTuB();
        ndtA.dangKy(dichVu);
        ndtB.dangKy(dichVu);
        //ndtA.capNhatTiGia(120);
        while(true)
        {
            Scanner scanner = new Scanner(System.in);
            float tiGia=0;
            System.out.print("Nhap khoang thay doi ti gia: ");
            tiGia = scanner.nextFloat();
            dichVu.thayDoiTiGia(tiGia);
            System.out.println("Tiep tuc: Y/N");
            String xacNhan;
            xacNhan = scanner.next();
            if(xacNhan.equalsIgnoreCase("N"))
                break;
        }
    }
    
}
