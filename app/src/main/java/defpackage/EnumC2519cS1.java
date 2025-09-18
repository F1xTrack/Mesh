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
/* renamed from: cS1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC2519cS1 {
    public static final EnumC2519cS1 b;
    public static final EnumC2519cS1 c;
    public static final EnumC2519cS1[] d;
    public static final /* synthetic */ EnumC2519cS1[] e;
    public final int a;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC2519cS1 EF6;

    static {
        EnumC2332bT1 enumC2332bT1 = EnumC2332bT1.e;
        EnumC2519cS1 enumC2519cS1 = new EnumC2519cS1("DOUBLE", 0, 0, 1, enumC2332bT1);
        EnumC2332bT1 enumC2332bT12 = EnumC2332bT1.d;
        EnumC2519cS1 enumC2519cS12 = new EnumC2519cS1("FLOAT", 1, 1, 1, enumC2332bT12);
        EnumC2332bT1 enumC2332bT13 = EnumC2332bT1.c;
        EnumC2519cS1 enumC2519cS13 = new EnumC2519cS1("INT64", 2, 2, 1, enumC2332bT13);
        EnumC2519cS1 enumC2519cS14 = new EnumC2519cS1("UINT64", 3, 3, 1, enumC2332bT13);
        EnumC2332bT1 enumC2332bT14 = EnumC2332bT1.b;
        EnumC2519cS1 enumC2519cS15 = new EnumC2519cS1("INT32", 4, 4, 1, enumC2332bT14);
        EnumC2519cS1 enumC2519cS16 = new EnumC2519cS1("FIXED64", 5, 5, 1, enumC2332bT13);
        EnumC2519cS1 enumC2519cS17 = new EnumC2519cS1("FIXED32", 6, 6, 1, enumC2332bT14);
        EnumC2332bT1 enumC2332bT15 = EnumC2332bT1.f;
        EnumC2519cS1 enumC2519cS18 = new EnumC2519cS1("BOOL", 7, 7, 1, enumC2332bT15);
        EnumC2332bT1 enumC2332bT16 = EnumC2332bT1.g;
        EnumC2519cS1 enumC2519cS19 = new EnumC2519cS1("STRING", 8, 8, 1, enumC2332bT16);
        EnumC2332bT1 enumC2332bT17 = EnumC2332bT1.j;
        EnumC2519cS1 enumC2519cS110 = new EnumC2519cS1("MESSAGE", 9, 9, 1, enumC2332bT17);
        EnumC2332bT1 enumC2332bT18 = EnumC2332bT1.h;
        EnumC2519cS1 enumC2519cS111 = new EnumC2519cS1("BYTES", 10, 10, 1, enumC2332bT18);
        EnumC2519cS1 enumC2519cS112 = new EnumC2519cS1("UINT32", 11, 11, 1, enumC2332bT14);
        EnumC2332bT1 enumC2332bT19 = EnumC2332bT1.i;
        EnumC2519cS1 enumC2519cS113 = new EnumC2519cS1("ENUM", 12, 12, 1, enumC2332bT19);
        EnumC2519cS1 enumC2519cS114 = new EnumC2519cS1("SFIXED32", 13, 13, 1, enumC2332bT14);
        EnumC2519cS1 enumC2519cS115 = new EnumC2519cS1("SFIXED64", 14, 14, 1, enumC2332bT13);
        EnumC2519cS1 enumC2519cS116 = new EnumC2519cS1("SINT32", 15, 15, 1, enumC2332bT14);
        EnumC2519cS1 enumC2519cS117 = new EnumC2519cS1("SINT64", 16, 16, 1, enumC2332bT13);
        EnumC2519cS1 enumC2519cS118 = new EnumC2519cS1("GROUP", 17, 17, 1, enumC2332bT17);
        EnumC2519cS1 enumC2519cS119 = new EnumC2519cS1("DOUBLE_LIST", 18, 18, 2, enumC2332bT1);
        EnumC2519cS1 enumC2519cS120 = new EnumC2519cS1("FLOAT_LIST", 19, 19, 2, enumC2332bT12);
        EnumC2519cS1 enumC2519cS121 = new EnumC2519cS1("INT64_LIST", 20, 20, 2, enumC2332bT13);
        EnumC2519cS1 enumC2519cS122 = new EnumC2519cS1("UINT64_LIST", 21, 21, 2, enumC2332bT13);
        EnumC2519cS1 enumC2519cS123 = new EnumC2519cS1("INT32_LIST", 22, 22, 2, enumC2332bT14);
        EnumC2519cS1 enumC2519cS124 = new EnumC2519cS1("FIXED64_LIST", 23, 23, 2, enumC2332bT13);
        EnumC2519cS1 enumC2519cS125 = new EnumC2519cS1("FIXED32_LIST", 24, 24, 2, enumC2332bT14);
        EnumC2519cS1 enumC2519cS126 = new EnumC2519cS1("BOOL_LIST", 25, 25, 2, enumC2332bT15);
        EnumC2519cS1 enumC2519cS127 = new EnumC2519cS1("STRING_LIST", 26, 26, 2, enumC2332bT16);
        EnumC2519cS1 enumC2519cS128 = new EnumC2519cS1("MESSAGE_LIST", 27, 27, 2, enumC2332bT17);
        EnumC2519cS1 enumC2519cS129 = new EnumC2519cS1("BYTES_LIST", 28, 28, 2, enumC2332bT18);
        EnumC2519cS1 enumC2519cS130 = new EnumC2519cS1("UINT32_LIST", 29, 29, 2, enumC2332bT14);
        EnumC2519cS1 enumC2519cS131 = new EnumC2519cS1("ENUM_LIST", 30, 30, 2, enumC2332bT19);
        EnumC2519cS1 enumC2519cS132 = new EnumC2519cS1("SFIXED32_LIST", 31, 31, 2, enumC2332bT14);
        EnumC2519cS1 enumC2519cS133 = new EnumC2519cS1("SFIXED64_LIST", 32, 32, 2, enumC2332bT13);
        EnumC2519cS1 enumC2519cS134 = new EnumC2519cS1("SINT32_LIST", 33, 33, 2, enumC2332bT14);
        EnumC2519cS1 enumC2519cS135 = new EnumC2519cS1("SINT64_LIST", 34, 34, 2, enumC2332bT13);
        EnumC2519cS1 enumC2519cS136 = new EnumC2519cS1("DOUBLE_LIST_PACKED", 35, 35, 3, enumC2332bT1);
        b = enumC2519cS136;
        EnumC2519cS1 enumC2519cS137 = new EnumC2519cS1("FLOAT_LIST_PACKED", 36, 36, 3, enumC2332bT12);
        EnumC2519cS1 enumC2519cS138 = new EnumC2519cS1("INT64_LIST_PACKED", 37, 37, 3, enumC2332bT13);
        EnumC2519cS1 enumC2519cS139 = new EnumC2519cS1("UINT64_LIST_PACKED", 38, 38, 3, enumC2332bT13);
        EnumC2519cS1 enumC2519cS140 = new EnumC2519cS1("INT32_LIST_PACKED", 39, 39, 3, enumC2332bT14);
        EnumC2519cS1 enumC2519cS141 = new EnumC2519cS1("FIXED64_LIST_PACKED", 40, 40, 3, enumC2332bT13);
        EnumC2519cS1 enumC2519cS142 = new EnumC2519cS1("FIXED32_LIST_PACKED", 41, 41, 3, enumC2332bT14);
        EnumC2519cS1 enumC2519cS143 = new EnumC2519cS1("BOOL_LIST_PACKED", 42, 42, 3, enumC2332bT15);
        EnumC2519cS1 enumC2519cS144 = new EnumC2519cS1("UINT32_LIST_PACKED", 43, 43, 3, enumC2332bT14);
        EnumC2519cS1 enumC2519cS145 = new EnumC2519cS1("ENUM_LIST_PACKED", 44, 44, 3, enumC2332bT19);
        EnumC2519cS1 enumC2519cS146 = new EnumC2519cS1("SFIXED32_LIST_PACKED", 45, 45, 3, enumC2332bT14);
        EnumC2519cS1 enumC2519cS147 = new EnumC2519cS1("SFIXED64_LIST_PACKED", 46, 46, 3, enumC2332bT13);
        EnumC2519cS1 enumC2519cS148 = new EnumC2519cS1("SINT32_LIST_PACKED", 47, 47, 3, enumC2332bT14);
        EnumC2519cS1 enumC2519cS149 = new EnumC2519cS1("SINT64_LIST_PACKED", 48, 48, 3, enumC2332bT13);
        c = enumC2519cS149;
        e = new EnumC2519cS1[]{enumC2519cS1, enumC2519cS12, enumC2519cS13, enumC2519cS14, enumC2519cS15, enumC2519cS16, enumC2519cS17, enumC2519cS18, enumC2519cS19, enumC2519cS110, enumC2519cS111, enumC2519cS112, enumC2519cS113, enumC2519cS114, enumC2519cS115, enumC2519cS116, enumC2519cS117, enumC2519cS118, enumC2519cS119, enumC2519cS120, enumC2519cS121, enumC2519cS122, enumC2519cS123, enumC2519cS124, enumC2519cS125, enumC2519cS126, enumC2519cS127, enumC2519cS128, enumC2519cS129, enumC2519cS130, enumC2519cS131, enumC2519cS132, enumC2519cS133, enumC2519cS134, enumC2519cS135, enumC2519cS136, enumC2519cS137, enumC2519cS138, enumC2519cS139, enumC2519cS140, enumC2519cS141, enumC2519cS142, enumC2519cS143, enumC2519cS144, enumC2519cS145, enumC2519cS146, enumC2519cS147, enumC2519cS148, enumC2519cS149, new EnumC2519cS1("GROUP_LIST", 49, 49, 2, enumC2332bT17), new EnumC2519cS1("MAP", 50, 50, 4, EnumC2332bT1.a)};
        EnumC2519cS1[] enumC2519cS1ArrValues = values();
        d = new EnumC2519cS1[enumC2519cS1ArrValues.length];
        for (EnumC2519cS1 enumC2519cS150 : enumC2519cS1ArrValues) {
            d[enumC2519cS150.a] = enumC2519cS150;
        }
    }

    public EnumC2519cS1(String str, int i, int i2, int i3, EnumC2332bT1 enumC2332bT1) {
        this.a = i2;
        int iX = AbstractC8235ym.x(i3);
        if (iX == 1 || iX == 3) {
            enumC2332bT1.getClass();
        }
        if (i3 == 1) {
            int i4 = AbstractC2138aS1.a[enumC2332bT1.ordinal()];
        }
    }

    public static EnumC2519cS1[] values() {
        return (EnumC2519cS1[]) e.clone();
    }

    public final int a() {
        return this.a;
    }
}
