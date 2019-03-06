/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;
import Data.Acuatico;
import Data.AguaDulce;
import Data.AguaSalada;
import Data.Monotrema;
import Data.NoVoladora;
import Data.Viviparo;
import Data.Voladora;
/**
 *
 * @author Estudiante
 */
public class Animalandia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        AguaDulce pezAguaDulce1 = new AguaDulce("Rio", 25, "ovoviviparo", false, 0, "varios", true,
                "Chordata", 30, "Guppy", "Macho",new String [] {"Venezuela","Colombia"}, false, true);
        AguaDulce pezAguaDulce2 = new AguaDulce("Rio", 28, "ovoviviparo", false, 2, "blanco y negro", false,
                "Chordata", 200, "Sorubim", "Hembra",new String [] {"Colombia"}, false, true);
        AguaSalada pezAguaSalada1= new AguaSalada(false, "Oviparo", false,false,
            0, "amarillo", true, "Chordata", 100,
            "Pez cirjano amarillo", "Hembra",new String[] {"Hawai","Japon","Filipinas"}, false, true);
        AguaSalada pezAguaSalada2= new AguaSalada(false, 0, "blanco y anaranjado", true, "Chordata", 56,
            "Pez payaso", "Macho",new String[] {"Madagascar","Indonesia","China"}, false, true);
        
        Acuatico moluscoAcuatico1= new Acuatico(2,0.25,"Salada",0,8,true,"Mollusca", false, true,"Pulpito","Macho",
                new String[]{"Mar mediterraneo","Ataltnico oriental"}, false, false);
        Acuatico moluscoAcuatico2= new Acuatico(2,4,"Salada",2,6,true,"Mollusca", false, true,"Calamardo","Macho",
                new String[]{"Pacifico","Indico"}, false, false);
        
        Viviparo viviparo1= new Viviparo(12,1,false,true,false,6,false,"Mamuctus",200,"ManiManito El Mamutsito","Macho",
                new String[]{"Africa","Europa"},true,true);
        Viviparo viviparo2= new Viviparo(9,2,true,true,false,2,true,"Miquito",206,"Danielito el Stralopitecus","Macho creo :v",
                new String[]{"Todo el mundo (es una plaga)"},false,true);
        Monotrema monotrema1= new Monotrema(false, 0.1, false, true, false, 6, false, "chordata", 100, "Perry el ornitorrinco",
                "Macho", new String[]{"Casa de Phineas y Ferb"}, false, true);
        Monotrema monotrema2= new Monotrema(true, 0.08, true, true, false, 4, false, "chordata", 87, "Equidna", "Hembra", 
            new String []{"Nueva Guinea","Australia"}, false, true);
        
        NoVoladora aveNoVoladora1 = new NoVoladora(false, 0.5, "Grande", true, "Blanco y gris", false, false,"chordata",70 ,
                "Dodo", "Hembra", new String[]{"Madagascar"}, true, true);
        NoVoladora aveNoVoladora2 = new NoVoladora(false, 1.2, "Pequeño", true, "Negro y gris", false, true, "Chordata", 80, "Avestruz", 
                "Macho", new String[]{"Australia"}, false, true);
        Voladora aveVoladora1= new Voladora("Reptiles, carnivora", 120000, false, true, "Negro", true, 
                false, "Chordata", 95, "Aguila", "Macho", new String[]{"Todo el mundo"},false, true);
        Voladora aveVoladora2= new Voladora("Insectos y nectar de flores", 79000, false, true, "Colorido", true, 
                false, "Chordata", 65, "Colibri", "Hembra", new String[]{"Todo el mundo"}, false, true); 
        
    }
    
}
