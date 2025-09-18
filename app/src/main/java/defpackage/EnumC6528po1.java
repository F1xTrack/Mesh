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
/* renamed from: po1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class EnumC6528po1 {
    public static final C3460do1 c;
    public static final C4033go1 d;
    public static final C5382jo1 e;
    public static final /* synthetic */ EnumC6528po1[] f;
    public final EnumC7100so1 a;
    public final int b;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC6528po1 EF10;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC6528po1 EF11;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC6528po1 EF12;

    static {
        EnumC6528po1 enumC6528po1 = new EnumC6528po1("DOUBLE", 0, EnumC7100so1.DOUBLE, 1);
        EnumC6528po1 enumC6528po12 = new EnumC6528po1("FLOAT", 1, EnumC7100so1.FLOAT, 5);
        EnumC7100so1 enumC7100so1 = EnumC7100so1.LONG;
        EnumC6528po1 enumC6528po13 = new EnumC6528po1("INT64", 2, enumC7100so1, 0);
        EnumC6528po1 enumC6528po14 = new EnumC6528po1("UINT64", 3, enumC7100so1, 0);
        EnumC7100so1 enumC7100so12 = EnumC7100so1.INT;
        EnumC6528po1 enumC6528po15 = new EnumC6528po1("INT32", 4, enumC7100so12, 0);
        EnumC6528po1 enumC6528po16 = new EnumC6528po1("FIXED64", 5, enumC7100so1, 1);
        EnumC6528po1 enumC6528po17 = new EnumC6528po1("FIXED32", 6, enumC7100so12, 5);
        EnumC6528po1 enumC6528po18 = new EnumC6528po1("BOOL", 7, EnumC7100so1.BOOLEAN, 0);
        C3460do1 c3460do1 = new C3460do1("STRING", 8, EnumC7100so1.STRING, 2);
        c = c3460do1;
        EnumC7100so1 enumC7100so13 = EnumC7100so1.MESSAGE;
        C4033go1 c4033go1 = new C4033go1("GROUP", 9, enumC7100so13, 3);
        d = c4033go1;
        C5382jo1 c5382jo1 = new C5382jo1("MESSAGE", 10, enumC7100so13, 2);
        e = c5382jo1;
        f = new EnumC6528po1[]{enumC6528po1, enumC6528po12, enumC6528po13, enumC6528po14, enumC6528po15, enumC6528po16, enumC6528po17, enumC6528po18, c3460do1, c4033go1, c5382jo1, new C5955mo1("BYTES", 11, EnumC7100so1.BYTE_STRING, 2), new EnumC6528po1("UINT32", 12, enumC7100so12, 0), new EnumC6528po1("ENUM", 13, EnumC7100so1.ENUM, 0), new EnumC6528po1("SFIXED32", 14, enumC7100so12, 5), new EnumC6528po1("SFIXED64", 15, enumC7100so1, 1), new EnumC6528po1("SINT32", 16, enumC7100so12, 0), new EnumC6528po1("SINT64", 17, enumC7100so1, 0)};
    }

    public EnumC6528po1(String str, int i, EnumC7100so1 enumC7100so1, int i2) {
        this.a = enumC7100so1;
        this.b = i2;
    }

    public static EnumC6528po1 valueOf(String str) {
        return (EnumC6528po1) Enum.valueOf(EnumC6528po1.class, str);
    }

    public static EnumC6528po1[] values() {
        return (EnumC6528po1[]) f.clone();
    }
}
