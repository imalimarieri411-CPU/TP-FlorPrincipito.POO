public class mainpf {
   public static void main(String[] args){

        Flor miFlor =new Flor();
        miFlor.setActitud("Vanidosa");
        miFlor.setApariencia ("Hermosa");
        miFlor.setEstado ("Sola");
        miFlor.setOrugas ( 500);
        Principito miPrincipito = new Principito();
        miPrincipito.setFlorPrincipito (miFlor);
        miPrincipito.setFlorPrincipito (miFlor);
        System.out.println("Flor principal del principito");
        miPrincipito.ImprimirFlorPrincipito();
        System.out.println("--------------------------------");
        Flor miFlor2 = new Flor();
        miFlor2.setActitud("Mala");
        miFlor2.setApariencia("Horrible");
        miFlor2.setEstado("Acompaniada");
        miFlor2.setOrugas(0);
        miPrincipito.setFlorPrincipito (miFlor2);
        System.out.println("Flor secundaria");
        miPrincipito.ImprimirFlorPrincipito();



        System.out.println("--------------------------------");
        System.out.println("TEXTO VERSION 1:\n");
        System.out.println("El principito tenía una flor que amaba mucho. Cuidaba de ella todos los\r\n" +
        "días, la regaba y le quitaba las "+miFlor.getOrugas() +" orugas. La flor, aunque un poco "+ miFlor.getActitud()+ ", \r\n" + 
        "era muy "+ miFlor.getApariencia()+ " y agradecía al principito por su dedicación. Un día, el\r\n" +
        "principito decidió explorar otros planetas y, aunque no quería dejar " +miFlor.getEstado()+ " \r\n" + 
        "a su flor,sabía que debía continuar su viaje para aprender más sobre el universo. ");
        System.out.println("--------------------------------");
        System.out.println("TEXTO VERSION 2:\n");
        System.out.println("El principito tenía una flor que amaba mucho. Cuidaba de ella todos los\r\n" +
        "días, la regaba y le quitaba las "+miFlor2.getOrugas() +" orugas. La flor, aunque un poco "+ miFlor2.getActitud()+ ", \r\n" + 
        "era muy "+ miFlor2.getApariencia()+ " y agradecía al principito por su dedicación. Un día, el\r\n" +
        "principito decidió explorar otros planetas y, aunque no quería dejar " +miFlor2.getEstado()+ " \r\n" + 
        "a su flor,sabía que debía continuar su viaje para aprender más sobre el universo. ");
        
   }
}
