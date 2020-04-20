public class Client{
    public static void main(String[] args) {
        int[] arr={10,20,50,-1,60,-1,-1,30,70,-1,80,110,-1,120,-1,-1,90,-1,-1,40,100,-1,-1};
        genericTree GT=new genericTree(arr);
         GT.display();
        // System.out.println(GT.size);
        // System.out.println(GT.max());
        // System.out.println(GT.height());
        // System.out.println(GT.find(1));
        // GT.pre();
        System.out.println();    
        // GT.post();
        GT.levelorder();
        // GT.removeLeaves();
        // GT.display();
        }
}