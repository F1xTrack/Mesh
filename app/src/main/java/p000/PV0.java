package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class PV0 {

    /* renamed from: a */
    public static final PV0 f9086a;

    /* renamed from: b */
    public static final PV0 f9087b;

    /* renamed from: c */
    public static final PV0 f9088c;

    /* renamed from: d */
    public static final PV0 f9089d;

    /* renamed from: e */
    public static final PV0 f9090e;

    /* renamed from: f */
    public static final PV0 f9091f;

    /* renamed from: g */
    public static final PV0 f9092g;

    /* renamed from: h */
    public static final PV0 f9093h;

    /* renamed from: i */
    public static final PV0 f9094i;

    /* renamed from: j */
    public static final /* synthetic */ PV0[] f9095j;

    static {
        PV0 pv0 = new PV0("ORIENTATION", 0);
        f9086a = pv0;
        PV0 pv02 = new PV0("COLOR", 1);
        f9087b = pv02;
        PV0 pv03 = new PV0("STYLE", 2);
        f9088c = pv03;
        PV0 pv04 = new PV0("TRANSLUCENT", 3);
        f9089d = pv04;
        PV0 pv05 = new PV0("HIDDEN", 4);
        f9090e = pv05;
        PV0 pv06 = new PV0("ANIMATED", 5);
        f9091f = pv06;
        PV0 pv07 = new PV0("NAVIGATION_BAR_COLOR", 6);
        f9092g = pv07;
        PV0 pv08 = new PV0("NAVIGATION_BAR_TRANSLUCENT", 7);
        f9093h = pv08;
        PV0 pv09 = new PV0("NAVIGATION_BAR_HIDDEN", 8);
        f9094i = pv09;
        PV0[] pv0Arr = {pv0, pv02, pv03, pv04, pv05, pv06, pv07, pv08, pv09};
        f9095j = pv0Arr;
        F02.m2482c(pv0Arr);
    }

    public static PV0 valueOf(String str) {
        return (PV0) Enum.valueOf(PV0.class, str);
    }

    public static PV0[] values() {
        return (PV0[]) f9095j.clone();
    }
}
