class AndCriteria implements Criteria { 
 
   private Criteria criteria1; 
   private Criteria criteria2; 
 
   public AndCriteria(Criteria c1, Criteria c2) { 
       this.criteria1 = c1; 
       this.criteria2 = c2; 
   } 
 
   public List<Product> meetCriteria(List<Product> products) { 
 
       List<Product> firstCriteria = criteria1.meetCriteria(products); 
       return criteria2.meetCriteria(firstCriteria); 
   } 
} 
