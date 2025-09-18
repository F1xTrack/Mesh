package defpackage;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.bumptech.glide.a;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class JR0 implements ComponentCallbacks2, InterfaceC0747Ji0 {
    private static final PR0 DECODE_TYPE_BITMAP = (PR0) PR0.decodeTypeOf(Bitmap.class).lock();
    private static final PR0 DECODE_TYPE_GIF = (PR0) PR0.decodeTypeOf(C3500e10.class).lock();
    private static final PR0 DOWNLOAD_ONLY_OPTIONS = (PR0) ((PR0) PR0.diskCacheStrategyOf(AbstractC3750fK.b).priority(EnumC7561vD0.d)).skipMemoryCache(true);
    private final Runnable addSelfToLifecycle;
    private final InterfaceC7316tx connectivityMonitor;
    protected final Context context;
    private final CopyOnWriteArrayList<FR0> defaultRequestListeners;
    protected final a glide;
    final InterfaceC0279Di0 lifecycle;
    private boolean pauseAllRequestsOnTrimMemoryModerate;
    private PR0 requestOptions;
    private final UR0 requestTracker;
    private final D81 targetTracker;
    private final OR0 treeNode;

    public JR0(a aVar, InterfaceC0279Di0 interfaceC0279Di0, OR0 or0, Context context) {
        PR0 pr0;
        UR0 ur0 = new UR0();
        TE te = aVar.g;
        this.targetTracker = new D81();
        GR0 gr0 = new GR0(0, this);
        this.addSelfToLifecycle = gr0;
        this.glide = aVar;
        this.lifecycle = interfaceC0279Di0;
        this.treeNode = or0;
        this.requestTracker = ur0;
        this.context = context;
        Context applicationContext = context.getApplicationContext();
        IR0 ir0 = new IR0(this, ur0);
        te.getClass();
        InterfaceC7316tx xe = AbstractC3556eJ.a(applicationContext, "android.permission.ACCESS_NETWORK_STATE") == 0 ? new XE(applicationContext, ir0) : new C8076xw0();
        this.connectivityMonitor = xe;
        if (AbstractC0121Bh1.i()) {
            AbstractC0121Bh1.f().post(gr0);
        } else {
            interfaceC0279Di0.k(this);
        }
        interfaceC0279Di0.k(xe);
        this.defaultRequestListeners = new CopyOnWriteArrayList<>(aVar.d.e);
        C7903x10 c7903x10 = aVar.d;
        synchronized (c7903x10) {
            try {
                if (c7903x10.j == null) {
                    c7903x10.d.getClass();
                    PR0 pr02 = new PR0();
                    pr02.lock();
                    c7903x10.j = pr02;
                }
                pr0 = c7903x10.j;
            } catch (Throwable th) {
                throw th;
            }
        }
        setRequestOptions(pr0);
        aVar.e(this);
    }

    public JR0 addDefaultRequestListener(FR0 fr0) {
        this.defaultRequestListeners.add(fr0);
        return this;
    }

    public synchronized JR0 applyDefaultRequestOptions(PR0 pr0) {
        d(pr0);
        return this;
    }

    public C7983xR0 as(Class cls) {
        return new C7983xR0(this.glide, this, cls, this.context);
    }

    public C7983xR0 asBitmap() {
        return as(Bitmap.class).apply((AbstractC0116Bg) DECODE_TYPE_BITMAP);
    }

    public C7983xR0 asDrawable() {
        return as(Drawable.class);
    }

    public C7983xR0 asGif() {
        return as(C3500e10.class).apply((AbstractC0116Bg) DECODE_TYPE_GIF);
    }

    public void clear(View view) {
        clear(new HR0(view));
    }

    public final synchronized void d(PR0 pr0) {
        this.requestOptions = (PR0) this.requestOptions.apply(pr0);
    }

    public C7983xR0 downloadOnly() {
        return as(File.class).apply((AbstractC0116Bg) DOWNLOAD_ONLY_OPTIONS);
    }

    public List<FR0> getDefaultRequestListeners() {
        return this.defaultRequestListeners;
    }

    public synchronized PR0 getDefaultRequestOptions() {
        return this.requestOptions;
    }

    public <T> AbstractC0808Kc1 getDefaultTransitionOptions(Class<T> cls) {
        C7925x8 c7925x8 = this.glide.d.f;
        AbstractC0808Kc1 abstractC0808Kc1 = (AbstractC0808Kc1) c7925x8.getOrDefault(cls, null);
        if (abstractC0808Kc1 == null) {
            Iterator it = ((C6781r8) c7925x8.entrySet()).iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    abstractC0808Kc1 = (AbstractC0808Kc1) entry.getValue();
                }
            }
        }
        return abstractC0808Kc1 == null ? C7903x10.k : abstractC0808Kc1;
    }

    public synchronized boolean isPaused() {
        return this.requestTracker.c;
    }

    /* renamed from: load */
    public C7983xR0 m59load(Object obj) {
        return asDrawable().m38load(obj);
    }

    @Override // defpackage.InterfaceC0747Ji0
    public synchronized void onDestroy() {
        try {
            this.targetTracker.onDestroy();
            Iterator it = AbstractC0121Bh1.e(this.targetTracker.a).iterator();
            while (it.hasNext()) {
                clear((A81) it.next());
            }
            this.targetTracker.a.clear();
            UR0 ur0 = this.requestTracker;
            Iterator it2 = AbstractC0121Bh1.e(ur0.a).iterator();
            while (it2.hasNext()) {
                ur0.a((InterfaceC6839rR0) it2.next());
            }
            ur0.b.clear();
            this.lifecycle.e(this);
            this.lifecycle.e(this.connectivityMonitor);
            AbstractC0121Bh1.f().removeCallbacks(this.addSelfToLifecycle);
            this.glide.g(this);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.InterfaceC0747Ji0
    public synchronized void onStart() {
        resumeRequests();
        this.targetTracker.onStart();
    }

    @Override // defpackage.InterfaceC0747Ji0
    public synchronized void onStop() {
        pauseRequests();
        this.targetTracker.onStop();
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        if (i == 60 && this.pauseAllRequestsOnTrimMemoryModerate) {
            pauseAllRequestsRecursive();
        }
    }

    public synchronized void pauseAllRequests() {
        UR0 ur0 = this.requestTracker;
        ur0.c = true;
        Iterator it = AbstractC0121Bh1.e(ur0.a).iterator();
        while (it.hasNext()) {
            InterfaceC6839rR0 interfaceC6839rR0 = (InterfaceC6839rR0) it.next();
            if (interfaceC6839rR0.isRunning() || interfaceC6839rR0.k()) {
                interfaceC6839rR0.clear();
                ur0.b.add(interfaceC6839rR0);
            }
        }
    }

    public synchronized void pauseAllRequestsRecursive() {
        pauseAllRequests();
        Iterator it = this.treeNode.F0().iterator();
        while (it.hasNext()) {
            ((JR0) it.next()).pauseAllRequests();
        }
    }

    public synchronized void pauseRequests() {
        UR0 ur0 = this.requestTracker;
        ur0.c = true;
        Iterator it = AbstractC0121Bh1.e(ur0.a).iterator();
        while (it.hasNext()) {
            InterfaceC6839rR0 interfaceC6839rR0 = (InterfaceC6839rR0) it.next();
            if (interfaceC6839rR0.isRunning()) {
                interfaceC6839rR0.pause();
                ur0.b.add(interfaceC6839rR0);
            }
        }
    }

    public synchronized void pauseRequestsRecursive() {
        pauseRequests();
        Iterator it = this.treeNode.F0().iterator();
        while (it.hasNext()) {
            ((JR0) it.next()).pauseRequests();
        }
    }

    public synchronized void resumeRequests() {
        UR0 ur0 = this.requestTracker;
        ur0.c = false;
        Iterator it = AbstractC0121Bh1.e(ur0.a).iterator();
        while (it.hasNext()) {
            InterfaceC6839rR0 interfaceC6839rR0 = (InterfaceC6839rR0) it.next();
            if (!interfaceC6839rR0.k() && !interfaceC6839rR0.isRunning()) {
                interfaceC6839rR0.j();
            }
        }
        ur0.b.clear();
    }

    public synchronized void resumeRequestsRecursive() {
        AbstractC0121Bh1.a();
        resumeRequests();
        Iterator it = this.treeNode.F0().iterator();
        while (it.hasNext()) {
            ((JR0) it.next()).resumeRequests();
        }
    }

    public synchronized JR0 setDefaultRequestOptions(PR0 pr0) {
        setRequestOptions(pr0);
        return this;
    }

    public void setPauseAllRequestsOnTrimMemoryModerate(boolean z) {
        this.pauseAllRequestsOnTrimMemoryModerate = z;
    }

    public synchronized void setRequestOptions(PR0 pr0) {
        this.requestOptions = (PR0) ((PR0) pr0.mo0clone()).autoClone();
    }

    public synchronized String toString() {
        return super.toString() + "{tracker=" + this.requestTracker + ", treeNode=" + this.treeNode + "}";
    }

    public synchronized void track(A81 a81, InterfaceC6839rR0 interfaceC6839rR0) {
        this.targetTracker.a.add(a81);
        UR0 ur0 = this.requestTracker;
        ur0.a.add(interfaceC6839rR0);
        if (ur0.c) {
            interfaceC6839rR0.clear();
            ur0.b.add(interfaceC6839rR0);
        } else {
            interfaceC6839rR0.j();
        }
    }

    public synchronized boolean untrack(A81 a81) {
        InterfaceC6839rR0 interfaceC6839rR0H = a81.h();
        if (interfaceC6839rR0H == null) {
            return true;
        }
        if (!this.requestTracker.a(interfaceC6839rR0H)) {
            return false;
        }
        this.targetTracker.a.remove(a81);
        a81.c(null);
        return true;
    }

    public void clear(A81 a81) {
        if (a81 == null) {
            return;
        }
        boolean zUntrack = untrack(a81);
        InterfaceC6839rR0 interfaceC6839rR0H = a81.h();
        if (zUntrack) {
            return;
        }
        a aVar = this.glide;
        synchronized (aVar.h) {
            try {
                Iterator it = aVar.h.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((JR0) it.next()).untrack(a81)) {
                        }
                    } else if (interfaceC6839rR0H != null) {
                        a81.c(null);
                        interfaceC6839rR0H.clear();
                    }
                }
            } finally {
            }
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }
}
