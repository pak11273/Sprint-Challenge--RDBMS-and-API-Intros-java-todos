package com.lambdaschool.todos.services;

import com.lambdaschool.todos.models.Todos;
import com.lambdaschool.todos.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;
import java.util.Optional;

@Transactional
@Service(value="todoService")
public class TodosServiceImpl implements TodosService {

    @Autowired
    TodoRepository todorepos;

    @Transactional
    @Override
    public void markComplete(long todoid) {
        Todos todo = todorepos.findById(todoid).orElseThrow(() -> new EntityNotFoundException("Todo " + todoid + " not found."));
        todo.setCompleted(true);

        todorepos.save(todo);
    }
}
