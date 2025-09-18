package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: h31, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class EnumC9577h31 {

    /* renamed from: b */
    public static final EnumC9577h31 f28205b;

    /* renamed from: c */
    public static final EnumC9577h31 f28206c;

    /* renamed from: d */
    public static final EnumC9577h31 f28207d;

    /* renamed from: e */
    public static final C9449g31 f28208e;

    /* renamed from: f */
    public static final /* synthetic */ EnumC9577h31[] f28209f;

    /* renamed from: a */
    public final Object f28210a;

    static {
        EnumC9577h31 enumC9577h31 = new EnumC9577h31(0, "NULL", null);
        f28205b = enumC9577h31;
        EnumC9577h31 enumC9577h312 = new EnumC9577h31(1, "INDEX", -1);
        f28206c = enumC9577h312;
        EnumC9577h31 enumC9577h313 = new EnumC9577h31(2, "FALSE", Boolean.FALSE);
        f28207d = enumC9577h313;
        C9449g31 c9449g31 = new C9449g31(3, "MAP_GET_OR_DEFAULT", null);
        f28208e = c9449g31;
        EnumC9577h31[] enumC9577h31Arr = {enumC9577h31, enumC9577h312, enumC9577h313, c9449g31};
        f28209f = enumC9577h31Arr;
        F02.m2482c(enumC9577h31Arr);
    }

    public EnumC9577h31(int i, String str, Object obj) {
        this.f28210a = obj;
    }

    public static EnumC9577h31 valueOf(String str) {
        return (EnumC9577h31) Enum.valueOf(EnumC9577h31.class, str);
    }

    public static EnumC9577h31[] values() {
        return (EnumC9577h31[]) f28209f.clone();
    }
}
