package org.skypro.skyshop.model.article;

import java.util.Objects;
import org.skypro.skyshop.model.product.TypeContent;
import org.skypro.skyshop.model.search.Searchable;

public class Article implements Searchable {

    private final String title;
    private final String text;

    public Article(String title, String text) {
        this.title = title;
        this.text = text;
    }

    @Override
    public String getContentType() {
        return TypeContent.ARTICLE.getType();
    }

    @Override
    public String getName() {
        return title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Article article = (Article) o;
        return Objects.equals(title, article.title);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(title);
    }

    @Override
    public String toString() {
        return title + "\n" + text;
    }
}
