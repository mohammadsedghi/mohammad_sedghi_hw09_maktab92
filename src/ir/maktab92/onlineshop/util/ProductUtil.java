package ir.maktab92.onlineshop.util;

import ir.maktab92.onlineshop.domain.*;
import ir.maktab92.onlineshop.repository.ProductRepository;

public class ProductUtil {


   private Tv tv = new Tv(1l, 100, "SonyTV", 220, " has a Oltra Hd screen ", 43);
   private Radio radio = new Radio(2l, 10, "SonyRadio", 220, " has a multi waves:FM,MW,SW ", "FM,MW,SW");
   private ShoeCollege shoeCollege = new ShoeCollege(3l, 15l, 43, "black", "natural leather", true);
   private ShoeSport shoeSport = new ShoeSport(4l, 20l, 40, "white", "football", false);
   private Book book = new Book(5l, 50l, 1, "shahName", "abolghasemFerdosi", "poem", 4);
    private Article article = new Article(6l, 120l, 223, "dataMining", "mohammadSedghi", "LHUI", "mining");

    public void createProduct() {
        ProductRepository productRepository = new ProductRepository();
     productRepository.saveProduct(tv);
     productRepository.saveProduct(radio);
     productRepository.saveProduct(shoeCollege);
     productRepository.saveProduct(shoeSport);
     productRepository.saveProduct(book);
     productRepository.saveProduct(article);
    }
    public Tv getTv() {
        return tv;
    }

    public Radio getRadio() {
        return radio;
    }

    public void setRadio(Radio radio) {
        this.radio = radio;
    }

    public ShoeCollege getShoeCollege() {
        return shoeCollege;
    }

    public void setShoeCollege(ShoeCollege shoeCollege) {
        this.shoeCollege = shoeCollege;
    }

    public ShoeSport getShoeSport() {
        return shoeSport;
    }

    public void setShoeSport(ShoeSport shoeSport) {
        this.shoeSport = shoeSport;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }
}
