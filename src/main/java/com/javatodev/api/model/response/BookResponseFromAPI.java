package com.javatodev.api.model.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookResponseFromAPI {
    private Integer pageCount;
    private String isbn;
    private String title;
    private String thumbnailUrl;
    private String status;
    private List<String> authors;
}
