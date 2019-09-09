package com.bw.TestDemo;

import java.util.ArrayList;
import java.util.List;

import com.bw.bean.BlankCard;
import com.bw.bean.Person;

public class Test01 {
		public static void main(String[] args) {
			BlankCard blankCard = new BlankCard("6223800001", "招商银行");
			BlankCard blankCard01 = new BlankCard("6224800001", "农业银行");
			List<BlankCard> cards = new ArrayList<BlankCard>();
			cards.add(blankCard01);			
			cards.add(blankCard);
			Person person = new Person("444444", "lll");
			Person person01 = new Person("55555", "iii");
			List<Person> persons = new ArrayList<>();
			persons.add(person);
			persons.add(person01);
		}
}
