package com.incar.convert;

public interface ProtocolEntity<H,B,F> {
    public Class<H> headClass();
    public Class<B> bodyClass();
    public Class<F> footClass();
    public void setHead(H head);
    public void setBody(B body);
    public void setFoot(F foot);
    public H getHead();
    public B getBody();
    public F getFoot();
}
