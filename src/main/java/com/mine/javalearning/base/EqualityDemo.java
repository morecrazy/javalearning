package com.mine.javalearning.base;

class Employee
{
   private String name;
   private int age;
 
   Employee(String name, int age)
   {
      this.name = name;
      this.age = age;
   }
 
   @Override
   public boolean equals(Object o)
   {
      if (!(o instanceof Employee))
         return false;
 
      Employee e = (Employee) o;
      return e.getName().equals(name) && e.getAge() == age;
   }
 
   String getName()
   {
      return name;
   }
 
   int getAge()
   {
      return age;
   }
}
 
public class EqualityDemo
{
   public static void main(String[] args)
   {
      Employee e1 = new Employee("John Doe", 29);
      Employee e2 = new Employee("Jane Doe", 33);
      Employee e3 = new Employee("John Doe", 29);
      Employee e4 = new Employee("John Doe", 27+2);
      // 验证自反性。
      System.out.printf("Demonstrating reflexivity...%n%n");
      System.out.printf("e1.equals(e1): %b%n", e1.equals(e1));
      // 验证对称性。
      System.out.printf("%nDemonstrating symmetry...%n%n");
      System.out.printf("e1.equals(e2): %b%n", e1.equals(e2));
      System.out.printf("e2.equals(e1): %b%n", e2.equals(e1));
      System.out.printf("e1.equals(e3): %b%n", e1.equals(e3));
      System.out.printf("e3.equals(e1): %b%n", e3.equals(e1));
      System.out.printf("e2.equals(e3): %b%n", e2.equals(e3));
      System.out.printf("e3.equals(e2): %b%n", e3.equals(e2));
      // 验证传递性。
      System.out.printf("%nDemonstrating transitivity...%n%n");
      System.out.printf("e1.equals(e3): %b%n", e1.equals(e3));
      System.out.printf("e3.equals(e4): %b%n", e3.equals(e4));
      System.out.printf("e1.equals(e4): %b%n", e1.equals(e4));
      // 验证一致性。
      System.out.printf("%nDemonstrating consistency...%n%n");
      for (int i = 0; i < 5; i++)
      {
         System.out.printf("e1.equals(e2): %b%n", e1.equals(e2));
         System.out.printf("e1.equals(e3): %b%n", e1.equals(e3));
      }
      // 验证传入非空集合时，返回值为false。
      System.out.printf("%nDemonstrating null check...%n%n");
      System.out.printf("e1.equals(null): %b%n", e1.equals(null));
   }
}
