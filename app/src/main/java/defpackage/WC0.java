package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class WC0 {
    public static final WC0 a;
    public static final /* synthetic */ WC0[] b;

    /* JADX INFO: Fake field, exist only in values array */
    WC0 EF2;

    static {
        WC0 wc0 = new WC0("SRGB", 0);
        WC0 wc02 = new WC0("DISPLAY_P3", 1);
        a = wc02;
        b = new WC0[]{wc0, wc02};
    }

    public static WC0 valueOf(String str) {
        return (WC0) Enum.valueOf(WC0.class, str);
    }

    public static WC0[] values() {
        return (WC0[]) b.clone();
    }
}
