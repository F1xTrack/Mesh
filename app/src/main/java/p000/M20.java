package p000;

import com.facebook.react.bridge.WritableMap;

/* loaded from: classes.dex */
public final class M20 {

    /* renamed from: a */
    public final String f6972a;

    /* renamed from: b */
    public final WritableMap f6973b;

    /* renamed from: c */
    public final long f6974c;

    /* renamed from: d */
    public final boolean f6975d;

    /* renamed from: e */
    public final C7460Cv0 f6976e;

    public M20(String str, WritableMap writableMap, long j) {
        C7460Cv0 c7460Cv0 = C7460Cv0.f1756f;
        this.f6972a = str;
        this.f6973b = writableMap;
        this.f6974c = j;
        this.f6975d = true;
        this.f6976e = c7460Cv0;
    }

    public M20(M20 m20) {
        this.f6972a = m20.f6972a;
        this.f6973b = m20.f6973b.copy();
        this.f6974c = m20.f6974c;
        this.f6975d = m20.f6975d;
        C7460Cv0 c7460Cv0 = m20.f6976e;
        if (c7460Cv0 != null) {
            this.f6976e = c7460Cv0;
        } else {
            this.f6976e = null;
        }
    }
}
