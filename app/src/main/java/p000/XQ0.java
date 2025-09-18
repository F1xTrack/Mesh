package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class XQ0 {

    /* renamed from: a */
    public static final XQ0 f13751a;

    /* renamed from: b */
    public static final XQ0 f13752b;

    /* renamed from: c */
    public static final XQ0 f13753c;

    /* renamed from: d */
    public static final /* synthetic */ XQ0[] f13754d;

    static {
        XQ0 xq0 = new XQ0("AUTOMATIC", 0);
        f13751a = xq0;
        XQ0 xq02 = new XQ0("HARDWARE", 1);
        f13752b = xq02;
        XQ0 xq03 = new XQ0("SOFTWARE", 2);
        f13753c = xq03;
        f13754d = new XQ0[]{xq0, xq02, xq03};
    }

    public static XQ0 valueOf(String str) {
        return (XQ0) Enum.valueOf(XQ0.class, str);
    }

    public static XQ0[] values() {
        return (XQ0[]) f13754d.clone();
    }
}
