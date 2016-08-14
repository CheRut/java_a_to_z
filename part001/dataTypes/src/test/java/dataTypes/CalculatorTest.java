package dataTypes;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;
import org.junit.Test;
import java.util.Arrays;
import dataTypes.Calculator;

public class CalculatorTest{
		private double first = 3.0;
        private double sec = 1.5;
		private double result;
		Calculator calculator;
		
		@Test
		public void calculatorAddTesting(){		
		calculator = new Calculator();
        
		double count = calculator.add(first,sec);
		result = 4.5;		
		assertThat(count, is(result));
		}
        @Test
		public void calculatorSubstractTesting(){		
		calculator = new Calculator();
        double count=calculator.substract(first,sec);
		result=1.5;
		assertThat(count, is(result));
		} 
}
