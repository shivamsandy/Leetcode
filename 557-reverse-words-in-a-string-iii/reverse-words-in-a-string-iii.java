class Solution {
    public String reverseWords(String s) {
        char[] arr  = s.toCharArray();
        int i=0;
        int j=0;
        while(j<arr.length){
            char ch = arr[j];
            if(ch == ' ' ){
                Swap(arr,i,j-1);
                i =j+1;
            }else if (j == arr.length - 1) {
                Swap(arr, i, j);   // include last character
            }
            j++;
        }
        return String.valueOf(arr);
        
    }
    public void Swap(char arr[] , int i,int j){
        while(i<j){
            char temp  =arr[i];
            arr[i] = arr[j];
            arr[j] =temp;
            i++;
            j--;
        }
    }
}