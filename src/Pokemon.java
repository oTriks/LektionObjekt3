abstract class Pokemon {   // om det inte ska gå att skapa någon "pokemon"
    protected String name;
    private String type;

    public Pokemon(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;

    }

    public void attack() {
        System.out.println(this.name + " is attacking!");

    }
}