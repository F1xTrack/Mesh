package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: o50, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC10477o50 {

    /* renamed from: a */
    public static final EnumC10477o50 f38790a;

    /* renamed from: b */
    public static final EnumC10477o50 f38791b;

    /* renamed from: c */
    public static final EnumC10477o50 f38792c;

    /* renamed from: d */
    public static final EnumC10477o50 f38793d;

    /* renamed from: e */
    public static final EnumC10477o50 f38794e;

    /* renamed from: f */
    public static final /* synthetic */ EnumC10477o50[] f38795f;

    static {
        EnumC10477o50 enumC10477o50 = new EnumC10477o50("H11", 0);
        f38790a = enumC10477o50;
        EnumC10477o50 enumC10477o502 = new EnumC10477o50("H12", 1);
        f38791b = enumC10477o502;
        EnumC10477o50 enumC10477o503 = new EnumC10477o50("H23", 2);
        f38792c = enumC10477o503;
        EnumC10477o50 enumC10477o504 = new EnumC10477o50("H24", 3);
        f38793d = enumC10477o504;
        EnumC10477o50 enumC10477o505 = new EnumC10477o50("UNDEFINED", 4);
        f38794e = enumC10477o505;
        f38795f = new EnumC10477o50[]{enumC10477o50, enumC10477o502, enumC10477o503, enumC10477o504, enumC10477o505};
    }

    public static EnumC10477o50 valueOf(String str) {
        return (EnumC10477o50) Enum.valueOf(EnumC10477o50.class, str);
    }

    public static EnumC10477o50[] values() {
        return (EnumC10477o50[]) f38795f.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return "h11";
        }
        if (iOrdinal == 1) {
            return "h12";
        }
        if (iOrdinal == 2) {
            return "h23";
        }
        if (iOrdinal == 3) {
            return "h24";
        }
        if (iOrdinal == 4) {
            return "";
        }
        throw new IllegalArgumentException();
    }
}
