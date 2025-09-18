package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: jZ0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC5336jZ0 {
    public static final EnumC5336jZ0 a;
    public static final EnumC5336jZ0 b;
    public static final /* synthetic */ EnumC5336jZ0[] c;

    static {
        EnumC5336jZ0 enumC5336jZ0 = new EnumC5336jZ0("CRASHLYTICS", 0);
        a = enumC5336jZ0;
        EnumC5336jZ0 enumC5336jZ02 = new EnumC5336jZ0("PERFORMANCE", 1);
        b = enumC5336jZ02;
        c = new EnumC5336jZ0[]{enumC5336jZ0, enumC5336jZ02, new EnumC5336jZ0("MATT_SAYS_HI", 2)};
    }

    public static EnumC5336jZ0 valueOf(String str) {
        return (EnumC5336jZ0) Enum.valueOf(EnumC5336jZ0.class, str);
    }

    public static EnumC5336jZ0[] values() {
        return (EnumC5336jZ0[]) c.clone();
    }
}
