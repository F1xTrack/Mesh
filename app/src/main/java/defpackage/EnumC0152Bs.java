package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: Bs, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC0152Bs {
    public static final EnumC0152Bs a;
    public static final EnumC0152Bs b;
    public static final EnumC0152Bs c;
    public static final EnumC0152Bs d;
    public static final EnumC0152Bs e;
    public static final EnumC0152Bs f;
    public static final /* synthetic */ EnumC0152Bs[] g;

    static {
        EnumC0152Bs enumC0152Bs = new EnumC0152Bs("CLASS", 0);
        a = enumC0152Bs;
        EnumC0152Bs enumC0152Bs2 = new EnumC0152Bs("INTERFACE", 1);
        b = enumC0152Bs2;
        EnumC0152Bs enumC0152Bs3 = new EnumC0152Bs("ENUM_CLASS", 2);
        c = enumC0152Bs3;
        EnumC0152Bs enumC0152Bs4 = new EnumC0152Bs("ENUM_ENTRY", 3);
        d = enumC0152Bs4;
        EnumC0152Bs enumC0152Bs5 = new EnumC0152Bs("ANNOTATION_CLASS", 4);
        e = enumC0152Bs5;
        EnumC0152Bs enumC0152Bs6 = new EnumC0152Bs("OBJECT", 5);
        f = enumC0152Bs6;
        EnumC0152Bs[] enumC0152BsArr = {enumC0152Bs, enumC0152Bs2, enumC0152Bs3, enumC0152Bs4, enumC0152Bs5, enumC0152Bs6};
        g = enumC0152BsArr;
        F02.c(enumC0152BsArr);
    }

    public static EnumC0152Bs valueOf(String str) {
        return (EnumC0152Bs) Enum.valueOf(EnumC0152Bs.class, str);
    }

    public static EnumC0152Bs[] values() {
        return (EnumC0152Bs[]) g.clone();
    }

    public final boolean a() {
        return this == f || this == d;
    }
}
