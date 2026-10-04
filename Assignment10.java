public class Assignment10 {
    public static void main(String[] args) {
        // pen p1 = new pen();
        // p1.setColor("black");
        // System.out.println(p1.getColor());

        // p1.setTip(5);
        // System.out.println(p1.getTip());

        // BankAccount b1 = new BankAccount();
        // b1.setUsername("mayuridurge");
        // System.out.println(b1.username);
        // b1.setPassword("mayu");
        // // System.out.println(b1.password); //gives an error
        // b1.display();

        person p = new person();
        p.setName("khushi");
        System.out.println(p.getName());

        p.setNumber(9356983034);
        System.out.println(p.getNumber());
    }
}

class pen {
    private String color;
    private int tipSize;

    String getColor() {
        return this.color;
    }

    int getTip() {
        return this.tipSize;
    }

    void setColor(String newColor) {
        this.color = newColor;
    }

    void setTip(int newTip) {
        this.tipSize = newTip;
    }

    // void display(){
    // System.out.println("Pen color is: "+ color);
    // System.out.println("Pen size is: "+tipSize);
    // }
}

class BankAccount {
    public String username;
    private String password;

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void display() {
        System.out.println(password);
    }
}

class person {
    private String name;
    private double phoneNum;

    String getName() {
        return this.name;
    }

    void setName(String newName) {
        this.name = newName;
    }

    double getNumber() {
        return this.phoneNum;
    }

    void setNumber(double newNumber) {
        this.phoneNum = newNumber;
    }
}
