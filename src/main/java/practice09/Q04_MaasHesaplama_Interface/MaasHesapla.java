package practice09.Q04_MaasHesaplama_Interface;

public class MaasHesapla implements MaasArtir, Vergi{
    @Override
    public double yillikEkstra(int calsimaYili) {
        System.out.println("YillikEkstra"+calsimaYili*100);
        return calsimaYili*100;
    }

    @Override
    public double saatlikEkstra(int calismaSaati) {

                if(calismaSaati-160>0){
                    System.out.println("saatlik Ekstra"+(calismaSaati-160)*10);
                    return (calismaSaati-160)*10;
                }else {
                    System.out.println("Sattlik ekstra:"+0);
                    return 0;
                }
    }

    @Override
    public double vergi(double brutMaas, int calismaYili) {
        if (calismaYili >= 10) {
            System.out.println("Vergi"+brutMaas * 30 / 100);
            return brutMaas * 30 / 100;

        }else {
            System.out.println("Vergi="+brutMaas*20/100);
            return brutMaas*20/100;
        }
    }

    public double netMaas (double brutMaas, int calismaYili, int calismaSaati){
        return brutMaas+yillikEkstra(calismaYili)+saatlikEkstra(calismaSaati)-vergi(brutMaas,calismaYili);
    }

}
