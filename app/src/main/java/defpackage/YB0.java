package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class YB0 {
    public static final YB0 a;
    public static final YB0 b;
    public static final YB0 c;
    public static final YB0 d;
    public static final /* synthetic */ YB0[] e;

    static {
        YB0 yb0 = new YB0("NONE", 0);
        a = yb0;
        YB0 yb02 = new YB0("BOX_NONE", 1);
        b = yb02;
        YB0 yb03 = new YB0("BOX_ONLY", 2);
        c = yb03;
        YB0 yb04 = new YB0("AUTO", 3);
        d = yb04;
        YB0[] yb0Arr = {yb0, yb02, yb03, yb04};
        e = yb0Arr;
        F02.c(yb0Arr);
    }

    public static YB0 valueOf(String str) {
        return (YB0) Enum.valueOf(YB0.class, str);
    }

    public static YB0[] values() {
        return (YB0[]) e.clone();
    }
}
