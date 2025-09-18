package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: Bs */
/* loaded from: classes2.dex */
public final class EnumC0118Bs {

    /* renamed from: a */
    public static final EnumC0118Bs f1060a;

    /* renamed from: b */
    public static final EnumC0118Bs f1061b;

    /* renamed from: c */
    public static final EnumC0118Bs f1062c;

    /* renamed from: d */
    public static final EnumC0118Bs f1063d;

    /* renamed from: e */
    public static final EnumC0118Bs f1064e;

    /* renamed from: f */
    public static final EnumC0118Bs f1065f;

    /* renamed from: g */
    public static final /* synthetic */ EnumC0118Bs[] f1066g;

    static {
        EnumC0118Bs enumC0118Bs = new EnumC0118Bs("CLASS", 0);
        f1060a = enumC0118Bs;
        EnumC0118Bs enumC0118Bs2 = new EnumC0118Bs("INTERFACE", 1);
        f1061b = enumC0118Bs2;
        EnumC0118Bs enumC0118Bs3 = new EnumC0118Bs("ENUM_CLASS", 2);
        f1062c = enumC0118Bs3;
        EnumC0118Bs enumC0118Bs4 = new EnumC0118Bs("ENUM_ENTRY", 3);
        f1063d = enumC0118Bs4;
        EnumC0118Bs enumC0118Bs5 = new EnumC0118Bs("ANNOTATION_CLASS", 4);
        f1064e = enumC0118Bs5;
        EnumC0118Bs enumC0118Bs6 = new EnumC0118Bs("OBJECT", 5);
        f1065f = enumC0118Bs6;
        EnumC0118Bs[] enumC0118BsArr = {enumC0118Bs, enumC0118Bs2, enumC0118Bs3, enumC0118Bs4, enumC0118Bs5, enumC0118Bs6};
        f1066g = enumC0118BsArr;
        F02.m2482c(enumC0118BsArr);
    }

    public static EnumC0118Bs valueOf(String str) {
        return (EnumC0118Bs) Enum.valueOf(EnumC0118Bs.class, str);
    }

    public static EnumC0118Bs[] values() {
        return (EnumC0118Bs[]) f1066g.clone();
    }

    /* renamed from: a */
    public final boolean m893a() {
        return this == f1065f || this == f1063d;
    }
}
