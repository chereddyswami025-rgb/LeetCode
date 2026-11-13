class Solution {
    public void rotate(int[][] matrix) {
         int n=matrix.length;
         for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }

         }
        int k=0;
         while(k<n){
             int left=0,right=n-1;
            while(left<right){

                int temp=matrix[k][left];
                matrix[k][left]=matrix[k][right];
                matrix[k][right]=temp;
                left++;
                right--;
            }
        k++;
         }
         

         for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.println(matrix[i][j]);
            }
         }
                 
            }
        }
     
 
        



        
