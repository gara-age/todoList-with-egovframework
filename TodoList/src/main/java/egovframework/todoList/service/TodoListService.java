package egovframework.todoList.service;

import java.util.List;

public interface TodoListService {
	List<TodoListVO> selectTodoListList(TodoListVO vo);
	TodoListVO selectTodoListView(TodoListVO vo);
	void insertTodoList(TodoListVO vo);
	void updateTodoList(TodoListVO vo);
	void deleteTodoList(TodoListVO vo);
	void completeTodoList(TodoListVO vo);

}
