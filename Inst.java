public class Inst {
private String name;
private int price;


public Inst(String n, int p){
name = n;
price = p;
}

public String getName(){
    return name;

public int getPrice(){
    return price;
}

public void display(){
    System.out.println("Nama: "+ name);
    System.out.println("Harga: Rp."+ price);
}
    
}
}