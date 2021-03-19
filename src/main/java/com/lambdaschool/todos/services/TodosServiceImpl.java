package com.lambdaschool.todos.services;

import com.lambdaschool.todos.repository.TodosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Transactional
@Service(value="todoService")
public class TodosServiceImpl implements TodosService {

    @Autowired
    private TodosRepository todosrepos;

    @Override
    public void markComplete(long todoid) {
    }
}
