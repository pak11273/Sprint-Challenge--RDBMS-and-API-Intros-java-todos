package com.lambdaschool.todos.services;

import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Transactional
@Service(value="todoService")
public class TodosServiceImpl implements TodosService {
    @Override
    public void markComplete(long todoid) {
    }
}
