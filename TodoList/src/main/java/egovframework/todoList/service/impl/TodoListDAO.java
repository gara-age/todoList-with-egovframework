package egovframework.todoList.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import egovframework.todoList.service.TodoListVO;

@Repository("todoListDAO")
public class TodoListDAO {
	private SqlSession sqlSession;
	
	public List<TodoListVO> selectTodoListList(TodoListVO vo){
		return sqlSession.selectList("todoListDAO.selectTodoListList", vo);
	}
	
	public TodoListVO selectTodoListView(TodoListVO vo) {
		return sqlSession.selectOne("todoListDAO.selectTodoListView", vo);
	}
	
	public void insertTodoList(TodoListVO vo) {
		sqlSession.insert("todoListDAO.insertTodoList", vo);
	}
	
	public void updateTodoList(TodoListVO vo) {
		sqlSession.update("todoListDAO.updateTodoList", vo);
	}
	public void deleteTodoList(TodoListVO vo) {
		sqlSession.update("todoListDAO.deleteTodoList", vo);
	}
	public void completeTodoList(TodoListVO vo) {
		sqlSession.update("todoListDAO.completeTodoList", vo);
	}
	public void orderTodoList(TodoListVO vo) {
		sqlSession.update("todoListDAO.orderTodoList", vo);
	}
}
