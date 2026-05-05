class Solution {
    public int mySqrt(int x) {
    //    
    int strt  =0;
    int end =x;
    while(strt<=end){
        int mid  = (strt+end)/2;
        if((long)mid*mid==x) return mid;
        if((long)mid*mid>x){
            end=mid-1;;
        }else if(mid*mid <=x){
            strt=mid+1;
        }
    }
    return end;

    }
}