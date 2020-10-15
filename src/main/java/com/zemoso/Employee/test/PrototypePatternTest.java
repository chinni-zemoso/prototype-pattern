package com.zemoso.Employee.test;

import com.zemoso.Employee.Employees;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;


public class PrototypePatternTest {
    private static final Logger logger = LoggerFactory.getLogger(PrototypePatternTest.class);

    public static void main(String[] args) throws CloneNotSupportedException {
        Employees emps = new Employees();
        emps.loadDBData();//fetch data from DB
        logger.info("List of Employees in DB: " + emps.getEmpList());
        
        //Use the clone method to get the Employee object
        Employees empsWithNameRaj = (Employees) emps.clone();
        List<String> list = empsWithNameRaj.getEmpList();
        logger.info("empsWithNameRaj List: " +  list.get(list.indexOf("Raj")));

        Employees empsExceptPankaj = (Employees) emps.clone();
        List<String> list1 = empsExceptPankaj.getEmpList();
        list1.remove("Pankaj");
        logger.info("empsExceptPankaj List: " + list1);
    }
}
