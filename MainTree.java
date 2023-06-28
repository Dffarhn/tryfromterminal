public class MainTree {
    public static void main(String[] args) throws Exception {

        Tree<String> perusahaanku = new Tree<String>("Jim");

        
        Node<String> anak1Jim = new Node<String>("Roy");     
        Node<String> anak2Jim = new Node<String>("Mal");

        perusahaanku.addChild("Jim", anak1Jim);
        perusahaanku.addChild("Jim", anak2Jim);
        perusahaanku.addChild("Jim", "Ali");

        Node<String> anak2Roy = new Node<String>("Ica");
        
        perusahaanku.addChild("Roy", "Adi");
        perusahaanku.addChild("Roy", anak2Roy);
        perusahaanku.addChild("Ica", "Ana");
        perusahaanku.addChild("Ica", "Gal");
        
        Node<String> anak1Mal = new Node<String>("Boy");
        
        perusahaanku.addChild("Mal", anak1Mal);
        
        perusahaanku.addChild("Boy", "Abu");
        perusahaanku.addChild("Boy", "Kim");


        


        perusahaanku.draw();


        perusahaanku.CariBawahan("Mal", perusahaanku);
    }
}
