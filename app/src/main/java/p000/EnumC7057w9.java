package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: w9 */
/* loaded from: classes.dex */
public final class EnumC7057w9 {

    /* renamed from: a */
    public static final EnumC7057w9 f44698a;

    /* renamed from: b */
    public static final EnumC7057w9 f44699b;

    /* renamed from: c */
    public static final /* synthetic */ EnumC7057w9[] f44700c;

    static {
        EnumC7057w9 enumC7057w9 = new EnumC7057w9("AUTOMATIC", 0);
        f44698a = enumC7057w9;
        EnumC7057w9 enumC7057w92 = new EnumC7057w9("ENABLED", 1);
        f44699b = enumC7057w92;
        f44700c = new EnumC7057w9[]{enumC7057w9, enumC7057w92, new EnumC7057w9("DISABLED", 2)};
    }

    public static EnumC7057w9 valueOf(String str) {
        return (EnumC7057w9) Enum.valueOf(EnumC7057w9.class, str);
    }

    public static EnumC7057w9[] values() {
        return (EnumC7057w9[]) f44700c.clone();
    }
}
