package defpackage;

/* renamed from: kQ1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractRunnableC5501kQ1 implements Runnable {
    public final S81 a;

    public AbstractRunnableC5501kQ1() {
        this.a = null;
    }

    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            a();
        } catch (Exception e) {
            S81 s81 = this.a;
            if (s81 != null) {
                s81.c(e);
            }
        }
    }

    public AbstractRunnableC5501kQ1(S81 s81) {
        this.a = s81;
    }
}
