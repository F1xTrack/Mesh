package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class OA0 {

    /* renamed from: a */
    public static final OA0 f8264a;

    /* renamed from: b */
    public static final OA0 f8265b;

    /* renamed from: c */
    public static final /* synthetic */ OA0[] f8266c;

    static {
        OA0 oa0 = new OA0("READ", 0);
        f8264a = oa0;
        OA0 oa02 = new OA0("WRITE", 1);
        f8265b = oa02;
        f8266c = new OA0[]{oa0, oa02};
    }

    public static OA0 valueOf(String str) {
        return (OA0) Enum.valueOf(OA0.class, str);
    }

    public static OA0[] values() {
        return (OA0[]) f8266c.clone();
    }
}
