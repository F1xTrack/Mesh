package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: tj */
/* loaded from: classes2.dex */
public final class EnumC6904tj {

    /* renamed from: a */
    public static final EnumC6904tj f43225a;

    /* renamed from: b */
    public static final EnumC6904tj f43226b;

    /* renamed from: c */
    public static final EnumC6904tj f43227c;

    /* renamed from: d */
    public static final /* synthetic */ EnumC6904tj[] f43228d;

    static {
        EnumC6904tj enumC6904tj = new EnumC6904tj("SUSPEND", 0);
        f43225a = enumC6904tj;
        EnumC6904tj enumC6904tj2 = new EnumC6904tj("DROP_OLDEST", 1);
        f43226b = enumC6904tj2;
        EnumC6904tj enumC6904tj3 = new EnumC6904tj("DROP_LATEST", 2);
        f43227c = enumC6904tj3;
        EnumC6904tj[] enumC6904tjArr = {enumC6904tj, enumC6904tj2, enumC6904tj3};
        f43228d = enumC6904tjArr;
        F02.m2482c(enumC6904tjArr);
    }

    public static EnumC6904tj valueOf(String str) {
        return (EnumC6904tj) Enum.valueOf(EnumC6904tj.class, str);
    }

    public static EnumC6904tj[] values() {
        return (EnumC6904tj[]) f43228d.clone();
    }
}
