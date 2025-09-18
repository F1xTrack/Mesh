package defpackage;

/* renamed from: Mz */
/* loaded from: classes2.dex */
public final class EnumC1030Mz extends Enum {
    public static final EnumC1030Mz a;
    public static final EnumC1030Mz b;
    public static final EnumC1030Mz c;
    public static final /* synthetic */ EnumC1030Mz[] d;

    static {
        EnumC1030Mz enumC1030Mz = new EnumC1030Mz("COROUTINE_SUSPENDED", 0);
        a = enumC1030Mz;
        EnumC1030Mz enumC1030Mz2 = new EnumC1030Mz("UNDECIDED", 1);
        b = enumC1030Mz2;
        EnumC1030Mz enumC1030Mz3 = new EnumC1030Mz("RESUMED", 2);
        c = enumC1030Mz3;
        EnumC1030Mz[] enumC1030MzArr = {enumC1030Mz, enumC1030Mz2, enumC1030Mz3};
        d = enumC1030MzArr;
        F02.c(enumC1030MzArr);
    }

    public static EnumC1030Mz valueOf(String str) {
        return (EnumC1030Mz) Enum.valueOf(EnumC1030Mz.class, str);
    }

    public static EnumC1030Mz[] values() {
        return (EnumC1030Mz[]) d.clone();
    }
}
