package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: s70, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC10993s70 {

    /* renamed from: a */
    public static final EnumC10993s70 f42267a;

    /* renamed from: b */
    public static final EnumC10993s70 f42268b;

    /* renamed from: c */
    public static final EnumC10993s70 f42269c;

    /* renamed from: d */
    public static final /* synthetic */ EnumC10993s70[] f42270d;

    static {
        EnumC10993s70 enumC10993s70 = new EnumC10993s70("AUTO", 0);
        f42267a = enumC10993s70;
        EnumC10993s70 enumC10993s702 = new EnumC10993s70("RESIZE", 1);
        f42268b = enumC10993s702;
        EnumC10993s70 enumC10993s703 = new EnumC10993s70("SCALE", 2);
        f42269c = enumC10993s703;
        EnumC10993s70[] enumC10993s70Arr = {enumC10993s70, enumC10993s702, enumC10993s703};
        f42270d = enumC10993s70Arr;
        F02.m2482c(enumC10993s70Arr);
    }

    public static EnumC10993s70 valueOf(String str) {
        return (EnumC10993s70) Enum.valueOf(EnumC10993s70.class, str);
    }

    public static EnumC10993s70[] values() {
        return (EnumC10993s70[]) f42270d.clone();
    }
}
