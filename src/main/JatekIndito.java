package main;

public class JatekIndito {
    
    public static void main(String[] args) {
        /* nincs referencia az objektumra: */
        //new Jatek().start();
        
        /* adunk referenciát az objektumra: */
        //Jatek referencia = new Jatek();
        /* a referencián keresztül elérjük az objektum tagfüggvényeit: */
        //referencia.start();
        
        /* nincs referencia, csak az objektum konstruktorát hívjuk: */
        //new KitalalosJatek();
        
        /* 3 játékos 1-1 tippel */
//        new Jatekos().tippel();
//        new Jatekos().tippel();
//        new Jatekos().tippel();
        
        /* 1 játékos tippel háromszor */
//        Jatekos jatekos1 = new Jatekos();
//        jatekos1.tippel();
//        jatekos1.tippel();
//        jatekos1.tippel();
        

        //ÖÖKLÖDÉS, PORIFORMIZMUS
        //KitalalosJatek jatek = new KitalalosJatek();
        //ha nincs öröklödés
//        CsigaVersenyJatek jatek= new CsigaVersenyJatek();
//        jatek.indito();
        //a jatek polimorf, hivatkozhat az utodjára
         Jatek kitalalos=new KitalalosJatek();
         Jatek verseny=new CsigaVersenyJatek();
         
         Jatek[] jatekok={kitalalos, verseny,new Jatek()};
         for (Jatek jatek : jatekok) {
//             //HIBÁS TERVEZÉS? NINCS KÖZÖS METODUS AZ ŐSBEN
//             if(jatek instanceof KitalalosJatek){
//                 ((KitalalosJatek)jatek).start();
//             }
//             else if(jatek instanceof CsigaVersenyJatek){
//                  ((CsigaVersenyJatek)jatek).indito();
//             }
//            
//        }

        //HELYES TERVEÉS:van közös metodusok
        //mindenki megörökli
       // jatek.kezdes();
       
   
    }
}}
