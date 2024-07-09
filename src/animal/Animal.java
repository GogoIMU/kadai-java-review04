package animal;

public class Animal {
    private String name;
    private int age;

    // getterとsetter
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    // 引数なしのコンストラクタ
    public Animal() {
    }

    // 引数ありのコンストラクタ
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
}
    // sayメソッド
    public void say() {
        System.out.println(this.name + "です。" + this.age +"歳です。");
    }
}