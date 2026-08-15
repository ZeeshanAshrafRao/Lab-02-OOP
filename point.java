class point{
  
    private int x;
    private int y;
    static int objCount;

public point () {         //null constructor
    this.x =0;
    this.y=0;
    objCount++;

}

public point(int x, int y){     //Parameterized Constructor
    this.x=x;
    this.y=y;
    objCount++;

   
}

public point(point obj){        //copy Constructor
    this.x=obj.x;
    this.y=obj.y;
    objCount++;
}

public void set(int x, int y){       //setter
    this.x=x;
    this.y=y;

}

public int getx(int x){      //getter
    return this.x;
}
public int gety(int y){      //getter
    return this.y;
}


void display(){             //Show Constructor

    System.out.println("x="+this.x+" y="+this.y);
    System.out.println(objCount);
}
public String toString(){      //tostring
    return "x ="+this.x + " y=" + this.y ;
}

public point Add(point obj){
    int nx = this.x + obj.x;
    int ny = this.y + obj.y;

    point n = new point(nx,ny);
    return n;
}

public point Sub(point obj){
    int nx = this.x - obj.x;
    int ny = this.y - obj.y;

    point n = new point(nx,ny);
    return n;
}

    public static void main(String[] args) {
        point p1 = new point();
        p1.display();

        point p2 = new point(2, 5);
        p2.display();

        
        point p3 = new point(p2);
        p3.display();

        p3.Add(p3);
        

        p3.Sub(p3);
        

}

}