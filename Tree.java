public class Tree<E> {
    
    public Node<E> rootNode = new Node<E>();
    public int treeSize = 1;

    public Tree(E data) {
        this.rootNode.setData(data);
    }
    
    public int size(){
        return this.treeSize;
    }
    
    public void addChild(E parentData, Node<E> child){
        Node<E> parent = getNode(parentData);
        parent.addChild(child);
        this.treeSize++;
    }
    
    public void addChild(E parentData, E dataChild){
        Node<E> newChild = new Node<E>(dataChild);
        Node<E> parent = getNode(parentData);
        parent.addChild(newChild);
        this.treeSize++;
    }
    
    public Node<E> getNode(E data){
        return preOrderGetNode(this.rootNode, data);
    }
    
    public void draw(){
        this.preOrderDraw(this.rootNode, 0);
    }
    
    private Node<E> preOrderGetNode(Node<E> node, E data){
        if(node.getData() == data){
            return node;
        } else if(node.isLeaf() == false){
            for(int i=0;i<node.getNumChild();i++){
                Node<E> child = (Node<E>) node.getChildren().get(i);
                Node<E> returnNode = preOrderGetNode(child, data);
                if(returnNode != null)
                    return returnNode;
            }
        }
        return null;
    }
    
    private void preOrderDraw(Node<E> node, int depth){
        for(int i=0;i<depth;i++){
            System.out.print("--");
        }
        System.out.println(" " + node.getData());
        for(int i=0;i<node.getNumChild();i++){
            Node<E> child = (Node<E>) node.getChildren().get(i);
            preOrderDraw(child, depth+1);
        }
    }



    private void preOrderCariBawahan(Node<String> NodeNow) {
        for (int i = 0; i < NodeNow.getNumChild(); i++) {

            Node<String> child =(Node<String>) NodeNow.getChildren().get(i);
            System.out.println(child.getData()+" ");
            preOrderCariBawahan(child);
            
        }
        
    }


    public void CariBawahan(String nama, Tree<String> t) {
        if (t.getNode(nama).getNumChild()!= 0) {
            Node<String> Awal = t.getNode(nama);
            System.out.println("Bawahan dari "+ nama + " adalah : ");
            preOrderCariBawahan(Awal);
            
        }else{
            System.out.println("Tidak memiliki bawahan");
        }
        
    }
    
}
