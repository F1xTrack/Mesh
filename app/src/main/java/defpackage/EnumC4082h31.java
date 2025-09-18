package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: h31, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class EnumC4082h31 {
    public static final EnumC4082h31 b;
    public static final EnumC4082h31 c;
    public static final EnumC4082h31 d;
    public static final C3891g31 e;
    public static final /* synthetic */ EnumC4082h31[] f;
    public final Object a;

    static {
        EnumC4082h31 enumC4082h31 = new EnumC4082h31(0, "NULL", null);
        b = enumC4082h31;
        EnumC4082h31 enumC4082h312 = new EnumC4082h31(1, "INDEX", -1);
        c = enumC4082h312;
        EnumC4082h31 enumC4082h313 = new EnumC4082h31(2, "FALSE", Boolean.FALSE);
        d = enumC4082h313;
        C3891g31 c3891g31 = new C3891g31(3, "MAP_GET_OR_DEFAULT", null);
        e = c3891g31;
        EnumC4082h31[] enumC4082h31Arr = {enumC4082h31, enumC4082h312, enumC4082h313, c3891g31};
        f = enumC4082h31Arr;
        F02.c(enumC4082h31Arr);
    }

    public EnumC4082h31(int i, String str, Object obj) {
        this.a = obj;
    }

    public static EnumC4082h31 valueOf(String str) {
        return (EnumC4082h31) Enum.valueOf(EnumC4082h31.class, str);
    }

    public static EnumC4082h31[] values() {
        return (EnumC4082h31[]) f.clone();
    }
}
