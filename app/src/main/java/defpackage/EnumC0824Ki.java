package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: Ki, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0824Ki {
    public static final EnumC0824Ki a;
    public static final /* synthetic */ EnumC0824Ki[] b;

    static {
        EnumC0824Ki enumC0824Ki = new EnumC0824Ki("BORDER_RADIUS", 0);
        a = enumC0824Ki;
        EnumC0824Ki[] enumC0824KiArr = {enumC0824Ki, new EnumC0824Ki("BORDER_TOP_LEFT_RADIUS", 1), new EnumC0824Ki("BORDER_TOP_RIGHT_RADIUS", 2), new EnumC0824Ki("BORDER_BOTTOM_RIGHT_RADIUS", 3), new EnumC0824Ki("BORDER_BOTTOM_LEFT_RADIUS", 4), new EnumC0824Ki("BORDER_TOP_START_RADIUS", 5), new EnumC0824Ki("BORDER_TOP_END_RADIUS", 6), new EnumC0824Ki("BORDER_BOTTOM_START_RADIUS", 7), new EnumC0824Ki("BORDER_BOTTOM_END_RADIUS", 8), new EnumC0824Ki("BORDER_END_END_RADIUS", 9), new EnumC0824Ki("BORDER_END_START_RADIUS", 10), new EnumC0824Ki("BORDER_START_END_RADIUS", 11), new EnumC0824Ki("BORDER_START_START_RADIUS", 12)};
        b = enumC0824KiArr;
        F02.c(enumC0824KiArr);
    }

    public static EnumC0824Ki valueOf(String str) {
        return (EnumC0824Ki) Enum.valueOf(EnumC0824Ki.class, str);
    }

    public static EnumC0824Ki[] values() {
        return (EnumC0824Ki[]) b.clone();
    }
}
