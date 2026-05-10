package com.pluralsight;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EmployeeTest {

    @Test
    public void testPunchIn() {

        Employee employee = new Employee(101, "Sara", "Front Desk", 20.00, 0);

        employee.punchIn(900);

        assertEquals(900, employee.getPunchInTime());
    }
    @Test
    public void testPunchOut() {

        Employee employee = new Employee(101, "Sara", "Front Desk", 20.00, 0);

        employee.punchIn(900);
        employee.punchOut(1700);

        assertEquals(1700, employee.getPunchOutTime());
    }

}
