package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public abstract class WW0 {

    /* renamed from: a */
    public static final VW0 f13237a;

    /* renamed from: b */
    public static final UW0 f13238b;

    /* renamed from: c */
    public static final TW0 f13239c;

    /* renamed from: d */
    public static final SW0 f13240d;

    /* renamed from: e */
    public static final /* synthetic */ WW0[] f13241e;

    static {
        VW0 vw0 = new VW0();
        f13237a = vw0;
        UW0 uw0 = new UW0();
        f13238b = uw0;
        TW0 tw0 = new TW0();
        f13239c = tw0;
        SW0 sw0 = new SW0();
        f13240d = sw0;
        WW0[] ww0Arr = {vw0, uw0, tw0, sw0};
        f13241e = ww0Arr;
        F02.m2482c(ww0Arr);
    }

    public static WW0 valueOf(String str) {
        return (WW0) Enum.valueOf(WW0.class, str);
    }

    public static WW0[] values() {
        return (WW0[]) f13241e.clone();
    }

    /* renamed from: a */
    public abstract int mo7391a(RW0 rw0);
}
