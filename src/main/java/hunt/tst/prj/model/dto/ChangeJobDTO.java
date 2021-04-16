package hunt.tst.prj.model.dto;

public class ChangeJobDTO {

	String inn;
	String oldf;
	String newf;
	
	public ChangeJobDTO() {
		super();
		
	}
	public String getInn() {
		return inn;
	}
	public void setInn(String inn) {
		this.inn = inn;
	}
	public String getOldf() {
		return this.oldf;
	}
	public void setOldf(String oldf) {
		this.oldf = oldf;
	}
	public String getNewf() {
		return this.newf;
	}
	public void setNewf(String newf) {
		this.newf = newf;
	}
}
