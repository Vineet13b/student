class student  extends course{
    String name;
    String usn;
    String dept;
    String sem;
    String program;

    public student(String name,String usn,String dept,String sem,String program){
        this.name =name;
        this.usn=usn;
        this.dept = dept;
        this.sem=sem;
        this.program = program;
    }

    void get_name(){
        System.out.println("Name: "+name);
    }
    void get_usn(){
        System.out.println("Usn: "+usn);
    }
    void get_dept(){
        System.out.println("Department: "+dept);
    }
    void get_sem(){
        System.out.println("Semester: "+sem);
    }
    void get_program(){
        System.out.println("Program: "+program);
    }

    public static void main(String[] args){
        student s1 = new student("Vineet","01fe22bca038","BCA","Fourth","BCA");
    
        s1.get_name();
        s1.get_usn();
        s1.get_dept();
        s1.get_sem();
        s1.get_program();
        s1.get_course();
        System.out.println("Marks less than 40 :");
        s1.get_marks();

    }
}