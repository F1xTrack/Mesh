package p000;

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
public class EnumC10440no1 {

    /* renamed from: c */
    public static final EnumC10440no1 f38539c;

    /* renamed from: d */
    public static final C8899bo1 f38540d;

    /* renamed from: e */
    public static final C9288eo1 f38541e;

    /* renamed from: f */
    public static final /* synthetic */ EnumC10440no1[] f38542f;

    /* renamed from: a */
    public final EnumC10824qo1 f38543a;

    /* renamed from: b */
    public final int f38544b;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC10440no1 EF10;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC10440no1 EF11;

    static {
        EnumC10440no1 enumC10440no1 = new EnumC10440no1("DOUBLE", 0, EnumC10824qo1.DOUBLE, 1);
        EnumC10440no1 enumC10440no12 = new EnumC10440no1("FLOAT", 1, EnumC10824qo1.FLOAT, 5);
        EnumC10824qo1 enumC10824qo1 = EnumC10824qo1.LONG;
        EnumC10440no1 enumC10440no13 = new EnumC10440no1("INT64", 2, enumC10824qo1, 0);
        f38539c = enumC10440no13;
        EnumC10440no1 enumC10440no14 = new EnumC10440no1("UINT64", 3, enumC10824qo1, 0);
        EnumC10824qo1 enumC10824qo12 = EnumC10824qo1.INT;
        EnumC10440no1 enumC10440no15 = new EnumC10440no1("INT32", 4, enumC10824qo12, 0);
        EnumC10440no1 enumC10440no16 = new EnumC10440no1("FIXED64", 5, enumC10824qo1, 1);
        EnumC10440no1 enumC10440no17 = new EnumC10440no1("FIXED32", 6, enumC10824qo12, 5);
        EnumC10440no1 enumC10440no18 = new EnumC10440no1("BOOL", 7, EnumC10824qo1.BOOLEAN, 0);
        C8899bo1 c8899bo1 = new C8899bo1("STRING", 8, EnumC10824qo1.STRING, 2);
        f38540d = c8899bo1;
        EnumC10824qo1 enumC10824qo13 = EnumC10824qo1.MESSAGE;
        C9288eo1 c9288eo1 = new C9288eo1("GROUP", 9, enumC10824qo13, 3);
        f38541e = c9288eo1;
        f38542f = new EnumC10440no1[]{enumC10440no1, enumC10440no12, enumC10440no13, enumC10440no14, enumC10440no15, enumC10440no16, enumC10440no17, enumC10440no18, c8899bo1, c9288eo1, new C9672ho1("MESSAGE", 10, enumC10824qo13, 2), new C10056ko1("BYTES", 11, EnumC10824qo1.BYTE_STRING, 2), new EnumC10440no1("UINT32", 12, enumC10824qo12, 0), new EnumC10440no1("ENUM", 13, EnumC10824qo1.ENUM, 0), new EnumC10440no1("SFIXED32", 14, enumC10824qo12, 5), new EnumC10440no1("SFIXED64", 15, enumC10824qo1, 1), new EnumC10440no1("SINT32", 16, enumC10824qo12, 0), new EnumC10440no1("SINT64", 17, enumC10824qo1, 0)};
    }

    public EnumC10440no1(String str, int i, EnumC10824qo1 enumC10824qo1, int i2) {
        this.f38543a = enumC10824qo1;
        this.f38544b = i2;
    }

    public static EnumC10440no1 valueOf(String str) {
        return (EnumC10440no1) Enum.valueOf(EnumC10440no1.class, str);
    }

    public static EnumC10440no1[] values() {
        return (EnumC10440no1[]) f38542f.clone();
    }
}
