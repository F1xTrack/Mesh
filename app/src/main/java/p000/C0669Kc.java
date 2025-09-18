package p000;

import java.io.File;

/* renamed from: Kc */
/* loaded from: classes.dex */
public final class C0669Kc {

    /* renamed from: a */
    public final C0606Jc f6223a;

    /* renamed from: b */
    public final String f6224b;

    /* renamed from: c */
    public final File f6225c;

    public C0669Kc(C0606Jc c0606Jc, String str, File file) {
        this.f6223a = c0606Jc;
        if (str == null) {
            throw new NullPointerException("Null sessionId");
        }
        this.f6224b = str;
        this.f6225c = file;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0669Kc)) {
            return false;
        }
        C0669Kc c0669Kc = (C0669Kc) obj;
        return this.f6223a.equals(c0669Kc.f6223a) && this.f6224b.equals(c0669Kc.f6224b) && this.f6225c.equals(c0669Kc.f6225c);
    }

    public final int hashCode() {
        return ((((this.f6223a.hashCode() ^ 1000003) * 1000003) ^ this.f6224b.hashCode()) * 1000003) ^ this.f6225c.hashCode();
    }

    public final String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.f6223a + ", sessionId=" + this.f6224b + ", reportFile=" + this.f6225c + "}";
    }
}
