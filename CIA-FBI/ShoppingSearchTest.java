public class ShoppingSearchTest { 
 
   public static void main(String[] args) { 
 
       List<Product> inventory = new ArrayList<>(); 
 
       inventory.add(new Product("Laptop","Dell","Electronics",1200,4.5)); 
       inventory.add(new Product("Phone","Apple","Electronics",999,4.8)); 
       inventory.add(new Product("Headphones","Sony","Accessories",199,4.3)); 
       inventory.add(new Product("Monitor","Dell","Electronics",300,4.2)); 
 
       System.out.println("---- Individual Criteria (Brand: Dell) ----"); 
 
       Criteria brand = new CriteriaBrand("Dell"); 
 
       for(Product p : brand.meetCriteria(inventory)) { 
           System.out.println(p); 
       } 
 
       System.out.println("\n---- Combined Criteria (Dell AND Price < 1000) ----"); 
 
       Criteria price = new CriteriaPrice(0,1000); 
       Criteria brandAndPrice = new AndCriteria(brand, price); 
 
       for(Product p : brandAndPrice.meetCriteria(inventory)) { 
           System.out.println(p); 
       } 
   } 
} 
