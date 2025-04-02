class Rectangle{
    public void displayRectangle(){
        String red = "\u001B[31m";
        int size = 10;
        for(int i=0; i<size; i++){
            for(int j=0; j<size; j++){
                System.out.print("S" + " " + red);
            }
            System.out.println();
        }
    }
}
