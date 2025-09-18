package p000;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;

/* renamed from: i10, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9698i10 extends AbstractC1459XB {

    /* renamed from: d */
    public final Handler f28755d;

    /* renamed from: e */
    public final int f28756e;

    /* renamed from: f */
    public final long f28757f;

    /* renamed from: g */
    public Bitmap f28758g;

    public C9698i10(Handler handler, int i, long j) {
        this.f28755d = handler;
        this.f28756e = i;
        this.f28757f = j;
    }

    @Override // p000.A81
    /* renamed from: e */
    public final void mo80e(Object obj) {
        this.f28758g = (Bitmap) obj;
        Handler handler = this.f28755d;
        handler.sendMessageAtTime(handler.obtainMessage(1, this), this.f28757f);
    }

    @Override // p000.A81
    /* renamed from: i */
    public final void mo84i(Drawable drawable) {
        this.f28758g = null;
    }
}
