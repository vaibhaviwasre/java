class code17{
    public static void main(String[] args) {
        int rows = 3;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= i; j++){
                System.out.print((char) ('C' - j));
            }
            System.out.println();
        }
    }
}




