//package com.example.api;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.example.entity.Book;
//import com.example.repository.BookRepository;
//
//
//	@CrossOrigin(origins = {"*"})
//	@RestController()
//	@RequestMapping("/viewbooks")
//	public class RemoveBook {
//		
//
//		@Autowired
//		BookRepository bookRepository;
//		
//		@GetMapping(produces= {"application/json"})
//		public List<Book> getAllBooks(){
//			return bookRepository.deleteById(book.getB_id());
//			
//		}
//		
//	}
//}
