package com.headfirst;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;

import com.headfirst.adapterdomain.MallardDuck;
import com.headfirst.adapterdomain.WildTurkey;
import com.headfirst.adapterinterfaces.Duck;
import com.headfirst.adapters.TurkeyAdapter;


/**
 * Unit test for simple App.
 */
public class AppTest 
{
	
	private static MallardDuck duck;
	private static WildTurkey turkey;
	private static Duck turkeyAdapter; // Target: we want to convert a Turkey into a Duck
	
	@BeforeClass
	public static void setUp() {
		// instantiate instance variables here
		duck = new MallardDuck();
		turkey = new WildTurkey();
		
		// instantiate adapter to perform composition relationship to transform turkey (adaptee) into a Duck (target)
		turkeyAdapter = new TurkeyAdapter(turkey);
		
	}
	
	static void testDuck(Duck duck) {
		duck.quack();
		duck.fly();
	}

    @Test
    public void turkeyActionsTest()
    {
    	System.out.println("A turkey says...");
        turkey.gobble();
        turkey.fly();
    }
    
    @Test
    public void duckActionsTest() {
    	testDuck(duck);
    }
    
    @Test
    public void turkeyToDuckAdaptertest() {
    	testDuck(turkeyAdapter);
    }
}
