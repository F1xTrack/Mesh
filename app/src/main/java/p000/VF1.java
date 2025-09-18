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
/* loaded from: classes.dex */
public final class VF1 {

    /* renamed from: b */
    public static final VF1 f12468b;

    /* renamed from: c */
    public static final VF1 f12469c;

    /* renamed from: d */
    public static final VF1[] f12470d;

    /* renamed from: e */
    public static final /* synthetic */ VF1[] f12471e;

    /* renamed from: a */
    public final int f12472a;

    /* JADX INFO: Fake field, exist only in values array */
    VF1 EF6;

    static {
        GH1 gh1 = GH1.f3669e;
        VF1 vf1 = new VF1("DOUBLE", 0, 0, 1, gh1);
        GH1 gh12 = GH1.f3668d;
        VF1 vf12 = new VF1("FLOAT", 1, 1, 1, gh12);
        GH1 gh13 = GH1.f3667c;
        VF1 vf13 = new VF1("INT64", 2, 2, 1, gh13);
        VF1 vf14 = new VF1("UINT64", 3, 3, 1, gh13);
        GH1 gh14 = GH1.f3666b;
        VF1 vf15 = new VF1("INT32", 4, 4, 1, gh14);
        VF1 vf16 = new VF1("FIXED64", 5, 5, 1, gh13);
        VF1 vf17 = new VF1("FIXED32", 6, 6, 1, gh14);
        GH1 gh15 = GH1.f3670f;
        VF1 vf18 = new VF1("BOOL", 7, 7, 1, gh15);
        GH1 gh16 = GH1.f3671g;
        VF1 vf19 = new VF1("STRING", 8, 8, 1, gh16);
        GH1 gh17 = GH1.f3674j;
        VF1 vf110 = new VF1("MESSAGE", 9, 9, 1, gh17);
        GH1 gh18 = GH1.f3672h;
        VF1 vf111 = new VF1("BYTES", 10, 10, 1, gh18);
        VF1 vf112 = new VF1("UINT32", 11, 11, 1, gh14);
        GH1 gh19 = GH1.f3673i;
        VF1 vf113 = new VF1("ENUM", 12, 12, 1, gh19);
        VF1 vf114 = new VF1("SFIXED32", 13, 13, 1, gh14);
        VF1 vf115 = new VF1("SFIXED64", 14, 14, 1, gh13);
        VF1 vf116 = new VF1("SINT32", 15, 15, 1, gh14);
        VF1 vf117 = new VF1("SINT64", 16, 16, 1, gh13);
        VF1 vf118 = new VF1("GROUP", 17, 17, 1, gh17);
        VF1 vf119 = new VF1("DOUBLE_LIST", 18, 18, 2, gh1);
        VF1 vf120 = new VF1("FLOAT_LIST", 19, 19, 2, gh12);
        VF1 vf121 = new VF1("INT64_LIST", 20, 20, 2, gh13);
        VF1 vf122 = new VF1("UINT64_LIST", 21, 21, 2, gh13);
        VF1 vf123 = new VF1("INT32_LIST", 22, 22, 2, gh14);
        VF1 vf124 = new VF1("FIXED64_LIST", 23, 23, 2, gh13);
        VF1 vf125 = new VF1("FIXED32_LIST", 24, 24, 2, gh14);
        VF1 vf126 = new VF1("BOOL_LIST", 25, 25, 2, gh15);
        VF1 vf127 = new VF1("STRING_LIST", 26, 26, 2, gh16);
        VF1 vf128 = new VF1("MESSAGE_LIST", 27, 27, 2, gh17);
        VF1 vf129 = new VF1("BYTES_LIST", 28, 28, 2, gh18);
        VF1 vf130 = new VF1("UINT32_LIST", 29, 29, 2, gh14);
        VF1 vf131 = new VF1("ENUM_LIST", 30, 30, 2, gh19);
        VF1 vf132 = new VF1("SFIXED32_LIST", 31, 31, 2, gh14);
        VF1 vf133 = new VF1("SFIXED64_LIST", 32, 32, 2, gh13);
        VF1 vf134 = new VF1("SINT32_LIST", 33, 33, 2, gh14);
        VF1 vf135 = new VF1("SINT64_LIST", 34, 34, 2, gh13);
        VF1 vf136 = new VF1("DOUBLE_LIST_PACKED", 35, 35, 3, gh1);
        f12468b = vf136;
        VF1 vf137 = new VF1("FLOAT_LIST_PACKED", 36, 36, 3, gh12);
        VF1 vf138 = new VF1("INT64_LIST_PACKED", 37, 37, 3, gh13);
        VF1 vf139 = new VF1("UINT64_LIST_PACKED", 38, 38, 3, gh13);
        VF1 vf140 = new VF1("INT32_LIST_PACKED", 39, 39, 3, gh14);
        VF1 vf141 = new VF1("FIXED64_LIST_PACKED", 40, 40, 3, gh13);
        VF1 vf142 = new VF1("FIXED32_LIST_PACKED", 41, 41, 3, gh14);
        VF1 vf143 = new VF1("BOOL_LIST_PACKED", 42, 42, 3, gh15);
        VF1 vf144 = new VF1("UINT32_LIST_PACKED", 43, 43, 3, gh14);
        VF1 vf145 = new VF1("ENUM_LIST_PACKED", 44, 44, 3, gh19);
        VF1 vf146 = new VF1("SFIXED32_LIST_PACKED", 45, 45, 3, gh14);
        VF1 vf147 = new VF1("SFIXED64_LIST_PACKED", 46, 46, 3, gh13);
        VF1 vf148 = new VF1("SINT32_LIST_PACKED", 47, 47, 3, gh14);
        VF1 vf149 = new VF1("SINT64_LIST_PACKED", 48, 48, 3, gh13);
        f12469c = vf149;
        f12471e = new VF1[]{vf1, vf12, vf13, vf14, vf15, vf16, vf17, vf18, vf19, vf110, vf111, vf112, vf113, vf114, vf115, vf116, vf117, vf118, vf119, vf120, vf121, vf122, vf123, vf124, vf125, vf126, vf127, vf128, vf129, vf130, vf131, vf132, vf133, vf134, vf135, vf136, vf137, vf138, vf139, vf140, vf141, vf142, vf143, vf144, vf145, vf146, vf147, vf148, vf149, new VF1("GROUP_LIST", 49, 49, 2, gh17), new VF1("MAP", 50, 50, 4, GH1.f3665a)};
        VF1[] vf1ArrValues = values();
        f12470d = new VF1[vf1ArrValues.length];
        for (VF1 vf150 : vf1ArrValues) {
            f12470d[vf150.f12472a] = vf150;
        }
    }

    public VF1(String str, int i, int i2, int i3, GH1 gh1) {
        this.f12472a = i2;
        int i4 = i3 - 1;
        if (i4 == 1 || i4 == 3) {
            gh1.getClass();
        }
        if (i3 == 1) {
            GH1 gh12 = GH1.f3665a;
            gh1.ordinal();
        }
    }

    public static VF1[] values() {
        return (VF1[]) f12471e.clone();
    }

    /* renamed from: a */
    public final int m8338a() {
        return this.f12472a;
    }
}
