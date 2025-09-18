package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: y41, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC8105y41 {
    public static final EnumC8105y41 a;
    public static final EnumC8105y41 b;
    public static final EnumC8105y41 c;
    public static final /* synthetic */ EnumC8105y41[] d;

    static {
        EnumC8105y41 enumC8105y41 = new EnumC8105y41("BEGINNING", 0);
        a = enumC8105y41;
        EnumC8105y41 enumC8105y412 = new EnumC8105y41("MIDDLE", 1);
        b = enumC8105y412;
        EnumC8105y41 enumC8105y413 = new EnumC8105y41("AFTER_DOT", 2);
        c = enumC8105y413;
        EnumC8105y41[] enumC8105y41Arr = {enumC8105y41, enumC8105y412, enumC8105y413};
        d = enumC8105y41Arr;
        F02.c(enumC8105y41Arr);
    }

    public static EnumC8105y41 valueOf(String str) {
        return (EnumC8105y41) Enum.valueOf(EnumC8105y41.class, str);
    }

    public static EnumC8105y41[] values() {
        return (EnumC8105y41[]) d.clone();
    }
}
