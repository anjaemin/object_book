package chap01;

public class Audience {
    private Bag bag;

    public Audience(Bag bag) {
        this.bag = bag;
    }

    /*public chap01.Bag getBag() {
        return bag;
    }*/

    public Long buy(Ticket ticket) {
        return bag.hold(ticket);
    }
}
