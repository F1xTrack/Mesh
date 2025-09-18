package defpackage;

import com.facebook.react.bridge.WritableMap;

/* loaded from: classes.dex */
public final class M20 {
    public final String a;
    public final WritableMap b;
    public final long c;
    public final boolean d;
    public final C0240Cv0 e;

    public M20(String str, WritableMap writableMap, long j) {
        C0240Cv0 c0240Cv0 = C0240Cv0.f;
        this.a = str;
        this.b = writableMap;
        this.c = j;
        this.d = true;
        this.e = c0240Cv0;
    }

    public M20(M20 m20) {
        this.a = m20.a;
        this.b = m20.b.copy();
        this.c = m20.c;
        this.d = m20.d;
        C0240Cv0 c0240Cv0 = m20.e;
        if (c0240Cv0 != null) {
            this.e = c0240Cv0;
        } else {
            this.e = null;
        }
    }
}
