import java.util.*;

public class GraphAdjList {

   
    private Map<Integer,ArrayList<Integer>> adjListMap;
    
    //constructor which takes number of verices 
    GraphAdjList(int vertices){
    adjListMap= new HashMap<Integer, ArrayList<Integer>>();
    
    for(int i=1; i<=vertices; i++){
    ArrayList<Integer> neighbour =new ArrayList<Integer>();
    adjListMap.put(i,neighbour);
    } 
   }
    
    // method to add edge to adjacency list 
    public void addEdge(int v, int w){
    
        if(v>adjListMap.size() || w > adjListMap.size()){
        return;
        }
        (adjListMap.get(v)).add(w);
        
        //for undirected graph i will add this as well
        (adjListMap.get(w)).add(v);
    }
    
   //method to get neighbours of any vertex 
    public ArrayList<Integer> getNeighbours(int vertex){
    
    if(vertex> adjListMap.size()){
    return null;
    }
    return new ArrayList<Integer>(adjListMap.get(vertex));
    }
    
    
    //main class
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
