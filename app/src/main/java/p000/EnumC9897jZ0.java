package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: jZ0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC9897jZ0 {

    /* renamed from: a */
    public static final EnumC9897jZ0 f35235a;

    /* renamed from: b */
    public static final EnumC9897jZ0 f35236b;

    /* renamed from: c */
    public static final /* synthetic */ EnumC9897jZ0[] f35237c;

    static {
        EnumC9897jZ0 enumC9897jZ0 = new EnumC9897jZ0("CRASHLYTICS", 0);
        f35235a = enumC9897jZ0;
        EnumC9897jZ0 enumC9897jZ02 = new EnumC9897jZ0("PERFORMANCE", 1);
        f35236b = enumC9897jZ02;
        f35237c = new EnumC9897jZ0[]{enumC9897jZ0, enumC9897jZ02, new EnumC9897jZ0("MATT_SAYS_HI", 2)};
    }

    public static EnumC9897jZ0 valueOf(String str) {
        return (EnumC9897jZ0) Enum.valueOf(EnumC9897jZ0.class, str);
    }

    public static EnumC9897jZ0[] values() {
        return (EnumC9897jZ0[]) f35237c.clone();
    }
}
