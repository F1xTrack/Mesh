package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: Ki */
/* loaded from: classes.dex */
public final class EnumC0675Ki {

    /* renamed from: a */
    public static final EnumC0675Ki f6262a;

    /* renamed from: b */
    public static final /* synthetic */ EnumC0675Ki[] f6263b;

    static {
        EnumC0675Ki enumC0675Ki = new EnumC0675Ki("BORDER_RADIUS", 0);
        f6262a = enumC0675Ki;
        EnumC0675Ki[] enumC0675KiArr = {enumC0675Ki, new EnumC0675Ki("BORDER_TOP_LEFT_RADIUS", 1), new EnumC0675Ki("BORDER_TOP_RIGHT_RADIUS", 2), new EnumC0675Ki("BORDER_BOTTOM_RIGHT_RADIUS", 3), new EnumC0675Ki("BORDER_BOTTOM_LEFT_RADIUS", 4), new EnumC0675Ki("BORDER_TOP_START_RADIUS", 5), new EnumC0675Ki("BORDER_TOP_END_RADIUS", 6), new EnumC0675Ki("BORDER_BOTTOM_START_RADIUS", 7), new EnumC0675Ki("BORDER_BOTTOM_END_RADIUS", 8), new EnumC0675Ki("BORDER_END_END_RADIUS", 9), new EnumC0675Ki("BORDER_END_START_RADIUS", 10), new EnumC0675Ki("BORDER_START_END_RADIUS", 11), new EnumC0675Ki("BORDER_START_START_RADIUS", 12)};
        f6263b = enumC0675KiArr;
        F02.m2482c(enumC0675KiArr);
    }

    public static EnumC0675Ki valueOf(String str) {
        return (EnumC0675Ki) Enum.valueOf(EnumC0675Ki.class, str);
    }

    public static EnumC0675Ki[] values() {
        return (EnumC0675Ki[]) f6263b.clone();
    }
}
