package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: Od1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC1122Od1 {
    public static final EnumC1122Od1 a;
    public static final EnumC1122Od1 b;
    public static final EnumC1122Od1 c;
    public static final /* synthetic */ EnumC1122Od1[] d;

    static {
        EnumC1122Od1 enumC1122Od1 = new EnumC1122Od1("FLEXIBLE_LOWER", 0);
        a = enumC1122Od1;
        EnumC1122Od1 enumC1122Od12 = new EnumC1122Od1("FLEXIBLE_UPPER", 1);
        b = enumC1122Od12;
        EnumC1122Od1 enumC1122Od13 = new EnumC1122Od1("INFLEXIBLE", 2);
        c = enumC1122Od13;
        EnumC1122Od1[] enumC1122Od1Arr = {enumC1122Od1, enumC1122Od12, enumC1122Od13};
        d = enumC1122Od1Arr;
        F02.c(enumC1122Od1Arr);
    }

    public static EnumC1122Od1 valueOf(String str) {
        return (EnumC1122Od1) Enum.valueOf(EnumC1122Od1.class, str);
    }

    public static EnumC1122Od1[] values() {
        return (EnumC1122Od1[]) d.clone();
    }
}
