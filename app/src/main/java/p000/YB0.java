package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class YB0 {

    /* renamed from: a */
    public static final YB0 f14197a;

    /* renamed from: b */
    public static final YB0 f14198b;

    /* renamed from: c */
    public static final YB0 f14199c;

    /* renamed from: d */
    public static final YB0 f14200d;

    /* renamed from: e */
    public static final /* synthetic */ YB0[] f14201e;

    static {
        YB0 yb0 = new YB0("NONE", 0);
        f14197a = yb0;
        YB0 yb02 = new YB0("BOX_NONE", 1);
        f14198b = yb02;
        YB0 yb03 = new YB0("BOX_ONLY", 2);
        f14199c = yb03;
        YB0 yb04 = new YB0("AUTO", 3);
        f14200d = yb04;
        YB0[] yb0Arr = {yb0, yb02, yb03, yb04};
        f14201e = yb0Arr;
        F02.m2482c(yb0Arr);
    }

    public static YB0 valueOf(String str) {
        return (YB0) Enum.valueOf(YB0.class, str);
    }

    public static YB0[] values() {
        return (YB0[]) f14201e.clone();
    }
}
