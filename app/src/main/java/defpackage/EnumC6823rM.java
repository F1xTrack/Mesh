package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: rM */
/* loaded from: classes2.dex */
public final class EnumC6823rM extends Enum {
    public static final EnumC6823rM b;
    public static final EnumC6823rM c;
    public static final EnumC6823rM d;
    public static final EnumC6823rM e;
    public static final EnumC6823rM f;
    public static final EnumC6823rM g;
    public static final /* synthetic */ EnumC6823rM[] h;
    public final TimeUnit a;

    static {
        EnumC6823rM enumC6823rM = new EnumC6823rM("NANOSECONDS", 0, TimeUnit.NANOSECONDS);
        b = enumC6823rM;
        EnumC6823rM enumC6823rM2 = new EnumC6823rM("MICROSECONDS", 1, TimeUnit.MICROSECONDS);
        EnumC6823rM enumC6823rM3 = new EnumC6823rM("MILLISECONDS", 2, TimeUnit.MILLISECONDS);
        c = enumC6823rM3;
        EnumC6823rM enumC6823rM4 = new EnumC6823rM("SECONDS", 3, TimeUnit.SECONDS);
        d = enumC6823rM4;
        EnumC6823rM enumC6823rM5 = new EnumC6823rM("MINUTES", 4, TimeUnit.MINUTES);
        e = enumC6823rM5;
        EnumC6823rM enumC6823rM6 = new EnumC6823rM("HOURS", 5, TimeUnit.HOURS);
        f = enumC6823rM6;
        EnumC6823rM enumC6823rM7 = new EnumC6823rM("DAYS", 6, TimeUnit.DAYS);
        g = enumC6823rM7;
        EnumC6823rM[] enumC6823rMArr = {enumC6823rM, enumC6823rM2, enumC6823rM3, enumC6823rM4, enumC6823rM5, enumC6823rM6, enumC6823rM7};
        h = enumC6823rMArr;
        F02.c(enumC6823rMArr);
    }

    public EnumC6823rM(String str, int i, TimeUnit timeUnit) {
        super(str, i);
        this.a = timeUnit;
    }

    public static EnumC6823rM valueOf(String str) {
        return (EnumC6823rM) Enum.valueOf(EnumC6823rM.class, str);
    }

    public static EnumC6823rM[] values() {
        return (EnumC6823rM[]) h.clone();
    }
}
