package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class LV0 {
    public static final LV0 a;
    public static final LV0 b;
    public static final LV0 c;
    public static final /* synthetic */ LV0[] d;

    static {
        LV0 lv0 = new LV0("INACTIVE", 0);
        a = lv0;
        LV0 lv02 = new LV0("TRANSITIONING_OR_BELOW_TOP", 1);
        b = lv02;
        LV0 lv03 = new LV0("ON_TOP", 2);
        c = lv03;
        LV0[] lv0Arr = {lv0, lv02, lv03};
        d = lv0Arr;
        F02.c(lv0Arr);
    }

    public static LV0 valueOf(String str) {
        return (LV0) Enum.valueOf(LV0.class, str);
    }

    public static LV0[] values() {
        return (LV0[]) d.clone();
    }
}
