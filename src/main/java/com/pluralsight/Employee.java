package com.pluralsight;

public class Employee {
    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;

    private int punchInTime;
    private int punchOutTime;

    public Employee(int employeeId, String name, String department, double payRate, double hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;

    }
    public void punchIn(int time) {
        punchInTime = time;
    }

    public void punchOut(int time) {
        punchOutTime = time;
        hoursWorked = (punchOutTime - punchInTime) / 100.0;

    }
    // getters
    public int getPunchInTime() {
        return punchInTime;
    }

    public int getPunchOutTime() {
        return punchOutTime;
    }

        public double getRegularHours () {
            if (hoursWorked > 40) {
                return 40;
            } else {
                return hoursWorked;
            }
        }

        public double getOvertimeHours () {
            if (hoursWorked > 40) {
                return hoursWorked - 40;
            } else {
                return 0;
            }
        }

        public double getTotalPay () {
            double regularPay = getRegularHours() * payRate;
            double overtimePay = getOvertimeHours() * payRate * 1.5;

            return regularPay + overtimePay;
        }
    }



