package p000;

/* loaded from: classes.dex */
public abstract class SQ1 extends AbstractC1259U0 {

    /* renamed from: c */
    public boolean f10765c;

    public SQ1(C9110dP1 c9110dP1) {
        super(c9110dP1);
        ((C9110dP1) this.f11615b).f26027F++;
    }

    /* renamed from: w1 */
    public final void m7367w1() {
        if (!this.f10765c) {
            throw new IllegalStateException("Not initialized");
        }
    }

    /* renamed from: x1 */
    public final void m7368x1() {
        if (this.f10765c) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (mo6035y1()) {
            return;
        }
        ((C9110dP1) this.f11615b).f26029H.incrementAndGet();
        this.f10765c = true;
    }

    /* renamed from: y1 */
    public abstract boolean mo6035y1();
}
