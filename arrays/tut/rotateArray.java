import java.util.Arrays;

public class rotateArray {

    public static void main(String[] args) {
        int [][] mat = {
            {0,0,0},
            {0,1,0},
            {1,1,1}
        };

        int [][] target = {
            {1,1,1},
            {0,1,0},
            {0,0,0}
        };

        System.out.println(findRotation(mat,target));
    }

    public static boolean findRotation(int[][] mat, int[][] target) {
        int n=1;
        // Check if the array is already same and return true
        if(Arrays.deepEquals(mat,target)){
            return true;
        }
        else{
            // rotate the array to calculate the count required to match with the target
            while(n<=3){
                if(rotate(mat,target)){
                    return true;
                }else{
                    n++;
                }
            }
            return false;
        }
    }
    
    // This function is used to take transpose of the given matrix
    public static int[][] transpose(int[][] m){
        int n = m.length;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int temp=0;
                temp=m[i][j];
                m[i][j]=m[j][i];
                m[j][i]=temp;
            }
        }
        return m;
    } 
    
    // This function is used to reverse the matrix
    public static int[][] reverse(int[][] mat){
        int n = mat.length;
        for(int i=0;i<n;i++){
            int left=0,right=n-1;
            while(left<right){
                int temp=0;
                temp=mat[i][left];
                mat[i][left]=mat[i][right];
                mat[i][right]=temp;
                left++;
                right--;
            }
        }
        return mat;
    }
    
    // This function is used to rotate the array 90 degree in clockwise direction
    public static boolean rotate(int[][] m,int[][] target){
        int n = m.length;
        m = transpose(m);
        m = reverse(m);
        if(Arrays.deepEquals(m, target)){
            return true;
        }
        return false;
    }
}
