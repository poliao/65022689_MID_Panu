/**
 * main
 */
public class main {

    public static void main(String[] args) {
            Product n = new Product("Chair", 500.0);
            Electronics e = new Electronics("Television", 20000.0,"Samaung","Neo QLED");
            Book b = new Book("OOP Programming", 250.0, "John Doe", 300);
            Smartphone s = new Smartphone("Iphone", 4000.0, "Apple", "Iphone99", "ios");
            n.display();
            e.display();
            b.display();
            s.display();
    }
}


class Product{
    protected String Name;
    protected double price;

    Product(String Name, double price){
        this.Name = Name;
        this.price = price;
    }

    public String getname(){
        return Name;
        
    }
    public void setname(String Name){
        this.Name = Name;
    }

    public double price(){
        return price ; 
    }
    public void setprice(double price){
        this.price = price;
    }

    public void display(){
        System.out.println("Product Name : "+this.Name);
        System.out.println("Product Price : "+this.price);
        System.out.println("*************************************");
    }
}

class Electronics extends Product{
    protected String brand= "sumsung";
    protected String model;

Electronics(String Name, double price ,String brand, String model){
    super(Name, price);
    this.brand = brand;
    this.model = model;    
}
    
        public String getBrand(){
            return brand;
        }
        public void setBrand(){
            this.brand =brand;
        }
        public String getModel(){
            return model;
        }
        public void setModel(){
            this.model = model;
        }

        public void display(){
        System.out.println("Product Name : "+this.Name);
        System.out.println("Product Price : "+this.price);
         System.out.println("Brand : "+this.brand);
        System.out.println("Model: "+this.model);
        System.out.println("*************************************");
    }
}
class Book extends Product{
    protected String author;
    protected int pages;

    Book(String Name, double price ,String author, int pages){
    super(Name, price);
    this.author =author;
    this.pages = pages;    
}
    
        public String getauthor(){
            return author;
        }
        public void setauthor(){
            this.author = author;
        }
        public int getpages(){
            return pages;
        }
        public void setpages(){
            this.pages = pages;
        }

        public void display(){
        System.out.println("Product Name : "+this.Name);
        System.out.println("Product Price : "+this.price);
         System.out.println("Author : "+this.author);
        System.out.println("Number of pages: "+this.pages);
        System.out.println("*************************************");
    }
}




class Smartphone extends Electronics{
 protected String operatingSystem;

    Smartphone(String Name, double price,String brand, String model,String operatingSystem){ 
    super(Name, price,brand,model);
        this.operatingSystem = operatingSystem;
    }
public String getoperatingSystem(){
    return operatingSystem;
   
}
public void setoperatingSystem(){
     this.operatingSystem = operatingSystem;
}



public void display(){
        System.out.println("Product Name : "+this.Name);
        System.out.println("Product Price : "+this.price);
        System.out.println("Brand : "+this.brand);
        System.out.println("Model: "+this.model);
        System.out.println("operatingSystem: "+this.operatingSystem);
        System.out.println("*************************************");


}
}
