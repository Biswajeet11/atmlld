public class Atm implements CardReader, CardDispenser {

    private String address;
    private String name;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean authenticateCard(Card card) {
        return false;
    }

    @Override
    public void dispenseCash() {

    }

    @Override
    public void ejectCard() {

    }
}
