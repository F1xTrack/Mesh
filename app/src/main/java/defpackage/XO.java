package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class XO {
    public static final /* synthetic */ XO[] a;

    static {
        XO[] xoArr = {new XO("ERROR_CLASS", 0), new XO("ERROR_FUNCTION", 1), new XO("ERROR_SCOPE", 2), new XO("ERROR_MODULE", 3), new XO("ERROR_PROPERTY", 4), new XO("ERROR_TYPE", 5), new XO("PARENT_OF_ERROR_SCOPE", 6)};
        a = xoArr;
        F02.c(xoArr);
    }

    public static XO valueOf(String str) {
        return (XO) Enum.valueOf(XO.class, str);
    }

    public static XO[] values() {
        return (XO[]) a.clone();
    }
}
