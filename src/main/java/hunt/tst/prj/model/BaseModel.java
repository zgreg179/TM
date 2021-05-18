package hunt.tst.prj.model;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class BaseModel {

	protected Boolean deleted = false;

	public BaseModel() {
		super();
		
	}

	public Boolean getDeleted() {
		return deleted;
	}

	public void setDeleted(Boolean deleted) {
		this.deleted = deleted;
	}
	
		
}
