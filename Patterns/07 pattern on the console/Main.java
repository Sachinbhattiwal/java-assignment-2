class Main {
    public static void main(String[] args) {
        for (int i = 1; i < 6; ++i) {
            for(int j =1; j < 6; ++j) {
                if (i == j) {
                    System.out.print(j);
                } else {
                    System.out.print(1);
                }
            }
            System.out.println();
        }
    }
}