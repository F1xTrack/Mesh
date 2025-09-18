package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF2' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: kN1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC5492kN1 {
    public static final EnumC5492kN1 b;
    public static final EnumC5492kN1 c;
    public static final /* synthetic */ EnumC5492kN1[] d;
    public final EnumC6256oN1 a;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC5492kN1 EF0;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC5492kN1 EF1;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC5492kN1 EF2;

    static {
        EnumC5492kN1 enumC5492kN1 = new EnumC5492kN1("DOUBLE", 0, EnumC6256oN1.d);
        EnumC5492kN1 enumC5492kN12 = new EnumC5492kN1("FLOAT", 1, EnumC6256oN1.c);
        EnumC6256oN1 enumC6256oN1 = EnumC6256oN1.b;
        EnumC5492kN1 enumC5492kN13 = new EnumC5492kN1("INT64", 2, enumC6256oN1);
        EnumC5492kN1 enumC5492kN14 = new EnumC5492kN1("UINT64", 3, enumC6256oN1);
        EnumC6256oN1 enumC6256oN12 = EnumC6256oN1.a;
        EnumC5492kN1 enumC5492kN15 = new EnumC5492kN1("INT32", 4, enumC6256oN12);
        EnumC5492kN1 enumC5492kN16 = new EnumC5492kN1("FIXED64", 5, enumC6256oN1);
        EnumC5492kN1 enumC5492kN17 = new EnumC5492kN1("FIXED32", 6, enumC6256oN12);
        EnumC5492kN1 enumC5492kN18 = new EnumC5492kN1("BOOL", 7, EnumC6256oN1.e);
        EnumC5492kN1 enumC5492kN19 = new EnumC5492kN1("STRING", 8, EnumC6256oN1.f);
        EnumC6256oN1 enumC6256oN13 = EnumC6256oN1.i;
        EnumC5492kN1 enumC5492kN110 = new EnumC5492kN1("GROUP", 9, enumC6256oN13);
        b = enumC5492kN110;
        EnumC5492kN1 enumC5492kN111 = new EnumC5492kN1("MESSAGE", 10, enumC6256oN13);
        EnumC5492kN1 enumC5492kN112 = new EnumC5492kN1("BYTES", 11, EnumC6256oN1.g);
        EnumC5492kN1 enumC5492kN113 = new EnumC5492kN1("UINT32", 12, enumC6256oN12);
        EnumC5492kN1 enumC5492kN114 = new EnumC5492kN1("ENUM", 13, EnumC6256oN1.h);
        c = enumC5492kN114;
        d = new EnumC5492kN1[]{enumC5492kN1, enumC5492kN12, enumC5492kN13, enumC5492kN14, enumC5492kN15, enumC5492kN16, enumC5492kN17, enumC5492kN18, enumC5492kN19, enumC5492kN110, enumC5492kN111, enumC5492kN112, enumC5492kN113, enumC5492kN114, new EnumC5492kN1("SFIXED32", 14, enumC6256oN12), new EnumC5492kN1("SFIXED64", 15, enumC6256oN1), new EnumC5492kN1("SINT32", 16, enumC6256oN12), new EnumC5492kN1("SINT64", 17, enumC6256oN1)};
    }

    public EnumC5492kN1(String str, int i, EnumC6256oN1 enumC6256oN1) {
        this.a = enumC6256oN1;
    }

    public static EnumC5492kN1[] values() {
        return (EnumC5492kN1[]) d.clone();
    }
}
