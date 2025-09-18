package defpackage;

import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public abstract class XT {
    public static final String a = WT.class.getSimpleName();

    public static final String a(String str) {
        if (str == null) {
            return null;
        }
        return D51.o(str, "file:///", false) ? str : Pattern.compile("^file:/*").matcher(str).replaceAll("file:///");
    }
}
