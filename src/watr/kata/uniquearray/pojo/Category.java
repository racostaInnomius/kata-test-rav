package watr.kata.uniquearray.pojo;

import java.util.ArrayList;

public class Category {
	
    private int id;
    private String name;
    private ArrayList<Category> category = new ArrayList<>();
    

	public Category(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Category> getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category.add(category);
	}
    
}
