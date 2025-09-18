package p000;

import android.content.Context;
import java.io.IOException;

/* renamed from: bZ */
/* loaded from: classes.dex */
public final class C1793bZ implements D61 {

    /* renamed from: a */
    public final Context f17067a;

    /* renamed from: b */
    public final String f17068b;

    /* renamed from: c */
    public final C8875bc1 f17069c;

    /* renamed from: d */
    public final boolean f17070d;

    /* renamed from: e */
    public final boolean f17071e;

    /* renamed from: f */
    public final F71 f17072f;

    /* renamed from: g */
    public boolean f17073g;

    public C1793bZ(Context context, String str, C8875bc1 c8875bc1, boolean z, boolean z2) {
        O90.m5968f(context, "context");
        O90.m5968f(c8875bc1, "callback");
        this.f17067a = context;
        this.f17068b = str;
        this.f17069c = c8875bc1;
        this.f17070d = z;
        this.f17071e = z2;
        this.f17072f = AbstractC0705LB.m4915b(new C4090g1(20, this));
    }

    @Override // p000.D61
    /* renamed from: M */
    public final C1482XY mo1557M() {
        return ((C1672aZ) this.f17072f.getValue()).m9758a(true);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f17072f.f3073b != C6914tt.f43396g) {
            ((C1672aZ) this.f17072f.getValue()).close();
        }
    }

    @Override // p000.D61
    public final void setWriteAheadLoggingEnabled(boolean z) {
        if (this.f17072f.f3073b != C6914tt.f43396g) {
            C1672aZ c1672aZ = (C1672aZ) this.f17072f.getValue();
            O90.m5968f(c1672aZ, "sQLiteOpenHelper");
            c1672aZ.setWriteAheadLoggingEnabled(z);
        }
        this.f17073g = z;
    }
}
