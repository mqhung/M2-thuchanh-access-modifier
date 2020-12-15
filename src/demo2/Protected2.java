package demo2;

import demo.Protected;

class Protected2 extends Protected {
    public static void main(String[] args) {
        Protected2 obj = new Protected2();
        obj.mesa(); // co the truy cap trong ngoai package nhung phai thong qua tinh ke thua (extends)
    }
}
