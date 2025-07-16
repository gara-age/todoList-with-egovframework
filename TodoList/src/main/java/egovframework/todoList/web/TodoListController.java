package egovframework.todoList.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import egovframework.todoList.service.TodoListService;
import egovframework.todoList.service.TodoListVO;

@Controller
public class TodoListController {
	@Resource(name = "todoListService")
	private TodoListService todoListService;
	
	@RequestMapping("/todo/test.do")
	public String todoTest() {
		
		return "todo/todoListList";
	}
	
	@RequestMapping("/todo/todoListList.do")
	public String selectTodoListList(TodoListVO vo, Model model) {
		System.out.println("진입 성공");
		List<TodoListVO> list = todoListService.selectTodoListList(vo);
		System.out.println("List 성공");
		model.addAttribute("resultList",list);
		System.out.println("Model 성공");
		return "todo/todoList";
	}
	
	@RequestMapping("/todo/todoListView.do")
	public String selectTodoListView(TodoListVO vo, Model model) {
		TodoListVO resultVO = todoListService.selectTodoListView(vo);
		model.addAttribute("result", resultVO);
		return "todo/todoListView";
	}
	
	@RequestMapping("/todo/todoListForm.do")
	public String  todoListForm(TodoListVO vo, Model model) {
		if(vo.getIdxNo() != null) {
			TodoListVO resultVO = todoListService.selectTodoListView(vo);
			model.addAttribute("resultVO", resultVO);
		}
		return "todo/todoListForm";
	}
	
	@RequestMapping("/todo/update.do")
	public String  updateTodoList(TodoListVO vo, Model model, RedirectAttributes redirectAttributes) {
		todoListService.updateTodoList(vo);
		redirectAttributes.addFlashAttribute("msg", "수정되었습니다.");
		return "redirect:/todo/todoListView,do?idxNo=" + vo.getIdxNo();
	}

	
	@RequestMapping("/todo/insert.do")
	public String  insertTodoList(TodoListVO vo, Model model, RedirectAttributes redirectAttributes) {
		todoListService.insertTodoList(vo);
		redirectAttributes.addFlashAttribute("msg", "추가되었습니다.");
		return "redirect:/todo/todoListList.do";
	}

	
	@RequestMapping("/todo/delete.do")
	public String  deleteTodoList(TodoListVO vo, Model model, RedirectAttributes redirectAttributes) {
		todoListService.deleteTodoList(vo);
		redirectAttributes.addFlashAttribute("msg", "삭제되었습니다.");
		return "redirect:/todo/todoListList.do";
	}


}
