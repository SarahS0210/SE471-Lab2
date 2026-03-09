class CriteriaPrice implements Criteria { 
 
   private double minPrice; 
   private double maxPrice; 
 
   public CriteriaPrice(double minPrice, double maxPrice) { 
       this.minPrice = minPrice; 
       this.maxPrice = maxPrice; 
   } 
 
   public List<Product> meetCriteria(List<Product> products) { 
 
       List<Product> result = new ArrayList<>(); 
 
       for(Product p : products) { 
           if(p.getPrice() >= minPrice && p.getPrice() <= maxPrice) { 
               result.add(p); 
           } 
       } 
 
       return result; 
   } 
} 
