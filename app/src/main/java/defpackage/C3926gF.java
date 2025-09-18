package defpackage;

import java.io.File;

/* renamed from: gF, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3926gF {
    public final String a;
    public final C5699lT b;
    public long c;
    public long d;

    public C3926gF(File file, String str) {
        str.getClass();
        this.a = str;
        this.b = new C5699lT(file);
        this.c = -1L;
        this.d = -1L;
    }

    public final long a() {
        if (this.d < 0) {
            this.d = this.b.a.lastModified();
        }
        return this.d;
    }
}
