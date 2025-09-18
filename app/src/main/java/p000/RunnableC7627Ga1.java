package p000;

/* renamed from: Ga1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC7627Ga1 extends JV0 implements Runnable {

    /* renamed from: e */
    public final long f3807e;

    public RunnableC7627Ga1(long j, AbstractC1571Yy abstractC1571Yy) {
        super(abstractC1571Yy, abstractC1571Yy.getContext());
        this.f3807e = j;
    }

    @Override // p000.C9002cc0
    /* renamed from: I */
    public final String mo3095I() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.mo3095I());
        sb.append("(timeMillis=");
        return AbstractC11153tN0.m24913y(sb, this.f3807e, ')');
    }

    @Override // java.lang.Runnable
    public final void run() {
        AZ1.m235c(this.f3003c);
        m10812n(new C7575Fa1(AbstractC0852NX.m5760i(new StringBuilder("Timed out waiting for "), this.f3807e, " ms"), this));
    }
}
