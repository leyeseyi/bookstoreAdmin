/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.service;

import com.example.demo.domain.Book;
import java.util.List;

/**
 *
 * @author Leyeseyi
 */

public interface BookService {
    Book save (Book book);
    List <Book> findAll();
    
    Book findOne(Long id);
}
