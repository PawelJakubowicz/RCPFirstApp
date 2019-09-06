package rcpapi;

import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

import rcpservice.DoSomething;

public interface IDoSomethingService {

    void getTodos(Consumer<List<DoSomething>> todosConsumer);

    boolean saveTodo(DoSomething dosomething);

    Optional<DoSomething> getTodo(long id);

    boolean deleteTodo(long id);
	
    
}
