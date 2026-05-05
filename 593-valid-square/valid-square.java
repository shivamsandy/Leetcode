class Solution {
    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {

        // createting a hashset
        HashSet<Integer> set  =  new HashSet<>();
        set.add(distance(p1,p2));
        set.add(distance(p1,p3));
        set.add(distance(p1,p4));
        set.add(distance(p2,p3));
        set.add(distance(p2,p4));
        set.add(distance(p3,p4));

        return !set.contains(0) && set.size() ==2;
        
    }
    public int distance(int x[] , int y[]){
        return (x[0]-y[0])*(x[0]-y[0]) + (x[1]-y[1])*(x[1]-y[1]);
    }
}