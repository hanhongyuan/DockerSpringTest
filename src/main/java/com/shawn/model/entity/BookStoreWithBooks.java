package com.shawn.model.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.util.List;

import org.springframework.stereotype.Component;

/**
 * @author Xiaoyue Xiao
 */
@Accessors(chain = true)
@NoArgsConstructor
@Getter
@Setter
@ToString(callSuper = true)
@Component
public class BookStoreWithBooks extends BookStore {

    private static final long serialVersionUID = -740463675258248874L;

    private List<Book> books;

}
