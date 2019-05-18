/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author WagTrung
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AppTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Employee> listemp = new ArrayList<Employee>();
		
		listemp.add(new Employee("B","IT",5000,3,5));
		listemp.add(new Employee("C","BA",4000,0,5));
		listemp.add(new Employee("A","BT",6500,3,4));
		
		Collections.sort(listemp);
		
		for(Employee emp: listemp) {
			System.out.println(emp.toString());
		}

	}

}


}

