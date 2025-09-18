package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class HU {
    public static final HU a;
    public static final HU b;
    public static final /* synthetic */ HU[] c;

    static {
        HU hu = new HU("GRANTED", 0);
        a = hu;
        HU hu2 = new HU("DENIED", 1);
        b = hu2;
        c = new HU[]{hu, hu2};
    }

    public static HU valueOf(String str) {
        return (HU) Enum.valueOf(HU.class, str);
    }

    public static HU[] values() {
        return (HU[]) c.clone();
    }
}
