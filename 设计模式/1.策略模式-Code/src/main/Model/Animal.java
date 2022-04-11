package main.Model;

/**
 * @author liu zhen
 * @create 2021/7/26
 */
public abstract class Animal {
    private Integer id;
    private String name;
    private Integer categoryId;
    private String categoryName;

    public Animal() {
    }

    public Animal(Integer id, String name, Integer categoryId, String categoryName) {
        this.id = id;
        this.name = name;
        this.categoryId = categoryId;
        this.categoryName = categoryName;
    }

    public abstract void getDescription();

}
