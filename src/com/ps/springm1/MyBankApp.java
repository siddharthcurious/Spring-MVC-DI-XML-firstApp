package com.ps.springm1;

//import com.ps.springm1.model.SavingAccount;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MyBankApp {
	public static void main(String [] args) {
//		SavingAccount account = new SavingAccount();
//		String data = account.createAccount();
//		System.out.println(data);
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Account account = context.getBean("myAccount", Account.class);
		System.out.println(account.createAccount());
		System.out.println(account.cardDetails());
		
		context.close();
		
	}

}
