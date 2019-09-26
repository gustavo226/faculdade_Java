package questao_09;

public class IntervaloDeTempo {
	private int seg, min, hor, totSeg;
	
	public IntervaloDeTempo(int seg) {
		calcula(seg);
	}
	
	public void soma(int seg) {
		calcula(this.totSeg+seg);
	}
	
	public void soma(IntervaloDeTempo seg2) {
		calcula(this.totSeg+seg2.getTotSeg());
	}

	public void calcula(int seg) {
		this.totSeg = seg;
		this.seg = seg;
		this.min = seg/60;
		this.hor = this.min/60;
		
		this.seg = this.seg - this.min*60;
		this.min = this.min - this.hor*60;
	}
	
	public String toString() {
		String retorno = "";
		retorno += String.valueOf(this.hor) + " horas, ";
		retorno += String.valueOf(this.min) + " minutos e ";
		retorno += String.valueOf(this.seg) + " segundos.";
		return retorno;
	}

	public int getSeg() {
		return seg;
	}

	public void setSeg(int seg) {
		this.seg = seg;
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}

	public int getHor() {
		return hor;
	}

	public void setHor(int hor) {
		this.hor = hor;
	}
	
	public int getTotSeg() {
		return totSeg;
	}

	public void setTotSeg(int totSeg) {
		this.totSeg = totSeg;
	}
}
