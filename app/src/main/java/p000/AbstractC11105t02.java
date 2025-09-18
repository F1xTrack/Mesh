package p000;

import android.widget.EditText;

/* renamed from: t02, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC11105t02 {
    /* renamed from: a */
    public static final String m24822a(InterfaceC8101Pd1 interfaceC8101Pd1) {
        StringBuilder sb = new StringBuilder();
        m24823b(sb, "type: " + interfaceC8101Pd1);
        m24823b(sb, "hashCode: " + interfaceC8101Pd1.hashCode());
        m24823b(sb, "javaClass: " + interfaceC8101Pd1.getClass().getCanonicalName());
        for (InterfaceC0140CD interfaceC0140CDMo1962a = interfaceC8101Pd1.mo1962a(); interfaceC0140CDMo1962a != null; interfaceC0140CDMo1962a = interfaceC0140CDMo1962a.mo423i()) {
            m24823b(sb, "fqName: ".concat(C6417mI.f37617c.m22767w(interfaceC0140CDMo1962a)));
            m24823b(sb, "javaClass: " + interfaceC0140CDMo1962a.getClass().getCanonicalName());
        }
        String string = sb.toString();
        O90.m5967e(string, "toString(...)");
        return string;
    }

    /* renamed from: b */
    public static final void m24823b(StringBuilder sb, String str) {
        O90.m5968f(str, "<this>");
        sb.append(str);
        sb.append('\n');
    }

    /* renamed from: c */
    public static boolean m24824c(EditText editText) {
        return editText.getInputType() != 0;
    }
}
