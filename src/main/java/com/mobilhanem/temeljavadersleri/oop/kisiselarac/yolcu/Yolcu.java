package com.mobilhanem.temeljavadersleri.oop.kisiselarac.yolcu;

import com.mobilhanem.temeljavadersleri.oop.kisiselarac.AracKullanicisi;
import com.mobilhanem.temeljavadersleri.oop.kisiselarac.OzelArac;

/**
 * Project: OOPExample
 *
 * @author ErenBasaran
 *         Created on 30/07/2017
 */
public class Yolcu {

    //Diğer sınıflardan erişilemeyecek sadece bu sınıf içerisinden erişilebilen değişkenler.
    private String yolcuCamlariAcabilir = "Yolcu camları açabilir";
    private String yolcuCamlariAcamaz = "Yolcu camlari açamaz!";
    private String yolcuKapilariAcabilir = "Yolcu kapıları açabilir";
    private String yolcuKapilariAcamaz = "Yolcu kapıları açamaz!";

    /**
     * Yolcunun yapabileceklerinin AracKullanicisi sınıfında belirlenen yapıya göre tanımlandığı
     * detayları yazdırır.
     */
    public void yolcununYapabilecekleriniYazdir(OzelArac ozelArac) {
        if(ozelArac.isCamlarAcilabilir()) {
            System.out.println(yolcuCamlariAcabilir);
        } else {
            System.out.println(yolcuCamlariAcamaz);
        }

        if(ozelArac.isKapilarAcilabilir()) {
            System.out.println(yolcuKapilariAcabilir);
        } else {
            System.out.println(yolcuKapilariAcamaz);
        }
    }

    /**
     * yolcununYapabilecekleriniYazdir metodu ile aynı işlemi yapmakta olan bu metot
     * if-else kullanımının farklı bir versiyonudur.
     */
    public void yolcununYapabilecekleriniYazdir1(OzelArac ozelArac) {
        System.out.println(ozelArac.isCamlarAcilabilir() ? yolcuCamlariAcabilir : yolcuCamlariAcamaz);
        System.out.println(ozelArac.isKapilarAcilabilir() ? yolcuKapilariAcabilir : yolcuKapilariAcamaz);
    }

}
