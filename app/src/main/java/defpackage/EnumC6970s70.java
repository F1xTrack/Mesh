package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: s70, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC6970s70 {
    public static final EnumC6970s70 a;
    public static final EnumC6970s70 b;
    public static final EnumC6970s70 c;
    public static final /* synthetic */ EnumC6970s70[] d;

    static {
        EnumC6970s70 enumC6970s70 = new EnumC6970s70("AUTO", 0);
        a = enumC6970s70;
        EnumC6970s70 enumC6970s702 = new EnumC6970s70("RESIZE", 1);
        b = enumC6970s702;
        EnumC6970s70 enumC6970s703 = new EnumC6970s70("SCALE", 2);
        c = enumC6970s703;
        EnumC6970s70[] enumC6970s70Arr = {enumC6970s70, enumC6970s702, enumC6970s703};
        d = enumC6970s70Arr;
        F02.c(enumC6970s70Arr);
    }

    public static EnumC6970s70 valueOf(String str) {
        return (EnumC6970s70) Enum.valueOf(EnumC6970s70.class, str);
    }

    public static EnumC6970s70[] values() {
        return (EnumC6970s70[]) d.clone();
    }
}
