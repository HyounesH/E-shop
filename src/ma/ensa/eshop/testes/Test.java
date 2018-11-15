package ma.ensa.eshop.testes;

import ma.ensa.eshop.dao.impl.EshopDaoImpl;

public class Test {
	public static void main(String[] args) {
		EshopDaoImpl dao=new EshopDaoImpl();
		//Client c=new Client("1111","1111","1111","1111","1111");
		
	    // dao.EnregClient(c);
		boolean isLogin=dao.IsLogin("1111", "1111");
		System.out.println(isLogin);
	}

}
