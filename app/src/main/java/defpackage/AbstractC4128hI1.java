package defpackage;

/* renamed from: hI1 */
/* loaded from: classes.dex */
public abstract class AbstractC4128hI1 extends TJ1 {
    public boolean c;

    public AbstractC4128hI1(C3386dP1 c3386dP1) {
        super(c3386dP1);
        ((C3386dP1) this.b).F++;
    }

    public final void A1() {
        if (!this.c) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void B1() {
        if (this.c) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (z1()) {
            return;
        }
        ((C3386dP1) this.b).H.incrementAndGet();
        this.c = true;
    }

    public abstract boolean z1();
}
