public class Person {
    protected String name;
    protected String adress;

    public Person(String name, String adress) {
        this.adress = adress;
        this.name = name;
    }

        public String getName () {
            return name;
        }

        public String getAdress () {
            return adress;
        }

        public void setAdress (String adress){
            this.adress = adress;
        }

    @Override
    public String toString() {
        return "Person{" + "name='" + name + '\'' +
                ", adress='" + adress + '\'' + '}';
    }
}
