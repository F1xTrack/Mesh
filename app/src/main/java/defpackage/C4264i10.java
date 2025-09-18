package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;

/* renamed from: i10, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4264i10 extends XB {
    public final Handler d;
    public final int e;
    public final long f;
    public Bitmap g;

    public C4264i10(Handler handler, int i, long j) {
        this.d = handler;
        this.e = i;
        this.f = j;
    }

    @Override // defpackage.A81
    public final void e(Object obj) {
        this.g = (Bitmap) obj;
        Handler handler = this.d;
        handler.sendMessageAtTime(handler.obtainMessage(1, this), this.f);
    }

    @Override // defpackage.A81
    public final void i(Drawable drawable) {
        this.g = null;
    }
}
