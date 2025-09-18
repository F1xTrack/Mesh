package defpackage;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: mM, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5869mM implements SurfaceTexture.OnFrameAvailableListener {
    public final C5487kM a;
    public final HandlerThread b;
    public final C20 c;
    public final Handler d;
    public int e;
    public boolean f;
    public final AtomicBoolean g;
    public final LinkedHashMap h;
    public SurfaceTexture i;
    public SurfaceTexture j;

    public C5869mM(CM cm, C5213iw c5213iw, C5213iw c5213iw2) {
        Map mapEmptyMap = Collections.emptyMap();
        this.e = 0;
        this.f = false;
        this.g = new AtomicBoolean(false);
        this.h = new LinkedHashMap();
        HandlerThread handlerThread = new HandlerThread("CameraX-GL Thread");
        this.b = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.d = handler;
        this.c = new C20(handler);
        this.a = new C5487kM(c5213iw, c5213iw2);
        try {
            try {
                AbstractC8171yQ1.b(new C4290i9(this, cm, mapEmptyMap, 8)).get();
            } catch (InterruptedException | ExecutionException e) {
                e = e;
                e = e instanceof ExecutionException ? e.getCause() : e;
                if (!(e instanceof RuntimeException)) {
                    throw new IllegalStateException("Failed to create DefaultSurfaceProcessor", e);
                }
                throw ((RuntimeException) e);
            }
        } catch (RuntimeException e2) {
            d();
            throw e2;
        }
    }

    public final void a() {
        if (this.f && this.e == 0) {
            LinkedHashMap linkedHashMap = this.h;
            Iterator it = linkedHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((T61) it.next()).close();
            }
            linkedHashMap.clear();
            C5487kM c5487kM = this.a;
            if (((AtomicBoolean) c5487kM.d).getAndSet(false)) {
                AbstractC3306d00.c((Thread) c5487kM.f);
                c5487kM.i();
            }
            c5487kM.o = -1;
            c5487kM.p = -1;
            this.b.quit();
        }
    }

    public final void b(Runnable runnable, Runnable runnable2) {
        try {
            this.c.execute(new RunnableC1557Ts1(this, runnable2, runnable, 19));
        } catch (RejectedExecutionException unused) {
            AbstractC0759Jm0.f("DualSurfaceProcessor");
            runnable2.run();
        }
    }

    public final void c(Z61 z61) {
        if (this.g.get()) {
            z61.d();
        } else {
            b(new RunnableC3529eA(this, 16, z61), new IG(z61, 0));
        }
    }

    public final void d() {
        if (this.g.getAndSet(true)) {
            return;
        }
        b(new DE(10, this), new A3(1));
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        SurfaceTexture surfaceTexture2;
        if (this.g.get() || (surfaceTexture2 = this.i) == null || this.j == null) {
            return;
        }
        surfaceTexture2.updateTexImage();
        this.j.updateTexImage();
        for (Map.Entry entry : this.h.entrySet()) {
            Surface surface = (Surface) entry.getValue();
            T61 t61 = (T61) entry.getKey();
            if (t61.c == 34) {
                try {
                    this.a.n(surfaceTexture.getTimestamp(), surface, t61, this.i, this.j);
                } catch (RuntimeException unused) {
                    AbstractC0759Jm0.f("DualSurfaceProcessor");
                }
            }
        }
    }
}
