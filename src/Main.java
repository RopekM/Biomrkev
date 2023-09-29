/// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {



    public static void main(String[] args) {


        String Name = "Karel";         //Jméno a příjmení prodejce
        String Surname = "Hromdopole";
        String DoB = "16.2.1978";      // Datum narození prodejce.
        float contracts = 15;            //Počet dosud sjednaných smluv.
        float SoldCarrot = 6;            //Celkové množství prodané mrkve v tunách.
        String City = "Prostějov";     //  Název města, kde prodejce sídlí.
        String SPZ = "0BJ5156";        //Registrační značka vozidla („SPZ“).
        double consumption = 7.6;      //Spotřeba firemního vozidla v litrech na 100 km.
        String IP = "192.168.30.12";   //IP adresa verze 4 firemního počítače.

        String message = "Jméno:"+Name+" Příjmení:"+Surname+ " Datum narození:"+DoB+ " Počet smluv:"+contracts+ " Prodaných mrkví:"+SoldCarrot+"t " + " Město:"+City+ " SPZ:"+SPZ+" Spotřeba:"+consumption+" IP:"+IP; // metoda výpisu 1
        float pomer = SoldCarrot/contracts;
        String message2 = "Poměr prodaných mrkví:"+pomer+"t";
        System.out.println(message);
        System.out.println(message2);











        //Více o formátu IP adresy verze 4 viz například IP adresa verze 4

    }
}