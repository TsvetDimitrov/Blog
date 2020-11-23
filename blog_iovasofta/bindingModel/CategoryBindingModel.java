package blog_iovasofta.bindingModel;

import blog_iovasofta.entity.Category;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import blog_iovasofta.repository.CategoryRepository;

public class CategoryBindingModel {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



}
