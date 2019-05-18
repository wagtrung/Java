/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apptest;

/**
 *
 * @author WagTrung
 */
public class Employee {

    private String employeeId;
    private String employeeName;
    private int salaryPerHour;
    private int noOfLeavingDay;
    private int noOfTravelDay;
    
    public Employee(String employId, String employeeName,int salaryPerHour,int noOfLeavingDay,int noOfTravelDay)
    {
    this.employeeId=employId;
    this.employeeName=employeeName;
    this.noOfLeavingDay=noOfLeavingDay;
    this.noOfTravelDay=noOfTravelDay;
    
    
    
    
    }
    

    public String getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public int getSalaryPerHour() {
        return salaryPerHour;
    }

    public int getNoOfLeavingDay() {
        return noOfLeavingDay;
    }

    public int getNoOfTravalDay() {
        return noOfTravelDay;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setSalaryPerHour(int salaryPerHour) {
        this.salaryPerHour = salaryPerHour;
    }

    public void setNoOfLeavingDay(int noOfLeavingDay) {
        this.noOfLeavingDay = noOfLeavingDay;
    }

    public void setNoOfTravalDay(int noOfTravalDay) {
        this.noOfTravelDay = noOfTravelDay;
    }

    ///method
    public int caculateWeeklySalary() {

        return this.salaryPerHour * 8 * (5 - this.noOfLeavingDay + this.noOfTravelDay / 2);

    }


public  int compareTo(Employee employee){
    
		if(this.noOfTravelDay>employee.noOfTravelDay)
			return 1;
		else if(this.noOfLeavingDay>employee.noOfLeavingDay)
			return -1;
		else 
			return 0;




}



    @Override
    public  String toString(){
    
   return  "name"+employeeName+
                "Salary Per Hour "+salaryPerHour+
                "Weekly Salary"+this.caculateWeeklySalary(); 
}

}
