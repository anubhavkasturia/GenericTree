public class Client{
    public static void main(String[] args) {
        int[] arr={10,20,50,-1,60,-1,-1,30,70,-1,80,110,-1,120,-1,-1,90,-1,-1,40,100,-1,-1};
        int[] arr1={1,2,5,-1,6,-1,-1,3,7,-1,8,1,-1,12,-1,-1,9,-1,-1,1,2,-1,-1};
        genericTree GT=new genericTree(arr);
        genericTree OT=new genericTree(arr1);
        
        //  GT.display();
         
        //  System.out.println();
        // OT.display();
         // System.out.println(GT.size);
        // System.out.println(GT.max());
        // System.out.println(GT.height());
        // System.out.println(GT.find(1));
        // GT.pre();
           
        // GT.post();
        // GT.levelorder();
        // GT.removeLeaves();
        // GT.display();
        System.out.println(GT.isIsomorphic(OT));
        // GT.mirror();
        // GT.display();
        System.out.println(GT.isMirror(OT));
        }
}