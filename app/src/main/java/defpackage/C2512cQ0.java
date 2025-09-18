package defpackage;

import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: cQ0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2512cQ0 implements Serializable {
    public final Pattern a;

    public C2512cQ0(String str) {
        Pattern patternCompile = Pattern.compile(str);
        O90.e(patternCompile, "compile(...)");
        this.a = patternCompile;
    }

    public static C1151On0 a(C2512cQ0 c2512cQ0, String str) {
        c2512cQ0.getClass();
        O90.f(str, "input");
        Matcher matcher = c2512cQ0.a.matcher(str);
        O90.e(matcher, "matcher(...)");
        if (matcher.find(0)) {
            return new C1151On0(matcher, str);
        }
        return null;
    }

    public final boolean b(String str) {
        O90.f(str, "input");
        return this.a.matcher(str).matches();
    }

    public final String c(String str, InterfaceC6099nZ interfaceC6099nZ) {
        O90.f(str, "input");
        C1151On0 c1151On0A = a(this, str);
        if (c1151On0A == null) {
            return str.toString();
        }
        int length = str.length();
        StringBuilder sb = new StringBuilder(length);
        int i = 0;
        do {
            Matcher matcher = c1151On0A.a;
            sb.append((CharSequence) str, i, AbstractC5686lO1.h(matcher.start(), matcher.end()).a);
            sb.append((CharSequence) interfaceC6099nZ.invoke(c1151On0A));
            i = AbstractC5686lO1.h(matcher.start(), matcher.end()).b + 1;
            int iEnd = matcher.end() + (matcher.end() != matcher.start() ? 0 : 1);
            String str2 = c1151On0A.b;
            C1151On0 c1151On0 = null;
            if (iEnd <= str2.length()) {
                Matcher matcher2 = matcher.pattern().matcher(str2);
                O90.e(matcher2, "matcher(...)");
                if (matcher2.find(iEnd)) {
                    c1151On0 = new C1151On0(matcher2, str2);
                }
            }
            c1151On0A = c1151On0;
            if (i >= length) {
                break;
            }
        } while (c1151On0A != null);
        if (i < length) {
            sb.append((CharSequence) str, i, length);
        }
        String string = sb.toString();
        O90.e(string, "toString(...)");
        return string;
    }

    public final String toString() {
        String string = this.a.toString();
        O90.e(string, "toString(...)");
        return string;
    }
}
