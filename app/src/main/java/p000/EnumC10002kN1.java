package p000;

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
public final class EnumC10002kN1 {

    /* renamed from: b */
    public static final EnumC10002kN1 f36470b;

    /* renamed from: c */
    public static final EnumC10002kN1 f36471c;

    /* renamed from: d */
    public static final /* synthetic */ EnumC10002kN1[] f36472d;

    /* renamed from: a */
    public final EnumC10514oN1 f36473a;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC10002kN1 EF0;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC10002kN1 EF1;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC10002kN1 EF2;

    static {
        EnumC10002kN1 enumC10002kN1 = new EnumC10002kN1("DOUBLE", 0, EnumC10514oN1.f38973d);
        EnumC10002kN1 enumC10002kN12 = new EnumC10002kN1("FLOAT", 1, EnumC10514oN1.f38972c);
        EnumC10514oN1 enumC10514oN1 = EnumC10514oN1.f38971b;
        EnumC10002kN1 enumC10002kN13 = new EnumC10002kN1("INT64", 2, enumC10514oN1);
        EnumC10002kN1 enumC10002kN14 = new EnumC10002kN1("UINT64", 3, enumC10514oN1);
        EnumC10514oN1 enumC10514oN12 = EnumC10514oN1.f38970a;
        EnumC10002kN1 enumC10002kN15 = new EnumC10002kN1("INT32", 4, enumC10514oN12);
        EnumC10002kN1 enumC10002kN16 = new EnumC10002kN1("FIXED64", 5, enumC10514oN1);
        EnumC10002kN1 enumC10002kN17 = new EnumC10002kN1("FIXED32", 6, enumC10514oN12);
        EnumC10002kN1 enumC10002kN18 = new EnumC10002kN1("BOOL", 7, EnumC10514oN1.f38974e);
        EnumC10002kN1 enumC10002kN19 = new EnumC10002kN1("STRING", 8, EnumC10514oN1.f38975f);
        EnumC10514oN1 enumC10514oN13 = EnumC10514oN1.f38978i;
        EnumC10002kN1 enumC10002kN110 = new EnumC10002kN1("GROUP", 9, enumC10514oN13);
        f36470b = enumC10002kN110;
        EnumC10002kN1 enumC10002kN111 = new EnumC10002kN1("MESSAGE", 10, enumC10514oN13);
        EnumC10002kN1 enumC10002kN112 = new EnumC10002kN1("BYTES", 11, EnumC10514oN1.f38976g);
        EnumC10002kN1 enumC10002kN113 = new EnumC10002kN1("UINT32", 12, enumC10514oN12);
        EnumC10002kN1 enumC10002kN114 = new EnumC10002kN1("ENUM", 13, EnumC10514oN1.f38977h);
        f36471c = enumC10002kN114;
        f36472d = new EnumC10002kN1[]{enumC10002kN1, enumC10002kN12, enumC10002kN13, enumC10002kN14, enumC10002kN15, enumC10002kN16, enumC10002kN17, enumC10002kN18, enumC10002kN19, enumC10002kN110, enumC10002kN111, enumC10002kN112, enumC10002kN113, enumC10002kN114, new EnumC10002kN1("SFIXED32", 14, enumC10514oN12), new EnumC10002kN1("SFIXED64", 15, enumC10514oN1), new EnumC10002kN1("SINT32", 16, enumC10514oN12), new EnumC10002kN1("SINT64", 17, enumC10514oN1)};
    }

    public EnumC10002kN1(String str, int i, EnumC10514oN1 enumC10514oN1) {
        this.f36473a = enumC10514oN1;
    }

    public static EnumC10002kN1[] values() {
        return (EnumC10002kN1[]) f36472d.clone();
    }
}
