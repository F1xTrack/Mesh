package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: jq1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC9932jq1 {

    /* renamed from: a */
    public static final EnumC9932jq1 f35420a;

    /* renamed from: b */
    public static final EnumC9932jq1 f35421b;

    /* renamed from: c */
    public static final EnumC9932jq1 f35422c;

    /* renamed from: d */
    public static final EnumC9932jq1 f35423d;

    /* renamed from: e */
    public static final /* synthetic */ EnumC9932jq1[] f35424e;

    static {
        EnumC9932jq1 enumC9932jq1 = new EnumC9932jq1("PRIORITY_NO_POWER", 0);
        f35420a = enumC9932jq1;
        EnumC9932jq1 enumC9932jq12 = new EnumC9932jq1("PRIORITY_LOW_POWER", 1);
        f35421b = enumC9932jq12;
        EnumC9932jq1 enumC9932jq13 = new EnumC9932jq1("PRIORITY_BALANCED_POWER_ACCURACY", 2);
        f35422c = enumC9932jq13;
        EnumC9932jq1 enumC9932jq14 = new EnumC9932jq1("PRIORITY_HIGH_ACCURACY", 3);
        f35423d = enumC9932jq14;
        f35424e = new EnumC9932jq1[]{enumC9932jq1, enumC9932jq12, enumC9932jq13, enumC9932jq14};
    }

    public static EnumC9932jq1 valueOf(String str) {
        return (EnumC9932jq1) Enum.valueOf(EnumC9932jq1.class, str);
    }

    public static EnumC9932jq1[] values() {
        return (EnumC9932jq1[]) f35424e.clone();
    }
}
