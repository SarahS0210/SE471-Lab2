import java.util.List;

class CriteriaBrand implements Criteria { 
 
   private String brand; 
 
   public CriteriaBrand(String brand) { 
       this.brand = brand; 
   } 
 
   public List<Product> meetCriteria(List<Product> products) { 
       List<Product> result = new ArrayList<>(); 
 
       for(Product p : products) { 
           if(p.getBrand().equalsIgnoreCase(brand)) { 
               result.add(p); 
           } 
       } 
       return result; 
   } 
} 
