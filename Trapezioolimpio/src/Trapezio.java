import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * 
 * 
 * 
 * @author olimpio2
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
	Trapezio t1= new Trapezio(3,2,1);
	double area = t1.getarea();
	double risAtteso = 2.5;
	double Risottenuto = t1.getarea();
	assertEquals(risAtteso,Risottenuto,0.1);
	System.out.println("area del trapezio è: "+area);
	Trapezio t2 = new Trapezio(6,5,5);
	double risAtteso1 = 27.5;
	double Risottenuto1 = t2.getarea();
	assertEquals(risAtteso1,Risottenuto1,0.1);
	System.out.println("area del trapezio è: "+t2.getarea());
}



}
