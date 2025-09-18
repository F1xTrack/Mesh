package p000;

/* renamed from: hI1 */
/* loaded from: classes.dex */
public abstract class AbstractC9608hI1 extends TJ1 {

    /* renamed from: c */
    public boolean f28371c;

    public AbstractC9608hI1(C9110dP1 c9110dP1) {
        super(c9110dP1);
        ((C9110dP1) this.f11615b).f26027F++;
    }

    /* renamed from: A1 */
    public final void m18793A1() {
        if (!this.f28371c) {
            throw new IllegalStateException("Not initialized");
        }
    }

    /* renamed from: B1 */
    public final void m18794B1() {
        if (this.f28371c) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (mo2654z1()) {
            return;
        }
        ((C9110dP1) this.f11615b).f26029H.incrementAndGet();
        this.f28371c = true;
    }

    /* renamed from: z1 */
    public abstract boolean mo2654z1();
}
