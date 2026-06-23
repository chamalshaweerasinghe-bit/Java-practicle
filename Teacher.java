class Teacher {
 
   private String name;
   private String subject;
  
    public void setDetails(String tName, String Subject) {
        name = tName;
        subject = Subject;
    }
    String getName() {
        return name;
    }
    String getSubject() {
        return subject;
    }
    public static void main(String[] args) {

        Teacher t1 = new Teacher();

        t1.setDetails("Kamal", "Mathematics");


        System.out.println("Teacher Name: " + t1.getName());
        System.out.println("Subject: " + t1.getSubject());
    }
}