public  class Product {


    // Mandatory fields
    private String name;
    private double price;

    // Optional fields
    private  String description;
    private double discount;
    private boolean freeshipping;
    private int stock;



    private Product (ProductBuilder builder){
        this.name = builder.name;
        this.price = builder.price;
        this.description = builder.description ;
        this.stock = builder.stock;
        this.discount = builder.discount;
        this.freeshipping = builder.freeshipping;

    }


    // settres and getters


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public boolean isFreeshipping() {
        return freeshipping;
    }

    public void setFreeshipping(boolean freeshipping) {
        this.freeshipping = freeshipping;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                ", discount=" + discount +
                ", freeshipping=" + freeshipping +
                ", stock=" + stock +
                '}';
    }


    public  static class  ProductBuilder {

        // Mandatory fields
        private String name;
        private double price;

        // Optional fields
        private  String description;
        private double discount;
        private boolean freeshipping;
        private int stock;

        // public const for Product Builder


        public ProductBuilder(double price, String name) {
            this.price = price;
            this.name = name;
        }



        // setters for optional fields
        public ProductBuilder setDescription(String description) {
            this.description = description;
            return this;
        }

        public ProductBuilder setDiscount(double discount) {
            this.discount = discount;
            return this;
        }

        public ProductBuilder setFreeshipping(boolean freeshipping) {
            this.freeshipping = freeshipping;
            return this;
        }

        public ProductBuilder setStock(int stock) {
            this.stock = stock;
            return this;
        }

        // build method to build product class

      public Product build (){
            return new Product(this);

        }
    }
}
