public class Principito {
    
    private Flor FlorPrincipito;
    
    
    public void Cuidar(){
        System.out.println();
    }
    public void Regar(){

    }
    public void Quitar(){
        
    }
    public void Explorar(){

        
        
    }
    public void Amar(){
    
    }
    public void ImprimirFlorPrincipito(){
        System.out.println("Actitud: " + FlorPrincipito.getActitud());
        System.out.println("Apariencia: " + FlorPrincipito.getApariencia());
        System.out.println("Estado: "+ FlorPrincipito.getEstado());
        System.out.println("Orugas: " + FlorPrincipito.getOrugas());    
    }
    public Flor getFlorPrincipito() {
        return FlorPrincipito;
    }
    public void setFlorPrincipito(Flor florPrincipito) {
        FlorPrincipito = florPrincipito;
    }

    



}
