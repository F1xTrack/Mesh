package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class WB0 {
    public static final WB0 a;
    public static final WB0 b;
    public static final WB0 c;
    public static final WB0 d;
    public static final WB0 e;
    public static final WB0 f;
    public static final WB0 g;
    public static final WB0 h;
    public static final WB0 i;
    public static final WB0 j;
    public static final WB0 k;
    public static final WB0 l;
    public static final WB0 m;
    public static final WB0 n;
    public static final WB0 o;
    public static final WB0 p;
    public static final WB0 q;
    public static final WB0 r;
    public static final /* synthetic */ WB0[] s;

    static {
        WB0 wb0 = new WB0("CANCEL", 0);
        a = wb0;
        WB0 wb02 = new WB0("CANCEL_CAPTURE", 1);
        b = wb02;
        WB0 wb03 = new WB0("CLICK", 2);
        c = wb03;
        WB0 wb04 = new WB0("CLICK_CAPTURE", 3);
        d = wb04;
        WB0 wb05 = new WB0("DOWN", 4);
        e = wb05;
        WB0 wb06 = new WB0("DOWN_CAPTURE", 5);
        f = wb06;
        WB0 wb07 = new WB0("ENTER", 6);
        g = wb07;
        WB0 wb08 = new WB0("ENTER_CAPTURE", 7);
        h = wb08;
        WB0 wb09 = new WB0("LEAVE", 8);
        i = wb09;
        WB0 wb010 = new WB0("LEAVE_CAPTURE", 9);
        j = wb010;
        WB0 wb011 = new WB0("MOVE", 10);
        k = wb011;
        WB0 wb012 = new WB0("MOVE_CAPTURE", 11);
        l = wb012;
        WB0 wb013 = new WB0("UP", 12);
        m = wb013;
        WB0 wb014 = new WB0("UP_CAPTURE", 13);
        n = wb014;
        WB0 wb015 = new WB0("OUT", 14);
        o = wb015;
        WB0 wb016 = new WB0("OUT_CAPTURE", 15);
        p = wb016;
        WB0 wb017 = new WB0("OVER", 16);
        q = wb017;
        WB0 wb018 = new WB0("OVER_CAPTURE", 17);
        r = wb018;
        s = new WB0[]{wb0, wb02, wb03, wb04, wb05, wb06, wb07, wb08, wb09, wb010, wb011, wb012, wb013, wb014, wb015, wb016, wb017, wb018};
    }

    public static WB0 valueOf(String str) {
        return (WB0) Enum.valueOf(WB0.class, str);
    }

    public static WB0[] values() {
        return (WB0[]) s.clone();
    }
}
