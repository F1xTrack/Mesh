package p000;

import java.util.concurrent.TimeUnit;

/* renamed from: rM */
/* loaded from: classes2.dex */
public final class EnumC6738rM extends Enum {

    /* renamed from: b */
    public static final EnumC6738rM f41609b;

    /* renamed from: c */
    public static final EnumC6738rM f41610c;

    /* renamed from: d */
    public static final EnumC6738rM f41611d;

    /* renamed from: e */
    public static final EnumC6738rM f41612e;

    /* renamed from: f */
    public static final EnumC6738rM f41613f;

    /* renamed from: g */
    public static final EnumC6738rM f41614g;

    /* renamed from: h */
    public static final /* synthetic */ EnumC6738rM[] f41615h;

    /* renamed from: a */
    public final TimeUnit f41616a;

    static {
        EnumC6738rM enumC6738rM = new EnumC6738rM("NANOSECONDS", 0, TimeUnit.NANOSECONDS);
        f41609b = enumC6738rM;
        EnumC6738rM enumC6738rM2 = new EnumC6738rM("MICROSECONDS", 1, TimeUnit.MICROSECONDS);
        EnumC6738rM enumC6738rM3 = new EnumC6738rM("MILLISECONDS", 2, TimeUnit.MILLISECONDS);
        f41610c = enumC6738rM3;
        EnumC6738rM enumC6738rM4 = new EnumC6738rM("SECONDS", 3, TimeUnit.SECONDS);
        f41611d = enumC6738rM4;
        EnumC6738rM enumC6738rM5 = new EnumC6738rM("MINUTES", 4, TimeUnit.MINUTES);
        f41612e = enumC6738rM5;
        EnumC6738rM enumC6738rM6 = new EnumC6738rM("HOURS", 5, TimeUnit.HOURS);
        f41613f = enumC6738rM6;
        EnumC6738rM enumC6738rM7 = new EnumC6738rM("DAYS", 6, TimeUnit.DAYS);
        f41614g = enumC6738rM7;
        EnumC6738rM[] enumC6738rMArr = {enumC6738rM, enumC6738rM2, enumC6738rM3, enumC6738rM4, enumC6738rM5, enumC6738rM6, enumC6738rM7};
        f41615h = enumC6738rMArr;
        F02.m2482c(enumC6738rMArr);
    }

    public EnumC6738rM(String str, int i, TimeUnit timeUnit) {
        super(str, i);
        this.f41616a = timeUnit;
    }

    public static EnumC6738rM valueOf(String str) {
        return (EnumC6738rM) Enum.valueOf(EnumC6738rM.class, str);
    }

    public static EnumC6738rM[] values() {
        return (EnumC6738rM[]) f41615h.clone();
    }
}
