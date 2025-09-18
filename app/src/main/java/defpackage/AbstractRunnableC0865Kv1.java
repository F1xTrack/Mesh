package defpackage;

/* renamed from: Kv1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractRunnableC0865Kv1 implements Runnable {
    public final S81 a;

    public AbstractRunnableC0865Kv1() {
        this.a = null;
    }

    public void a(Exception exc) {
        S81 s81 = this.a;
        if (s81 != null) {
            s81.c(exc);
        }
    }

    public abstract void b();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            b();
        } catch (Exception e) {
            a(e);
        }
    }

    public AbstractRunnableC0865Kv1(S81 s81) {
        this.a = s81;
    }
}
