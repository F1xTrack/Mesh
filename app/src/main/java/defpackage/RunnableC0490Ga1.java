package defpackage;

/* renamed from: Ga1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC0490Ga1 extends JV0 implements Runnable {
    public final long e;

    public RunnableC0490Ga1(long j, AbstractC1963Yy abstractC1963Yy) {
        super(abstractC1963Yy, abstractC1963Yy.getContext());
        this.e = j;
    }

    @Override // defpackage.C2548cc0
    public final String I() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.I());
        sb.append("(timeMillis=");
        return AbstractC7209tN0.y(sb, this.e, ')');
    }

    @Override // java.lang.Runnable
    public final void run() {
        AZ1.c(this.c);
        n(new C0412Fa1(NX.i(new StringBuilder("Timed out waiting for "), this.e, " ms"), this));
    }
}
