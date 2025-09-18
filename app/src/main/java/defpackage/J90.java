package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class J90 {
    public static final C7532v32 a;
    public static final J90 b;
    public static final J90 c;
    public static final J90 d;
    public static final J90 e;
    public static final J90 f;
    public static final /* synthetic */ J90[] g;

    static {
        J90 j90 = new J90("LINEAR", 0);
        b = j90;
        J90 j902 = new J90("EASE_IN", 1);
        c = j902;
        J90 j903 = new J90("EASE_OUT", 2);
        d = j903;
        J90 j904 = new J90("EASE_IN_EASE_OUT", 3);
        e = j904;
        J90 j905 = new J90("SPRING", 4);
        f = j905;
        J90[] j90Arr = {j90, j902, j903, j904, j905};
        g = j90Arr;
        F02.c(j90Arr);
        a = new C7532v32(15);
    }

    public static J90 valueOf(String str) {
        return (J90) Enum.valueOf(J90.class, str);
    }

    public static J90[] values() {
        return (J90[]) g.clone();
    }
}
