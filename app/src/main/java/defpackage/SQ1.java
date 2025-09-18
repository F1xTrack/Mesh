package defpackage;

/* loaded from: classes.dex */
public abstract class SQ1 extends U0 {
    public boolean c;

    public SQ1(C3386dP1 c3386dP1) {
        super(c3386dP1);
        ((C3386dP1) this.b).F++;
    }

    public final void w1() {
        if (!this.c) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void x1() {
        if (this.c) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (y1()) {
            return;
        }
        ((C3386dP1) this.b).H.incrementAndGet();
        this.c = true;
    }

    public abstract boolean y1();
}
