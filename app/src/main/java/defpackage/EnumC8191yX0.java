package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: yX0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC8191yX0 {
    public static final EnumC8191yX0 a;
    public static final EnumC8191yX0 b;
    public static final EnumC8191yX0 c;
    public static final /* synthetic */ EnumC8191yX0[] d;

    static {
        EnumC8191yX0 enumC8191yX0 = new EnumC8191yX0("ANY", 0);
        a = enumC8191yX0;
        EnumC8191yX0 enumC8191yX02 = new EnumC8191yX0("SECURE_SOFTWARE", 1);
        b = enumC8191yX02;
        EnumC8191yX0 enumC8191yX03 = new EnumC8191yX0("SECURE_HARDWARE", 2);
        c = enumC8191yX03;
        d = new EnumC8191yX0[]{enumC8191yX0, enumC8191yX02, enumC8191yX03};
    }

    public static EnumC8191yX0 valueOf(String str) {
        return (EnumC8191yX0) Enum.valueOf(EnumC8191yX0.class, str);
    }

    public static EnumC8191yX0[] values() {
        return (EnumC8191yX0[]) d.clone();
    }

    public final String a() {
        return AbstractC8235ym.v("SECURITY_LEVEL_", name());
    }
}
