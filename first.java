class student {

    int id;
    char name;
    void grade(){
        System.out.println("this is my java program");
    }
}

interface bca extends student{
    void grade(){
        System.out.println("this is my java program");
    }   
}

interface mca extends student{
    void grade(){
        System.out.println("this is my java program");
    }
}

interface grade implements bca, mca{

}

class first
{

    public static void main(String[] args) {
        student obj = new student();
        obj.grade();
    }
}