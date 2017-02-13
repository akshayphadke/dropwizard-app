package com.akshay.todo;

import com.akshay.todo.resources.TodoResource;
import io.dropwizard.Application;
import io.dropwizard.setup.Environment;

/**
 * Created by akshayphadke on 2/12/17.
 */
public class TodoApplication extends Application<TodoConfiguration> {

    public static void main(String[] args) throws Exception {
        new TodoApplication().run(args);
    }

    @Override
    public void run(TodoConfiguration todoConfiguration, Environment environment) throws Exception {
        environment.jersey().register(new TodoResource());
    }
}
