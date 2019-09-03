package com.ps.springm1.model;

import com.ps.springm1.Account;
import com.ps.springm1.Card;

public class CurrentAccount implements Account{
	
	private Card atmCard;
	
	public CurrentAccount(Card card) {
		this.atmCard = card;
	}

	@Override
	public String createAccount() {
		return "Current Account created successfully";
	}

	@Override
	public String cardDetails() {
		// TODO Auto-generated method stub
		return atmCard.cardDetails();
	}
	
	
}
