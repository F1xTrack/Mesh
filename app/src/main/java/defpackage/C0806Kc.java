package defpackage;

import java.io.File;

/* renamed from: Kc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0806Kc {
    public final C0728Jc a;
    public final String b;
    public final File c;

    public C0806Kc(C0728Jc c0728Jc, String str, File file) {
        this.a = c0728Jc;
        if (str == null) {
            throw new NullPointerException("Null sessionId");
        }
        this.b = str;
        this.c = file;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0806Kc)) {
            return false;
        }
        C0806Kc c0806Kc = (C0806Kc) obj;
        return this.a.equals(c0806Kc.a) && this.b.equals(c0806Kc.b) && this.c.equals(c0806Kc.c);
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.a + ", sessionId=" + this.b + ", reportFile=" + this.c + "}";
    }
}
