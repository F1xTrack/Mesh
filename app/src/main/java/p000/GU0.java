package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class GU0 {

    /* renamed from: a */
    public static final GU0 f3759a;

    /* renamed from: b */
    public static final GU0 f3760b;

    /* renamed from: c */
    public static final GU0 f3761c;

    /* renamed from: d */
    public static final /* synthetic */ GU0[] f3762d;

    static {
        GU0 gu0 = new GU0("OFF", 0);
        f3759a = gu0;
        GU0 gu02 = new GU0("ADDITIVE", 1);
        f3760b = gu02;
        GU0 gu03 = new GU0("MAXIMUM", 2);
        f3761c = gu03;
        GU0[] gu0Arr = {gu0, gu02, gu03};
        f3762d = gu0Arr;
        F02.m2482c(gu0Arr);
    }

    public static GU0 valueOf(String str) {
        return (GU0) Enum.valueOf(GU0.class, str);
    }

    public static GU0[] values() {
        return (GU0[]) f3762d.clone();
    }
}
