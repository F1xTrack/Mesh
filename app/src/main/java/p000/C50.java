package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class C50 {

    /* renamed from: a */
    public static final C50 f1186a;

    /* renamed from: b */
    public static final C50 f1187b;

    /* renamed from: c */
    public static final C50 f1188c;

    /* renamed from: d */
    public static final C50 f1189d;

    /* renamed from: e */
    public static final /* synthetic */ C50[] f1190e;

    static {
        C50 c50 = new C50("DECIMAL", 0);
        f1186a = c50;
        C50 c502 = new C50("PERCENT", 1);
        f1187b = c502;
        C50 c503 = new C50("CURRENCY", 2);
        f1188c = c503;
        C50 c504 = new C50("UNIT", 3);
        f1189d = c504;
        f1190e = new C50[]{c50, c502, c503, c504};
    }

    public static C50 valueOf(String str) {
        return (C50) Enum.valueOf(C50.class, str);
    }

    public static C50[] values() {
        return (C50[]) f1190e.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return "decimal";
        }
        if (iOrdinal == 1) {
            return "percent";
        }
        if (iOrdinal == 2) {
            return "currency";
        }
        if (iOrdinal == 3) {
            return "unit";
        }
        throw new IllegalArgumentException();
    }
}
