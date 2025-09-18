package p000;

/* renamed from: gY1 */
/* loaded from: classes.dex */
public abstract class AbstractC9512gY1 extends JX1 {

    /* renamed from: d */
    public boolean f27833d;

    public AbstractC9512gY1(C10152lY1 c10152lY1) {
        super(c10152lY1);
        this.f5586c.f37140r++;
    }

    /* renamed from: A1 */
    public final void m18575A1() {
        if (this.f27833d) {
            throw new IllegalStateException("Can't initialize twice");
        }
        mo1721B1();
        this.f5586c.f37141s++;
        this.f27833d = true;
    }

    /* renamed from: B1 */
    public abstract boolean mo1721B1();

    /* renamed from: z1 */
    public final void m18576z1() {
        if (!this.f27833d) {
            throw new IllegalStateException("Not initialized");
        }
    }
}
