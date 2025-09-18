package defpackage;

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
/* renamed from: iT, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC4350iT {
    public static final EnumC4350iT b;
    public static final EnumC4350iT c;
    public static final EnumC4350iT[] d;
    public static final /* synthetic */ EnumC4350iT[] e;
    public final int a;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC4350iT EF6;

    static {
        EnumC7633vb0 enumC7633vb0 = EnumC7633vb0.DOUBLE;
        EnumC4350iT enumC4350iT = new EnumC4350iT("DOUBLE", 0, 0, 1, enumC7633vb0);
        EnumC7633vb0 enumC7633vb02 = EnumC7633vb0.FLOAT;
        EnumC4350iT enumC4350iT2 = new EnumC4350iT("FLOAT", 1, 1, 1, enumC7633vb02);
        EnumC7633vb0 enumC7633vb03 = EnumC7633vb0.LONG;
        EnumC4350iT enumC4350iT3 = new EnumC4350iT("INT64", 2, 2, 1, enumC7633vb03);
        EnumC4350iT enumC4350iT4 = new EnumC4350iT("UINT64", 3, 3, 1, enumC7633vb03);
        EnumC7633vb0 enumC7633vb04 = EnumC7633vb0.INT;
        EnumC4350iT enumC4350iT5 = new EnumC4350iT("INT32", 4, 4, 1, enumC7633vb04);
        EnumC4350iT enumC4350iT6 = new EnumC4350iT("FIXED64", 5, 5, 1, enumC7633vb03);
        EnumC4350iT enumC4350iT7 = new EnumC4350iT("FIXED32", 6, 6, 1, enumC7633vb04);
        EnumC7633vb0 enumC7633vb05 = EnumC7633vb0.BOOLEAN;
        EnumC4350iT enumC4350iT8 = new EnumC4350iT("BOOL", 7, 7, 1, enumC7633vb05);
        EnumC7633vb0 enumC7633vb06 = EnumC7633vb0.STRING;
        EnumC4350iT enumC4350iT9 = new EnumC4350iT("STRING", 8, 8, 1, enumC7633vb06);
        EnumC7633vb0 enumC7633vb07 = EnumC7633vb0.MESSAGE;
        EnumC4350iT enumC4350iT10 = new EnumC4350iT("MESSAGE", 9, 9, 1, enumC7633vb07);
        EnumC7633vb0 enumC7633vb08 = EnumC7633vb0.BYTE_STRING;
        EnumC4350iT enumC4350iT11 = new EnumC4350iT("BYTES", 10, 10, 1, enumC7633vb08);
        EnumC4350iT enumC4350iT12 = new EnumC4350iT("UINT32", 11, 11, 1, enumC7633vb04);
        EnumC7633vb0 enumC7633vb09 = EnumC7633vb0.ENUM;
        EnumC4350iT enumC4350iT13 = new EnumC4350iT("ENUM", 12, 12, 1, enumC7633vb09);
        EnumC4350iT enumC4350iT14 = new EnumC4350iT("SFIXED32", 13, 13, 1, enumC7633vb04);
        EnumC4350iT enumC4350iT15 = new EnumC4350iT("SFIXED64", 14, 14, 1, enumC7633vb03);
        EnumC4350iT enumC4350iT16 = new EnumC4350iT("SINT32", 15, 15, 1, enumC7633vb04);
        EnumC4350iT enumC4350iT17 = new EnumC4350iT("SINT64", 16, 16, 1, enumC7633vb03);
        EnumC4350iT enumC4350iT18 = new EnumC4350iT("GROUP", 17, 17, 1, enumC7633vb07);
        EnumC4350iT enumC4350iT19 = new EnumC4350iT("DOUBLE_LIST", 18, 18, 2, enumC7633vb0);
        EnumC4350iT enumC4350iT20 = new EnumC4350iT("FLOAT_LIST", 19, 19, 2, enumC7633vb02);
        EnumC4350iT enumC4350iT21 = new EnumC4350iT("INT64_LIST", 20, 20, 2, enumC7633vb03);
        EnumC4350iT enumC4350iT22 = new EnumC4350iT("UINT64_LIST", 21, 21, 2, enumC7633vb03);
        EnumC4350iT enumC4350iT23 = new EnumC4350iT("INT32_LIST", 22, 22, 2, enumC7633vb04);
        EnumC4350iT enumC4350iT24 = new EnumC4350iT("FIXED64_LIST", 23, 23, 2, enumC7633vb03);
        EnumC4350iT enumC4350iT25 = new EnumC4350iT("FIXED32_LIST", 24, 24, 2, enumC7633vb04);
        EnumC4350iT enumC4350iT26 = new EnumC4350iT("BOOL_LIST", 25, 25, 2, enumC7633vb05);
        EnumC4350iT enumC4350iT27 = new EnumC4350iT("STRING_LIST", 26, 26, 2, enumC7633vb06);
        EnumC4350iT enumC4350iT28 = new EnumC4350iT("MESSAGE_LIST", 27, 27, 2, enumC7633vb07);
        EnumC4350iT enumC4350iT29 = new EnumC4350iT("BYTES_LIST", 28, 28, 2, enumC7633vb08);
        EnumC4350iT enumC4350iT30 = new EnumC4350iT("UINT32_LIST", 29, 29, 2, enumC7633vb04);
        EnumC4350iT enumC4350iT31 = new EnumC4350iT("ENUM_LIST", 30, 30, 2, enumC7633vb09);
        EnumC4350iT enumC4350iT32 = new EnumC4350iT("SFIXED32_LIST", 31, 31, 2, enumC7633vb04);
        EnumC4350iT enumC4350iT33 = new EnumC4350iT("SFIXED64_LIST", 32, 32, 2, enumC7633vb03);
        EnumC4350iT enumC4350iT34 = new EnumC4350iT("SINT32_LIST", 33, 33, 2, enumC7633vb04);
        EnumC4350iT enumC4350iT35 = new EnumC4350iT("SINT64_LIST", 34, 34, 2, enumC7633vb03);
        EnumC4350iT enumC4350iT36 = new EnumC4350iT("DOUBLE_LIST_PACKED", 35, 35, 3, enumC7633vb0);
        b = enumC4350iT36;
        EnumC4350iT enumC4350iT37 = new EnumC4350iT("FLOAT_LIST_PACKED", 36, 36, 3, enumC7633vb02);
        EnumC4350iT enumC4350iT38 = new EnumC4350iT("INT64_LIST_PACKED", 37, 37, 3, enumC7633vb03);
        EnumC4350iT enumC4350iT39 = new EnumC4350iT("UINT64_LIST_PACKED", 38, 38, 3, enumC7633vb03);
        EnumC4350iT enumC4350iT40 = new EnumC4350iT("INT32_LIST_PACKED", 39, 39, 3, enumC7633vb04);
        EnumC4350iT enumC4350iT41 = new EnumC4350iT("FIXED64_LIST_PACKED", 40, 40, 3, enumC7633vb03);
        EnumC4350iT enumC4350iT42 = new EnumC4350iT("FIXED32_LIST_PACKED", 41, 41, 3, enumC7633vb04);
        EnumC4350iT enumC4350iT43 = new EnumC4350iT("BOOL_LIST_PACKED", 42, 42, 3, enumC7633vb05);
        EnumC4350iT enumC4350iT44 = new EnumC4350iT("UINT32_LIST_PACKED", 43, 43, 3, enumC7633vb04);
        EnumC4350iT enumC4350iT45 = new EnumC4350iT("ENUM_LIST_PACKED", 44, 44, 3, enumC7633vb09);
        EnumC4350iT enumC4350iT46 = new EnumC4350iT("SFIXED32_LIST_PACKED", 45, 45, 3, enumC7633vb04);
        EnumC4350iT enumC4350iT47 = new EnumC4350iT("SFIXED64_LIST_PACKED", 46, 46, 3, enumC7633vb03);
        EnumC4350iT enumC4350iT48 = new EnumC4350iT("SINT32_LIST_PACKED", 47, 47, 3, enumC7633vb04);
        EnumC4350iT enumC4350iT49 = new EnumC4350iT("SINT64_LIST_PACKED", 48, 48, 3, enumC7633vb03);
        c = enumC4350iT49;
        e = new EnumC4350iT[]{enumC4350iT, enumC4350iT2, enumC4350iT3, enumC4350iT4, enumC4350iT5, enumC4350iT6, enumC4350iT7, enumC4350iT8, enumC4350iT9, enumC4350iT10, enumC4350iT11, enumC4350iT12, enumC4350iT13, enumC4350iT14, enumC4350iT15, enumC4350iT16, enumC4350iT17, enumC4350iT18, enumC4350iT19, enumC4350iT20, enumC4350iT21, enumC4350iT22, enumC4350iT23, enumC4350iT24, enumC4350iT25, enumC4350iT26, enumC4350iT27, enumC4350iT28, enumC4350iT29, enumC4350iT30, enumC4350iT31, enumC4350iT32, enumC4350iT33, enumC4350iT34, enumC4350iT35, enumC4350iT36, enumC4350iT37, enumC4350iT38, enumC4350iT39, enumC4350iT40, enumC4350iT41, enumC4350iT42, enumC4350iT43, enumC4350iT44, enumC4350iT45, enumC4350iT46, enumC4350iT47, enumC4350iT48, enumC4350iT49, new EnumC4350iT("GROUP_LIST", 49, 49, 2, enumC7633vb07), new EnumC4350iT("MAP", 50, 50, 4, EnumC7633vb0.VOID)};
        EnumC4350iT[] enumC4350iTArrValues = values();
        d = new EnumC4350iT[enumC4350iTArrValues.length];
        for (EnumC4350iT enumC4350iT50 : enumC4350iTArrValues) {
            d[enumC4350iT50.a] = enumC4350iT50;
        }
    }

    public EnumC4350iT(String str, int i, int i2, int i3, EnumC7633vb0 enumC7633vb0) {
        this.a = i2;
        int iX = AbstractC8235ym.x(i3);
        if (iX == 1 || iX == 3) {
            enumC7633vb0.getClass();
        }
        if (i3 == 1) {
            enumC7633vb0.ordinal();
        }
    }

    public static EnumC4350iT valueOf(String str) {
        return (EnumC4350iT) Enum.valueOf(EnumC4350iT.class, str);
    }

    public static EnumC4350iT[] values() {
        return (EnumC4350iT[]) e.clone();
    }

    public final int a() {
        return this.a;
    }
}
