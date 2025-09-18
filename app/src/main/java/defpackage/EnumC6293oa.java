package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: oa, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC6293oa {
    public static final TE c;
    public static final EnumC6293oa d;
    public static final /* synthetic */ EnumC6293oa[] e;
    public final String a;
    public final int b;

    static {
        EnumC6293oa enumC6293oa = new EnumC6293oa(0, "SPEAKER", 3, "speaker");
        d = enumC6293oa;
        EnumC6293oa[] enumC6293oaArr = {enumC6293oa, new EnumC6293oa(1, "EARPIECE", 0, "earpiece")};
        e = enumC6293oaArr;
        F02.c(enumC6293oaArr);
        c = new TE(8);
    }

    public EnumC6293oa(int i, String str, int i2, String str2) {
        this.a = str2;
        this.b = i2;
    }

    public static EnumC6293oa valueOf(String str) {
        return (EnumC6293oa) Enum.valueOf(EnumC6293oa.class, str);
    }

    public static EnumC6293oa[] values() {
        return (EnumC6293oa[]) e.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        StringBuilder sbK = NX.k(EnumC6293oa.class.getSimpleName(), "(");
        sbK.append(this.a);
        sbK.append(", ");
        return AbstractC1705Vq.j(sbK, this.b, ")");
    }
}
