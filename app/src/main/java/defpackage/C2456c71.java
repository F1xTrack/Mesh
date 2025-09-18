package defpackage;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Size;
import android.view.PixelCopy;
import android.view.SurfaceView;
import android.view.View;
import android.widget.FrameLayout;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* renamed from: c71, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2456c71 extends AbstractC4056gw0 {
    public SurfaceView e;
    public final SurfaceHolderCallbackC2266b71 f;

    public C2456c71(FrameLayout frameLayout, C4303iD0 c4303iD0) {
        super(frameLayout, c4303iD0);
        this.f = new SurfaceHolderCallbackC2266b71(this);
    }

    @Override // defpackage.AbstractC4056gw0
    public final View e() {
        return this.e;
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [a71] */
    @Override // defpackage.AbstractC4056gw0
    public final Bitmap f() {
        SurfaceView surfaceView = this.e;
        if (surfaceView == null || surfaceView.getHolder().getSurface() == null || !this.e.getHolder().getSurface().isValid()) {
            return null;
        }
        final Semaphore semaphore = new Semaphore(0);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(this.e.getWidth(), this.e.getHeight(), Bitmap.Config.ARGB_8888);
        HandlerThread handlerThread = new HandlerThread("pixelCopyRequest Thread");
        handlerThread.start();
        PixelCopy.request(this.e, bitmapCreateBitmap, (PixelCopy.OnPixelCopyFinishedListener) new PixelCopy.OnPixelCopyFinishedListener() { // from class: a71
            @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
            public final void onPixelCopyFinished(int i) {
                Semaphore semaphore2 = semaphore;
                if (i == 0) {
                    AbstractC0759Jm0.f("SurfaceViewImpl");
                } else {
                    AbstractC0759Jm0.f("SurfaceViewImpl");
                }
                semaphore2.release();
            }
        }, new Handler(handlerThread.getLooper()));
        try {
            try {
                if (!semaphore.tryAcquire(1, 100L, TimeUnit.MILLISECONDS)) {
                    AbstractC0759Jm0.f("SurfaceViewImpl");
                }
            } catch (InterruptedException unused) {
                AbstractC0759Jm0.f("SurfaceViewImpl");
            }
            return bitmapCreateBitmap;
        } finally {
            handlerThread.quitSafely();
        }
    }

    @Override // defpackage.AbstractC4056gw0
    public final void i(Z61 z61, C4290i9 c4290i9) {
        SurfaceView surfaceView = this.e;
        boolean zEquals = Objects.equals((Size) this.b, z61.b);
        if (surfaceView == null || !zEquals) {
            this.b = z61.b;
            FrameLayout frameLayout = (FrameLayout) this.c;
            frameLayout.getClass();
            ((Size) this.b).getClass();
            SurfaceView surfaceView2 = new SurfaceView(frameLayout.getContext());
            this.e = surfaceView2;
            surfaceView2.setLayoutParams(new FrameLayout.LayoutParams(((Size) this.b).getWidth(), ((Size) this.b).getHeight()));
            frameLayout.removeAllViews();
            frameLayout.addView(this.e);
            this.e.getHolder().addCallback(this.f);
        }
        Executor executorC = AbstractC3556eJ.c(this.e.getContext());
        z61.k.a(new N61(3, c4290i9), executorC);
        this.e.post(new RunnableC1313Qp0(this, z61, c4290i9, 11));
    }

    @Override // defpackage.AbstractC4056gw0
    public final InterfaceFutureC0750Jj0 k() {
        return F70.c;
    }

    @Override // defpackage.AbstractC4056gw0
    public final void g() {
    }

    @Override // defpackage.AbstractC4056gw0
    public final void h() {
    }
}
