package projetoluta;
public class ProjetoLuta {
    public static void main(String[] args) {
        /*int v [];
        v = new int[5];
        v[0] = new Lutador("Diego", "Brasil", 68f, 1.70f, 10,7,5, 25);
    
        
        l.status(); */
            Lutador l[]= new Lutador[6];
            l[0] = new Lutador("Diego", "Brasil", 120f, 1.70f, 10,2 ,5, 25);
            l[1] = new Lutador("Luan", "França", 75f, 1.60f, 10, 5, 3, 22);
            l[2] = new Lutador("Lucas", "Argentina", 85f, 1.75f, 8,0,3,21);
            l[3] = new Lutador("Pedro", "Uruguai", 100f , 1.80f, 8, 0, 0, 25);
            l[4] = new Lutador("Bold", "Malasia", 95f, 1.75f, 7, 2, 2, 23);
            l[5] = new Lutador("Blaziken", "Russia", 82f, 1.82f, 9, 0, 1, 27);
            
            Luta  uec1 = new Luta();
            uec1.marcarLuta(l[1], l[5]);
            uec1.lutar();
            /*l[0].status();
            l[3].status();*/
    }
    
}
