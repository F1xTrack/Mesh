package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class NP {
    public static final NP a;
    public static final NP b;
    public static final NP c;
    public static final NP d;
    public static final NP e;
    public static final NP f;
    public static final NP g;
    public static final /* synthetic */ NP[] h;

    static {
        NP np = new NP("MODULE_CREATE", 0);
        a = np;
        NP np2 = new NP("MODULE_DESTROY", 1);
        b = np2;
        NP np3 = new NP("ACTIVITY_ENTERS_FOREGROUND", 2);
        c = np3;
        NP np4 = new NP("ACTIVITY_ENTERS_BACKGROUND", 3);
        d = np4;
        NP np5 = new NP("ACTIVITY_DESTROYS", 4);
        e = np5;
        NP np6 = new NP("ON_NEW_INTENT", 5);
        f = np6;
        NP np7 = new NP("ON_ACTIVITY_RESULT", 6);
        g = np7;
        NP[] npArr = {np, np2, np3, np4, np5, np6, np7};
        h = npArr;
        F02.c(npArr);
    }

    public static NP valueOf(String str) {
        return (NP) Enum.valueOf(NP.class, str);
    }

    public static NP[] values() {
        return (NP[]) h.clone();
    }
}
