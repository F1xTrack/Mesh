package p000;

/* renamed from: sG */
/* loaded from: classes.dex */
public final class C6812sG {

    /* renamed from: a */
    public final String f42342a;

    /* renamed from: b */
    public int f42343b;

    /* renamed from: c */
    public long f42344c;

    /* renamed from: d */
    public final C7604Fp0 f42345d;

    /* renamed from: e */
    public boolean f42346e;

    /* renamed from: f */
    public boolean f42347f;

    /* renamed from: g */
    public final /* synthetic */ C6875tG f42348g;

    public C6812sG(C6875tG c6875tG, String str, int i, C7604Fp0 c7604Fp0) {
        this.f42348g = c6875tG;
        this.f42342a = str;
        this.f42343b = i;
        this.f42344c = c7604Fp0 == null ? -1L : c7604Fp0.f3433d;
        if (c7604Fp0 == null || !c7604Fp0.m2791b()) {
            return;
        }
        this.f42345d = c7604Fp0;
    }

    /* renamed from: a */
    public final boolean m24685a(C1514Y3 c1514y3) {
        C7604Fp0 c7604Fp0 = c1514y3.f14129d;
        if (c7604Fp0 == null) {
            return this.f42343b != c1514y3.f14128c;
        }
        long j = this.f42344c;
        if (j == -1) {
            return false;
        }
        if (c7604Fp0.f3433d > j) {
            return true;
        }
        C7604Fp0 c7604Fp02 = this.f42345d;
        if (c7604Fp02 == null) {
            return false;
        }
        AbstractC7419Ca1 abstractC7419Ca1 = c1514y3.f14127b;
        int iMo1245b = abstractC7419Ca1.mo1245b(c7604Fp0.f3430a);
        int iMo1245b2 = abstractC7419Ca1.mo1245b(c7604Fp02.f3430a);
        if (c7604Fp0.f3433d < c7604Fp02.f3433d || iMo1245b < iMo1245b2) {
            return false;
        }
        if (iMo1245b > iMo1245b2) {
            return true;
        }
        boolean zM2791b = c7604Fp0.m2791b();
        int i = c7604Fp02.f3431b;
        if (!zM2791b) {
            int i2 = c7604Fp0.f3434e;
            return i2 == -1 || i2 > i;
        }
        int i3 = c7604Fp0.f3431b;
        if (i3 > i) {
            return true;
        }
        if (i3 == i) {
            if (c7604Fp0.f3432c > c7604Fp02.f3432c) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final boolean m24686b(AbstractC7419Ca1 abstractC7419Ca1, AbstractC7419Ca1 abstractC7419Ca12) {
        int i = this.f42343b;
        if (i < abstractC7419Ca1.mo1258o()) {
            C6875tG c6875tG = this.f42348g;
            abstractC7419Ca1.m1257n(i, c6875tG.f42975a);
            C7367Ba1 c7367Ba1 = c6875tG.f42975a;
            for (int i2 = c7367Ba1.f927n; i2 <= c7367Ba1.f928o; i2++) {
                int iMo1245b = abstractC7419Ca12.mo1245b(abstractC7419Ca1.mo1255l(i2));
                if (iMo1245b != -1) {
                    i = abstractC7419Ca12.mo1249f(iMo1245b, c6875tG.f42976b, false).f258c;
                    break;
                }
            }
            i = -1;
        } else if (i >= abstractC7419Ca12.mo1258o()) {
            i = -1;
        }
        this.f42343b = i;
        if (i == -1) {
            return false;
        }
        C7604Fp0 c7604Fp0 = this.f42345d;
        return c7604Fp0 == null || abstractC7419Ca12.mo1245b(c7604Fp0.f3430a) != -1;
    }
}
