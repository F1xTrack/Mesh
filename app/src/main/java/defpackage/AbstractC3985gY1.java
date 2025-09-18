package defpackage;

/* renamed from: gY1 */
/* loaded from: classes.dex */
public abstract class AbstractC3985gY1 extends JX1 {
    public boolean d;

    public AbstractC3985gY1(C5716lY1 c5716lY1) {
        super(c5716lY1);
        this.c.r++;
    }

    public final void A1() {
        if (this.d) {
            throw new IllegalStateException("Can't initialize twice");
        }
        B1();
        this.c.s++;
        this.d = true;
    }

    public abstract boolean B1();

    public final void z1() {
        if (!this.d) {
            throw new IllegalStateException("Not initialized");
        }
    }
}
