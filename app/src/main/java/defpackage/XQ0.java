package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class XQ0 {
    public static final XQ0 a;
    public static final XQ0 b;
    public static final XQ0 c;
    public static final /* synthetic */ XQ0[] d;

    static {
        XQ0 xq0 = new XQ0("AUTOMATIC", 0);
        a = xq0;
        XQ0 xq02 = new XQ0("HARDWARE", 1);
        b = xq02;
        XQ0 xq03 = new XQ0("SOFTWARE", 2);
        c = xq03;
        d = new XQ0[]{xq0, xq02, xq03};
    }

    public static XQ0 valueOf(String str) {
        return (XQ0) Enum.valueOf(XQ0.class, str);
    }

    public static XQ0[] values() {
        return (XQ0[]) d.clone();
    }
}
