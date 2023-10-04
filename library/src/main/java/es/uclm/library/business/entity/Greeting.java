package es.uclm.library.business.entity;
//CAMBIO DDfASFf y es mejor el conjunto


//cambio en nueva rama
public class Greeting {
	private String person;
	private String content;

	public String getPerson() {
		return person;
	}

	public void setPerson(String person) {
		this.person = person;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "Greeting [person=" + person + ", content=" + content + "]";
	}
	
	

}
