package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class KU0 {

    /* renamed from: a */
    public static final KU0 f6125a;

    /* renamed from: b */
    public static final KU0 f6126b;

    /* renamed from: c */
    public static final /* synthetic */ KU0[] f6127c;

    static {
        KU0 ku0 = new KU0("PADDING", 0);
        f6125a = ku0;
        KU0 ku02 = new KU0("MARGIN", 1);
        f6126b = ku02;
        KU0[] ku0Arr = {ku0, ku02};
        f6127c = ku0Arr;
        F02.m2482c(ku0Arr);
    }

    public static KU0 valueOf(String str) {
        return (KU0) Enum.valueOf(KU0.class, str);
    }

    public static KU0[] values() {
        return (KU0[]) f6127c.clone();
    }
}
