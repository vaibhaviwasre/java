class code13 {
    public static void main(String[] args) {
        int rows = 4; 
        for (int i = 0; i < rows; i++) {
            for (int j = 3; j >= i; j--) {
                System.out.print((char) ('D' - j + i));
            }
            System.out.println();
        }
    }
}
	


