package practice04;

public class Butce {
    static int butce;
    int harclik;

    public void harclikAl (int alinanHarclik){
        harclik += alinanHarclik;
        butce -= alinanHarclik;

    }

    public void butcedenHarca (int harcanacakPara){
        butce-=harcanacakPara;

    }
    public void harclikHarca (int harclikHarcamasi){
        harclik-=harclikHarcamasi;
    }

    public void maasAl (int alinanMaas){
        butce+=alinanMaas;
    }
}
