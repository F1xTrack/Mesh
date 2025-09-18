package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: jq1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC5388jq1 {
    public static final EnumC5388jq1 a;
    public static final EnumC5388jq1 b;
    public static final EnumC5388jq1 c;
    public static final EnumC5388jq1 d;
    public static final /* synthetic */ EnumC5388jq1[] e;

    static {
        EnumC5388jq1 enumC5388jq1 = new EnumC5388jq1("PRIORITY_NO_POWER", 0);
        a = enumC5388jq1;
        EnumC5388jq1 enumC5388jq12 = new EnumC5388jq1("PRIORITY_LOW_POWER", 1);
        b = enumC5388jq12;
        EnumC5388jq1 enumC5388jq13 = new EnumC5388jq1("PRIORITY_BALANCED_POWER_ACCURACY", 2);
        c = enumC5388jq13;
        EnumC5388jq1 enumC5388jq14 = new EnumC5388jq1("PRIORITY_HIGH_ACCURACY", 3);
        d = enumC5388jq14;
        e = new EnumC5388jq1[]{enumC5388jq1, enumC5388jq12, enumC5388jq13, enumC5388jq14};
    }

    public static EnumC5388jq1 valueOf(String str) {
        return (EnumC5388jq1) Enum.valueOf(EnumC5388jq1.class, str);
    }

    public static EnumC5388jq1[] values() {
        return (EnumC5388jq1[]) e.clone();
    }
}
