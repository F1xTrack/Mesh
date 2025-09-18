package p000;

/* loaded from: classes2.dex */
public final class G20 extends Enum implements InterfaceC7782Ja0 {

    /* renamed from: b */
    public static final S20 f3542b;

    /* renamed from: c */
    public static final G20 f3543c;

    /* renamed from: d */
    public static final G20 f3544d;

    /* renamed from: e */
    public static final G20 f3545e;

    /* renamed from: f */
    public static final G20 f3546f;

    /* renamed from: g */
    public static final G20 f3547g;

    /* renamed from: h */
    public static final /* synthetic */ G20[] f3548h;

    /* renamed from: a */
    public final String f3549a;

    static {
        G20 g20 = new G20("LEGACY", 0, "legacy");
        f3543c = g20;
        G20 g202 = new G20("LIMITED", 1, "limited");
        f3544d = g202;
        G20 g203 = new G20("EXTERNAL", 2, "limited");
        f3545e = g203;
        G20 g204 = new G20("FULL", 3, "full");
        f3546f = g204;
        G20 g205 = new G20("LEVEL_3", 4, "full");
        f3547g = g205;
        G20[] g20Arr = {g20, g202, g203, g204, g205};
        f3548h = g20Arr;
        F02.m2482c(g20Arr);
        f3542b = new S20(15);
    }

    public G20(String str, int i, String str2) {
        super(str, i);
        this.f3549a = str2;
    }

    public static G20 valueOf(String str) {
        return (G20) Enum.valueOf(G20.class, str);
    }

    public static G20[] values() {
        return (G20[]) f3548h.clone();
    }

    @Override // p000.InterfaceC7782Ja0
    /* renamed from: a */
    public final String mo7a() {
        return this.f3549a;
    }
}
