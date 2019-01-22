package com.headfirst.adapters;

import com.headfirst.adapterinterfaces.Duck;
import com.headfirst.adapterinterfaces.Turkey;

// Turkey adapter is used to pass a turkey off  as a Duck
public class TurkeyAdapter implements Duck{
	
	//instantiate a Turkey object
	Turkey turkey;
	
	//constructor for the composition relationship
	public TurkeyAdapter(Turkey turkey) {
		this.turkey = turkey;
	}

	@Override
	public void quack() {
		turkey.gobble();
		
	}

	@Override
	public void fly() {
		// A turkey must fly 5 times the distance to qualify itself as a duck
		for(int i = 0; i < 5; i++) {
			turkey.fly();
		}
		
	}

	

}
