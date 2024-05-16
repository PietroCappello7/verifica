public class Smartphone {
    private String brand;
    private String model;
    private int storageCapacity;
    private double price;

    public Smartphone() {};

    public Smartphone(String brand, String model, int storageCapacity, double price) {
        this.brand = brand;
        this.model = model;
        this.storageCapacity = storageCapacity;
        this.price = price;
    }

    public Smartphone(Smartphone other) {
        this(other.brand, other.model, other.storageCapacity, other.price);
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setStorageCapacity(int storageCapacity) {
        if (storageCapacity > 0) {
            this.storageCapacity = storageCapacity;
        }
    }

    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        }
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getStorageCapacity() {
        return storageCapacity;
    }

    public double getPrice() {
        return price;
    }

    public String toString() {
        String s = "";
        s = "Brand: " + brand + ", Model: " + model + ", Storage capacity" + storageCapacity + ", Price: " + price;
        return s;
    }

    public boolean equals(Object obj) {
        boolean uguali = false;
        if (this == obj) {
            uguali = true;
        } else {
            if (obj instanceof Smartphone) {
                Smartphone a = (Smartphone) obj;
                uguali = false;
                if (this.brand.equalsIgnoreCase(a.brand) && this.model.equalsIgnoreCase(a.model)
                        && this.storageCapacity == a.storageCapacity && this.price == a.price) {
                    uguali = true;
                }
            }
        }
        return uguali;

    }

}
