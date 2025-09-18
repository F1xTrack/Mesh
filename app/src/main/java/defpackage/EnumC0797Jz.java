package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: Jz, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC0797Jz {
    public static final EnumC0797Jz a;
    public static final EnumC0797Jz b;
    public static final EnumC0797Jz c;
    public static final EnumC0797Jz d;
    public static final EnumC0797Jz e;
    public static final /* synthetic */ EnumC0797Jz[] f;

    static {
        EnumC0797Jz enumC0797Jz = new EnumC0797Jz("CPU_ACQUIRED", 0);
        a = enumC0797Jz;
        EnumC0797Jz enumC0797Jz2 = new EnumC0797Jz("BLOCKING", 1);
        b = enumC0797Jz2;
        EnumC0797Jz enumC0797Jz3 = new EnumC0797Jz("PARKING", 2);
        c = enumC0797Jz3;
        EnumC0797Jz enumC0797Jz4 = new EnumC0797Jz("DORMANT", 3);
        d = enumC0797Jz4;
        EnumC0797Jz enumC0797Jz5 = new EnumC0797Jz("TERMINATED", 4);
        e = enumC0797Jz5;
        EnumC0797Jz[] enumC0797JzArr = {enumC0797Jz, enumC0797Jz2, enumC0797Jz3, enumC0797Jz4, enumC0797Jz5};
        f = enumC0797JzArr;
        F02.c(enumC0797JzArr);
    }

    public static EnumC0797Jz valueOf(String str) {
        return (EnumC0797Jz) Enum.valueOf(EnumC0797Jz.class, str);
    }

    public static EnumC0797Jz[] values() {
        return (EnumC0797Jz[]) f.clone();
    }
}
