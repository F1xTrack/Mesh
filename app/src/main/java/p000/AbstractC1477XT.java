package p000;

import java.util.regex.Pattern;

/* renamed from: XT */
/* loaded from: classes2.dex */
public abstract class AbstractC1477XT {

    /* renamed from: a */
    public static final String f13800a = C1414WT.class.getSimpleName();

    /* renamed from: a */
    public static final String m9053a(String str) {
        if (str == null) {
            return null;
        }
        return D51.m1556o(str, "file:///", false) ? str : Pattern.compile("^file:/*").matcher(str).replaceAll("file:///");
    }
}
