package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class MD {
    public static final MD a;
    public static final MD b;
    public static final MD c;
    public static final /* synthetic */ MD[] d;

    static {
        MD md = new MD("PREFER_ARGB_8888", 0);
        a = md;
        MD md2 = new MD("PREFER_RGB_565", 1);
        b = md2;
        d = new MD[]{md, md2};
        c = md;
    }

    public static MD valueOf(String str) {
        return (MD) Enum.valueOf(MD.class, str);
    }

    public static MD[] values() {
        return (MD[]) d.clone();
    }
}
