package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: Od1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC8049Od1 {

    /* renamed from: a */
    public static final EnumC8049Od1 f8543a;

    /* renamed from: b */
    public static final EnumC8049Od1 f8544b;

    /* renamed from: c */
    public static final EnumC8049Od1 f8545c;

    /* renamed from: d */
    public static final /* synthetic */ EnumC8049Od1[] f8546d;

    static {
        EnumC8049Od1 enumC8049Od1 = new EnumC8049Od1("FLEXIBLE_LOWER", 0);
        f8543a = enumC8049Od1;
        EnumC8049Od1 enumC8049Od12 = new EnumC8049Od1("FLEXIBLE_UPPER", 1);
        f8544b = enumC8049Od12;
        EnumC8049Od1 enumC8049Od13 = new EnumC8049Od1("INFLEXIBLE", 2);
        f8545c = enumC8049Od13;
        EnumC8049Od1[] enumC8049Od1Arr = {enumC8049Od1, enumC8049Od12, enumC8049Od13};
        f8546d = enumC8049Od1Arr;
        F02.m2482c(enumC8049Od1Arr);
    }

    public static EnumC8049Od1 valueOf(String str) {
        return (EnumC8049Od1) Enum.valueOf(EnumC8049Od1.class, str);
    }

    public static EnumC8049Od1[] values() {
        return (EnumC8049Od1[]) f8546d.clone();
    }
}
