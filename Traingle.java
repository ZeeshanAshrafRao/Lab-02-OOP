class Triangle{
  
    private double sideA;
    private double sideB;
    private double sideC;
    static int objCount;

public Triangle () {         //null constructor
    this.sideA =0;
    this.sideB=0;
    this.sideC=0;
    objCount++;

}

public Triangle(double sideA, double sideB, double sideC){     //Parameterized Constructor
    this.sideA=sideA;
    this.sideB=sideB;
    this.sideB=sideB;
    objCount++;

   
}

public Triangle(Triangle obj){        //copy Constructor
    this.sideA=obj.sideA;
    this.sideB=obj.sideB;
    this.sideC=obj.sideC;
    objCount++;
}

public void set(double sideA, double sideB , double sideC){       //setter
    this.sideA=sideA;
    this.sideB=sideB;
    this.sideC=sideC;
}

public double getA(double sideA){      //getter
    return this.sideA;
}
public double getB(double sideB){      //getter
    return this.sideB;
}
public double getC(double sideB){      //getter
    return this.sideB;
}


void display(){             //Show Constructor

    System.out.println("Side A="+this.sideA+"Side B="+this.sideB+"Side C="+this.sideC);
    System.out.println(objCount);
}
public String toString(){      //tostring
    return "Side A ="+this.sideA + "Side B=" + this.sideB + "Side C" + this.sideC;
}

public static void isRightAngle(double sideA, double sideB, double sideC) {
        
        double a2 = sideA * sideA;
        double b2 = sideB * sideB;
        double c2 = sideC * sideC;

        if ((a2 + b2 == c2) || (a2 + c2 == b2) || (b2 + c2 == a2)) {
            System.out.println("It's a right angle triangle");
        } else {
            System.out.println("It's not a right angle triangle");
        }
    }



    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.display();

        Triangle t2 = new Triangle(3.0, 4.0, 5.0);
        t2.display();

        
        Triangle t3 = new Triangle(t2);
        t3.display();

}

}