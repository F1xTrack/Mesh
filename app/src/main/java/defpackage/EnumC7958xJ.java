package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: xJ, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC7958xJ implements InterfaceC0723Ja0 {
    public static final EnumC7958xJ b;
    public static final EnumC7958xJ c;
    public static final EnumC7958xJ d;
    public static final /* synthetic */ EnumC7958xJ[] e;
    public final String a;

    static {
        EnumC7958xJ enumC7958xJ = new EnumC7958xJ("ULTRA_WIDE_ANGLE", 0, "ultra-wide-angle-camera");
        b = enumC7958xJ;
        EnumC7958xJ enumC7958xJ2 = new EnumC7958xJ("WIDE_ANGLE", 1, "wide-angle-camera");
        c = enumC7958xJ2;
        EnumC7958xJ enumC7958xJ3 = new EnumC7958xJ("TELEPHOTO", 2, "telephoto-camera");
        d = enumC7958xJ3;
        EnumC7958xJ[] enumC7958xJArr = {enumC7958xJ, enumC7958xJ2, enumC7958xJ3};
        e = enumC7958xJArr;
        F02.c(enumC7958xJArr);
    }

    public EnumC7958xJ(String str, int i, String str2) {
        this.a = str2;
    }

    public static EnumC7958xJ valueOf(String str) {
        return (EnumC7958xJ) Enum.valueOf(EnumC7958xJ.class, str);
    }

    public static EnumC7958xJ[] values() {
        return (EnumC7958xJ[]) e.clone();
    }

    @Override // defpackage.InterfaceC0723Ja0
    public final String a() {
        return this.a;
    }
}
