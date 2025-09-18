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
/* renamed from: jT, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC5317jT {
    public static final EnumC5317jT b;
    public static final EnumC5317jT c;
    public static final EnumC5317jT[] d;
    public static final /* synthetic */ EnumC5317jT[] e;
    public final int a;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC5317jT EF6;

    static {
        EnumC8013xb0 enumC8013xb0 = EnumC8013xb0.DOUBLE;
        EnumC5317jT enumC5317jT = new EnumC5317jT("DOUBLE", 0, 0, 1, enumC8013xb0);
        EnumC8013xb0 enumC8013xb02 = EnumC8013xb0.FLOAT;
        EnumC5317jT enumC5317jT2 = new EnumC5317jT("FLOAT", 1, 1, 1, enumC8013xb02);
        EnumC8013xb0 enumC8013xb03 = EnumC8013xb0.LONG;
        EnumC5317jT enumC5317jT3 = new EnumC5317jT("INT64", 2, 2, 1, enumC8013xb03);
        EnumC5317jT enumC5317jT4 = new EnumC5317jT("UINT64", 3, 3, 1, enumC8013xb03);
        EnumC8013xb0 enumC8013xb04 = EnumC8013xb0.INT;
        EnumC5317jT enumC5317jT5 = new EnumC5317jT("INT32", 4, 4, 1, enumC8013xb04);
        EnumC5317jT enumC5317jT6 = new EnumC5317jT("FIXED64", 5, 5, 1, enumC8013xb03);
        EnumC5317jT enumC5317jT7 = new EnumC5317jT("FIXED32", 6, 6, 1, enumC8013xb04);
        EnumC8013xb0 enumC8013xb05 = EnumC8013xb0.BOOLEAN;
        EnumC5317jT enumC5317jT8 = new EnumC5317jT("BOOL", 7, 7, 1, enumC8013xb05);
        EnumC8013xb0 enumC8013xb06 = EnumC8013xb0.STRING;
        EnumC5317jT enumC5317jT9 = new EnumC5317jT("STRING", 8, 8, 1, enumC8013xb06);
        EnumC8013xb0 enumC8013xb07 = EnumC8013xb0.MESSAGE;
        EnumC5317jT enumC5317jT10 = new EnumC5317jT("MESSAGE", 9, 9, 1, enumC8013xb07);
        EnumC8013xb0 enumC8013xb08 = EnumC8013xb0.BYTE_STRING;
        EnumC5317jT enumC5317jT11 = new EnumC5317jT("BYTES", 10, 10, 1, enumC8013xb08);
        EnumC5317jT enumC5317jT12 = new EnumC5317jT("UINT32", 11, 11, 1, enumC8013xb04);
        EnumC8013xb0 enumC8013xb09 = EnumC8013xb0.ENUM;
        EnumC5317jT enumC5317jT13 = new EnumC5317jT("ENUM", 12, 12, 1, enumC8013xb09);
        EnumC5317jT enumC5317jT14 = new EnumC5317jT("SFIXED32", 13, 13, 1, enumC8013xb04);
        EnumC5317jT enumC5317jT15 = new EnumC5317jT("SFIXED64", 14, 14, 1, enumC8013xb03);
        EnumC5317jT enumC5317jT16 = new EnumC5317jT("SINT32", 15, 15, 1, enumC8013xb04);
        EnumC5317jT enumC5317jT17 = new EnumC5317jT("SINT64", 16, 16, 1, enumC8013xb03);
        EnumC5317jT enumC5317jT18 = new EnumC5317jT("GROUP", 17, 17, 1, enumC8013xb07);
        EnumC5317jT enumC5317jT19 = new EnumC5317jT("DOUBLE_LIST", 18, 18, 2, enumC8013xb0);
        EnumC5317jT enumC5317jT20 = new EnumC5317jT("FLOAT_LIST", 19, 19, 2, enumC8013xb02);
        EnumC5317jT enumC5317jT21 = new EnumC5317jT("INT64_LIST", 20, 20, 2, enumC8013xb03);
        EnumC5317jT enumC5317jT22 = new EnumC5317jT("UINT64_LIST", 21, 21, 2, enumC8013xb03);
        EnumC5317jT enumC5317jT23 = new EnumC5317jT("INT32_LIST", 22, 22, 2, enumC8013xb04);
        EnumC5317jT enumC5317jT24 = new EnumC5317jT("FIXED64_LIST", 23, 23, 2, enumC8013xb03);
        EnumC5317jT enumC5317jT25 = new EnumC5317jT("FIXED32_LIST", 24, 24, 2, enumC8013xb04);
        EnumC5317jT enumC5317jT26 = new EnumC5317jT("BOOL_LIST", 25, 25, 2, enumC8013xb05);
        EnumC5317jT enumC5317jT27 = new EnumC5317jT("STRING_LIST", 26, 26, 2, enumC8013xb06);
        EnumC5317jT enumC5317jT28 = new EnumC5317jT("MESSAGE_LIST", 27, 27, 2, enumC8013xb07);
        EnumC5317jT enumC5317jT29 = new EnumC5317jT("BYTES_LIST", 28, 28, 2, enumC8013xb08);
        EnumC5317jT enumC5317jT30 = new EnumC5317jT("UINT32_LIST", 29, 29, 2, enumC8013xb04);
        EnumC5317jT enumC5317jT31 = new EnumC5317jT("ENUM_LIST", 30, 30, 2, enumC8013xb09);
        EnumC5317jT enumC5317jT32 = new EnumC5317jT("SFIXED32_LIST", 31, 31, 2, enumC8013xb04);
        EnumC5317jT enumC5317jT33 = new EnumC5317jT("SFIXED64_LIST", 32, 32, 2, enumC8013xb03);
        EnumC5317jT enumC5317jT34 = new EnumC5317jT("SINT32_LIST", 33, 33, 2, enumC8013xb04);
        EnumC5317jT enumC5317jT35 = new EnumC5317jT("SINT64_LIST", 34, 34, 2, enumC8013xb03);
        EnumC5317jT enumC5317jT36 = new EnumC5317jT("DOUBLE_LIST_PACKED", 35, 35, 3, enumC8013xb0);
        b = enumC5317jT36;
        EnumC5317jT enumC5317jT37 = new EnumC5317jT("FLOAT_LIST_PACKED", 36, 36, 3, enumC8013xb02);
        EnumC5317jT enumC5317jT38 = new EnumC5317jT("INT64_LIST_PACKED", 37, 37, 3, enumC8013xb03);
        EnumC5317jT enumC5317jT39 = new EnumC5317jT("UINT64_LIST_PACKED", 38, 38, 3, enumC8013xb03);
        EnumC5317jT enumC5317jT40 = new EnumC5317jT("INT32_LIST_PACKED", 39, 39, 3, enumC8013xb04);
        EnumC5317jT enumC5317jT41 = new EnumC5317jT("FIXED64_LIST_PACKED", 40, 40, 3, enumC8013xb03);
        EnumC5317jT enumC5317jT42 = new EnumC5317jT("FIXED32_LIST_PACKED", 41, 41, 3, enumC8013xb04);
        EnumC5317jT enumC5317jT43 = new EnumC5317jT("BOOL_LIST_PACKED", 42, 42, 3, enumC8013xb05);
        EnumC5317jT enumC5317jT44 = new EnumC5317jT("UINT32_LIST_PACKED", 43, 43, 3, enumC8013xb04);
        EnumC5317jT enumC5317jT45 = new EnumC5317jT("ENUM_LIST_PACKED", 44, 44, 3, enumC8013xb09);
        EnumC5317jT enumC5317jT46 = new EnumC5317jT("SFIXED32_LIST_PACKED", 45, 45, 3, enumC8013xb04);
        EnumC5317jT enumC5317jT47 = new EnumC5317jT("SFIXED64_LIST_PACKED", 46, 46, 3, enumC8013xb03);
        EnumC5317jT enumC5317jT48 = new EnumC5317jT("SINT32_LIST_PACKED", 47, 47, 3, enumC8013xb04);
        EnumC5317jT enumC5317jT49 = new EnumC5317jT("SINT64_LIST_PACKED", 48, 48, 3, enumC8013xb03);
        c = enumC5317jT49;
        e = new EnumC5317jT[]{enumC5317jT, enumC5317jT2, enumC5317jT3, enumC5317jT4, enumC5317jT5, enumC5317jT6, enumC5317jT7, enumC5317jT8, enumC5317jT9, enumC5317jT10, enumC5317jT11, enumC5317jT12, enumC5317jT13, enumC5317jT14, enumC5317jT15, enumC5317jT16, enumC5317jT17, enumC5317jT18, enumC5317jT19, enumC5317jT20, enumC5317jT21, enumC5317jT22, enumC5317jT23, enumC5317jT24, enumC5317jT25, enumC5317jT26, enumC5317jT27, enumC5317jT28, enumC5317jT29, enumC5317jT30, enumC5317jT31, enumC5317jT32, enumC5317jT33, enumC5317jT34, enumC5317jT35, enumC5317jT36, enumC5317jT37, enumC5317jT38, enumC5317jT39, enumC5317jT40, enumC5317jT41, enumC5317jT42, enumC5317jT43, enumC5317jT44, enumC5317jT45, enumC5317jT46, enumC5317jT47, enumC5317jT48, enumC5317jT49, new EnumC5317jT("GROUP_LIST", 49, 49, 2, enumC8013xb07), new EnumC5317jT("MAP", 50, 50, 4, EnumC8013xb0.VOID)};
        EnumC5317jT[] enumC5317jTArrValues = values();
        d = new EnumC5317jT[enumC5317jTArrValues.length];
        for (EnumC5317jT enumC5317jT50 : enumC5317jTArrValues) {
            d[enumC5317jT50.a] = enumC5317jT50;
        }
    }

    public EnumC5317jT(String str, int i, int i2, int i3, EnumC8013xb0 enumC8013xb0) {
        this.a = i2;
        int iX = AbstractC8235ym.x(i3);
        if (iX == 1 || iX == 3) {
            enumC8013xb0.getClass();
        }
        if (i3 == 1) {
            enumC8013xb0.ordinal();
        }
    }

    public static EnumC5317jT valueOf(String str) {
        return (EnumC5317jT) Enum.valueOf(EnumC5317jT.class, str);
    }

    public static EnumC5317jT[] values() {
        return (EnumC5317jT[]) e.clone();
    }

    public final int a() {
        return this.a;
    }
}
