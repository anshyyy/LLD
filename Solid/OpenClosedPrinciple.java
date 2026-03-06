public class OpenClosedPrinciple {
    
}

// a class should be  closed for modifications but open for extensions


// class AreaCalulator{
//     public double calulate(Object shape){
//         if(shape instanceof Rectangle){
//             return ((Rectangle)shape).breadth * ((Rectangle)shape).lenght;
//         }
//         return -1;
//     }
// }

// class Rectangle{
//     public int lenght;
//     public int breadth;
// }


// now the upper example works fine until we have to add 1 more shape then we have go and change the 
// AreaCalulator class that is not good and it violates the OpenClosed Principle.






interface Shape {
     public double area();  
}


class Rectangle implements Shape { 
    
    public int lenght;
    public int breadth;

    Rectangle(int lenght,int breadth){
        this.lenght = lenght;
        this.breadth = breadth;
    }

    @Override
    public double area(){
        return this.lenght * this.breadth;
    }
}


class Triangle implements Shape{
   
   double base;
   double height;

   Triangle(double base, double height){
    this.base = base;
    this.height = height;
   }

   @Override
   public double area(){
      return (1/2) * this.base * this.height;
   }
}



class AreaCalulator {
    public double calulate(Shape shape){
        return shape.area();
    }
}

// now we can add as many shapes we want but areacalultor class will never get modified. and we can extend also






