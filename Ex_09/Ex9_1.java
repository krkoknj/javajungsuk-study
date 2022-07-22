public class Ex9_1 {
    public static void main(String[] args) {
        Value v1 = new Value(10);
        Value v2 = new Value(10);

        if (v1.equals(v2)) {
            System.out.println("==");
        } else {
            System.out.println("!=");
        }
    }
}

class Value {
    int value;

    Value(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Value)) return false;

        Value v = (Value)obj;

        return this.value == v.value;
    }
}