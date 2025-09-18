package p000;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF12' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: oo1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class EnumC10568oo1 {

    /* renamed from: c */
    public static final EnumC10568oo1 f39275c;

    /* renamed from: d */
    public static final EnumC10568oo1 f39276d;

    /* renamed from: e */
    public static final C9416fo1 f39277e;

    /* renamed from: f */
    public static final C9800io1 f39278f;

    /* renamed from: g */
    public static final EnumC10568oo1 f39279g;

    /* renamed from: h */
    public static final /* synthetic */ EnumC10568oo1[] f39280h;

    /* renamed from: a */
    public final EnumC10952ro1 f39281a;

    /* renamed from: b */
    public final int f39282b;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC10568oo1 EF10;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC10568oo1 EF11;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC10568oo1 EF12;

    static {
        EnumC10568oo1 enumC10568oo1 = new EnumC10568oo1("DOUBLE", 0, EnumC10952ro1.f41911e, 1);
        EnumC10568oo1 enumC10568oo12 = new EnumC10568oo1("FLOAT", 1, EnumC10952ro1.f41910d, 5);
        EnumC10952ro1 enumC10952ro1 = EnumC10952ro1.f41909c;
        EnumC10568oo1 enumC10568oo13 = new EnumC10568oo1("INT64", 2, enumC10952ro1, 0);
        EnumC10568oo1 enumC10568oo14 = new EnumC10568oo1("UINT64", 3, enumC10952ro1, 0);
        EnumC10952ro1 enumC10952ro12 = EnumC10952ro1.f41908b;
        EnumC10568oo1 enumC10568oo15 = new EnumC10568oo1("INT32", 4, enumC10952ro12, 0);
        f39275c = enumC10568oo15;
        EnumC10568oo1 enumC10568oo16 = new EnumC10568oo1("FIXED64", 5, enumC10952ro1, 1);
        EnumC10568oo1 enumC10568oo17 = new EnumC10568oo1("FIXED32", 6, enumC10952ro12, 5);
        EnumC10568oo1 enumC10568oo18 = new EnumC10568oo1("BOOL", 7, EnumC10952ro1.f41912f, 0);
        f39276d = enumC10568oo18;
        C9027co1 c9027co1 = new C9027co1("STRING", 8, EnumC10952ro1.f41913g, 2);
        EnumC10952ro1 enumC10952ro13 = EnumC10952ro1.f41916j;
        C9416fo1 c9416fo1 = new C9416fo1("GROUP", 9, enumC10952ro13, 3);
        f39277e = c9416fo1;
        C9800io1 c9800io1 = new C9800io1("MESSAGE", 10, enumC10952ro13, 2);
        f39278f = c9800io1;
        C10184lo1 c10184lo1 = new C10184lo1("BYTES", 11, EnumC10952ro1.f41914h, 2);
        EnumC10568oo1 enumC10568oo19 = new EnumC10568oo1("UINT32", 12, enumC10952ro12, 0);
        EnumC10568oo1 enumC10568oo110 = new EnumC10568oo1("ENUM", 13, EnumC10952ro1.f41915i, 0);
        f39279g = enumC10568oo110;
        f39280h = new EnumC10568oo1[]{enumC10568oo1, enumC10568oo12, enumC10568oo13, enumC10568oo14, enumC10568oo15, enumC10568oo16, enumC10568oo17, enumC10568oo18, c9027co1, c9416fo1, c9800io1, c10184lo1, enumC10568oo19, enumC10568oo110, new EnumC10568oo1("SFIXED32", 14, enumC10952ro12, 5), new EnumC10568oo1("SFIXED64", 15, enumC10952ro1, 1), new EnumC10568oo1("SINT32", 16, enumC10952ro12, 0), new EnumC10568oo1("SINT64", 17, enumC10952ro1, 0)};
    }

    public EnumC10568oo1(String str, int i, EnumC10952ro1 enumC10952ro1, int i2) {
        this.f39281a = enumC10952ro1;
        this.f39282b = i2;
    }

    public static EnumC10568oo1 valueOf(String str) {
        return (EnumC10568oo1) Enum.valueOf(EnumC10568oo1.class, str);
    }

    public static EnumC10568oo1[] values() {
        return (EnumC10568oo1[]) f39280h.clone();
    }

    /* renamed from: a */
    public boolean mo18297a() {
        return !(this instanceof C9027co1);
    }
}
