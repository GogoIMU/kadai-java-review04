package animal;

public class Human extends Animal implements Thinkable {
    private String hobby; // 趣味

        public String getHobby() {
        return hobby;
    }
        public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    /*// 引数なしコンストラクタ
        public Human() {
        }*/

    // 引数ありコンストラクタ
        public Human(String name, int age, String hobby) {
            super(name, age); // スーパークラス(Animalの呼び出し)
            this.hobby = hobby;
        }

    @Override
    public void think() {
        System.out.println("私は" + hobby + "について考えています。");

    }

}
