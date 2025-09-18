package defpackage;

import android.widget.EditText;

/* renamed from: t02, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7138t02 {
    public static final String a(InterfaceC1200Pd1 interfaceC1200Pd1) {
        StringBuilder sb = new StringBuilder();
        b(sb, "type: " + interfaceC1200Pd1);
        b(sb, "hashCode: " + interfaceC1200Pd1.hashCode());
        b(sb, "javaClass: " + interfaceC1200Pd1.getClass().getCanonicalName());
        for (CD cdA = interfaceC1200Pd1.a(); cdA != null; cdA = cdA.i()) {
            b(sb, "fqName: ".concat(C5857mI.c.w(cdA)));
            b(sb, "javaClass: " + cdA.getClass().getCanonicalName());
        }
        String string = sb.toString();
        O90.e(string, "toString(...)");
        return string;
    }

    public static final void b(StringBuilder sb, String str) {
        O90.f(str, "<this>");
        sb.append(str);
        sb.append('\n');
    }

    public static boolean c(EditText editText) {
        return editText.getInputType() != 0;
    }
}
