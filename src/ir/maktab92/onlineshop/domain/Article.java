package ir.maktab92.onlineshop.domain;

import ir.maktab92.onlineshop.base.product.StudyThing;

public class Article extends StudyThing {
   private String title;
   private String keyWord;

   public Article(long id, double unitPrice, int number, String name, String authorNameFamily, String title, String keyWord) {
      super(id, unitPrice, number, name, authorNameFamily);
      this.title = title;
      this.keyWord = keyWord;
   }

   public Article(int number, String name, String authorNameFamily, String title, String keyWord) {
      super(number, name, authorNameFamily);
      this.title = title;
      this.keyWord = keyWord;
   }

   public Article(String title, String keyWord) {
      this.title = title;
      this.keyWord = keyWord;
   }

   public Article() {
   }

   public String getTitle() {
      return title;
   }

   public void setTitle(String title) {
      this.title = title;
   }

   public String getKeyWord() {
      return keyWord;
   }

   public void setKeyWord(String keyWord) {
      this.keyWord = keyWord;
   }

   @Override
   public String toString() {
      return "Article{" +
              "title='" + title + '\'' +
              ", keyWord='" + keyWord + '\'' +
              "} " + super.toString();
   }
}
