package p000;

import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: cQ0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8978cQ0 implements Serializable {

    /* renamed from: a */
    public final Pattern f17471a;

    public C8978cQ0(String str) {
        Pattern patternCompile = Pattern.compile(str);
        O90.m5967e(patternCompile, "compile(...)");
        this.f17471a = patternCompile;
    }

    /* renamed from: a */
    public static C8068On0 m10696a(C8978cQ0 c8978cQ0, String str) {
        c8978cQ0.getClass();
        O90.m5968f(str, "input");
        Matcher matcher = c8978cQ0.f17471a.matcher(str);
        O90.m5967e(matcher, "matcher(...)");
        if (matcher.find(0)) {
            return new C8068On0(matcher, str);
        }
        return null;
    }

    /* renamed from: b */
    public final boolean m10697b(String str) {
        O90.m5968f(str, "input");
        return this.f17471a.matcher(str).matches();
    }

    /* renamed from: c */
    public final String m10698c(String str, InterfaceC6497nZ interfaceC6497nZ) {
        O90.m5968f(str, "input");
        C8068On0 c8068On0M10696a = m10696a(this, str);
        if (c8068On0M10696a == null) {
            return str.toString();
        }
        int length = str.length();
        StringBuilder sb = new StringBuilder(length);
        int i = 0;
        do {
            Matcher matcher = c8068On0M10696a.f8621a;
            sb.append((CharSequence) str, i, AbstractC10132lO1.m22423h(matcher.start(), matcher.end()).f26569a);
            sb.append((CharSequence) interfaceC6497nZ.invoke(c8068On0M10696a));
            i = AbstractC10132lO1.m22423h(matcher.start(), matcher.end()).f26570b + 1;
            int iEnd = matcher.end() + (matcher.end() != matcher.start() ? 0 : 1);
            String str2 = c8068On0M10696a.f8622b;
            C8068On0 c8068On0 = null;
            if (iEnd <= str2.length()) {
                Matcher matcher2 = matcher.pattern().matcher(str2);
                O90.m5967e(matcher2, "matcher(...)");
                if (matcher2.find(iEnd)) {
                    c8068On0 = new C8068On0(matcher2, str2);
                }
            }
            c8068On0M10696a = c8068On0;
            if (i >= length) {
                break;
            }
        } while (c8068On0M10696a != null);
        if (i < length) {
            sb.append((CharSequence) str, i, length);
        }
        String string = sb.toString();
        O90.m5967e(string, "toString(...)");
        return string;
    }

    public final String toString() {
        String string = this.f17471a.toString();
        O90.m5967e(string, "toString(...)");
        return string;
    }
}
