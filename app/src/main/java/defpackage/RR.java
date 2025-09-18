package defpackage;


/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class RR {
    public static final RR a;
    public static final RR b;
    public static final RR c;
    public static final /* synthetic */ RR[] d;

    static {
        RR rr = new RR("OVERRIDABLE", 0);
        a = rr;
        RR rr2 = new RR("CONFLICT", 1);
        RR rr3 = new RR("INCOMPATIBLE", 2);
        b = rr3;
        RR rr4 = new RR(GrsBaseInfo.CountryCodeSource.UNKNOWN, 3);
        c = rr4;
        d = new RR[]{rr, rr2, rr3, rr4};
    }

    public static RR valueOf(String str) {
        return (RR) Enum.valueOf(RR.class, str);
    }

    public static RR[] values() {
        return (RR[]) d.clone();
    }
}
