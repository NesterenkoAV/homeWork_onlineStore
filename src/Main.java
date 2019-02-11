public class Main {
    public static void main (String[] args){
        Shop shop = new Shop ();
        try {
            GoodsForChilderens good = shop.buy ("апукпакупуа");
        }
        catch (IllegalArgumentException e){
            System.out.println(e);
            throw e;
        }
     }
}
