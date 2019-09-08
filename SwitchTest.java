class SwitchTest{
    public static void main(String args[]){
        byte m = 128;

        switch(m){
            case 1: System.out.print("A");
                    break;
            case 128: System.out.println("B");
                    break;
            default: System.out.println("D");
        }
    }    
}