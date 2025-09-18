package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class LV0 {

    /* renamed from: a */
    public static final LV0 f6675a;

    /* renamed from: b */
    public static final LV0 f6676b;

    /* renamed from: c */
    public static final LV0 f6677c;

    /* renamed from: d */
    public static final /* synthetic */ LV0[] f6678d;

    static {
        LV0 lv0 = new LV0("INACTIVE", 0);
        f6675a = lv0;
        LV0 lv02 = new LV0("TRANSITIONING_OR_BELOW_TOP", 1);
        f6676b = lv02;
        LV0 lv03 = new LV0("ON_TOP", 2);
        f6677c = lv03;
        LV0[] lv0Arr = {lv0, lv02, lv03};
        f6678d = lv0Arr;
        F02.m2482c(lv0Arr);
    }

    public static LV0 valueOf(String str) {
        return (LV0) Enum.valueOf(LV0.class, str);
    }

    public static LV0[] values() {
        return (LV0[]) f6678d.clone();
    }
}
