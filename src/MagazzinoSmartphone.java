public class MagazzinoSmartphone {
    private Smartphone[] smartphones;
    private int count;

    public MagazzinoSmartphone() {
        smartphones = new Smartphone[10]; // Assuming initial capacity of 10
        count = 0;
    }

    public MagazzinoSmartphone(MagazzinoSmartphone other) {
        for (int i = 0; i < 10; i++) {
            smartphones[i] = new Smartphone(other.smartphones[i]);
        }
    }

    public int getCount() {
        for (int i = 0; i < smartphones.length; i++) {
            if(smartphones[i] != null){
                count++;
            }
        }
        return count;
    }

    public void addSmartphone(Smartphone smartphone) {
        for (int i = 0; i < 10; i++) {
            if(smartphones[i] != null){
                smartphones[i] = new Smartphone(smartphone);
                count++;
            }
        }
    }

    public void removeSmartphone(Smartphone smartphone) {
        for (int i = 0; i < smartphones.length; i++) {
            if(smartphones[i].equals(smartphone)){
                smartphones[i] = null;
                count--;
            }
            
        }
    }

    public Smartphone[] getSmartphonesArray() {
        Smartphone[] smartphoneArray = new Smartphone[count];
        System.arraycopy(smartphones, 0, smartphoneArray, 0, count);
        return smartphoneArray;
    }

    public Smartphone getSmartphoneByBrand(String brand) {
        Smartphone smartphone = new Smartphone();
        boolean trovato = false;
        int i = 0;
        while (i < 10 && !trovato) {
            if (smartphones[i] != null) {
                if (smartphones[i].getBrand().equalsIgnoreCase(brand)) {
                    trovato = true;
                    smartphone = new Smartphone(smartphones[i]);
                } else {
                    smartphone = null;
                }
            }
            i++;
        }

        return smartphone;
    }

    public Smartphone getSmartphonesByStorageCapacity(int storageCapacity) {
        Smartphone smartphone = new Smartphone();
        boolean trovato = false;
        int i = 0;
        while (i < 10 && !trovato) {
            if (smartphones[i] != null) {
                if (smartphones[i].getStorageCapacity() == storageCapacity) {
                    trovato = true;
                    smartphone = new Smartphone(smartphones[i]);
                } else {
                    smartphone = null;
                }
            } else {
                smartphone = null;
            }
            i++;
        }

        return smartphone;
    }

    public Smartphone getSmartphonesByPriceRange(double minPrice, double maxPrice) {
        Smartphone smartphone = new Smartphone();
        boolean trovato = false;
        int i = 0;
        while (i < 10 && !trovato) {
            if (smartphones[i] != null) {
                if (smartphones[i].getPrice() >= minPrice && smartphones[i].getPrice() <= maxPrice) {
                    trovato = true;
                    smartphone = new Smartphone(smartphones[i]);
                } else {
                    smartphone = null;
                }
            } else {
                smartphone = null;
            }
            i++;
        }

        return smartphone;
    }

    public String toString() {
        String s="";
        for (int i = 0; i < count; i++) {
            s+=smartphones[i].toString()+"/n";
        }
        return s;
    }
        

    public boolean equals(Object obj) {
        boolean uguali = false;
        if (this == obj) {
            uguali = true;
        } else {
            if (obj instanceof MagazzinoSmartphone) {
                
        }
        return uguali;
    }

}
}