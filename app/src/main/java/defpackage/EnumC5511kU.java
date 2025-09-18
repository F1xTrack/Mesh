package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: kU, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC5511kU {
    public static final EnumC5511kU a;
    public static final /* synthetic */ EnumC5511kU[] b;

    static {
        EnumC5511kU enumC5511kU = new EnumC5511kU("TOP_DOWN", 0);
        EnumC5511kU enumC5511kU2 = new EnumC5511kU("BOTTOM_UP", 1);
        a = enumC5511kU2;
        EnumC5511kU[] enumC5511kUArr = {enumC5511kU, enumC5511kU2};
        b = enumC5511kUArr;
        F02.c(enumC5511kUArr);
    }

    public static EnumC5511kU valueOf(String str) {
        return (EnumC5511kU) Enum.valueOf(EnumC5511kU.class, str);
    }

    public static EnumC5511kU[] values() {
        return (EnumC5511kU[]) b.clone();
    }
}
