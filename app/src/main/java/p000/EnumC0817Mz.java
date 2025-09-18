package p000;

/* renamed from: Mz */
/* loaded from: classes2.dex */
public final class EnumC0817Mz extends Enum {

    /* renamed from: a */
    public static final EnumC0817Mz f7418a;

    /* renamed from: b */
    public static final EnumC0817Mz f7419b;

    /* renamed from: c */
    public static final EnumC0817Mz f7420c;

    /* renamed from: d */
    public static final /* synthetic */ EnumC0817Mz[] f7421d;

    static {
        EnumC0817Mz enumC0817Mz = new EnumC0817Mz("COROUTINE_SUSPENDED", 0);
        f7418a = enumC0817Mz;
        EnumC0817Mz enumC0817Mz2 = new EnumC0817Mz("UNDECIDED", 1);
        f7419b = enumC0817Mz2;
        EnumC0817Mz enumC0817Mz3 = new EnumC0817Mz("RESUMED", 2);
        f7420c = enumC0817Mz3;
        EnumC0817Mz[] enumC0817MzArr = {enumC0817Mz, enumC0817Mz2, enumC0817Mz3};
        f7421d = enumC0817MzArr;
        F02.m2482c(enumC0817MzArr);
    }

    public static EnumC0817Mz valueOf(String str) {
        return (EnumC0817Mz) Enum.valueOf(EnumC0817Mz.class, str);
    }

    public static EnumC0817Mz[] values() {
        return (EnumC0817Mz[]) f7421d.clone();
    }
}
