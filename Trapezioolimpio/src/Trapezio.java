/**
 * 
 * 
 * 
 * @author olimpio
 *
 */
public class Trapezio {
private double baseM,baseMi,altezza;




public Trapezio(double baseM,double baseMi,double altezza) {
	
	this.baseM=baseM;
	this.baseMi=baseMi;
	this.altezza=altezza;
	
}
/**
 * <p>calcolo dell'area</p>
 * @return
 */
public double getarea() {
	return(baseM + baseMi)* altezza/2.0;
}
@Override
public String toString() {
	return "Trapezio [baseM=" + baseM + ", baseMi=" + baseMi + ", altezza=" + altezza + "]";
}
public static void main(String[] args) {
	Trapezio t1= new Trapezio(5.7,3.7,7.9);
	double area = t1.getarea();
	System.out.println("area del trapezio è: "+area);
}



}
