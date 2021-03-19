package com.lambdaschool.todos.services;

import com.lambdaschool.todos.models.Todos;

public interface TodosService {
    Todos save(Todos todos);
    void markComplete(long todoid);
}
