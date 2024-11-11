package com.Xworks.AccessSpecifiers.example;

public class Police {
	public String name;          
    private int badgeNumber;      
    protected String department;  
    String rank;                  

    public Police() {
        this.name = "Ajith";
        this.badgeNumber = 3;
        this.department = "Vijilence";
        this.rank = "SP";
    }

    private Police(int badgeNumber) {
        this.badgeNumber = badgeNumber;
    }

   

    private void setBadgeNumber(int badgeNumber) {
        this.badgeNumber = badgeNumber;
    }

    protected void setDepartment(String department) {
        this.department = department;
        System.out.println("Department is:"+department);
    }
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Badge Number: " + badgeNumber);
        System.out.println("Department: " + department);
        System.out.println("Rank: " + rank);
    }
        void setRank(String rank) {
        this.rank = rank;
    }
    /*public static void main(String[] args)
    {
    	Police officer=new Police();
    	officer.setDepartment("Vijilence");
    	Police officer1=new Police(1);
    	officer1.displayInfo();
    }*/

    }

