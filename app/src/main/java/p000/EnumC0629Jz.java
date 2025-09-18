package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: Jz */
/* loaded from: classes2.dex */
public final class EnumC0629Jz {

    /* renamed from: a */
    public static final EnumC0629Jz f5823a;

    /* renamed from: b */
    public static final EnumC0629Jz f5824b;

    /* renamed from: c */
    public static final EnumC0629Jz f5825c;

    /* renamed from: d */
    public static final EnumC0629Jz f5826d;

    /* renamed from: e */
    public static final EnumC0629Jz f5827e;

    /* renamed from: f */
    public static final /* synthetic */ EnumC0629Jz[] f5828f;

    static {
        EnumC0629Jz enumC0629Jz = new EnumC0629Jz("CPU_ACQUIRED", 0);
        f5823a = enumC0629Jz;
        EnumC0629Jz enumC0629Jz2 = new EnumC0629Jz("BLOCKING", 1);
        f5824b = enumC0629Jz2;
        EnumC0629Jz enumC0629Jz3 = new EnumC0629Jz("PARKING", 2);
        f5825c = enumC0629Jz3;
        EnumC0629Jz enumC0629Jz4 = new EnumC0629Jz("DORMANT", 3);
        f5826d = enumC0629Jz4;
        EnumC0629Jz enumC0629Jz5 = new EnumC0629Jz("TERMINATED", 4);
        f5827e = enumC0629Jz5;
        EnumC0629Jz[] enumC0629JzArr = {enumC0629Jz, enumC0629Jz2, enumC0629Jz3, enumC0629Jz4, enumC0629Jz5};
        f5828f = enumC0629JzArr;
        F02.m2482c(enumC0629JzArr);
    }

    public static EnumC0629Jz valueOf(String str) {
        return (EnumC0629Jz) Enum.valueOf(EnumC0629Jz.class, str);
    }

    public static EnumC0629Jz[] values() {
        return (EnumC0629Jz[]) f5828f.clone();
    }
}
