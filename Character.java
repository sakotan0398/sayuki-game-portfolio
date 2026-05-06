package mainpage.model.beans;

import java.io.Serializable;

public class ItemBeans implements Serializable {
	
    private String title;       // ツール名
    private String description; // ツールの説明
    private String techStack;   // 使用技術（例："Python, Art"）
    private String version;     // バージョン情報

    public ItemBeans(String title, String description, String techStack, String version) {
        super();
        this.title = title;
        this.description = description;
        this.techStack = techStack;
        this.version = version;
    }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    
    public String getTechStack() { return techStack; }
    public void setTechStack(String techStack) { this.techStack = techStack; }
    
    public String getVersion() { return version; }
    public void setVersion(String version) { this.version = version; }
}