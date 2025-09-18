package p000;

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

/* renamed from: mM */
/* loaded from: classes.dex */
public final class C6421mM implements SurfaceTexture.OnFrameAvailableListener {

    /* renamed from: a */
    public final C6295kM f37639a;

    /* renamed from: b */
    public final HandlerThread f37640b;

    /* renamed from: c */
    public final C20 f37641c;

    /* renamed from: d */
    public final Handler f37642d;

    /* renamed from: e */
    public int f37643e;

    /* renamed from: f */
    public boolean f37644f;

    /* renamed from: g */
    public final AtomicBoolean f37645g;

    /* renamed from: h */
    public final LinkedHashMap f37646h;

    /* renamed from: i */
    public SurfaceTexture f37647i;

    /* renamed from: j */
    public SurfaceTexture f37648j;

    public C6421mM(C0149CM c0149cm, C6205iw c6205iw, C6205iw c6205iw2) {
        Map mapEmptyMap = Collections.emptyMap();
        this.f37643e = 0;
        this.f37644f = false;
        this.f37645g = new AtomicBoolean(false);
        this.f37646h = new LinkedHashMap();
        HandlerThread handlerThread = new HandlerThread("CameraX-GL Thread");
        this.f37640b = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.f37642d = handler;
        this.f37641c = new C20(handler);
        this.f37639a = new C6295kM(c6205iw, c6205iw2);
        try {
            try {
                AbstractC11797yQ1.m26149b(new C4224i9(this, c0149cm, mapEmptyMap, 8)).get();
            } catch (InterruptedException | ExecutionException e) {
                e = e;
                e = e instanceof ExecutionException ? e.getCause() : e;
                if (!(e instanceof RuntimeException)) {
                    throw new IllegalStateException("Failed to create DefaultSurfaceProcessor", e);
                }
                throw ((RuntimeException) e);
            }
        } catch (RuntimeException e2) {
            m22811d();
            throw e2;
        }
    }

    /* renamed from: a */
    public final void m22808a() {
        if (this.f37644f && this.f37643e == 0) {
            LinkedHashMap linkedHashMap = this.f37646h;
            Iterator it = linkedHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((T61) it.next()).close();
            }
            linkedHashMap.clear();
            C6295kM c6295kM = this.f37639a;
            if (((AtomicBoolean) c6295kM.f40464d).getAndSet(false)) {
                AbstractC9055d00.m17454c((Thread) c6295kM.f40466f);
                c6295kM.m23913i();
            }
            c6295kM.f36439o = -1;
            c6295kM.f36440p = -1;
            this.f37640b.quit();
        }
    }

    /* renamed from: b */
    public final void m22809b(Runnable runnable, Runnable runnable2) {
        try {
            this.f37641c.execute(new RunnableC8339Ts1(this, runnable2, runnable, 19));
        } catch (RejectedExecutionException unused) {
            AbstractC7806Jm0.m4412f("DualSurfaceProcessor");
            runnable2.run();
        }
    }

    /* renamed from: c */
    public final void m22810c(Z61 z61) {
        if (this.f37645g.get()) {
            z61.m9493d();
        } else {
            m22809b(new RunnableC3973eA(this, 16, z61), new RunnableC0521IG(z61, 0));
        }
    }

    /* renamed from: d */
    public final void m22811d() {
        if (this.f37645g.getAndSet(true)) {
            return;
        }
        m22809b(new RunnableC0204DE(10, this), new RunnableC0004A3(1));
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        SurfaceTexture surfaceTexture2;
        if (this.f37645g.get() || (surfaceTexture2 = this.f37647i) == null || this.f37648j == null) {
            return;
        }
        surfaceTexture2.updateTexImage();
        this.f37648j.updateTexImage();
        for (Map.Entry entry : this.f37646h.entrySet()) {
            Surface surface = (Surface) entry.getValue();
            T61 t61 = (T61) entry.getKey();
            if (t61.f11158c == 34) {
                try {
                    this.f37639a.m22193n(surfaceTexture.getTimestamp(), surface, t61, this.f37647i, this.f37648j);
                } catch (RuntimeException unused) {
                    AbstractC7806Jm0.m4412f("DualSurfaceProcessor");
                }
            }
        }
    }
}
