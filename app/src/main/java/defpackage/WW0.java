package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public abstract class WW0 {
    public static final VW0 a;
    public static final UW0 b;
    public static final TW0 c;
    public static final SW0 d;
    public static final /* synthetic */ WW0[] e;

    static {
        VW0 vw0 = new VW0();
        a = vw0;
        UW0 uw0 = new UW0();
        b = uw0;
        TW0 tw0 = new TW0();
        c = tw0;
        SW0 sw0 = new SW0();
        d = sw0;
        WW0[] ww0Arr = {vw0, uw0, tw0, sw0};
        e = ww0Arr;
        F02.c(ww0Arr);
    }

    public static WW0 valueOf(String str) {
        return (WW0) Enum.valueOf(WW0.class, str);
    }

    public static WW0[] values() {
        return (WW0[]) e.clone();
    }

    public abstract int a(RW0 rw0);
}
