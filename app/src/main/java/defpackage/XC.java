package defpackage;


/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class XC {
    public static final XC a;
    public static final XC b;
    public static final XC c;
    public static final XC d;
    public static final XC e;
    public static final /* synthetic */ XC[] f;

    static {
        XC xc = new XC("LOCAL", 0);
        a = xc;
        XC xc2 = new XC(Core.NotificationType.REMOTE, 1);
        b = xc2;
        XC xc3 = new XC("DATA_DISK_CACHE", 2);
        c = xc3;
        XC xc4 = new XC("RESOURCE_DISK_CACHE", 3);
        d = xc4;
        XC xc5 = new XC("MEMORY_CACHE", 4);
        e = xc5;
        f = new XC[]{xc, xc2, xc3, xc4, xc5};
    }

    public static XC valueOf(String str) {
        return (XC) Enum.valueOf(XC.class, str);
    }

    public static XC[] values() {
        return (XC[]) f.clone();
    }
}
