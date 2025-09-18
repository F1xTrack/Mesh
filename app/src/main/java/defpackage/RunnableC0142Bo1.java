package defpackage;

import android.content.Context;
import android.os.Build;

/* renamed from: Bo1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0142Bo1 implements Runnable {
    public static final /* synthetic */ int g = 0;
    public final C8007xZ0 a = new C8007xZ0();
    public final Context b;
    public final C1623Uo1 c;
    public final AbstractC1139Oj0 d;
    public final C0298Do1 e;
    public final C1857Xo1 f;

    static {
        TE.M("WorkForegroundRunnable");
    }

    public RunnableC0142Bo1(Context context, C1623Uo1 c1623Uo1, AbstractC1139Oj0 abstractC1139Oj0, C0298Do1 c0298Do1, C1857Xo1 c1857Xo1) {
        this.b = context;
        this.c = c1623Uo1;
        this.d = abstractC1139Oj0;
        this.e = c0298Do1;
        this.f = c1857Xo1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.c.q || Build.VERSION.SDK_INT >= 31) {
            this.a.j(null);
            return;
        }
        C8007xZ0 c8007xZ0 = new C8007xZ0();
        C1857Xo1 c1857Xo1 = this.f;
        ((ExecutorC3799fa0) c1857Xo1.d).execute(new O91(this, 10, c8007xZ0));
        c8007xZ0.d(new XZ(this, c8007xZ0, false, 22), (ExecutorC3799fa0) c1857Xo1.d);
    }
}
