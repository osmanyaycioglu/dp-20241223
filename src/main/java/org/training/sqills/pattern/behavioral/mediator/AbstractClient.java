package org.training.sqills.pattern.behavioral.mediator;


public abstract class AbstractClient implements IMsgListener {

    protected Mediator mediator;

    public AbstractClient(final Mediator mediatorParam) {
        super();
        this.mediator = mediatorParam;
        this.mediator.register(this);
    }


}
