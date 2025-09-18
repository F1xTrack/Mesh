package androidx.camera.lifecycle;

import android.annotation.SuppressLint;
import android.os.Build;
import androidx.lifecycle.C1742a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import p000.AbstractC9402fh1;
import p000.C0743Lo;
import p000.C1561Yo;
import p000.EnumC7382Bi0;
import p000.EnumC7434Ci0;
import p000.InterfaceC6385ln;
import p000.InterfaceC6766ro;
import p000.InterfaceC7850Ki0;
import p000.InterfaceC7902Li0;
import p000.InterfaceC8504Wx0;

@SuppressLint({"UsesNonDefaultVisibleForTesting"})
/* loaded from: classes.dex */
public final class LifecycleCamera implements InterfaceC7850Ki0, InterfaceC6385ln {

    /* renamed from: b */
    public final C0743Lo f16028b;

    /* renamed from: c */
    public final C1561Yo f16029c;

    /* renamed from: a */
    public final Object f16027a = new Object();

    /* renamed from: d */
    public boolean f16030d = false;

    public LifecycleCamera(C0743Lo c0743Lo, C1561Yo c1561Yo) {
        this.f16028b = c0743Lo;
        this.f16029c = c1561Yo;
        C1742a c1742a = c0743Lo.f6872q;
        if (c1742a.f16309c.compareTo(EnumC7434Ci0.f1589d) >= 0) {
            c1561Yo.m9374f();
        } else {
            c1561Yo.m9380u();
        }
        c1742a.mo2368a(this);
    }

    @Override // p000.InterfaceC6385ln
    /* renamed from: b */
    public final InterfaceC6766ro mo1328b() {
        return this.f16029c.f14544q;
    }

    /* renamed from: d */
    public final void m9926d(Collection collection) {
        synchronized (this.f16027a) {
            this.f16029c.m9373d(collection);
        }
    }

    /* renamed from: i */
    public final InterfaceC7902Li0 m9927i() {
        C0743Lo c0743Lo;
        synchronized (this.f16027a) {
            c0743Lo = this.f16028b;
        }
        return c0743Lo;
    }

    @InterfaceC8504Wx0(EnumC7382Bi0.ON_DESTROY)
    public void onDestroy(InterfaceC7902Li0 interfaceC7902Li0) {
        synchronized (this.f16027a) {
            C1561Yo c1561Yo = this.f16029c;
            c1561Yo.m9366G((ArrayList) c1561Yo.m9383z());
        }
    }

    @InterfaceC8504Wx0(EnumC7382Bi0.ON_PAUSE)
    public void onPause(InterfaceC7902Li0 interfaceC7902Li0) {
        if (Build.VERSION.SDK_INT >= 24) {
            this.f16029c.f14528a.mo1336j(false);
        }
    }

    @InterfaceC8504Wx0(EnumC7382Bi0.ON_RESUME)
    public void onResume(InterfaceC7902Li0 interfaceC7902Li0) {
        if (Build.VERSION.SDK_INT >= 24) {
            this.f16029c.f14528a.mo1336j(true);
        }
    }

    @InterfaceC8504Wx0(EnumC7382Bi0.ON_START)
    public void onStart(InterfaceC7902Li0 interfaceC7902Li0) {
        synchronized (this.f16027a) {
            try {
                if (!this.f16030d) {
                    this.f16029c.m9374f();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @InterfaceC8504Wx0(EnumC7382Bi0.ON_STOP)
    public void onStop(InterfaceC7902Li0 interfaceC7902Li0) {
        synchronized (this.f16027a) {
            try {
                if (!this.f16030d) {
                    this.f16029c.m9380u();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: p */
    public final List m9928p() {
        List listUnmodifiableList;
        synchronized (this.f16027a) {
            listUnmodifiableList = Collections.unmodifiableList(this.f16029c.m9383z());
        }
        return listUnmodifiableList;
    }

    /* renamed from: q */
    public final boolean m9929q(AbstractC9402fh1 abstractC9402fh1) {
        boolean zContains;
        synchronized (this.f16027a) {
            zContains = ((ArrayList) this.f16029c.m9383z()).contains(abstractC9402fh1);
        }
        return zContains;
    }

    /* renamed from: r */
    public final void m9930r() {
        synchronized (this.f16027a) {
            try {
                if (this.f16030d) {
                    return;
                }
                onStop(this.f16028b);
                this.f16030d = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: s */
    public final void m9931s(Collection collection) {
        synchronized (this.f16027a) {
            ArrayList arrayList = new ArrayList(collection);
            arrayList.retainAll(this.f16029c.m9383z());
            this.f16029c.m9366G(arrayList);
        }
    }

    /* renamed from: t */
    public final void m9932t() {
        synchronized (this.f16027a) {
            C1561Yo c1561Yo = this.f16029c;
            c1561Yo.m9366G((ArrayList) c1561Yo.m9383z());
        }
    }

    /* renamed from: u */
    public final void m9933u() {
        synchronized (this.f16027a) {
            try {
                if (this.f16030d) {
                    this.f16030d = false;
                    if (this.f16028b.f6872q.f16309c.compareTo(EnumC7434Ci0.f1589d) >= 0) {
                        onStart(this.f16028b);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
