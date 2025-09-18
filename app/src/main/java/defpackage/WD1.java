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
/* loaded from: classes.dex */
public final class WD1 {
    public static final WD1 b;
    public static final WD1 c;
    public static final WD1[] d;
    public static final /* synthetic */ WD1[] e;
    public final int a;

    /* JADX INFO: Fake field, exist only in values array */
    WD1 EF6;

    static {
        EnumC6423pF1 enumC6423pF1 = EnumC6423pF1.DOUBLE;
        WD1 wd1 = new WD1("DOUBLE", 0, 0, 1, enumC6423pF1);
        EnumC6423pF1 enumC6423pF12 = EnumC6423pF1.FLOAT;
        WD1 wd12 = new WD1("FLOAT", 1, 1, 1, enumC6423pF12);
        EnumC6423pF1 enumC6423pF13 = EnumC6423pF1.LONG;
        WD1 wd13 = new WD1("INT64", 2, 2, 1, enumC6423pF13);
        WD1 wd14 = new WD1("UINT64", 3, 3, 1, enumC6423pF13);
        EnumC6423pF1 enumC6423pF14 = EnumC6423pF1.INT;
        WD1 wd15 = new WD1("INT32", 4, 4, 1, enumC6423pF14);
        WD1 wd16 = new WD1("FIXED64", 5, 5, 1, enumC6423pF13);
        WD1 wd17 = new WD1("FIXED32", 6, 6, 1, enumC6423pF14);
        EnumC6423pF1 enumC6423pF15 = EnumC6423pF1.BOOLEAN;
        WD1 wd18 = new WD1("BOOL", 7, 7, 1, enumC6423pF15);
        EnumC6423pF1 enumC6423pF16 = EnumC6423pF1.STRING;
        WD1 wd19 = new WD1("STRING", 8, 8, 1, enumC6423pF16);
        EnumC6423pF1 enumC6423pF17 = EnumC6423pF1.MESSAGE;
        WD1 wd110 = new WD1("MESSAGE", 9, 9, 1, enumC6423pF17);
        EnumC6423pF1 enumC6423pF18 = EnumC6423pF1.BYTE_STRING;
        WD1 wd111 = new WD1("BYTES", 10, 10, 1, enumC6423pF18);
        WD1 wd112 = new WD1("UINT32", 11, 11, 1, enumC6423pF14);
        EnumC6423pF1 enumC6423pF19 = EnumC6423pF1.ENUM;
        WD1 wd113 = new WD1("ENUM", 12, 12, 1, enumC6423pF19);
        WD1 wd114 = new WD1("SFIXED32", 13, 13, 1, enumC6423pF14);
        WD1 wd115 = new WD1("SFIXED64", 14, 14, 1, enumC6423pF13);
        WD1 wd116 = new WD1("SINT32", 15, 15, 1, enumC6423pF14);
        WD1 wd117 = new WD1("SINT64", 16, 16, 1, enumC6423pF13);
        WD1 wd118 = new WD1("GROUP", 17, 17, 1, enumC6423pF17);
        WD1 wd119 = new WD1("DOUBLE_LIST", 18, 18, 2, enumC6423pF1);
        WD1 wd120 = new WD1("FLOAT_LIST", 19, 19, 2, enumC6423pF12);
        WD1 wd121 = new WD1("INT64_LIST", 20, 20, 2, enumC6423pF13);
        WD1 wd122 = new WD1("UINT64_LIST", 21, 21, 2, enumC6423pF13);
        WD1 wd123 = new WD1("INT32_LIST", 22, 22, 2, enumC6423pF14);
        WD1 wd124 = new WD1("FIXED64_LIST", 23, 23, 2, enumC6423pF13);
        WD1 wd125 = new WD1("FIXED32_LIST", 24, 24, 2, enumC6423pF14);
        WD1 wd126 = new WD1("BOOL_LIST", 25, 25, 2, enumC6423pF15);
        WD1 wd127 = new WD1("STRING_LIST", 26, 26, 2, enumC6423pF16);
        WD1 wd128 = new WD1("MESSAGE_LIST", 27, 27, 2, enumC6423pF17);
        WD1 wd129 = new WD1("BYTES_LIST", 28, 28, 2, enumC6423pF18);
        WD1 wd130 = new WD1("UINT32_LIST", 29, 29, 2, enumC6423pF14);
        WD1 wd131 = new WD1("ENUM_LIST", 30, 30, 2, enumC6423pF19);
        WD1 wd132 = new WD1("SFIXED32_LIST", 31, 31, 2, enumC6423pF14);
        WD1 wd133 = new WD1("SFIXED64_LIST", 32, 32, 2, enumC6423pF13);
        WD1 wd134 = new WD1("SINT32_LIST", 33, 33, 2, enumC6423pF14);
        WD1 wd135 = new WD1("SINT64_LIST", 34, 34, 2, enumC6423pF13);
        WD1 wd136 = new WD1("DOUBLE_LIST_PACKED", 35, 35, 3, enumC6423pF1);
        b = wd136;
        WD1 wd137 = new WD1("FLOAT_LIST_PACKED", 36, 36, 3, enumC6423pF12);
        WD1 wd138 = new WD1("INT64_LIST_PACKED", 37, 37, 3, enumC6423pF13);
        WD1 wd139 = new WD1("UINT64_LIST_PACKED", 38, 38, 3, enumC6423pF13);
        WD1 wd140 = new WD1("INT32_LIST_PACKED", 39, 39, 3, enumC6423pF14);
        WD1 wd141 = new WD1("FIXED64_LIST_PACKED", 40, 40, 3, enumC6423pF13);
        WD1 wd142 = new WD1("FIXED32_LIST_PACKED", 41, 41, 3, enumC6423pF14);
        WD1 wd143 = new WD1("BOOL_LIST_PACKED", 42, 42, 3, enumC6423pF15);
        WD1 wd144 = new WD1("UINT32_LIST_PACKED", 43, 43, 3, enumC6423pF14);
        WD1 wd145 = new WD1("ENUM_LIST_PACKED", 44, 44, 3, enumC6423pF19);
        WD1 wd146 = new WD1("SFIXED32_LIST_PACKED", 45, 45, 3, enumC6423pF14);
        WD1 wd147 = new WD1("SFIXED64_LIST_PACKED", 46, 46, 3, enumC6423pF13);
        WD1 wd148 = new WD1("SINT32_LIST_PACKED", 47, 47, 3, enumC6423pF14);
        WD1 wd149 = new WD1("SINT64_LIST_PACKED", 48, 48, 3, enumC6423pF13);
        c = wd149;
        e = new WD1[]{wd1, wd12, wd13, wd14, wd15, wd16, wd17, wd18, wd19, wd110, wd111, wd112, wd113, wd114, wd115, wd116, wd117, wd118, wd119, wd120, wd121, wd122, wd123, wd124, wd125, wd126, wd127, wd128, wd129, wd130, wd131, wd132, wd133, wd134, wd135, wd136, wd137, wd138, wd139, wd140, wd141, wd142, wd143, wd144, wd145, wd146, wd147, wd148, wd149, new WD1("GROUP_LIST", 49, 49, 2, enumC6423pF17), new WD1("MAP", 50, 50, 4, EnumC6423pF1.VOID)};
        WD1[] wd1ArrValues = values();
        d = new WD1[wd1ArrValues.length];
        for (WD1 wd150 : wd1ArrValues) {
            d[wd150.a] = wd150;
        }
    }

    public WD1(String str, int i, int i2, int i3, EnumC6423pF1 enumC6423pF1) {
        this.a = i2;
        int i4 = i3 - 1;
        if (i4 == 1 || i4 == 3) {
            enumC6423pF1.getClass();
        }
        if (i3 == 1) {
            EnumC6423pF1 enumC6423pF12 = EnumC6423pF1.VOID;
            enumC6423pF1.ordinal();
        }
    }

    public static WD1[] values() {
        return (WD1[]) e.clone();
    }

    public final int a() {
        return this.a;
    }
}
