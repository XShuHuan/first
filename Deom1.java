public class Deom1 {
    public static void main(String[] args) {
        Person person=new Person();
        person.name="憨批";
        person.sex="男";
        person.address="，，，，，";
        person.introduction();

        Student stu=new Student();
        stu.name="111";
        stu.age=22;
        stu.interest="游戏";
        stu.studyInfo="S1";
        stu.study();

        Teacher tea=new Teacher();
        tea.name="老师";
        tea.tAge=5;
        tea.major="Java";
        tea.course="java初体验";
        tea.wook();
    }
}
