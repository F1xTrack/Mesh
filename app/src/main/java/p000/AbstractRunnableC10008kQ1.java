package p000;

/* renamed from: kQ1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractRunnableC10008kQ1 implements Runnable {

    /* renamed from: a */
    public final S81 f36502a;

    public AbstractRunnableC10008kQ1() {
        this.f36502a = null;
    }

    /* renamed from: a */
    public abstract void mo8800a();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            mo8800a();
        } catch (Exception e) {
            S81 s81 = this.f36502a;
            if (s81 != null) {
                s81.m7185c(e);
            }
        }
    }

    public AbstractRunnableC10008kQ1(S81 s81) {
        this.f36502a = s81;
    }
}
