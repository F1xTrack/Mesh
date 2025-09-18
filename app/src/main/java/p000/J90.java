package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class J90 {

    /* renamed from: a */
    public static final C11370v32 f5361a;

    /* renamed from: b */
    public static final J90 f5362b;

    /* renamed from: c */
    public static final J90 f5363c;

    /* renamed from: d */
    public static final J90 f5364d;

    /* renamed from: e */
    public static final J90 f5365e;

    /* renamed from: f */
    public static final J90 f5366f;

    /* renamed from: g */
    public static final /* synthetic */ J90[] f5367g;

    static {
        J90 j90 = new J90("LINEAR", 0);
        f5362b = j90;
        J90 j902 = new J90("EASE_IN", 1);
        f5363c = j902;
        J90 j903 = new J90("EASE_OUT", 2);
        f5364d = j903;
        J90 j904 = new J90("EASE_IN_EASE_OUT", 3);
        f5365e = j904;
        J90 j905 = new J90("SPRING", 4);
        f5366f = j905;
        J90[] j90Arr = {j90, j902, j903, j904, j905};
        f5367g = j90Arr;
        F02.m2482c(j90Arr);
        f5361a = new C11370v32(15);
    }

    public static J90 valueOf(String str) {
        return (J90) Enum.valueOf(J90.class, str);
    }

    public static J90[] values() {
        return (J90[]) f5367g.clone();
    }
}
