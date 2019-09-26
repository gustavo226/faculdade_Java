package questao_09;

public class Exer09 {

	public static void main(String[] args) {
		IntervaloDeTempo t1 = new IntervaloDeTempo(8000);
		
		System.out.println("seg: " + t1.getSeg());
		System.out.println("min: " + t1.getMin());
		System.out.println("hor: " + t1.getHor());
		System.out.println("TOTSEG: " + t1.getTotSeg());
		
		t1.soma(40);
		System.out.println("----------------------");
		System.out.println("seg: " + t1.getSeg());
		System.out.println("min: " + t1.getMin());
		System.out.println("hor: " + t1.getHor());
		System.out.println("TOTSEG: " + t1.getTotSeg());
		
		IntervaloDeTempo t2 = new IntervaloDeTempo(60);
		t1.soma(t2);
		System.out.println("----------------------");
		System.out.println("seg: " + t1.getSeg());
		System.out.println("min: " + t1.getMin());
		System.out.println("hor: " + t1.getHor());
		System.out.println("TOTSEG: " + t1.getTotSeg());
		
		System.out.println("-------------------------");
		System.out.println("To String: " + t1.toString());
		System.out.println("-------------------------");
		System.out.println("To String: " + t2.toString());
	}

}
