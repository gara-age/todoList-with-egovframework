package egovframework.todoList.service;

public class TodoListVO {
	private String idxNo;  
	private String title; 
	private String content;
	private String isCompleted; //0 또는 1
	private String isDeleted;	//0 또는 1
	private String createdAt; 
	private String updateAt; 
	private String category; 
	private String priority; 
	private String dueDate; 
	private String completedAt; 
	private String oredrBy;
	
	
	public String getOredrBy() {
		return oredrBy;
	}
	public void setOredrBy(String oredrBy) {
		this.oredrBy = oredrBy;
	}
	public String getIdxNo() {
		return idxNo;
	}
	public void setIdxNo(String idxNo) {
		this.idxNo = idxNo;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getIsCompleted() {
		return isCompleted;
	}
	public void setIsCompleted(String isCompleted) {
		this.isCompleted = isCompleted;
	}
	public String getIsDeleted() {
		return isDeleted;
	}
	public void setIsDeleted(String isDeleted) {
		this.isDeleted = isDeleted;
	}
	public String getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}
	public String getUpdateAt() {
		return updateAt;
	}
	public void setUpdateAt(String updateAt) {
		this.updateAt = updateAt;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getPriority() {
		return priority;
	}
	public void setPriority(String priority) {
		this.priority = priority;
	}
	public String getDueDate() {
		return dueDate;
	}
	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}
	public String getCompletedAt() {
		return completedAt;
	}
	public void setCompletedAt(String completedAt) {
		this.completedAt = completedAt;
	}
	
	
	
}
