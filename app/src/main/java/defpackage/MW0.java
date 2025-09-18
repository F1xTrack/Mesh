package defpackage;

/* loaded from: classes.dex */
public final class MW0 extends Enum {
    public static final TE a;
    public static final MW0 b;
    public static final MW0 c;
    public static final MW0 d;
    public static final MW0 e;
    public static final MW0 f;
    public static final /* synthetic */ MW0[] g;

    static {
        MW0 mw0 = new MW0("BEGIN_DRAG", 0);
        b = mw0;
        MW0 mw02 = new MW0("END_DRAG", 1);
        c = mw02;
        MW0 mw03 = new MW0("SCROLL", 2);
        d = mw03;
        MW0 mw04 = new MW0("MOMENTUM_BEGIN", 3);
        e = mw04;
        MW0 mw05 = new MW0("MOMENTUM_END", 4);
        f = mw05;
        MW0[] mw0Arr = {mw0, mw02, mw03, mw04, mw05};
        g = mw0Arr;
        F02.c(mw0Arr);
        a = new TE(21);
    }

    public static MW0 valueOf(String str) {
        return (MW0) Enum.valueOf(MW0.class, str);
    }

    public static MW0[] values() {
        return (MW0[]) g.clone();
    }
}
