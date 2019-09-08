enum Animals {
    DOG("woof"), CAT("meow"), FISH("burble");
    String sound;
        Animals(String s) { sound = s; }
}

class TestEnum {
    Animals a;
    public static void main(String [] args) {
        // System.out.println(a.DOG.sound + " " + a.FISH.sound);
        TestEnum t = new TestEnum();
        t.test();
    } 

    public void test(){
        System.out.println(a.DOG.sound + " " + a.FISH.sound);
    }
}

