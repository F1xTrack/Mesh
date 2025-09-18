package p000;

/* loaded from: classes.dex */
public final class X41 implements Runnable {

    /* renamed from: a */
    public final C7863Ko1 f13553a;

    /* renamed from: b */
    public final C11499w41 f13554b;

    /* renamed from: c */
    public final boolean f13555c;

    static {
        C1210TE.m7637M("StopWorkRunnable");
    }

    public X41(C7863Ko1 c7863Ko1, C11499w41 c11499w41, boolean z) {
        this.f13553a = c7863Ko1;
        this.f13554b = c11499w41;
        this.f13555c = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        RunnableC9290ep1 runnableC9290ep1;
        if (this.f13555c) {
            PD0 pd0 = this.f13553a.f6319f;
            C11499w41 c11499w41 = this.f13554b;
            pd0.getClass();
            String str = c11499w41.f44673a.f2911a;
            synchronized (pd0.f8908l) {
                try {
                    C1210TE.m7634G().getClass();
                    runnableC9290ep1 = (RunnableC9290ep1) pd0.f8902f.remove(str);
                    if (runnableC9290ep1 != null) {
                        pd0.f8904h.remove(str);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            PD0.m6257d(runnableC9290ep1);
        } else {
            this.f13553a.f6319f.m6268m(this.f13554b);
        }
        C1210TE c1210teM7634G = C1210TE.m7634G();
        C7551Eo1 c7551Eo1 = this.f13554b.f44673a;
        c1210teM7634G.getClass();
    }
}
