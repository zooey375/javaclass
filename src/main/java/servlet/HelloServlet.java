package servlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


//表示瀏覽器可以透過 https://localhost:8080/JavaWeb/hello 網址執行到此 Servlet 程式。
//@WebServlet("/hello" ) 這是精簡配置寫法。
//@WebServlet(urlPatterns = "/hello" ) 這是標準配置寫法。
//@WebServlet(urlPatterns = {"/hello", "/welcome","/hi.php" }) //等於三個文字都可以開啟同一個網站(一定要有斜線/)。
@WebServlet("/*") //不建議，*是隨便打的意思。
public class HelloServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		resp.getWriter().print("Hello JacaServlet"); //將字串回應給瀏覽器

	}
	
}
