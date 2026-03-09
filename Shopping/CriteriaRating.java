class CriteriaRating implements Criteria { 
 
   private double rating; 
 
public CriteriaRating(double rating) { 
       this.rating = rating; 
   } 
 
   public List<Product> meetCriteria(List<Product> products) { 
 
       List<Product> result = new ArrayList<>(); 
 
       for(Product p : products) { 
           if(p.getRating() >= rating) { 
               result.add(p); 
           } 
       } 
 
       return result; 
   } 
} 
