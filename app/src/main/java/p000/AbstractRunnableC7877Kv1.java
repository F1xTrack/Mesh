package p000;

/* renamed from: Kv1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractRunnableC7877Kv1 implements Runnable {

    /* renamed from: a */
    public final S81 f6391a;

    public AbstractRunnableC7877Kv1() {
        this.f6391a = null;
    }

    /* renamed from: a */
    public void mo4778a(Exception exc) {
        S81 s81 = this.f6391a;
        if (s81 != null) {
            s81.m7185c(exc);
        }
    }

    /* renamed from: b */
    public abstract void mo4779b();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            mo4779b();
        } catch (Exception e) {
            mo4778a(e);
        }
    }

    public AbstractRunnableC7877Kv1(S81 s81) {
        this.f6391a = s81;
    }
}
