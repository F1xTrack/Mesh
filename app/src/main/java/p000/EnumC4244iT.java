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
/* renamed from: iT */
/* loaded from: classes.dex */
public final class EnumC4244iT {

    /* renamed from: b */
    public static final EnumC4244iT f29138b;

    /* renamed from: c */
    public static final EnumC4244iT f29139c;

    /* renamed from: d */
    public static final EnumC4244iT[] f29140d;

    /* renamed from: e */
    public static final /* synthetic */ EnumC4244iT[] f29141e;

    /* renamed from: a */
    public final int f29142a;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC4244iT EF6;

    static {
        EnumC11437vb0 enumC11437vb0 = EnumC11437vb0.DOUBLE;
        EnumC4244iT enumC4244iT = new EnumC4244iT("DOUBLE", 0, 0, 1, enumC11437vb0);
        EnumC11437vb0 enumC11437vb02 = EnumC11437vb0.FLOAT;
        EnumC4244iT enumC4244iT2 = new EnumC4244iT("FLOAT", 1, 1, 1, enumC11437vb02);
        EnumC11437vb0 enumC11437vb03 = EnumC11437vb0.LONG;
        EnumC4244iT enumC4244iT3 = new EnumC4244iT("INT64", 2, 2, 1, enumC11437vb03);
        EnumC4244iT enumC4244iT4 = new EnumC4244iT("UINT64", 3, 3, 1, enumC11437vb03);
        EnumC11437vb0 enumC11437vb04 = EnumC11437vb0.INT;
        EnumC4244iT enumC4244iT5 = new EnumC4244iT("INT32", 4, 4, 1, enumC11437vb04);
        EnumC4244iT enumC4244iT6 = new EnumC4244iT("FIXED64", 5, 5, 1, enumC11437vb03);
        EnumC4244iT enumC4244iT7 = new EnumC4244iT("FIXED32", 6, 6, 1, enumC11437vb04);
        EnumC11437vb0 enumC11437vb05 = EnumC11437vb0.BOOLEAN;
        EnumC4244iT enumC4244iT8 = new EnumC4244iT("BOOL", 7, 7, 1, enumC11437vb05);
        EnumC11437vb0 enumC11437vb06 = EnumC11437vb0.STRING;
        EnumC4244iT enumC4244iT9 = new EnumC4244iT("STRING", 8, 8, 1, enumC11437vb06);
        EnumC11437vb0 enumC11437vb07 = EnumC11437vb0.MESSAGE;
        EnumC4244iT enumC4244iT10 = new EnumC4244iT("MESSAGE", 9, 9, 1, enumC11437vb07);
        EnumC11437vb0 enumC11437vb08 = EnumC11437vb0.BYTE_STRING;
        EnumC4244iT enumC4244iT11 = new EnumC4244iT("BYTES", 10, 10, 1, enumC11437vb08);
        EnumC4244iT enumC4244iT12 = new EnumC4244iT("UINT32", 11, 11, 1, enumC11437vb04);
        EnumC11437vb0 enumC11437vb09 = EnumC11437vb0.ENUM;
        EnumC4244iT enumC4244iT13 = new EnumC4244iT("ENUM", 12, 12, 1, enumC11437vb09);
        EnumC4244iT enumC4244iT14 = new EnumC4244iT("SFIXED32", 13, 13, 1, enumC11437vb04);
        EnumC4244iT enumC4244iT15 = new EnumC4244iT("SFIXED64", 14, 14, 1, enumC11437vb03);
        EnumC4244iT enumC4244iT16 = new EnumC4244iT("SINT32", 15, 15, 1, enumC11437vb04);
        EnumC4244iT enumC4244iT17 = new EnumC4244iT("SINT64", 16, 16, 1, enumC11437vb03);
        EnumC4244iT enumC4244iT18 = new EnumC4244iT("GROUP", 17, 17, 1, enumC11437vb07);
        EnumC4244iT enumC4244iT19 = new EnumC4244iT("DOUBLE_LIST", 18, 18, 2, enumC11437vb0);
        EnumC4244iT enumC4244iT20 = new EnumC4244iT("FLOAT_LIST", 19, 19, 2, enumC11437vb02);
        EnumC4244iT enumC4244iT21 = new EnumC4244iT("INT64_LIST", 20, 20, 2, enumC11437vb03);
        EnumC4244iT enumC4244iT22 = new EnumC4244iT("UINT64_LIST", 21, 21, 2, enumC11437vb03);
        EnumC4244iT enumC4244iT23 = new EnumC4244iT("INT32_LIST", 22, 22, 2, enumC11437vb04);
        EnumC4244iT enumC4244iT24 = new EnumC4244iT("FIXED64_LIST", 23, 23, 2, enumC11437vb03);
        EnumC4244iT enumC4244iT25 = new EnumC4244iT("FIXED32_LIST", 24, 24, 2, enumC11437vb04);
        EnumC4244iT enumC4244iT26 = new EnumC4244iT("BOOL_LIST", 25, 25, 2, enumC11437vb05);
        EnumC4244iT enumC4244iT27 = new EnumC4244iT("STRING_LIST", 26, 26, 2, enumC11437vb06);
        EnumC4244iT enumC4244iT28 = new EnumC4244iT("MESSAGE_LIST", 27, 27, 2, enumC11437vb07);
        EnumC4244iT enumC4244iT29 = new EnumC4244iT("BYTES_LIST", 28, 28, 2, enumC11437vb08);
        EnumC4244iT enumC4244iT30 = new EnumC4244iT("UINT32_LIST", 29, 29, 2, enumC11437vb04);
        EnumC4244iT enumC4244iT31 = new EnumC4244iT("ENUM_LIST", 30, 30, 2, enumC11437vb09);
        EnumC4244iT enumC4244iT32 = new EnumC4244iT("SFIXED32_LIST", 31, 31, 2, enumC11437vb04);
        EnumC4244iT enumC4244iT33 = new EnumC4244iT("SFIXED64_LIST", 32, 32, 2, enumC11437vb03);
        EnumC4244iT enumC4244iT34 = new EnumC4244iT("SINT32_LIST", 33, 33, 2, enumC11437vb04);
        EnumC4244iT enumC4244iT35 = new EnumC4244iT("SINT64_LIST", 34, 34, 2, enumC11437vb03);
        EnumC4244iT enumC4244iT36 = new EnumC4244iT("DOUBLE_LIST_PACKED", 35, 35, 3, enumC11437vb0);
        f29138b = enumC4244iT36;
        EnumC4244iT enumC4244iT37 = new EnumC4244iT("FLOAT_LIST_PACKED", 36, 36, 3, enumC11437vb02);
        EnumC4244iT enumC4244iT38 = new EnumC4244iT("INT64_LIST_PACKED", 37, 37, 3, enumC11437vb03);
        EnumC4244iT enumC4244iT39 = new EnumC4244iT("UINT64_LIST_PACKED", 38, 38, 3, enumC11437vb03);
        EnumC4244iT enumC4244iT40 = new EnumC4244iT("INT32_LIST_PACKED", 39, 39, 3, enumC11437vb04);
        EnumC4244iT enumC4244iT41 = new EnumC4244iT("FIXED64_LIST_PACKED", 40, 40, 3, enumC11437vb03);
        EnumC4244iT enumC4244iT42 = new EnumC4244iT("FIXED32_LIST_PACKED", 41, 41, 3, enumC11437vb04);
        EnumC4244iT enumC4244iT43 = new EnumC4244iT("BOOL_LIST_PACKED", 42, 42, 3, enumC11437vb05);
        EnumC4244iT enumC4244iT44 = new EnumC4244iT("UINT32_LIST_PACKED", 43, 43, 3, enumC11437vb04);
        EnumC4244iT enumC4244iT45 = new EnumC4244iT("ENUM_LIST_PACKED", 44, 44, 3, enumC11437vb09);
        EnumC4244iT enumC4244iT46 = new EnumC4244iT("SFIXED32_LIST_PACKED", 45, 45, 3, enumC11437vb04);
        EnumC4244iT enumC4244iT47 = new EnumC4244iT("SFIXED64_LIST_PACKED", 46, 46, 3, enumC11437vb03);
        EnumC4244iT enumC4244iT48 = new EnumC4244iT("SINT32_LIST_PACKED", 47, 47, 3, enumC11437vb04);
        EnumC4244iT enumC4244iT49 = new EnumC4244iT("SINT64_LIST_PACKED", 48, 48, 3, enumC11437vb03);
        f29139c = enumC4244iT49;
        f29141e = new EnumC4244iT[]{enumC4244iT, enumC4244iT2, enumC4244iT3, enumC4244iT4, enumC4244iT5, enumC4244iT6, enumC4244iT7, enumC4244iT8, enumC4244iT9, enumC4244iT10, enumC4244iT11, enumC4244iT12, enumC4244iT13, enumC4244iT14, enumC4244iT15, enumC4244iT16, enumC4244iT17, enumC4244iT18, enumC4244iT19, enumC4244iT20, enumC4244iT21, enumC4244iT22, enumC4244iT23, enumC4244iT24, enumC4244iT25, enumC4244iT26, enumC4244iT27, enumC4244iT28, enumC4244iT29, enumC4244iT30, enumC4244iT31, enumC4244iT32, enumC4244iT33, enumC4244iT34, enumC4244iT35, enumC4244iT36, enumC4244iT37, enumC4244iT38, enumC4244iT39, enumC4244iT40, enumC4244iT41, enumC4244iT42, enumC4244iT43, enumC4244iT44, enumC4244iT45, enumC4244iT46, enumC4244iT47, enumC4244iT48, enumC4244iT49, new EnumC4244iT("GROUP_LIST", 49, 49, 2, enumC11437vb07), new EnumC4244iT("MAP", 50, 50, 4, EnumC11437vb0.VOID)};
        EnumC4244iT[] enumC4244iTArrValues = values();
        f29140d = new EnumC4244iT[enumC4244iTArrValues.length];
        for (EnumC4244iT enumC4244iT50 : enumC4244iTArrValues) {
            f29140d[enumC4244iT50.f29142a] = enumC4244iT50;
        }
    }

    public EnumC4244iT(String str, int i, int i2, int i3, EnumC11437vb0 enumC11437vb0) {
        this.f29142a = i2;
        int iM26247x = AbstractC7222ym.m26247x(i3);
        if (iM26247x == 1 || iM26247x == 3) {
            enumC11437vb0.getClass();
        }
        if (i3 == 1) {
            enumC11437vb0.ordinal();
        }
    }

    public static EnumC4244iT valueOf(String str) {
        return (EnumC4244iT) Enum.valueOf(EnumC4244iT.class, str);
    }

    public static EnumC4244iT[] values() {
        return (EnumC4244iT[]) f29141e.clone();
    }

    /* renamed from: a */
    public final int m19048a() {
        return this.f29142a;
    }
}
