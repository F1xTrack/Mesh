package p000;

/* renamed from: wb1 */
/* loaded from: classes.dex */
public final class EnumC11565wb1 extends Enum {

    /* renamed from: b */
    public static final C4049fN f44986b;

    /* renamed from: c */
    public static final EnumC11565wb1 f44987c;

    /* renamed from: d */
    public static final EnumC11565wb1 f44988d;

    /* renamed from: e */
    public static final EnumC11565wb1 f44989e;

    /* renamed from: f */
    public static final EnumC11565wb1 f44990f;

    /* renamed from: g */
    public static final /* synthetic */ EnumC11565wb1[] f44991g;

    /* renamed from: a */
    public final String f44992a;

    static {
        EnumC11565wb1 enumC11565wb1 = new EnumC11565wb1("START", 0, "topTouchStart");
        f44987c = enumC11565wb1;
        EnumC11565wb1 enumC11565wb12 = new EnumC11565wb1("END", 1, "topTouchEnd");
        f44988d = enumC11565wb12;
        EnumC11565wb1 enumC11565wb13 = new EnumC11565wb1("MOVE", 2, "topTouchMove");
        f44989e = enumC11565wb13;
        EnumC11565wb1 enumC11565wb14 = new EnumC11565wb1("CANCEL", 3, "topTouchCancel");
        f44990f = enumC11565wb14;
        EnumC11565wb1[] enumC11565wb1Arr = {enumC11565wb1, enumC11565wb12, enumC11565wb13, enumC11565wb14};
        f44991g = enumC11565wb1Arr;
        F02.m2482c(enumC11565wb1Arr);
        f44986b = new C4049fN(22);
    }

    public EnumC11565wb1(String str, int i, String str2) {
        super(str, i);
        this.f44992a = str2;
    }

    public static EnumC11565wb1 valueOf(String str) {
        return (EnumC11565wb1) Enum.valueOf(EnumC11565wb1.class, str);
    }

    public static EnumC11565wb1[] values() {
        return (EnumC11565wb1[]) f44991g.clone();
    }
}
