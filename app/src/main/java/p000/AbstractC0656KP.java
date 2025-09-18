package p000;

/* renamed from: KP */
/* loaded from: classes2.dex */
public abstract class AbstractC0656KP extends AbstractC0377Fz {

    /* renamed from: f */
    public static final /* synthetic */ int f6062f = 0;

    /* renamed from: c */
    public long f6063c;

    /* renamed from: d */
    public boolean f6064d;

    /* renamed from: e */
    public C6470n8 f6065e;

    /* renamed from: A */
    public abstract long mo4306A();

    /* renamed from: D */
    public final boolean m4626D() {
        C6470n8 c6470n8 = this.f6065e;
        if (c6470n8 == null) {
            return false;
        }
        AbstractC7257zK abstractC7257zK = (AbstractC7257zK) (c6470n8.isEmpty() ? null : c6470n8.m23092y());
        if (abstractC7257zK == null) {
            return false;
        }
        abstractC7257zK.run();
        return true;
    }

    /* renamed from: J */
    public void mo4627J(long j, AbstractRunnableC0467HP abstractRunnableC0467HP) {
        RunnableC6811sF.f42334j.m4312b0(j, abstractRunnableC0467HP);
    }

    /* renamed from: p */
    public final void m4628p(boolean z) {
        long j = this.f6063c - (z ? 4294967296L : 1L);
        this.f6063c = j;
        if (j <= 0 && this.f6064d) {
            shutdown();
        }
    }

    public abstract void shutdown();

    /* renamed from: w */
    public abstract Thread mo1842w();

    /* renamed from: x */
    public final void m4629x(boolean z) {
        this.f6063c = (z ? 4294967296L : 1L) + this.f6063c;
        if (z) {
            return;
        }
        this.f6064d = true;
    }
}
