package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class JV {
    public static final JV a;
    public static final JV b;
    public static final JV c;
    public static final /* synthetic */ JV[] d;

    static {
        JV jv = new JV("WIDTH", 0);
        a = jv;
        JV jv2 = new JV("HEIGHT", 1);
        b = jv2;
        JV jv3 = new JV("BOTH", 2);
        c = jv3;
        d = new JV[]{jv, jv2, jv3};
    }

    public static JV valueOf(String str) {
        return (JV) Enum.valueOf(JV.class, str);
    }

    public static JV[] values() {
        return (JV[]) d.clone();
    }
}
