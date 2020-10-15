package com.zemoso.Employee;

import java.util.ArrayList;
import java.util.List;

public class Employees implements Cloneable {

    private final List<String> empList;

    public Employees() {
        empList = new ArrayList<String>();
    }

    public Employees(List<String> list) {
        this.empList = list;
    }

    public void loadDBData() {
        //read all employees from database and put into the list
        empList.add("Pankaj");
        empList.add("Raj");
        empList.add("David");
        empList.add("Lisa");
    }

    public List<String> getEmpList() {
        return empList;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        super.clone();
        return new Employees(new ArrayList<String>(this.getEmpList()));
    }

}