package org.tnsif.client;

import org.tnsif.application.GSNormalAcc;
import org.tnsif.application.GSPrimeAcc;
import org.tnsif.application.GSShopFactory;
import org.tnsif.framework.ShopFactory;

public class Client {

	public static void main(String[] args) {
		ShopFactory f=new GSShopFactory();
		GSPrimeAcc p=new GSPrimeAcc(1234,"Pratik More",1050f,true);
		GSNormalAcc n=new GSNormalAcc(1134,"Pratik Gosavi",1050f,60f);
		
		//prime Account
		System.out.println("Prime Acc");
		System.out.println(p);
		p.bookProduct(p.getCharges());
		
		//Normal Account
		System.out.println("Normal Acc");
		System.out.println(n);
		n.bookProduct(n.getCharges());

	}

}
