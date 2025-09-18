package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: fP */
/* loaded from: classes2.dex */
public final class EnumC4051fP {

    /* renamed from: b */
    public static final EnumC4051fP f27176b;

    /* renamed from: c */
    public static final EnumC4051fP f27177c;

    /* renamed from: d */
    public static final EnumC4051fP f27178d;

    /* renamed from: e */
    public static final EnumC4051fP f27179e;

    /* renamed from: f */
    public static final EnumC4051fP f27180f;

    /* renamed from: g */
    public static final /* synthetic */ EnumC4051fP[] f27181g;

    /* renamed from: a */
    public final String f27182a;

    static {
        EnumC4051fP enumC4051fP = new EnumC4051fP("CAPTURED_TYPE_SCOPE", 0, "No member resolution should be done on captured type, it used only during constraint system resolution");
        f27176b = enumC4051fP;
        EnumC4051fP enumC4051fP2 = new EnumC4051fP("INTEGER_LITERAL_TYPE_SCOPE", 1, "Scope for integer literal type (%s)");
        f27177c = enumC4051fP2;
        EnumC4051fP enumC4051fP3 = new EnumC4051fP("ERASED_RECEIVER_TYPE_SCOPE", 2, "Error scope for erased receiver type");
        EnumC4051fP enumC4051fP4 = new EnumC4051fP("SCOPE_FOR_ABBREVIATION_TYPE", 3, "Scope for abbreviation %s");
        f27178d = enumC4051fP4;
        EnumC4051fP enumC4051fP5 = new EnumC4051fP("STUB_TYPE_SCOPE", 4, "Scope for stub type %s");
        EnumC4051fP enumC4051fP6 = new EnumC4051fP("NON_CLASSIFIER_SUPER_TYPE_SCOPE", 5, "A scope for common supertype which is not a normal classifier");
        EnumC4051fP enumC4051fP7 = new EnumC4051fP("ERROR_TYPE_SCOPE", 6, "Scope for error type %s");
        f27179e = enumC4051fP7;
        EnumC4051fP enumC4051fP8 = new EnumC4051fP("UNSUPPORTED_TYPE_SCOPE", 7, "Scope for unsupported type %s");
        EnumC4051fP enumC4051fP9 = new EnumC4051fP("SCOPE_FOR_ERROR_CLASS", 8, "Error scope for class %s with arguments: %s");
        f27180f = enumC4051fP9;
        EnumC4051fP[] enumC4051fPArr = {enumC4051fP, enumC4051fP2, enumC4051fP3, enumC4051fP4, enumC4051fP5, enumC4051fP6, enumC4051fP7, enumC4051fP8, enumC4051fP9, new EnumC4051fP("SCOPE_FOR_ERROR_RESOLUTION_CANDIDATE", 9, "Error resolution candidate for call %s")};
        f27181g = enumC4051fPArr;
        F02.m2482c(enumC4051fPArr);
    }

    public EnumC4051fP(String str, int i, String str2) {
        this.f27182a = str2;
    }

    public static EnumC4051fP valueOf(String str) {
        return (EnumC4051fP) Enum.valueOf(EnumC4051fP.class, str);
    }

    public static EnumC4051fP[] values() {
        return (EnumC4051fP[]) f27181g.clone();
    }
}
