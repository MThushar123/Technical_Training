class 2d {
    public static void main(String[] args) {
        System.out.println("2-D array");
       
        Scanner input = new Scanner(System.in);
       
        int[][] arr = new int[3][3];
       
       
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                arr[i][j] = input.nextInt();
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.println(arr[i][j]);
            }
        }
        input.close();
    }
}