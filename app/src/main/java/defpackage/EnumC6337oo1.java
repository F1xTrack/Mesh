package defpackage;

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
public class EnumC6337oo1 {
    public static final EnumC6337oo1 c;
    public static final EnumC6337oo1 d;
    public static final C3842fo1 e;
    public static final C5192io1 f;
    public static final EnumC6337oo1 g;
    public static final /* synthetic */ EnumC6337oo1[] h;
    public final EnumC6909ro1 a;
    public final int b;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC6337oo1 EF10;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC6337oo1 EF11;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC6337oo1 EF12;

    static {
        EnumC6337oo1 enumC6337oo1 = new EnumC6337oo1("DOUBLE", 0, EnumC6909ro1.e, 1);
        EnumC6337oo1 enumC6337oo12 = new EnumC6337oo1("FLOAT", 1, EnumC6909ro1.d, 5);
        EnumC6909ro1 enumC6909ro1 = EnumC6909ro1.c;
        EnumC6337oo1 enumC6337oo13 = new EnumC6337oo1("INT64", 2, enumC6909ro1, 0);
        EnumC6337oo1 enumC6337oo14 = new EnumC6337oo1("UINT64", 3, enumC6909ro1, 0);
        EnumC6909ro1 enumC6909ro12 = EnumC6909ro1.b;
        EnumC6337oo1 enumC6337oo15 = new EnumC6337oo1("INT32", 4, enumC6909ro12, 0);
        c = enumC6337oo15;
        EnumC6337oo1 enumC6337oo16 = new EnumC6337oo1("FIXED64", 5, enumC6909ro1, 1);
        EnumC6337oo1 enumC6337oo17 = new EnumC6337oo1("FIXED32", 6, enumC6909ro12, 5);
        EnumC6337oo1 enumC6337oo18 = new EnumC6337oo1("BOOL", 7, EnumC6909ro1.f, 0);
        d = enumC6337oo18;
        C2585co1 c2585co1 = new C2585co1("STRING", 8, EnumC6909ro1.g, 2);
        EnumC6909ro1 enumC6909ro13 = EnumC6909ro1.j;
        C3842fo1 c3842fo1 = new C3842fo1("GROUP", 9, enumC6909ro13, 3);
        e = c3842fo1;
        C5192io1 c5192io1 = new C5192io1("MESSAGE", 10, enumC6909ro13, 2);
        f = c5192io1;
        C5764lo1 c5764lo1 = new C5764lo1("BYTES", 11, EnumC6909ro1.h, 2);
        EnumC6337oo1 enumC6337oo19 = new EnumC6337oo1("UINT32", 12, enumC6909ro12, 0);
        EnumC6337oo1 enumC6337oo110 = new EnumC6337oo1("ENUM", 13, EnumC6909ro1.i, 0);
        g = enumC6337oo110;
        h = new EnumC6337oo1[]{enumC6337oo1, enumC6337oo12, enumC6337oo13, enumC6337oo14, enumC6337oo15, enumC6337oo16, enumC6337oo17, enumC6337oo18, c2585co1, c3842fo1, c5192io1, c5764lo1, enumC6337oo19, enumC6337oo110, new EnumC6337oo1("SFIXED32", 14, enumC6909ro12, 5), new EnumC6337oo1("SFIXED64", 15, enumC6909ro1, 1), new EnumC6337oo1("SINT32", 16, enumC6909ro12, 0), new EnumC6337oo1("SINT64", 17, enumC6909ro1, 0)};
    }

    public EnumC6337oo1(String str, int i, EnumC6909ro1 enumC6909ro1, int i2) {
        this.a = enumC6909ro1;
        this.b = i2;
    }

    public static EnumC6337oo1 valueOf(String str) {
        return (EnumC6337oo1) Enum.valueOf(EnumC6337oo1.class, str);
    }

    public static EnumC6337oo1[] values() {
        return (EnumC6337oo1[]) h.clone();
    }

    public boolean a() {
        return !(this instanceof C2585co1);
    }
}
