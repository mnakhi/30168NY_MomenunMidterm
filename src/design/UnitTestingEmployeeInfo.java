package design;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Collections;

public class UnitTestingEmployeeInfo {
    public static void main(String[] args) {
        //Write Unit Test for all the methods has been implemented in this package.

    }
    @Test
    public void testPositiveEmployeeName(){
        EmployeeInfo em = new EmployeeInfo();
        em.setEmployeeName("John Doe");
        Assert.assertEquals("John Doe",em.getEmployeeName());
    }

    @Test
    public void testNegativeEmployeeName(){
        EmployeeInfo em = new EmployeeInfo();
        em.setEmployeeName("James Watt");
        Assert.assertNotEquals("James Morris",em.getEmployeeName());
    }
    @Test
    public void testPositiveEmployeeInfo(){
        EmployeeInfo em = new EmployeeInfo();
        em.setAssignedDepartment("IT");
        Assert.assertEquals("IT",em.getAssignedDepartment());
    }
    @Test
    public void testNegativeEmployeeDepartmentName(){
        EmployeeInfo em = new EmployeeInfo();
        em.setAssignedDepartment("IT");
        Assert.assertNotEquals("Finance",em.getAssignedDepartment());
    }
    @Test
    public void testPositiveEmployeeId(){
        EmployeeInfo em = new EmployeeInfo(1,"Sharlock Homes");
        em.employeeId();
        Assert.assertEquals(1,em.employeeId());

    }
    @Test
    public void testNegativeEmployeeInfo(){
        EmployeeInfo em = new EmployeeInfo("Sarah Shaw",2,"IT",66000.00,'F');
        Assert.assertNotEquals("HR",em.getAssignedDepartment());

    }

}
