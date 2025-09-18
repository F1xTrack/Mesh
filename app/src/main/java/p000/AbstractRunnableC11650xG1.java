package p000;

/* renamed from: xG1 */
/* loaded from: classes.dex */
public abstract class AbstractRunnableC11650xG1 implements Runnable {

    /* renamed from: a */
    public final long f45510a;

    /* renamed from: b */
    public final long f45511b;

    /* renamed from: c */
    public final boolean f45512c;

    /* renamed from: d */
    public final /* synthetic */ CG1 f45513d;

    public AbstractRunnableC11650xG1(CG1 cg1, boolean z) {
        this.f45513d = cg1;
        this.f45510a = cg1.f1288b.currentTimeMillis();
        this.f45511b = cg1.f1288b.elapsedRealtime();
        this.f45512c = z;
    }

    /* renamed from: a */
    public abstract void mo1137a();

    @Override // java.lang.Runnable
    public final void run() {
        CG1 cg1 = this.f45513d;
        if (cg1.f1293g) {
            mo4940b();
            return;
        }
        try {
            mo1137a();
        } catch (Exception e) {
            cg1.m1135e(e, false, this.f45512c);
            mo4940b();
        }
    }

    /* renamed from: b */
    public void mo4940b() {
    }
}
