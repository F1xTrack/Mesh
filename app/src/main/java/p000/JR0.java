package p000;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.bumptech.glide.ComponentCallbacks2C1874a;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class JR0 implements ComponentCallbacks2, InterfaceC7798Ji0 {
    private static final PR0 DECODE_TYPE_BITMAP = (PR0) PR0.decodeTypeOf(Bitmap.class).lock();
    private static final PR0 DECODE_TYPE_GIF = (PR0) PR0.decodeTypeOf(C9186e10.class).lock();
    private static final PR0 DOWNLOAD_ONLY_OPTIONS = (PR0) ((PR0) PR0.diskCacheStrategyOf(AbstractC4046fK.f27137b).priority(EnumC11389vD0.f44275d)).skipMemoryCache(true);
    private final Runnable addSelfToLifecycle;
    private final InterfaceC6918tx connectivityMonitor;
    protected final Context context;
    private final CopyOnWriteArrayList<FR0> defaultRequestListeners;
    protected final ComponentCallbacks2C1874a glide;
    final InterfaceC7486Di0 lifecycle;
    private boolean pauseAllRequestsOnTrimMemoryModerate;
    private PR0 requestOptions;
    private final UR0 requestTracker;
    private final D81 targetTracker;
    private final OR0 treeNode;

    public JR0(ComponentCallbacks2C1874a componentCallbacks2C1874a, InterfaceC7486Di0 interfaceC7486Di0, OR0 or0, Context context) {
        PR0 pr0;
        UR0 ur0 = new UR0();
        C1210TE c1210te = componentCallbacks2C1874a.f17779g;
        this.targetTracker = new D81();
        GR0 gr0 = new GR0(0, this);
        this.addSelfToLifecycle = gr0;
        this.glide = componentCallbacks2C1874a;
        this.lifecycle = interfaceC7486Di0;
        this.treeNode = or0;
        this.requestTracker = ur0;
        this.context = context;
        Context applicationContext = context.getApplicationContext();
        IR0 ir0 = new IR0(this, ur0);
        c1210te.getClass();
        InterfaceC6918tx c1462xe = AbstractC3982eJ.m17899a(applicationContext, "android.permission.ACCESS_NETWORK_STATE") == 0 ? new C1462XE(applicationContext, ir0) : new C11733xw0();
        this.connectivityMonitor = c1462xe;
        if (AbstractC7381Bh1.m810i()) {
            AbstractC7381Bh1.m807f().post(gr0);
        } else {
            interfaceC7486Di0.mo1844k(this);
        }
        interfaceC7486Di0.mo1844k(c1462xe);
        this.defaultRequestListeners = new CopyOnWriteArrayList<>(componentCallbacks2C1874a.f17776d.f45265e);
        C11617x10 c11617x10 = componentCallbacks2C1874a.f17776d;
        synchronized (c11617x10) {
            try {
                if (c11617x10.f45270j == null) {
                    c11617x10.f45264d.getClass();
                    PR0 pr02 = new PR0();
                    pr02.lock();
                    c11617x10.f45270j = pr02;
                }
                pr0 = c11617x10.f45270j;
            } catch (Throwable th) {
                throw th;
            }
        }
        setRequestOptions(pr0);
        componentCallbacks2C1874a.m10889e(this);
    }

    public JR0 addDefaultRequestListener(FR0 fr0) {
        this.defaultRequestListeners.add(fr0);
        return this;
    }

    public synchronized JR0 applyDefaultRequestOptions(PR0 pr0) {
        m4326d(pr0);
        return this;
    }

    /* renamed from: as */
    public C11671xR0 mo4325as(Class cls) {
        return new C11671xR0(this.glide, this, cls, this.context);
    }

    public C11671xR0 asBitmap() {
        return mo4325as(Bitmap.class).apply((AbstractC0106Bg) DECODE_TYPE_BITMAP);
    }

    public C11671xR0 asDrawable() {
        return mo4325as(Drawable.class);
    }

    public C11671xR0 asGif() {
        return mo4325as(C9186e10.class).apply((AbstractC0106Bg) DECODE_TYPE_GIF);
    }

    public void clear(View view) {
        clear(new HR0(view));
    }

    /* renamed from: d */
    public final synchronized void m4326d(PR0 pr0) {
        this.requestOptions = (PR0) this.requestOptions.apply(pr0);
    }

    public C11671xR0 downloadOnly() {
        return mo4325as(File.class).apply((AbstractC0106Bg) DOWNLOAD_ONLY_OPTIONS);
    }

    public List<FR0> getDefaultRequestListeners() {
        return this.defaultRequestListeners;
    }

    public synchronized PR0 getDefaultRequestOptions() {
        return this.requestOptions;
    }

    public <T> AbstractC7839Kc1 getDefaultTransitionOptions(Class<T> cls) {
        C7119x8 c7119x8 = this.glide.f17776d.f45266f;
        AbstractC7839Kc1 abstractC7839Kc1 = (AbstractC7839Kc1) c7119x8.getOrDefault(cls, null);
        if (abstractC7839Kc1 == null) {
            Iterator it = ((C6724r8) c7119x8.entrySet()).iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    abstractC7839Kc1 = (AbstractC7839Kc1) entry.getValue();
                }
            }
        }
        return abstractC7839Kc1 == null ? C11617x10.f45260k : abstractC7839Kc1;
    }

    public synchronized boolean isPaused() {
        return this.requestTracker.f11788c;
    }

    /* renamed from: load */
    public C11671xR0 m26653load(Object obj) {
        return asDrawable().m26632load(obj);
    }

    @Override // p000.InterfaceC7798Ji0
    public synchronized void onDestroy() {
        try {
            this.targetTracker.onDestroy();
            Iterator it = AbstractC7381Bh1.m806e(this.targetTracker.f1860a).iterator();
            while (it.hasNext()) {
                clear((A81) it.next());
            }
            this.targetTracker.f1860a.clear();
            UR0 ur0 = this.requestTracker;
            Iterator it2 = AbstractC7381Bh1.m806e(ur0.f11786a).iterator();
            while (it2.hasNext()) {
                ur0.m8016a((InterfaceC10905rR0) it2.next());
            }
            ur0.f11787b.clear();
            this.lifecycle.mo1843e(this);
            this.lifecycle.mo1843e(this.connectivityMonitor);
            AbstractC7381Bh1.m807f().removeCallbacks(this.addSelfToLifecycle);
            this.glide.m10890g(this);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p000.InterfaceC7798Ji0
    public synchronized void onStart() {
        resumeRequests();
        this.targetTracker.onStart();
    }

    @Override // p000.InterfaceC7798Ji0
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
        ur0.f11788c = true;
        Iterator it = AbstractC7381Bh1.m806e(ur0.f11786a).iterator();
        while (it.hasNext()) {
            InterfaceC10905rR0 interfaceC10905rR0 = (InterfaceC10905rR0) it.next();
            if (interfaceC10905rR0.isRunning() || interfaceC10905rR0.mo4126k()) {
                interfaceC10905rR0.clear();
                ur0.f11787b.add(interfaceC10905rR0);
            }
        }
    }

    public synchronized void pauseAllRequestsRecursive() {
        pauseAllRequests();
        Iterator it = this.treeNode.mo53F0().iterator();
        while (it.hasNext()) {
            ((JR0) it.next()).pauseAllRequests();
        }
    }

    public synchronized void pauseRequests() {
        UR0 ur0 = this.requestTracker;
        ur0.f11788c = true;
        Iterator it = AbstractC7381Bh1.m806e(ur0.f11786a).iterator();
        while (it.hasNext()) {
            InterfaceC10905rR0 interfaceC10905rR0 = (InterfaceC10905rR0) it.next();
            if (interfaceC10905rR0.isRunning()) {
                interfaceC10905rR0.pause();
                ur0.f11787b.add(interfaceC10905rR0);
            }
        }
    }

    public synchronized void pauseRequestsRecursive() {
        pauseRequests();
        Iterator it = this.treeNode.mo53F0().iterator();
        while (it.hasNext()) {
            ((JR0) it.next()).pauseRequests();
        }
    }

    public synchronized void resumeRequests() {
        UR0 ur0 = this.requestTracker;
        ur0.f11788c = false;
        Iterator it = AbstractC7381Bh1.m806e(ur0.f11786a).iterator();
        while (it.hasNext()) {
            InterfaceC10905rR0 interfaceC10905rR0 = (InterfaceC10905rR0) it.next();
            if (!interfaceC10905rR0.mo4126k() && !interfaceC10905rR0.isRunning()) {
                interfaceC10905rR0.mo4125j();
            }
        }
        ur0.f11787b.clear();
    }

    public synchronized void resumeRequestsRecursive() {
        AbstractC7381Bh1.m802a();
        resumeRequests();
        Iterator it = this.treeNode.mo53F0().iterator();
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
        this.requestOptions = (PR0) ((PR0) pr0.mo26596clone()).autoClone();
    }

    public synchronized String toString() {
        return super.toString() + "{tracker=" + this.requestTracker + ", treeNode=" + this.treeNode + "}";
    }

    public synchronized void track(A81 a81, InterfaceC10905rR0 interfaceC10905rR0) {
        this.targetTracker.f1860a.add(a81);
        UR0 ur0 = this.requestTracker;
        ur0.f11786a.add(interfaceC10905rR0);
        if (ur0.f11788c) {
            interfaceC10905rR0.clear();
            ur0.f11787b.add(interfaceC10905rR0);
        } else {
            interfaceC10905rR0.mo4125j();
        }
    }

    public synchronized boolean untrack(A81 a81) {
        InterfaceC10905rR0 interfaceC10905rR0Mo83h = a81.mo83h();
        if (interfaceC10905rR0Mo83h == null) {
            return true;
        }
        if (!this.requestTracker.m8016a(interfaceC10905rR0Mo83h)) {
            return false;
        }
        this.targetTracker.f1860a.remove(a81);
        a81.mo79c(null);
        return true;
    }

    public void clear(A81 a81) {
        if (a81 == null) {
            return;
        }
        boolean zUntrack = untrack(a81);
        InterfaceC10905rR0 interfaceC10905rR0Mo83h = a81.mo83h();
        if (zUntrack) {
            return;
        }
        ComponentCallbacks2C1874a componentCallbacks2C1874a = this.glide;
        synchronized (componentCallbacks2C1874a.f17780h) {
            try {
                Iterator it = componentCallbacks2C1874a.f17780h.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((JR0) it.next()).untrack(a81)) {
                        }
                    } else if (interfaceC10905rR0Mo83h != null) {
                        a81.mo79c(null);
                        interfaceC10905rR0Mo83h.clear();
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
