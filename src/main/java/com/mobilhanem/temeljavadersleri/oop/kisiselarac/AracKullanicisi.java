package com.mobilhanem.temeljavadersleri.oop.kisiselarac;

import com.mobilhanem.temeljavadersleri.oop.kisiselarac.yolcu.Yolcu;

/**
 * Project: OOPExample
 *
 * @author ErenBasaran
 *         Created on 30/07/2017
 */
public class AracKullanicisi {

    public static void main(String[] args) {

        /**
         * OzelArac sınıfından bir nesne olusturuldu.
         */
        OzelArac ozelArac = new OzelArac();

        /**
         * protected erişim tipi ile tanımlanan metot aynı paket içinden çağrıldı.
         */
        ozelArac.arabayiCalistir();

        /**
         * setter yapısı protected olarak tanımlanan camlarAcilabilir değişkeni aynı paket içindeki
         * AracKullainicisi tarafından setlenebildi.
         */
        ozelArac.setCamlarAcilabilir(true);

        /**
         * setter yapısı protected olarak tanımlanan kapilarAcilabilir değişkeni aynı paket içindeki
         * AracKullainicisi tarafından setlenebildi.
         */
        ozelArac.setKapilarAcilabilir(false);

        Yolcu yolcu = new Yolcu();
        System.out.println("If-Else yapısı ile yaz:");
        yolcu.yolcununYapabilecekleriniYazdir(ozelArac);
        System.out.println("? : yapısı ile yaz:");
        yolcu.yolcununYapabilecekleriniYazdir1(ozelArac);


    }

}
