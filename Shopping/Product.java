import java.util.*; 
 
class Product { 
   private String name; 
   private String brand; 
   private String category; 
   private double price; 
   private double rating; 
 
   public Product(String name, String brand, String category, double price, double rating) { 
       this.name = name; 
       this.brand = brand; 
       this.category = category; 
       this.price = price; 
       this.rating = rating; 
   } 
 
   public String getName() { return name; } 
   public String getBrand() { return brand; } 
   public String getCategory() { return category; } 
   public double getPrice() { return price; } 
   public double getRating() { return rating; } 
 
   public String toString() { 
       return name + " | " + brand + " | " + category + " | $" + price + " | Rating: " + rating; 
   } 
} 
