package com.lambdaschool.todos.controllers;

import com.lambdaschool.todos.models.Todos;
import com.lambdaschool.todos.services.TodosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * The entry point for client to access user, todos combinations
 */
@RestController
@RequestMapping("/todos")
public class TodosController {
    /**
     * Using the Todos service to process user, todos combinations data
     */
    @Autowired
    TodosService todosService;

//    // http://localhost:2019/todos/todos
//    @GetMapping(value = "todos",
//    produces = "application/json")
//    public ResponseEntity<?> findAll() {
//        List<Todos> myTodos = todosService.findAll();
//        return new ResponseEntity<>(myTodos, HttpStatus.OK);
//    }

    /**
     * Given the todo id, mark the task as complete
     * <br>Example: <a href="http://localhost:2019/todos/todo/7">http://localhost:2019/todos/todo/7</a>
     *
     * @param todoid The todo to be marked complete
     * @return Status of OK
     */
    @PatchMapping(value = "/todo/{todoid}")
    public ResponseEntity<?> completeTodo(
            @PathVariable
                    long todoid) {
        todosService.markComplete(todoid);
        return new ResponseEntity<>(HttpStatus.OK);
    }

// DELETE /users/user/{userid} - Deletes a user based off of their userid and deletes all their associated todos.
}
