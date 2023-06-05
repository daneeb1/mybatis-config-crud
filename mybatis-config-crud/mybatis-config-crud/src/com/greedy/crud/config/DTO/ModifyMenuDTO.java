package com.greedy.crud.config.DTO;

public class ModifyMenuDTO {
   private String postingTitle;
   private String postringContent;
   private String categoryNo;
   
   public ModifyMenuDTO() {
      
   }
   public ModifyMenuDTO(String postingTitle, String postringContent, String categoryNo) {
      super();
      this.postingTitle = postingTitle;
      this.postringContent = postringContent;
      this.categoryNo = categoryNo;
   }
   public String getPostingTitle() {
      return postingTitle;
   }
   public void setPostingTitle(String postingTitle) {
      this.postingTitle = postingTitle;
   }
   public String getPostringContent() {
      return postringContent;
   }
   public void setPostringContent(String postringContent) {
      this.postringContent = postringContent;
   }
   public String getCategoryNo() {
      return categoryNo;
   }
   public void setCategoryNo(String categoryNo) {
      this.categoryNo = categoryNo;
   }
   @Override
   public String toString() {
      return "ModifyMenuDTO [postingTitle=" + postingTitle + ", postringContent=" + postringContent + ", categoryNo="
            + categoryNo + "]";
   }
   
   
}