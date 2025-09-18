package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: NP */
/* loaded from: classes2.dex */
public final class EnumC0844NP {

    /* renamed from: a */
    public static final EnumC0844NP f7754a;

    /* renamed from: b */
    public static final EnumC0844NP f7755b;

    /* renamed from: c */
    public static final EnumC0844NP f7756c;

    /* renamed from: d */
    public static final EnumC0844NP f7757d;

    /* renamed from: e */
    public static final EnumC0844NP f7758e;

    /* renamed from: f */
    public static final EnumC0844NP f7759f;

    /* renamed from: g */
    public static final EnumC0844NP f7760g;

    /* renamed from: h */
    public static final /* synthetic */ EnumC0844NP[] f7761h;

    static {
        EnumC0844NP enumC0844NP = new EnumC0844NP("MODULE_CREATE", 0);
        f7754a = enumC0844NP;
        EnumC0844NP enumC0844NP2 = new EnumC0844NP("MODULE_DESTROY", 1);
        f7755b = enumC0844NP2;
        EnumC0844NP enumC0844NP3 = new EnumC0844NP("ACTIVITY_ENTERS_FOREGROUND", 2);
        f7756c = enumC0844NP3;
        EnumC0844NP enumC0844NP4 = new EnumC0844NP("ACTIVITY_ENTERS_BACKGROUND", 3);
        f7757d = enumC0844NP4;
        EnumC0844NP enumC0844NP5 = new EnumC0844NP("ACTIVITY_DESTROYS", 4);
        f7758e = enumC0844NP5;
        EnumC0844NP enumC0844NP6 = new EnumC0844NP("ON_NEW_INTENT", 5);
        f7759f = enumC0844NP6;
        EnumC0844NP enumC0844NP7 = new EnumC0844NP("ON_ACTIVITY_RESULT", 6);
        f7760g = enumC0844NP7;
        EnumC0844NP[] enumC0844NPArr = {enumC0844NP, enumC0844NP2, enumC0844NP3, enumC0844NP4, enumC0844NP5, enumC0844NP6, enumC0844NP7};
        f7761h = enumC0844NPArr;
        F02.m2482c(enumC0844NPArr);
    }

    public static EnumC0844NP valueOf(String str) {
        return (EnumC0844NP) Enum.valueOf(EnumC0844NP.class, str);
    }

    public static EnumC0844NP[] values() {
        return (EnumC0844NP[]) f7761h.clone();
    }
}
