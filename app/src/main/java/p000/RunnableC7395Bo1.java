package p000;

import android.content.Context;
import android.os.Build;

/* renamed from: Bo1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC7395Bo1 implements Runnable {

    /* renamed from: g */
    public static final /* synthetic */ int f1035g = 0;

    /* renamed from: a */
    public final C11687xZ0 f1036a = new C11687xZ0();

    /* renamed from: b */
    public final Context f1037b;

    /* renamed from: c */
    public final C8383Uo1 f1038c;

    /* renamed from: d */
    public final AbstractC8060Oj0 f1039d;

    /* renamed from: e */
    public final C7499Do1 f1040e;

    /* renamed from: f */
    public final C8539Xo1 f1041f;

    static {
        C1210TE.m7637M("WorkForegroundRunnable");
    }

    public RunnableC7395Bo1(Context context, C8383Uo1 c8383Uo1, AbstractC8060Oj0 abstractC8060Oj0, C7499Do1 c7499Do1, C8539Xo1 c8539Xo1) {
        this.f1037b = context;
        this.f1038c = c8383Uo1;
        this.f1039d = abstractC8060Oj0;
        this.f1040e = c7499Do1;
        this.f1041f = c8539Xo1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.f1038c.f12150q || Build.VERSION.SDK_INT >= 31) {
            this.f1036a.m25921j(null);
            return;
        }
        C11687xZ0 c11687xZ0 = new C11687xZ0();
        C8539Xo1 c8539Xo1 = this.f1041f;
        ((ExecutorC9387fa0) c8539Xo1.f13983d).execute(new O91(this, 10, c11687xZ0));
        c11687xZ0.mo2494d(new RunnableC1483XZ(this, c11687xZ0, false, 22), (ExecutorC9387fa0) c8539Xo1.f13983d);
    }
}
