 public static double generateBill(Cake[] c)
     {
         double totalAmount=0;
         for(int i=0;i<c.length;i++)
         {
             if(c[i].getEggless())
             {
                 totalAmount=totalAmount +50+c[i].getPricePerPound()*c[i].getPound();
             }
             else{
                  totalAmount=totalAmount +c[i].getPricePerPound()*c[i].getPound();
             }

         }
         totalAmount=totalAmount+totalAmount*.02;
         return totalAmount;
     }
     public static Cake[] getEgglessCake(Cake[] c)
     {    int j=0;
         int k=0;
         
        
          for(int i=0;i<c.length;i++)
          {
              if(c[i].getEggless())
              {
                  j++;
              }
             
          }
          Cake[] c1=new Cake[j];
          for(int i=0;i<c.length;i++)
          {
        if(c[i].getEggless())
              {
               c1[k++]=c[i];  
              }
          }
         return c1; 


     }
}