package nit_sem2_LM4;

class BOX {
    int l, b, h;
    BOX() {
        l = 0;
        b = 0;
        h = 0;
    }
    BOX(int l, int b, int h) {
        this.l = l;
        this.b = b;
        this.h = h;
    }
    
    void volume() {
        System.out.println("Volume of box is " + l*b*h);
    }
    
    public static void main(String...args) {
        BOX b = new BOX();
        b.volume();
        BOX b2 = new BOX(4,5,6);
        b2.volume();
    }
}
