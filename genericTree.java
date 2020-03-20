import java.util.ArrayList;
import java.util.LinkedList;

public class genericTree{
    private class Node{
        int data;
        ArrayList<Node>children=new ArrayList<>();
        Node(int acceptedValue){
            this.data=acceptedValue;
        }
    }
    private Node root;
    public int size;

    genericTree(int[]arr){
        this.root=construct(arr);
        this.size=size(root);

    }
    private Node construct(int [] arr){
        LinkedList<Node> stack=new LinkedList<>();
        for(int i=0;i<=arr.length-1;i++){
        if(arr[i]!=-1){
        Node node=new Node(arr[i]);
        stack.addFirst(node);

        
        }else{
        Node rchild=stack.removeFirst();
        stack.getFirst().children.add(rchild);
        }
    }
    return stack.removeFirst();
    }

    public void display(){
        d(this.root);
    }
    private void d(Node node){
        String str =" ";
        str=node.data+ "->";
        for(Node child:node.children){
            str+=child.data+ ",";

        }
        System.out.println(str);
        for(Node child:node.children){
            d(child);
        }
    }
        
        public int size(Node node){
        int csize=0;
        for(Node child:node.children){
            csize+=size(child);
        }
    return csize+1;    
    }


    public int max(){
        int max=maxp(this.root);
        return max;
    }
    private int maxp(Node node){
        int cmax=node.data;
        for(Node child:node.children){
        cmax= Math.max(maxp(child), cmax);
    }
    return cmax;
}

    public int height(){
        return heightp(this.root);
    }
    private int heightp(Node node){
        int ht=0;
        for(Node child:node.children){
            int rheight=heightp(child);
            ht=Math.max(rheight, ht);

        }
    return ht+1;
    }
    

    public boolean find(int data){
        return findp(this.root,data);

    }
private boolean findp(Node node,int data){

    if(node.data==data){
        return true;
    }
    for(Node child:node.children){
        boolean cfind=findp(child, data);
        return cfind;
    }
 return false;
}
    public void pre(){
        prep(this.root);    

}
    private void prep(Node node){
        System.out.println(node.data);
        for(Node child:node.children){
            prep(child);
        }
    }
    public void post(){
        postp(this.root);    

}
    private void postp(Node node){
        
        for(Node child:node.children){
            postp(child);
        }
        System.out.println(node.data);
    }

}
