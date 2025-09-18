package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class OA0 {
    public static final OA0 a;
    public static final OA0 b;
    public static final /* synthetic */ OA0[] c;

    static {
        OA0 oa0 = new OA0("READ", 0);
        a = oa0;
        OA0 oa02 = new OA0("WRITE", 1);
        b = oa02;
        c = new OA0[]{oa0, oa02};
    }

    public static OA0 valueOf(String str) {
        return (OA0) Enum.valueOf(OA0.class, str);
    }

    public static OA0[] values() {
        return (OA0[]) c.clone();
    }
}
