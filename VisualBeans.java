package sayukiGame.model.beans;

public class Character {

	private String name;
	
	public String getName(){
		return this.name;
		
	}
	public void setName(String name) {
		if(name == null||name.isEmpty()) {
			
			this.name =("名無し");
			
		}else if(name.length()>10){
			
			this.name=(name.substring(0,10));
			
		}else {
			this.name=name;
		}
		
	}
}
