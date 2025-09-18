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
/* renamed from: po1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class EnumC10696po1 {

    /* renamed from: c */
    public static final C9160do1 f40394c;

    /* renamed from: d */
    public static final C9544go1 f40395d;

    /* renamed from: e */
    public static final C9928jo1 f40396e;

    /* renamed from: f */
    public static final /* synthetic */ EnumC10696po1[] f40397f;

    /* renamed from: a */
    public final EnumC11080so1 f40398a;

    /* renamed from: b */
    public final int f40399b;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC10696po1 EF10;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC10696po1 EF11;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC10696po1 EF12;

    static {
        EnumC10696po1 enumC10696po1 = new EnumC10696po1("DOUBLE", 0, EnumC11080so1.DOUBLE, 1);
        EnumC10696po1 enumC10696po12 = new EnumC10696po1("FLOAT", 1, EnumC11080so1.FLOAT, 5);
        EnumC11080so1 enumC11080so1 = EnumC11080so1.LONG;
        EnumC10696po1 enumC10696po13 = new EnumC10696po1("INT64", 2, enumC11080so1, 0);
        EnumC10696po1 enumC10696po14 = new EnumC10696po1("UINT64", 3, enumC11080so1, 0);
        EnumC11080so1 enumC11080so12 = EnumC11080so1.INT;
        EnumC10696po1 enumC10696po15 = new EnumC10696po1("INT32", 4, enumC11080so12, 0);
        EnumC10696po1 enumC10696po16 = new EnumC10696po1("FIXED64", 5, enumC11080so1, 1);
        EnumC10696po1 enumC10696po17 = new EnumC10696po1("FIXED32", 6, enumC11080so12, 5);
        EnumC10696po1 enumC10696po18 = new EnumC10696po1("BOOL", 7, EnumC11080so1.BOOLEAN, 0);
        C9160do1 c9160do1 = new C9160do1("STRING", 8, EnumC11080so1.STRING, 2);
        f40394c = c9160do1;
        EnumC11080so1 enumC11080so13 = EnumC11080so1.MESSAGE;
        C9544go1 c9544go1 = new C9544go1("GROUP", 9, enumC11080so13, 3);
        f40395d = c9544go1;
        C9928jo1 c9928jo1 = new C9928jo1("MESSAGE", 10, enumC11080so13, 2);
        f40396e = c9928jo1;
        f40397f = new EnumC10696po1[]{enumC10696po1, enumC10696po12, enumC10696po13, enumC10696po14, enumC10696po15, enumC10696po16, enumC10696po17, enumC10696po18, c9160do1, c9544go1, c9928jo1, new C10312mo1("BYTES", 11, EnumC11080so1.BYTE_STRING, 2), new EnumC10696po1("UINT32", 12, enumC11080so12, 0), new EnumC10696po1("ENUM", 13, EnumC11080so1.ENUM, 0), new EnumC10696po1("SFIXED32", 14, enumC11080so12, 5), new EnumC10696po1("SFIXED64", 15, enumC11080so1, 1), new EnumC10696po1("SINT32", 16, enumC11080so12, 0), new EnumC10696po1("SINT64", 17, enumC11080so1, 0)};
    }

    public EnumC10696po1(String str, int i, EnumC11080so1 enumC11080so1, int i2) {
        this.f40398a = enumC11080so1;
        this.f40399b = i2;
    }

    public static EnumC10696po1 valueOf(String str) {
        return (EnumC10696po1) Enum.valueOf(EnumC10696po1.class, str);
    }

    public static EnumC10696po1[] values() {
        return (EnumC10696po1[]) f40397f.clone();
    }
}
