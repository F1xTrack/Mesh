package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: Bb0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC0102Bb0 {
    public static final EnumC0102Bb0 a;
    public static final EnumC0102Bb0 b;
    public static final EnumC0102Bb0 c;
    public static final /* synthetic */ EnumC0102Bb0[] d;

    static {
        EnumC0102Bb0 enumC0102Bb0 = new EnumC0102Bb0("INFLEXIBLE", 0);
        a = enumC0102Bb0;
        EnumC0102Bb0 enumC0102Bb02 = new EnumC0102Bb0("FLEXIBLE_UPPER_BOUND", 1);
        b = enumC0102Bb02;
        EnumC0102Bb0 enumC0102Bb03 = new EnumC0102Bb0("FLEXIBLE_LOWER_BOUND", 2);
        c = enumC0102Bb03;
        EnumC0102Bb0[] enumC0102Bb0Arr = {enumC0102Bb0, enumC0102Bb02, enumC0102Bb03};
        d = enumC0102Bb0Arr;
        F02.c(enumC0102Bb0Arr);
    }

    public static EnumC0102Bb0 valueOf(String str) {
        return (EnumC0102Bb0) Enum.valueOf(EnumC0102Bb0.class, str);
    }

    public static EnumC0102Bb0[] values() {
        return (EnumC0102Bb0[]) d.clone();
    }
}
