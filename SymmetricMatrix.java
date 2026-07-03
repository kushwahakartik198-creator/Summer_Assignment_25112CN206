public class SymmetricMatrix {
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{2,4,5},{3,5,6}};
        boolean symmetric=true;

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i][j]!=arr[j][i]){
                    symmetric=false;
                }
            }
        }

        if(symmetric)
            System.out.println("Symmetric");
        else
            System.out.println("Not Symmetric");
    }
}