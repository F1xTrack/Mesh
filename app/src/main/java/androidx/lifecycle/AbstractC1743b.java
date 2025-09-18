package androidx.lifecycle;

import android.os.Looper;
import java.util.Map;
import p000.AbstractC7222ym;
import p000.AbstractC8762ak0;
import p000.C4223i8;
import p000.C8632Zj0;
import p000.EnumC7434Ci0;
import p000.GR0;
import p000.InterfaceC7902Li0;
import p000.InterfaceC9305ex0;
import p000.UU0;
import p000.WU0;

/* renamed from: androidx.lifecycle.b */
/* loaded from: classes.dex */
public abstract class AbstractC1743b {

    /* renamed from: k */
    public static final Object f16315k = new Object();

    /* renamed from: a */
    public final Object f16316a;

    /* renamed from: b */
    public final WU0 f16317b;

    /* renamed from: c */
    public int f16318c;

    /* renamed from: d */
    public boolean f16319d;

    /* renamed from: e */
    public volatile Object f16320e;

    /* renamed from: f */
    public volatile Object f16321f;

    /* renamed from: g */
    public int f16322g;

    /* renamed from: h */
    public boolean f16323h;

    /* renamed from: i */
    public boolean f16324i;

    /* renamed from: j */
    public final GR0 f16325j;

    public AbstractC1743b(Object obj) {
        this.f16316a = new Object();
        this.f16317b = new WU0();
        this.f16318c = 0;
        this.f16321f = f16315k;
        this.f16325j = new GR0(29, this);
        this.f16320e = obj;
        this.f16322g = 0;
    }

    /* renamed from: a */
    public static void m10130a(String str) {
        C4223i8.m18971c().f28832a.getClass();
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException(AbstractC7222ym.m26234k("Cannot invoke ", str, " on a background thread"));
        }
    }

    /* renamed from: b */
    public final void m10131b(AbstractC8762ak0 abstractC8762ak0) {
        if (abstractC8762ak0.f15662b) {
            if (!abstractC8762ak0.mo9584d()) {
                abstractC8762ak0.m9798a(false);
                return;
            }
            int i = abstractC8762ak0.f15663c;
            int i2 = this.f16322g;
            if (i >= i2) {
                return;
            }
            abstractC8762ak0.f15663c = i2;
            abstractC8762ak0.f15661a.mo505r0(this.f16320e);
        }
    }

    /* renamed from: c */
    public final void m10132c(AbstractC8762ak0 abstractC8762ak0) {
        if (this.f16323h) {
            this.f16324i = true;
            return;
        }
        this.f16323h = true;
        do {
            this.f16324i = false;
            if (abstractC8762ak0 != null) {
                m10131b(abstractC8762ak0);
                abstractC8762ak0 = null;
            } else {
                WU0 wu0 = this.f16317b;
                wu0.getClass();
                UU0 uu0 = new UU0(wu0);
                wu0.f13216c.put(uu0, Boolean.FALSE);
                while (uu0.hasNext()) {
                    m10131b((AbstractC8762ak0) ((Map.Entry) uu0.next()).getValue());
                    if (this.f16324i) {
                        break;
                    }
                }
            }
        } while (this.f16324i);
        this.f16323h = false;
    }

    /* renamed from: d */
    public Object mo1868d() {
        Object obj = this.f16320e;
        if (obj != f16315k) {
            return obj;
        }
        return null;
    }

    /* renamed from: e */
    public final void m10133e(InterfaceC7902Li0 interfaceC7902Li0, InterfaceC9305ex0 interfaceC9305ex0) {
        m10130a("observe");
        if (((C1742a) interfaceC7902Li0.getLifecycle()).f16309c == EnumC7434Ci0.f1586a) {
            return;
        }
        LiveData$LifecycleBoundObserver liveData$LifecycleBoundObserver = new LiveData$LifecycleBoundObserver(this, interfaceC7902Li0, interfaceC9305ex0);
        AbstractC8762ak0 abstractC8762ak0 = (AbstractC8762ak0) this.f16317b.mo1188d(interfaceC9305ex0, liveData$LifecycleBoundObserver);
        if (abstractC8762ak0 != null && !abstractC8762ak0.mo9800c(interfaceC7902Li0)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (abstractC8762ak0 != null) {
            return;
        }
        interfaceC7902Li0.getLifecycle().mo2368a(liveData$LifecycleBoundObserver);
    }

    /* renamed from: f */
    public final void m10134f(InterfaceC9305ex0 interfaceC9305ex0) {
        m10130a("observeForever");
        C8632Zj0 c8632Zj0 = new C8632Zj0(this, interfaceC9305ex0);
        AbstractC8762ak0 abstractC8762ak0 = (AbstractC8762ak0) this.f16317b.mo1188d(interfaceC9305ex0, c8632Zj0);
        if (abstractC8762ak0 instanceof LiveData$LifecycleBoundObserver) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (abstractC8762ak0 != null) {
            return;
        }
        c8632Zj0.m9798a(true);
    }

    /* renamed from: g */
    public void mo1869g() {
    }

    /* renamed from: h */
    public void mo1870h() {
    }

    /* renamed from: i */
    public void mo10135i(InterfaceC9305ex0 interfaceC9305ex0) {
        m10130a("removeObserver");
        AbstractC8762ak0 abstractC8762ak0 = (AbstractC8762ak0) this.f16317b.mo1189h(interfaceC9305ex0);
        if (abstractC8762ak0 == null) {
            return;
        }
        abstractC8762ak0.mo9799b();
        abstractC8762ak0.m9798a(false);
    }

    /* renamed from: j */
    public abstract void mo2439j(Object obj);

    public AbstractC1743b() {
        this.f16316a = new Object();
        this.f16317b = new WU0();
        this.f16318c = 0;
        Object obj = f16315k;
        this.f16321f = obj;
        this.f16325j = new GR0(29, this);
        this.f16320e = obj;
        this.f16322g = -1;
    }
}
