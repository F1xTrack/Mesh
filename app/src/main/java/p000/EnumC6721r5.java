package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: r5 */
/* loaded from: classes2.dex */
public final class EnumC6721r5 {

    /* renamed from: c */
    public static final EnumC6721r5 f41329c;

    /* renamed from: d */
    public static final /* synthetic */ EnumC6721r5[] f41330d;

    /* renamed from: a */
    public final boolean f41331a;

    /* renamed from: b */
    public final boolean f41332b;

    static {
        EnumC6721r5 enumC6721r5 = new EnumC6721r5(false, (int) (0 == true ? 1 : 0), 3, "NO_ARGUMENTS");
        f41329c = enumC6721r5;
        EnumC6721r5[] enumC6721r5Arr = {enumC6721r5, new EnumC6721r5(true, (int) (true ? 1 : 0), 2, "UNLESS_EMPTY"), new EnumC6721r5("ALWAYS_PARENTHESIZED", 2, true, true)};
        f41330d = enumC6721r5Arr;
        F02.m2482c(enumC6721r5Arr);
    }

    public EnumC6721r5(String str, int i, boolean z, boolean z2) {
        this.f41331a = z;
        this.f41332b = z2;
    }

    public static EnumC6721r5 valueOf(String str) {
        return (EnumC6721r5) Enum.valueOf(EnumC6721r5.class, str);
    }

    public static EnumC6721r5[] values() {
        return (EnumC6721r5[]) f41330d.clone();
    }

    public /* synthetic */ EnumC6721r5(boolean z, int i, int i2, String str) {
        this(str, i, (i2 & 1) != 0 ? false : z, false);
    }
}
