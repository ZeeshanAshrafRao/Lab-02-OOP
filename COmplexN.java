public class ComplexN {
    
    private int re;
    private int im;
    static int objCount;

public ComplexN () {         //null constructor
    this.re =0;
    this.im=0;
    objCount++;

}

public ComplexN(int re, int im){     //Parameterized Constructor
    this.re=re;
    this.im=im;
    objCount++;

   
}

public ComplexN(ComplexN obj){        //copy Constructor
    this.re=obj.re;
    this.im=obj.im;
    objCount++;
}

public void set(int re, int im){       //setter
    this.re=re;
    this.im=im;

}

public int getx(int re){      //getter
    return this.re;
}
public int gety(int im){      //getter
    return this.im;
}


void display(){             //Show Constructor

    System.out.println("real ="+this.re+" imaginary ="+this.im);
    System.out.println(objCount);
}
public String toString(){      //tostring
    return "real ="+this.re + " imaginary=" + this.im ;
}

public ComplexN Add(ComplexN obj){
    int nre = this.re + obj.re;
    int nim = this.im + obj.im;

    ComplexN n = new ComplexN(nre,nim);
    return n;
}

public ComplexN Sub(ComplexN obj){
    int nre = this.re - obj.re;
    int nim = this.im - obj.im;

    ComplexN n = new ComplexN(nre,nim);
    return n;
}

    public static void main(String[] args) {
        ComplexN num1 = new ComplexN();
        num1.display();

        ComplexN num2 = new ComplexN(2, 5);
        num2.display();

        
        ComplexN num3 = new ComplexN(num2);
        num3.display();

        num3.Add(num3);
        

        num3.Sub(num3);
        

}

}