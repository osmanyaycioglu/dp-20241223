package org.training.sqills.pattern.behavioral.memento;


public class MySession {
    private String    data;
    private String    sessionId;
    private String    name;
    private int       counter;
    private Caretaker caretaker = new Caretaker();

    public void doSome() {
        counter++;
    }

    public Memento save() {
        Memento memento = new Memento();
        memento.setData(data);
        memento.setCounter(counter);
        caretaker.save(memento);
        return memento;
    }

    public void undo() {
        caretaker.undo(this);
    }

    public void restore(Memento memento) {
        data = memento.getData();
        counter = memento.getCounter();
    }

    public String getData() {
        return data;
    }

    public void setData(final String dataParam) {
        data = dataParam;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(final String sessionIdParam) {
        sessionId = sessionIdParam;
    }

    public String getName() {
        return name;
    }

    public void setName(final String nameParam) {
        name = nameParam;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(final int counterParam) {
        counter = counterParam;
    }

    public Caretaker getCaretaker() {
        return caretaker;
    }

    public void setCaretaker(final Caretaker caretakerParam) {
        caretaker = caretakerParam;
    }

    @Override
    public String toString() {
        return "MySession{" +
               "data='" + data + '\'' +
               ", sessionId='" + sessionId + '\'' +
               ", name='" + name + '\'' +
               ", counter=" + counter +
               ", caretaker=" + caretaker +
               '}';
    }
}
