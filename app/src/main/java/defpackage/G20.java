package defpackage;

/* loaded from: classes2.dex */
public final class G20 extends Enum implements InterfaceC0723Ja0 {
    public static final S20 b;
    public static final G20 c;
    public static final G20 d;
    public static final G20 e;
    public static final G20 f;
    public static final G20 g;
    public static final /* synthetic */ G20[] h;
    public final String a;

    static {
        G20 g20 = new G20("LEGACY", 0, "legacy");
        c = g20;
        G20 g202 = new G20("LIMITED", 1, "limited");
        d = g202;
        G20 g203 = new G20("EXTERNAL", 2, "limited");
        e = g203;
        G20 g204 = new G20("FULL", 3, "full");
        f = g204;
        G20 g205 = new G20("LEVEL_3", 4, "full");
        g = g205;
        G20[] g20Arr = {g20, g202, g203, g204, g205};
        h = g20Arr;
        F02.c(g20Arr);
        b = new S20(15);
    }

    public G20(String str, int i, String str2) {
        super(str, i);
        this.a = str2;
    }

    public static G20 valueOf(String str) {
        return (G20) Enum.valueOf(G20.class, str);
    }

    public static G20[] values() {
        return (G20[]) h.clone();
    }

    @Override // defpackage.InterfaceC0723Ja0
    public final String a() {
        return this.a;
    }
}
