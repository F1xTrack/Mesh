package p000;

/* loaded from: classes.dex */
public final class MW0 extends Enum {

    /* renamed from: a */
    public static final C1210TE f7202a;

    /* renamed from: b */
    public static final MW0 f7203b;

    /* renamed from: c */
    public static final MW0 f7204c;

    /* renamed from: d */
    public static final MW0 f7205d;

    /* renamed from: e */
    public static final MW0 f7206e;

    /* renamed from: f */
    public static final MW0 f7207f;

    /* renamed from: g */
    public static final /* synthetic */ MW0[] f7208g;

    static {
        MW0 mw0 = new MW0("BEGIN_DRAG", 0);
        f7203b = mw0;
        MW0 mw02 = new MW0("END_DRAG", 1);
        f7204c = mw02;
        MW0 mw03 = new MW0("SCROLL", 2);
        f7205d = mw03;
        MW0 mw04 = new MW0("MOMENTUM_BEGIN", 3);
        f7206e = mw04;
        MW0 mw05 = new MW0("MOMENTUM_END", 4);
        f7207f = mw05;
        MW0[] mw0Arr = {mw0, mw02, mw03, mw04, mw05};
        f7208g = mw0Arr;
        F02.m2482c(mw0Arr);
        f7202a = new C1210TE(21);
    }

    public static MW0 valueOf(String str) {
        return (MW0) Enum.valueOf(MW0.class, str);
    }

    public static MW0[] values() {
        return (MW0[]) f7208g.clone();
    }
}
