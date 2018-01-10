import java.util.*;

class AdjacencyList{

    private Map<Integer,ArrayList<Integer>> adjlist;
    
    //constructor
    AdjacencyList(int vertex){
        adjlist= new HashMap<Integer,ArrayList<Integer>>();
        
        for(int i=1; i<=vertex; i++){
        adjlist.put(i,new ArrayList<Integer>());
        }    
    }
    
   public void getEdge(int v, int w){
   
       if(v>adjlist.size() || w>adjlist.size()){
       return;
       }
       (adjlist.get(v)).add(w);
       
       //as graph is undirected
       (adjlist.get(w)).add(v);
   } 
   
   public ArrayList<Integer> getNeighbours(int vertex ){
   
   if(vertex > adjlist.size()){
   return null;
   }
   
   return new ArrayList<Integer>(adjlist.get(vertex));
   }    
}



public class Solution {  
    public static void main(String[] args) {
        // TODO code application logic here
    
        Scanner sc=new Scanner(System.in);
        int q=sc.nextInt();
  
         for(int i=0; i<q; i++){
               int n=sc.nextInt();
               int m=sc.nextInt();
               int cl=sc.nextInt();
               int cr=sc.nextInt();
         
        AdjacencyList G= new AdjacencyList(n);
        
        for(int j=1; j<=m; j++){
         int u=sc.nextInt();
         int v=sc.nextInt();
         
         G.getEdge(u, v);
        }
        
        //problem solution
        
         if(cl<=cr){
            System.out.println(n*cl);
           }
         else{
         Queue<Integer> que=new LinkedList<Integer>();
         
         
         
         }
        
        
        
         }//end of queries
         
         
    }//end of main method  
}//end of solution class
