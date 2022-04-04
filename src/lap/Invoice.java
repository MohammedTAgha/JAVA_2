package lap;

public class Invoice {
    private String id;
    private String description;
    private double price;
    private int quantity;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public Invoice() {
    }

    public Invoice(String id, String description, double price, int quantity) {
        this.id = id;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        if(price>0){
            this.price = price;
        }else{
            this.price=0;
            System.out.println("Invalid price: " + price);
        }

    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if(price>0){
            this.quantity = quantity;
        }else{
            this.quantity=0;
            System.out.println("Invalid price: " + quantity);
        }
    }
    public double getTotalPrice(){
        double totalPrice =this.quantity * this.price;
        return totalPrice ;
    }


    public String rebort() {
        return "Invoice{" +
                "id='" + id + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", quantity=" + getTotalPrice() +
                '}';
    }
}
