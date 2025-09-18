package p000;

import java.io.File;

/* renamed from: gF */
/* loaded from: classes.dex */
public final class C4104gF {

    /* renamed from: a */
    public final String f27630a;

    /* renamed from: b */
    public final C6365lT f27631b;

    /* renamed from: c */
    public long f27632c;

    /* renamed from: d */
    public long f27633d;

    public C4104gF(File file, String str) {
        str.getClass();
        this.f27630a = str;
        this.f27631b = new C6365lT(file);
        this.f27632c = -1L;
        this.f27633d = -1L;
    }

    /* renamed from: a */
    public final long m18413a() {
        if (this.f27633d < 0) {
            this.f27633d = this.f27631b.f37075a.lastModified();
        }
        return this.f27633d;
    }
}
