package defpackage;

/* renamed from: xG1 */
/* loaded from: classes.dex */
public abstract class AbstractRunnableC7951xG1 implements Runnable {
    public final long a;
    public final long b;
    public final boolean c;
    public final /* synthetic */ CG1 d;

    public AbstractRunnableC7951xG1(CG1 cg1, boolean z) {
        this.d = cg1;
        this.a = cg1.b.currentTimeMillis();
        this.b = cg1.b.elapsedRealtime();
        this.c = z;
    }

    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        CG1 cg1 = this.d;
        if (cg1.g) {
            b();
            return;
        }
        try {
            a();
        } catch (Exception e) {
            cg1.e(e, false, this.c);
            b();
        }
    }

    public void b() {
    }
}
