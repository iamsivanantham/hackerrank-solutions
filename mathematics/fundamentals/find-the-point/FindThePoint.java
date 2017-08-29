import java.io.*;
import java.util.*;

public class FindThePoint {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        Point p,q,r;
        
        while(n-- > 0){
            p = new Point(sc.nextInt(), sc.nextInt());
            q = new Point(sc.nextInt(), sc.nextInt());
            r = new Point(2*q.x()-p.x(), 2*q.y()-p.y());
            System.out.println(r.x() + " " + r.y());
        }
    }
}

class Point{
    
    private int x, y;
    
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    public int x(){
        return x;
    } 
    
    public int y(){
        return y;
    }
 
}
