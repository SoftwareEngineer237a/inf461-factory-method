public class Client {

    public static void main (String[] args){
        System.out.println("Hello World");

        FabriqueProduit fabriqueProduit = new FabriqueProduit();
        Produit produit = null;

        produit = fabriqueProduit.createProduit(fabriqueProduit.typeA);
        produit.methodproduit();

        produit = fabriqueProduit.createProduit(fabriqueProduit.typeB);
        produit.methodproduit();

        produit = fabriqueProduit.createProduit(fabriqueProduit.typeC);
        produit.methodproduit();

        produit = fabriqueProduit.createProduit(fabriqueProduit.typeD);
        produit.methodproduit();

        String e = "E";
        produit = fabriqueProduit.createProduit(e);
        produit.methodproduit();
    }
}