package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class IU {
    public static final IU a;
    public static final IU b;
    public static final IU c;
    public static final IU d;
    public static final /* synthetic */ IU[] e;

    static {
        IU iu = new IU("AD_STORAGE", 0);
        a = iu;
        IU iu2 = new IU("ANALYTICS_STORAGE", 1);
        b = iu2;
        IU iu3 = new IU("AD_USER_DATA", 2);
        c = iu3;
        IU iu4 = new IU("AD_PERSONALIZATION", 3);
        d = iu4;
        e = new IU[]{iu, iu2, iu3, iu4};
    }

    public static IU valueOf(String str) {
        return (IU) Enum.valueOf(IU.class, str);
    }

    public static IU[] values() {
        return (IU[]) e.clone();
    }
}
