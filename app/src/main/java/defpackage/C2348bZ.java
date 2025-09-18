package defpackage;

import android.content.Context;
import java.io.IOException;

/* renamed from: bZ, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2348bZ implements D61 {
    public final Context a;
    public final String b;
    public final C2359bc1 c;
    public final boolean d;
    public final boolean e;
    public final F71 f;
    public boolean g;

    public C2348bZ(Context context, String str, C2359bc1 c2359bc1, boolean z, boolean z2) {
        O90.f(context, "context");
        O90.f(c2359bc1, "callback");
        this.a = context;
        this.b = str;
        this.c = c2359bc1;
        this.d = z;
        this.e = z2;
        this.f = LB.b(new C3881g1(20, this));
    }

    @Override // defpackage.D61
    public final XY M() {
        return ((C2157aZ) this.f.getValue()).a(true);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f.b != C7304tt.g) {
            ((C2157aZ) this.f.getValue()).close();
        }
    }

    @Override // defpackage.D61
    public final void setWriteAheadLoggingEnabled(boolean z) {
        if (this.f.b != C7304tt.g) {
            C2157aZ c2157aZ = (C2157aZ) this.f.getValue();
            O90.f(c2157aZ, "sQLiteOpenHelper");
            c2157aZ.setWriteAheadLoggingEnabled(z);
        }
        this.g = z;
    }
}
