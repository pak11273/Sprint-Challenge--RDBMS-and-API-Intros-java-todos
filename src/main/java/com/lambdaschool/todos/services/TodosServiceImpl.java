package com.lambdaschool.todos.services;

import com.lambdaschool.todos.models.Todos;
import com.lambdaschool.todos.repository.TodosRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Transactional
@Service(value="todoService")
public class TodosServiceImpl implements TodosService {

    private TodosRepository todosrepos;

    @Transactional
    @Override
    public Todos save(Todos todos) {
        Todos newtodos = new Todos();

        newtodos.setCompleted(todos.isCompleted());
        newtodos.setDescription(todos.getDescription());
        newtodos.setUser(todos.getUser());
        return todosrepos.save(newtodos);
    }

    @Override
    public void markComplete(long todoid) {
    }
}
