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
/* renamed from: cS1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC8983cS1 {

    /* renamed from: b */
    public static final EnumC8983cS1 f17524b;

    /* renamed from: c */
    public static final EnumC8983cS1 f17525c;

    /* renamed from: d */
    public static final EnumC8983cS1[] f17526d;

    /* renamed from: e */
    public static final /* synthetic */ EnumC8983cS1[] f17527e;

    /* renamed from: a */
    public final int f17528a;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC8983cS1 EF6;

    static {
        EnumC8857bT1 enumC8857bT1 = EnumC8857bT1.f17041e;
        EnumC8983cS1 enumC8983cS1 = new EnumC8983cS1("DOUBLE", 0, 0, 1, enumC8857bT1);
        EnumC8857bT1 enumC8857bT12 = EnumC8857bT1.f17040d;
        EnumC8983cS1 enumC8983cS12 = new EnumC8983cS1("FLOAT", 1, 1, 1, enumC8857bT12);
        EnumC8857bT1 enumC8857bT13 = EnumC8857bT1.f17039c;
        EnumC8983cS1 enumC8983cS13 = new EnumC8983cS1("INT64", 2, 2, 1, enumC8857bT13);
        EnumC8983cS1 enumC8983cS14 = new EnumC8983cS1("UINT64", 3, 3, 1, enumC8857bT13);
        EnumC8857bT1 enumC8857bT14 = EnumC8857bT1.f17038b;
        EnumC8983cS1 enumC8983cS15 = new EnumC8983cS1("INT32", 4, 4, 1, enumC8857bT14);
        EnumC8983cS1 enumC8983cS16 = new EnumC8983cS1("FIXED64", 5, 5, 1, enumC8857bT13);
        EnumC8983cS1 enumC8983cS17 = new EnumC8983cS1("FIXED32", 6, 6, 1, enumC8857bT14);
        EnumC8857bT1 enumC8857bT15 = EnumC8857bT1.f17042f;
        EnumC8983cS1 enumC8983cS18 = new EnumC8983cS1("BOOL", 7, 7, 1, enumC8857bT15);
        EnumC8857bT1 enumC8857bT16 = EnumC8857bT1.f17043g;
        EnumC8983cS1 enumC8983cS19 = new EnumC8983cS1("STRING", 8, 8, 1, enumC8857bT16);
        EnumC8857bT1 enumC8857bT17 = EnumC8857bT1.f17046j;
        EnumC8983cS1 enumC8983cS110 = new EnumC8983cS1("MESSAGE", 9, 9, 1, enumC8857bT17);
        EnumC8857bT1 enumC8857bT18 = EnumC8857bT1.f17044h;
        EnumC8983cS1 enumC8983cS111 = new EnumC8983cS1("BYTES", 10, 10, 1, enumC8857bT18);
        EnumC8983cS1 enumC8983cS112 = new EnumC8983cS1("UINT32", 11, 11, 1, enumC8857bT14);
        EnumC8857bT1 enumC8857bT19 = EnumC8857bT1.f17045i;
        EnumC8983cS1 enumC8983cS113 = new EnumC8983cS1("ENUM", 12, 12, 1, enumC8857bT19);
        EnumC8983cS1 enumC8983cS114 = new EnumC8983cS1("SFIXED32", 13, 13, 1, enumC8857bT14);
        EnumC8983cS1 enumC8983cS115 = new EnumC8983cS1("SFIXED64", 14, 14, 1, enumC8857bT13);
        EnumC8983cS1 enumC8983cS116 = new EnumC8983cS1("SINT32", 15, 15, 1, enumC8857bT14);
        EnumC8983cS1 enumC8983cS117 = new EnumC8983cS1("SINT64", 16, 16, 1, enumC8857bT13);
        EnumC8983cS1 enumC8983cS118 = new EnumC8983cS1("GROUP", 17, 17, 1, enumC8857bT17);
        EnumC8983cS1 enumC8983cS119 = new EnumC8983cS1("DOUBLE_LIST", 18, 18, 2, enumC8857bT1);
        EnumC8983cS1 enumC8983cS120 = new EnumC8983cS1("FLOAT_LIST", 19, 19, 2, enumC8857bT12);
        EnumC8983cS1 enumC8983cS121 = new EnumC8983cS1("INT64_LIST", 20, 20, 2, enumC8857bT13);
        EnumC8983cS1 enumC8983cS122 = new EnumC8983cS1("UINT64_LIST", 21, 21, 2, enumC8857bT13);
        EnumC8983cS1 enumC8983cS123 = new EnumC8983cS1("INT32_LIST", 22, 22, 2, enumC8857bT14);
        EnumC8983cS1 enumC8983cS124 = new EnumC8983cS1("FIXED64_LIST", 23, 23, 2, enumC8857bT13);
        EnumC8983cS1 enumC8983cS125 = new EnumC8983cS1("FIXED32_LIST", 24, 24, 2, enumC8857bT14);
        EnumC8983cS1 enumC8983cS126 = new EnumC8983cS1("BOOL_LIST", 25, 25, 2, enumC8857bT15);
        EnumC8983cS1 enumC8983cS127 = new EnumC8983cS1("STRING_LIST", 26, 26, 2, enumC8857bT16);
        EnumC8983cS1 enumC8983cS128 = new EnumC8983cS1("MESSAGE_LIST", 27, 27, 2, enumC8857bT17);
        EnumC8983cS1 enumC8983cS129 = new EnumC8983cS1("BYTES_LIST", 28, 28, 2, enumC8857bT18);
        EnumC8983cS1 enumC8983cS130 = new EnumC8983cS1("UINT32_LIST", 29, 29, 2, enumC8857bT14);
        EnumC8983cS1 enumC8983cS131 = new EnumC8983cS1("ENUM_LIST", 30, 30, 2, enumC8857bT19);
        EnumC8983cS1 enumC8983cS132 = new EnumC8983cS1("SFIXED32_LIST", 31, 31, 2, enumC8857bT14);
        EnumC8983cS1 enumC8983cS133 = new EnumC8983cS1("SFIXED64_LIST", 32, 32, 2, enumC8857bT13);
        EnumC8983cS1 enumC8983cS134 = new EnumC8983cS1("SINT32_LIST", 33, 33, 2, enumC8857bT14);
        EnumC8983cS1 enumC8983cS135 = new EnumC8983cS1("SINT64_LIST", 34, 34, 2, enumC8857bT13);
        EnumC8983cS1 enumC8983cS136 = new EnumC8983cS1("DOUBLE_LIST_PACKED", 35, 35, 3, enumC8857bT1);
        f17524b = enumC8983cS136;
        EnumC8983cS1 enumC8983cS137 = new EnumC8983cS1("FLOAT_LIST_PACKED", 36, 36, 3, enumC8857bT12);
        EnumC8983cS1 enumC8983cS138 = new EnumC8983cS1("INT64_LIST_PACKED", 37, 37, 3, enumC8857bT13);
        EnumC8983cS1 enumC8983cS139 = new EnumC8983cS1("UINT64_LIST_PACKED", 38, 38, 3, enumC8857bT13);
        EnumC8983cS1 enumC8983cS140 = new EnumC8983cS1("INT32_LIST_PACKED", 39, 39, 3, enumC8857bT14);
        EnumC8983cS1 enumC8983cS141 = new EnumC8983cS1("FIXED64_LIST_PACKED", 40, 40, 3, enumC8857bT13);
        EnumC8983cS1 enumC8983cS142 = new EnumC8983cS1("FIXED32_LIST_PACKED", 41, 41, 3, enumC8857bT14);
        EnumC8983cS1 enumC8983cS143 = new EnumC8983cS1("BOOL_LIST_PACKED", 42, 42, 3, enumC8857bT15);
        EnumC8983cS1 enumC8983cS144 = new EnumC8983cS1("UINT32_LIST_PACKED", 43, 43, 3, enumC8857bT14);
        EnumC8983cS1 enumC8983cS145 = new EnumC8983cS1("ENUM_LIST_PACKED", 44, 44, 3, enumC8857bT19);
        EnumC8983cS1 enumC8983cS146 = new EnumC8983cS1("SFIXED32_LIST_PACKED", 45, 45, 3, enumC8857bT14);
        EnumC8983cS1 enumC8983cS147 = new EnumC8983cS1("SFIXED64_LIST_PACKED", 46, 46, 3, enumC8857bT13);
        EnumC8983cS1 enumC8983cS148 = new EnumC8983cS1("SINT32_LIST_PACKED", 47, 47, 3, enumC8857bT14);
        EnumC8983cS1 enumC8983cS149 = new EnumC8983cS1("SINT64_LIST_PACKED", 48, 48, 3, enumC8857bT13);
        f17525c = enumC8983cS149;
        f17527e = new EnumC8983cS1[]{enumC8983cS1, enumC8983cS12, enumC8983cS13, enumC8983cS14, enumC8983cS15, enumC8983cS16, enumC8983cS17, enumC8983cS18, enumC8983cS19, enumC8983cS110, enumC8983cS111, enumC8983cS112, enumC8983cS113, enumC8983cS114, enumC8983cS115, enumC8983cS116, enumC8983cS117, enumC8983cS118, enumC8983cS119, enumC8983cS120, enumC8983cS121, enumC8983cS122, enumC8983cS123, enumC8983cS124, enumC8983cS125, enumC8983cS126, enumC8983cS127, enumC8983cS128, enumC8983cS129, enumC8983cS130, enumC8983cS131, enumC8983cS132, enumC8983cS133, enumC8983cS134, enumC8983cS135, enumC8983cS136, enumC8983cS137, enumC8983cS138, enumC8983cS139, enumC8983cS140, enumC8983cS141, enumC8983cS142, enumC8983cS143, enumC8983cS144, enumC8983cS145, enumC8983cS146, enumC8983cS147, enumC8983cS148, enumC8983cS149, new EnumC8983cS1("GROUP_LIST", 49, 49, 2, enumC8857bT17), new EnumC8983cS1("MAP", 50, 50, 4, EnumC8857bT1.f17037a)};
        EnumC8983cS1[] enumC8983cS1ArrValues = values();
        f17526d = new EnumC8983cS1[enumC8983cS1ArrValues.length];
        for (EnumC8983cS1 enumC8983cS150 : enumC8983cS1ArrValues) {
            f17526d[enumC8983cS150.f17528a] = enumC8983cS150;
        }
    }

    public EnumC8983cS1(String str, int i, int i2, int i3, EnumC8857bT1 enumC8857bT1) {
        this.f17528a = i2;
        int iM26247x = AbstractC7222ym.m26247x(i3);
        if (iM26247x == 1 || iM26247x == 3) {
            enumC8857bT1.getClass();
        }
        if (i3 == 1) {
            int i4 = AbstractC8727aS1.f15521a[enumC8857bT1.ordinal()];
        }
    }

    public static EnumC8983cS1[] values() {
        return (EnumC8983cS1[]) f17527e.clone();
    }

    /* renamed from: a */
    public final int m10699a() {
        return this.f17528a;
    }
}
