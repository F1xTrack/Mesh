package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: fP, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC3765fP {
    public static final EnumC3765fP b;
    public static final EnumC3765fP c;
    public static final EnumC3765fP d;
    public static final EnumC3765fP e;
    public static final EnumC3765fP f;
    public static final /* synthetic */ EnumC3765fP[] g;
    public final String a;

    static {
        EnumC3765fP enumC3765fP = new EnumC3765fP("CAPTURED_TYPE_SCOPE", 0, "No member resolution should be done on captured type, it used only during constraint system resolution");
        b = enumC3765fP;
        EnumC3765fP enumC3765fP2 = new EnumC3765fP("INTEGER_LITERAL_TYPE_SCOPE", 1, "Scope for integer literal type (%s)");
        c = enumC3765fP2;
        EnumC3765fP enumC3765fP3 = new EnumC3765fP("ERASED_RECEIVER_TYPE_SCOPE", 2, "Error scope for erased receiver type");
        EnumC3765fP enumC3765fP4 = new EnumC3765fP("SCOPE_FOR_ABBREVIATION_TYPE", 3, "Scope for abbreviation %s");
        d = enumC3765fP4;
        EnumC3765fP enumC3765fP5 = new EnumC3765fP("STUB_TYPE_SCOPE", 4, "Scope for stub type %s");
        EnumC3765fP enumC3765fP6 = new EnumC3765fP("NON_CLASSIFIER_SUPER_TYPE_SCOPE", 5, "A scope for common supertype which is not a normal classifier");
        EnumC3765fP enumC3765fP7 = new EnumC3765fP("ERROR_TYPE_SCOPE", 6, "Scope for error type %s");
        e = enumC3765fP7;
        EnumC3765fP enumC3765fP8 = new EnumC3765fP("UNSUPPORTED_TYPE_SCOPE", 7, "Scope for unsupported type %s");
        EnumC3765fP enumC3765fP9 = new EnumC3765fP("SCOPE_FOR_ERROR_CLASS", 8, "Error scope for class %s with arguments: %s");
        f = enumC3765fP9;
        EnumC3765fP[] enumC3765fPArr = {enumC3765fP, enumC3765fP2, enumC3765fP3, enumC3765fP4, enumC3765fP5, enumC3765fP6, enumC3765fP7, enumC3765fP8, enumC3765fP9, new EnumC3765fP("SCOPE_FOR_ERROR_RESOLUTION_CANDIDATE", 9, "Error resolution candidate for call %s")};
        g = enumC3765fPArr;
        F02.c(enumC3765fPArr);
    }

    public EnumC3765fP(String str, int i, String str2) {
        this.a = str2;
    }

    public static EnumC3765fP valueOf(String str) {
        return (EnumC3765fP) Enum.valueOf(EnumC3765fP.class, str);
    }

    public static EnumC3765fP[] values() {
        return (EnumC3765fP[]) g.clone();
    }
}
