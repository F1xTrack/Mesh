package p000;

import java.nio.charset.Charset;
import java.util.regex.Pattern;

/* renamed from: Xp0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8540Xp0 {

    /* renamed from: d */
    public static final Pattern f13986d = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* renamed from: e */
    public static final Pattern f13987e = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* renamed from: a */
    public final String f13988a;

    /* renamed from: b */
    public final String f13989b;

    /* renamed from: c */
    public final String[] f13990c;

    public C8540Xp0(String str, String str2, String[] strArr) {
        this.f13988a = str;
        this.f13989b = str2;
        this.f13990c = strArr;
    }

    /* renamed from: a */
    public final Charset m9156a(Charset charset) {
        String str;
        String[] strArr = this.f13990c;
        int i = 0;
        int iM24880a = AbstractC11152tM1.m24880a(0, strArr.length - 1, 2);
        if (iM24880a < 0) {
            str = null;
            break;
        }
        while (!D51.m1551j(strArr[i], "charset")) {
            if (i == iM24880a) {
                str = null;
                break;
            }
            i += 2;
        }
        str = strArr[i + 1];
        if (str == null) {
            return charset;
        }
        try {
            return Charset.forName(str);
        } catch (IllegalArgumentException unused) {
            return charset;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C8540Xp0) && O90.m5963a(((C8540Xp0) obj).f13988a, this.f13988a);
    }

    public final int hashCode() {
        return this.f13988a.hashCode();
    }

    public final String toString() {
        return this.f13988a;
    }
}
