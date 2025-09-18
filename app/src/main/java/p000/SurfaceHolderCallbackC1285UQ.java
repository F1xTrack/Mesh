package p000;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;

/* renamed from: UQ */
/* loaded from: classes.dex */
public final class SurfaceHolderCallbackC1285UQ implements SurfaceHolder.Callback, TextureView.SurfaceTextureListener {

    /* renamed from: a */
    public final /* synthetic */ C1474XQ f11780a;

    public SurfaceHolderCallbackC1285UQ(C1474XQ c1474xq) {
        this.f11780a = c1474xq;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        C1474XQ c1474xq = this.f11780a;
        c1474xq.getClass();
        Surface surface = new Surface(surfaceTexture);
        c1474xq.m9028Z1(surface);
        c1474xq.f13707S = surface;
        c1474xq.m9018P1(i, i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        C1474XQ c1474xq = this.f11780a;
        c1474xq.m9028Z1(null);
        c1474xq.m9018P1(0, 0);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        this.f11780a.m9018P1(i, i2);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        this.f11780a.m9018P1(i2, i3);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        C1474XQ c1474xq = this.f11780a;
        if (c1474xq.f13710V) {
            c1474xq.m9028Z1(surfaceHolder.getSurface());
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        C1474XQ c1474xq = this.f11780a;
        if (c1474xq.f13710V) {
            c1474xq.m9028Z1(null);
        }
        c1474xq.m9018P1(0, 0);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
