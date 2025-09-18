package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'c' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: no1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class EnumC6146no1 {
    public static final EnumC6146no1 c;
    public static final C2395bo1 d;
    public static final C3651eo1 e;
    public static final /* synthetic */ EnumC6146no1[] f;
    public final EnumC6719qo1 a;
    public final int b;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC6146no1 EF10;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC6146no1 EF11;

    static {
        EnumC6146no1 enumC6146no1 = new EnumC6146no1("DOUBLE", 0, EnumC6719qo1.DOUBLE, 1);
        EnumC6146no1 enumC6146no12 = new EnumC6146no1("FLOAT", 1, EnumC6719qo1.FLOAT, 5);
        EnumC6719qo1 enumC6719qo1 = EnumC6719qo1.LONG;
        EnumC6146no1 enumC6146no13 = new EnumC6146no1("INT64", 2, enumC6719qo1, 0);
        c = enumC6146no13;
        EnumC6146no1 enumC6146no14 = new EnumC6146no1("UINT64", 3, enumC6719qo1, 0);
        EnumC6719qo1 enumC6719qo12 = EnumC6719qo1.INT;
        EnumC6146no1 enumC6146no15 = new EnumC6146no1("INT32", 4, enumC6719qo12, 0);
        EnumC6146no1 enumC6146no16 = new EnumC6146no1("FIXED64", 5, enumC6719qo1, 1);
        EnumC6146no1 enumC6146no17 = new EnumC6146no1("FIXED32", 6, enumC6719qo12, 5);
        EnumC6146no1 enumC6146no18 = new EnumC6146no1("BOOL", 7, EnumC6719qo1.BOOLEAN, 0);
        C2395bo1 c2395bo1 = new C2395bo1("STRING", 8, EnumC6719qo1.STRING, 2);
        d = c2395bo1;
        EnumC6719qo1 enumC6719qo13 = EnumC6719qo1.MESSAGE;
        C3651eo1 c3651eo1 = new C3651eo1("GROUP", 9, enumC6719qo13, 3);
        e = c3651eo1;
        f = new EnumC6146no1[]{enumC6146no1, enumC6146no12, enumC6146no13, enumC6146no14, enumC6146no15, enumC6146no16, enumC6146no17, enumC6146no18, c2395bo1, c3651eo1, new C4224ho1("MESSAGE", 10, enumC6719qo13, 2), new C5573ko1("BYTES", 11, EnumC6719qo1.BYTE_STRING, 2), new EnumC6146no1("UINT32", 12, enumC6719qo12, 0), new EnumC6146no1("ENUM", 13, EnumC6719qo1.ENUM, 0), new EnumC6146no1("SFIXED32", 14, enumC6719qo12, 5), new EnumC6146no1("SFIXED64", 15, enumC6719qo1, 1), new EnumC6146no1("SINT32", 16, enumC6719qo12, 0), new EnumC6146no1("SINT64", 17, enumC6719qo1, 0)};
    }

    public EnumC6146no1(String str, int i, EnumC6719qo1 enumC6719qo1, int i2) {
        this.a = enumC6719qo1;
        this.b = i2;
    }

    public static EnumC6146no1 valueOf(String str) {
        return (EnumC6146no1) Enum.valueOf(EnumC6146no1.class, str);
    }

    public static EnumC6146no1[] values() {
        return (EnumC6146no1[]) f.clone();
    }
}
