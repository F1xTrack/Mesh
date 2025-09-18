package p000;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;

/* renamed from: Zm1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8639Zm1 extends AbstractC1459XB {

    /* renamed from: d */
    public final Handler f15123d;

    /* renamed from: e */
    public final int f15124e;

    /* renamed from: f */
    public final long f15125f;

    /* renamed from: g */
    public Bitmap f15126g;

    public C8639Zm1(Handler handler, int i, long j) {
        this.f15123d = handler;
        this.f15124e = i;
        this.f15125f = j;
    }

    @Override // p000.A81
    /* renamed from: e */
    public final void mo80e(Object obj) {
        this.f15126g = (Bitmap) obj;
        Handler handler = this.f15123d;
        handler.sendMessageAtTime(handler.obtainMessage(1, this), this.f15125f);
    }

    @Override // p000.A81
    /* renamed from: i */
    public final void mo84i(Drawable drawable) {
        this.f15126g = null;
    }
}
