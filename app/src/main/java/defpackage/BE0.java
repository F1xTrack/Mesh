package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class BE0 {
    public static final BE0 a;
    public static final BE0 b;
    public static final /* synthetic */ BE0[] c;

    static {
        BE0 be0 = new BE0("PRETTY", 0);
        BE0 be02 = new BE0("DEBUG", 1);
        a = be02;
        BE0 be03 = new BE0("NONE", 2);
        b = be03;
        BE0[] be0Arr = {be0, be02, be03};
        c = be0Arr;
        F02.c(be0Arr);
    }

    public static BE0 valueOf(String str) {
        return (BE0) Enum.valueOf(BE0.class, str);
    }

    public static BE0[] values() {
        return (BE0[]) c.clone();
    }
}
