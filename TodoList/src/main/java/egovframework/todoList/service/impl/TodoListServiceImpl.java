package egovframework.todoList.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.todoList.service.TodoListService;
import egovframework.todoList.service.TodoListVO;

@Service("todoListService")
public class TodoListServiceImpl implements TodoListService{
	@Resource(name = "todoListDAO")
	private TodoListDAO todoListDAO;
	
	@Override
	public List<TodoListVO> selectTodoListList(TodoListVO vo) {
		return todoListDAO.selectTodoListList(vo);
	}

	@Override
	public TodoListVO selectTodoListView(TodoListVO vo) {
		return todoListDAO.selectTodoListView(vo);
	}

	@Override
	public void insertTodoList(TodoListVO vo) {
		todoListDAO.insertTodoList(vo);
	}

	@Override
	public void updateTodoList(TodoListVO vo) {
		todoListDAO.updateTodoList(vo);
		
	}

	@Override
	public void deleteTodoList(TodoListVO vo) {
		todoListDAO.deleteTodoList(vo);
	}

	@Override
	public void completeTodoList(TodoListVO vo) {
		todoListDAO.completeTodoList(vo);
	}

}
