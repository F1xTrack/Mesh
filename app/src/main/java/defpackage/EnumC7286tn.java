package defpackage;


/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: tn, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC7286tn {
    public static final EnumC7286tn a;
    public static final EnumC7286tn b;
    public static final EnumC7286tn c;
    public static final EnumC7286tn d;
    public static final EnumC7286tn e;
    public static final /* synthetic */ EnumC7286tn[] f;

    static {
        EnumC7286tn enumC7286tn = new EnumC7286tn(GrsBaseInfo.CountryCodeSource.UNKNOWN, 0);
        a = enumC7286tn;
        EnumC7286tn enumC7286tn2 = new EnumC7286tn("INACTIVE", 1);
        b = enumC7286tn2;
        EnumC7286tn enumC7286tn3 = new EnumC7286tn("METERING", 2);
        c = enumC7286tn3;
        EnumC7286tn enumC7286tn4 = new EnumC7286tn("CONVERGED", 3);
        d = enumC7286tn4;
        EnumC7286tn enumC7286tn5 = new EnumC7286tn("LOCKED", 4);
        e = enumC7286tn5;
        f = new EnumC7286tn[]{enumC7286tn, enumC7286tn2, enumC7286tn3, enumC7286tn4, enumC7286tn5};
    }

    public static EnumC7286tn valueOf(String str) {
        return (EnumC7286tn) Enum.valueOf(EnumC7286tn.class, str);
    }

    public static EnumC7286tn[] values() {
        return (EnumC7286tn[]) f.clone();
    }
}
