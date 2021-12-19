 public static Book[] booksWithPriceRange(double minPrice,double maxPrice,Book[] newBooks)
    { 
        int j=0;
        int k=0;
        int o=0
        for(int i=0;i<newBooks.length;i++)
        {
            if(newBooks[i].getPrice()>=minPrice && newBooks[i].getPrice()<=maxPrice)
            {
               j++;   
            }   
        }
        Book[] b=new Book[j];
        for(int i=0;i<newBooks.length;i++)
        {
            if(newBooks[i].getPrice()>=minPrice && newBooks[i].getPrice()<=maxPrice)
            {
               b[k++] =newBooks[i];
            }   
        }
        Book temp=null;
        for(int i1=0;i1<b.length;i1++)
        {
            for(int j1=i1+1;j1<b.length;j1++)
            {
                if(b[i1].getId() > b[j1].getId())
              {
                    temp=b[i1];
                     b[i1] = b[j1];
                    b[j1] =temp;
            }
            }
        }
        return b;
    }
}
