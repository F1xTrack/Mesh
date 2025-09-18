package p000;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF6' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: jT */
/* loaded from: classes.dex */
public final class EnumC6239jT {

    /* renamed from: b */
    public static final EnumC6239jT f35153b;

    /* renamed from: c */
    public static final EnumC6239jT f35154c;

    /* renamed from: d */
    public static final EnumC6239jT[] f35155d;

    /* renamed from: e */
    public static final /* synthetic */ EnumC6239jT[] f35156e;

    /* renamed from: a */
    public final int f35157a;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC6239jT EF6;

    static {
        EnumC11691xb0 enumC11691xb0 = EnumC11691xb0.DOUBLE;
        EnumC6239jT enumC6239jT = new EnumC6239jT("DOUBLE", 0, 0, 1, enumC11691xb0);
        EnumC11691xb0 enumC11691xb02 = EnumC11691xb0.FLOAT;
        EnumC6239jT enumC6239jT2 = new EnumC6239jT("FLOAT", 1, 1, 1, enumC11691xb02);
        EnumC11691xb0 enumC11691xb03 = EnumC11691xb0.LONG;
        EnumC6239jT enumC6239jT3 = new EnumC6239jT("INT64", 2, 2, 1, enumC11691xb03);
        EnumC6239jT enumC6239jT4 = new EnumC6239jT("UINT64", 3, 3, 1, enumC11691xb03);
        EnumC11691xb0 enumC11691xb04 = EnumC11691xb0.INT;
        EnumC6239jT enumC6239jT5 = new EnumC6239jT("INT32", 4, 4, 1, enumC11691xb04);
        EnumC6239jT enumC6239jT6 = new EnumC6239jT("FIXED64", 5, 5, 1, enumC11691xb03);
        EnumC6239jT enumC6239jT7 = new EnumC6239jT("FIXED32", 6, 6, 1, enumC11691xb04);
        EnumC11691xb0 enumC11691xb05 = EnumC11691xb0.BOOLEAN;
        EnumC6239jT enumC6239jT8 = new EnumC6239jT("BOOL", 7, 7, 1, enumC11691xb05);
        EnumC11691xb0 enumC11691xb06 = EnumC11691xb0.STRING;
        EnumC6239jT enumC6239jT9 = new EnumC6239jT("STRING", 8, 8, 1, enumC11691xb06);
        EnumC11691xb0 enumC11691xb07 = EnumC11691xb0.MESSAGE;
        EnumC6239jT enumC6239jT10 = new EnumC6239jT("MESSAGE", 9, 9, 1, enumC11691xb07);
        EnumC11691xb0 enumC11691xb08 = EnumC11691xb0.BYTE_STRING;
        EnumC6239jT enumC6239jT11 = new EnumC6239jT("BYTES", 10, 10, 1, enumC11691xb08);
        EnumC6239jT enumC6239jT12 = new EnumC6239jT("UINT32", 11, 11, 1, enumC11691xb04);
        EnumC11691xb0 enumC11691xb09 = EnumC11691xb0.ENUM;
        EnumC6239jT enumC6239jT13 = new EnumC6239jT("ENUM", 12, 12, 1, enumC11691xb09);
        EnumC6239jT enumC6239jT14 = new EnumC6239jT("SFIXED32", 13, 13, 1, enumC11691xb04);
        EnumC6239jT enumC6239jT15 = new EnumC6239jT("SFIXED64", 14, 14, 1, enumC11691xb03);
        EnumC6239jT enumC6239jT16 = new EnumC6239jT("SINT32", 15, 15, 1, enumC11691xb04);
        EnumC6239jT enumC6239jT17 = new EnumC6239jT("SINT64", 16, 16, 1, enumC11691xb03);
        EnumC6239jT enumC6239jT18 = new EnumC6239jT("GROUP", 17, 17, 1, enumC11691xb07);
        EnumC6239jT enumC6239jT19 = new EnumC6239jT("DOUBLE_LIST", 18, 18, 2, enumC11691xb0);
        EnumC6239jT enumC6239jT20 = new EnumC6239jT("FLOAT_LIST", 19, 19, 2, enumC11691xb02);
        EnumC6239jT enumC6239jT21 = new EnumC6239jT("INT64_LIST", 20, 20, 2, enumC11691xb03);
        EnumC6239jT enumC6239jT22 = new EnumC6239jT("UINT64_LIST", 21, 21, 2, enumC11691xb03);
        EnumC6239jT enumC6239jT23 = new EnumC6239jT("INT32_LIST", 22, 22, 2, enumC11691xb04);
        EnumC6239jT enumC6239jT24 = new EnumC6239jT("FIXED64_LIST", 23, 23, 2, enumC11691xb03);
        EnumC6239jT enumC6239jT25 = new EnumC6239jT("FIXED32_LIST", 24, 24, 2, enumC11691xb04);
        EnumC6239jT enumC6239jT26 = new EnumC6239jT("BOOL_LIST", 25, 25, 2, enumC11691xb05);
        EnumC6239jT enumC6239jT27 = new EnumC6239jT("STRING_LIST", 26, 26, 2, enumC11691xb06);
        EnumC6239jT enumC6239jT28 = new EnumC6239jT("MESSAGE_LIST", 27, 27, 2, enumC11691xb07);
        EnumC6239jT enumC6239jT29 = new EnumC6239jT("BYTES_LIST", 28, 28, 2, enumC11691xb08);
        EnumC6239jT enumC6239jT30 = new EnumC6239jT("UINT32_LIST", 29, 29, 2, enumC11691xb04);
        EnumC6239jT enumC6239jT31 = new EnumC6239jT("ENUM_LIST", 30, 30, 2, enumC11691xb09);
        EnumC6239jT enumC6239jT32 = new EnumC6239jT("SFIXED32_LIST", 31, 31, 2, enumC11691xb04);
        EnumC6239jT enumC6239jT33 = new EnumC6239jT("SFIXED64_LIST", 32, 32, 2, enumC11691xb03);
        EnumC6239jT enumC6239jT34 = new EnumC6239jT("SINT32_LIST", 33, 33, 2, enumC11691xb04);
        EnumC6239jT enumC6239jT35 = new EnumC6239jT("SINT64_LIST", 34, 34, 2, enumC11691xb03);
        EnumC6239jT enumC6239jT36 = new EnumC6239jT("DOUBLE_LIST_PACKED", 35, 35, 3, enumC11691xb0);
        f35153b = enumC6239jT36;
        EnumC6239jT enumC6239jT37 = new EnumC6239jT("FLOAT_LIST_PACKED", 36, 36, 3, enumC11691xb02);
        EnumC6239jT enumC6239jT38 = new EnumC6239jT("INT64_LIST_PACKED", 37, 37, 3, enumC11691xb03);
        EnumC6239jT enumC6239jT39 = new EnumC6239jT("UINT64_LIST_PACKED", 38, 38, 3, enumC11691xb03);
        EnumC6239jT enumC6239jT40 = new EnumC6239jT("INT32_LIST_PACKED", 39, 39, 3, enumC11691xb04);
        EnumC6239jT enumC6239jT41 = new EnumC6239jT("FIXED64_LIST_PACKED", 40, 40, 3, enumC11691xb03);
        EnumC6239jT enumC6239jT42 = new EnumC6239jT("FIXED32_LIST_PACKED", 41, 41, 3, enumC11691xb04);
        EnumC6239jT enumC6239jT43 = new EnumC6239jT("BOOL_LIST_PACKED", 42, 42, 3, enumC11691xb05);
        EnumC6239jT enumC6239jT44 = new EnumC6239jT("UINT32_LIST_PACKED", 43, 43, 3, enumC11691xb04);
        EnumC6239jT enumC6239jT45 = new EnumC6239jT("ENUM_LIST_PACKED", 44, 44, 3, enumC11691xb09);
        EnumC6239jT enumC6239jT46 = new EnumC6239jT("SFIXED32_LIST_PACKED", 45, 45, 3, enumC11691xb04);
        EnumC6239jT enumC6239jT47 = new EnumC6239jT("SFIXED64_LIST_PACKED", 46, 46, 3, enumC11691xb03);
        EnumC6239jT enumC6239jT48 = new EnumC6239jT("SINT32_LIST_PACKED", 47, 47, 3, enumC11691xb04);
        EnumC6239jT enumC6239jT49 = new EnumC6239jT("SINT64_LIST_PACKED", 48, 48, 3, enumC11691xb03);
        f35154c = enumC6239jT49;
        f35156e = new EnumC6239jT[]{enumC6239jT, enumC6239jT2, enumC6239jT3, enumC6239jT4, enumC6239jT5, enumC6239jT6, enumC6239jT7, enumC6239jT8, enumC6239jT9, enumC6239jT10, enumC6239jT11, enumC6239jT12, enumC6239jT13, enumC6239jT14, enumC6239jT15, enumC6239jT16, enumC6239jT17, enumC6239jT18, enumC6239jT19, enumC6239jT20, enumC6239jT21, enumC6239jT22, enumC6239jT23, enumC6239jT24, enumC6239jT25, enumC6239jT26, enumC6239jT27, enumC6239jT28, enumC6239jT29, enumC6239jT30, enumC6239jT31, enumC6239jT32, enumC6239jT33, enumC6239jT34, enumC6239jT35, enumC6239jT36, enumC6239jT37, enumC6239jT38, enumC6239jT39, enumC6239jT40, enumC6239jT41, enumC6239jT42, enumC6239jT43, enumC6239jT44, enumC6239jT45, enumC6239jT46, enumC6239jT47, enumC6239jT48, enumC6239jT49, new EnumC6239jT("GROUP_LIST", 49, 49, 2, enumC11691xb07), new EnumC6239jT("MAP", 50, 50, 4, EnumC11691xb0.VOID)};
        EnumC6239jT[] enumC6239jTArrValues = values();
        f35155d = new EnumC6239jT[enumC6239jTArrValues.length];
        for (EnumC6239jT enumC6239jT50 : enumC6239jTArrValues) {
            f35155d[enumC6239jT50.f35157a] = enumC6239jT50;
        }
    }

    public EnumC6239jT(String str, int i, int i2, int i3, EnumC11691xb0 enumC11691xb0) {
        this.f35157a = i2;
        int iM26247x = AbstractC7222ym.m26247x(i3);
        if (iM26247x == 1 || iM26247x == 3) {
            enumC11691xb0.getClass();
        }
        if (i3 == 1) {
            enumC11691xb0.ordinal();
        }
    }

    public static EnumC6239jT valueOf(String str) {
        return (EnumC6239jT) Enum.valueOf(EnumC6239jT.class, str);
    }

    public static EnumC6239jT[] values() {
        return (EnumC6239jT[]) f35156e.clone();
    }

    /* renamed from: a */
    public final int m22034a() {
        return this.f35157a;
    }
}
