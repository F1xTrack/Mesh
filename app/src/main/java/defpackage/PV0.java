package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class PV0 {
    public static final PV0 a;
    public static final PV0 b;
    public static final PV0 c;
    public static final PV0 d;
    public static final PV0 e;
    public static final PV0 f;
    public static final PV0 g;
    public static final PV0 h;
    public static final PV0 i;
    public static final /* synthetic */ PV0[] j;

    static {
        PV0 pv0 = new PV0("ORIENTATION", 0);
        a = pv0;
        PV0 pv02 = new PV0("COLOR", 1);
        b = pv02;
        PV0 pv03 = new PV0("STYLE", 2);
        c = pv03;
        PV0 pv04 = new PV0("TRANSLUCENT", 3);
        d = pv04;
        PV0 pv05 = new PV0("HIDDEN", 4);
        e = pv05;
        PV0 pv06 = new PV0("ANIMATED", 5);
        f = pv06;
        PV0 pv07 = new PV0("NAVIGATION_BAR_COLOR", 6);
        g = pv07;
        PV0 pv08 = new PV0("NAVIGATION_BAR_TRANSLUCENT", 7);
        h = pv08;
        PV0 pv09 = new PV0("NAVIGATION_BAR_HIDDEN", 8);
        i = pv09;
        PV0[] pv0Arr = {pv0, pv02, pv03, pv04, pv05, pv06, pv07, pv08, pv09};
        j = pv0Arr;
        F02.c(pv0Arr);
    }

    public static PV0 valueOf(String str) {
        return (PV0) Enum.valueOf(PV0.class, str);
    }

    public static PV0[] values() {
        return (PV0[]) j.clone();
    }
}
