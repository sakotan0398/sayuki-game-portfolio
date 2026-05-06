package sayukiGame.model.beans;

public class Player extends Character{
	
	// アイテム管理
	private boolean hasBook = false;
    private boolean hasSweets = false;
    private boolean hasPC_Parts = false;
    private boolean hasDrawingDoll = false;
    private boolean hasCoffee = false;
    
    // アイテム管理 getter,setter
    public boolean isHasCoffee() {
    	return hasCoffee;
    }
    public void setHasCoffee(boolean hasCoffee) {
    	this.hasCoffee = hasCoffee;
    }
    public boolean isHasBook() {
    	return hasBook;
    }
    public void setHasBook(boolean hasBook) {
    	this.hasBook = hasBook;
    }
    public boolean isHasSweets() {
    	return hasSweets;
    }
    public void setHasSweets(boolean hasSweets) {
    	this.hasSweets = hasSweets;
    }
    public boolean isHasPC_Parts() {
    	return hasPC_Parts;
    }
    public void setHasPC_Parts(boolean hasPC_Parts) {
    	this.hasPC_Parts = hasPC_Parts;
    }
    public boolean isHasDrawingDoll() {
    	return hasDrawingDoll;
    }
    public void setHasDrawingDoll(boolean hasDrawingDoll) {
    	this.hasDrawingDoll = hasDrawingDoll;
    }
		}
	 

