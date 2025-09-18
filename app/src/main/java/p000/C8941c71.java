package p000;

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
public final class C8941c71 extends AbstractC9559gw0 {

    /* renamed from: e */
    public SurfaceView f17329e;

    /* renamed from: f */
    public final SurfaceHolderCallbackC8813b71 f17330f;

    public C8941c71(FrameLayout frameLayout, C9725iD0 c9725iD0) {
        super(frameLayout, c9725iD0);
        this.f17330f = new SurfaceHolderCallbackC8813b71(this);
    }

    @Override // p000.AbstractC9559gw0
    /* renamed from: e */
    public final View mo6588e() {
        return this.f17329e;
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [a71] */
    @Override // p000.AbstractC9559gw0
    /* renamed from: f */
    public final Bitmap mo6589f() {
        SurfaceView surfaceView = this.f17329e;
        if (surfaceView == null || surfaceView.getHolder().getSurface() == null || !this.f17329e.getHolder().getSurface().isValid()) {
            return null;
        }
        final Semaphore semaphore = new Semaphore(0);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(this.f17329e.getWidth(), this.f17329e.getHeight(), Bitmap.Config.ARGB_8888);
        HandlerThread handlerThread = new HandlerThread("pixelCopyRequest Thread");
        handlerThread.start();
        PixelCopy.request(this.f17329e, bitmapCreateBitmap, (PixelCopy.OnPixelCopyFinishedListener) new PixelCopy.OnPixelCopyFinishedListener() { // from class: a71
            @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
            public final void onPixelCopyFinished(int i) {
                Semaphore semaphore2 = semaphore;
                if (i == 0) {
                    AbstractC7806Jm0.m4412f("SurfaceViewImpl");
                } else {
                    AbstractC7806Jm0.m4412f("SurfaceViewImpl");
                }
                semaphore2.release();
            }
        }, new Handler(handlerThread.getLooper()));
        try {
            try {
                if (!semaphore.tryAcquire(1, 100L, TimeUnit.MILLISECONDS)) {
                    AbstractC7806Jm0.m4412f("SurfaceViewImpl");
                }
            } catch (InterruptedException unused) {
                AbstractC7806Jm0.m4412f("SurfaceViewImpl");
            }
            return bitmapCreateBitmap;
        } finally {
            handlerThread.quitSafely();
        }
    }

    @Override // p000.AbstractC9559gw0
    /* renamed from: i */
    public final void mo6592i(Z61 z61, C4224i9 c4224i9) {
        SurfaceView surfaceView = this.f17329e;
        boolean zEquals = Objects.equals((Size) this.f28105b, z61.f14738b);
        if (surfaceView == null || !zEquals) {
            this.f28105b = z61.f14738b;
            FrameLayout frameLayout = (FrameLayout) this.f28106c;
            frameLayout.getClass();
            ((Size) this.f28105b).getClass();
            SurfaceView surfaceView2 = new SurfaceView(frameLayout.getContext());
            this.f17329e = surfaceView2;
            surfaceView2.setLayoutParams(new FrameLayout.LayoutParams(((Size) this.f28105b).getWidth(), ((Size) this.f28105b).getHeight()));
            frameLayout.removeAllViews();
            frameLayout.addView(this.f17329e);
            this.f17329e.getHolder().addCallback(this.f17330f);
        }
        Executor executorM17901c = AbstractC3982eJ.m17901c(this.f17329e.getContext());
        z61.f14747k.m2374a(new N61(3, c4224i9), executorM17901c);
        this.f17329e.post(new RunnableC8176Qp0(this, z61, c4224i9, 11));
    }

    @Override // p000.AbstractC9559gw0
    /* renamed from: k */
    public final InterfaceFutureC7800Jj0 mo6593k() {
        return F70.f3069c;
    }

    @Override // p000.AbstractC9559gw0
    /* renamed from: g */
    public final void mo6590g() {
    }

    @Override // p000.AbstractC9559gw0
    /* renamed from: h */
    public final void mo6591h() {
    }
}
