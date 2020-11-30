package Test1;

import java.util.List;

import com.gem.book_mall.dao.BookChartDAO;
import com.gem.book_mall.dao.BookInfoDAO;
import com.gem.book_mall.dao.BookSortDAO;
import com.gem.book_mall.dao.BookSortsDAO;
import com.gem.book_mall.dao.UserDAO;
import com.gem.book_mall.dao.impl.BookChartDAOImpl;
import com.gem.book_mall.dao.impl.BookInfoDAOImpl;
import com.gem.book_mall.dao.impl.BookSortDAOImpl;
import com.gem.book_mall.dao.impl.BookSortsDAOImpl;
import com.gem.book_mall.dao.impl.UserDAOImpl;
import com.gem.book_mall.pojo.BookChart;
import com.gem.book_mall.pojo.BookInfo;
import com.gem.book_mall.pojo.BookSort;
import com.gem.book_mall.pojo.User;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	BookInfoDAO bookInfoDAO =new BookInfoDAOImpl();
		List<BookInfo> list1 = bookInfoDAO.getAllBooksById(1);
		for (int i = 0; i < list1.size(); i++) {
			System.out.println(list1.get(i));
		}
		BookSortDAO bookSortDAO = new BookSortDAOImpl();
		List<BookInfo> list2 = bookSortDAO.getAllBookSort(3);
		for (int i = 0; i < list2.size(); i++) {
			System.out.println(list2.get(i));
		}
		BookSortsDAO bookSortsDAO = new BookSortsDAOImpl();
		List<BookSort> list = bookSortsDAO.getAllBookSortsById();
		for(int i=0;i<list.size();i++){
			int cid = list.get(i).getCid();
			System.out.println(cid);
		}*/
		/*BookChartDAO bookChartDAO = new BookChartDAOImpl();
		List<BookChart> book = bookChartDAO.getAllBuy();
		int sum=0;
		for (int i=0;i<book.size();i++) {
			sum+=book.get(i).getNew_price();
		}
		System.out.println(sum);*/
		UserDAO user = new UserDAOImpl();
		/*List<User> list =user.getAllUser();
		for (User string : list) {
			System.out.println(string);
		}*/
		List<User> list = user.getUserById(1);
		for (User user2 : list) {
			System.out.println(user2);
		}
	}

}
