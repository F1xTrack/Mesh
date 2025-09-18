package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class BE0 {

    /* renamed from: a */
    public static final BE0 f665a;

    /* renamed from: b */
    public static final BE0 f666b;

    /* renamed from: c */
    public static final /* synthetic */ BE0[] f667c;

    static {
        BE0 be0 = new BE0("PRETTY", 0);
        BE0 be02 = new BE0("DEBUG", 1);
        f665a = be02;
        BE0 be03 = new BE0("NONE", 2);
        f666b = be03;
        BE0[] be0Arr = {be0, be02, be03};
        f667c = be0Arr;
        F02.m2482c(be0Arr);
    }

    public static BE0 valueOf(String str) {
        return (BE0) Enum.valueOf(BE0.class, str);
    }

    public static BE0[] values() {
        return (BE0[]) f667c.clone();
    }
}
