package androidx.lifecycle;

import android.os.Looper;
import defpackage.AbstractC2191ak0;
import defpackage.AbstractC8235ym;
import defpackage.C1997Zj0;
import defpackage.C4287i8;
import defpackage.EnumC0201Ci0;
import defpackage.GR0;
import defpackage.InterfaceC0903Li0;
import defpackage.InterfaceC3677ex0;
import defpackage.UU0;
import defpackage.WU0;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class b {
    public static final Object k = new Object();
    public final Object a;
    public final WU0 b;
    public int c;
    public boolean d;
    public volatile Object e;
    public volatile Object f;
    public int g;
    public boolean h;
    public boolean i;
    public final GR0 j;

    public b(Object obj) {
        this.a = new Object();
        this.b = new WU0();
        this.c = 0;
        this.f = k;
        this.j = new GR0(29, this);
        this.e = obj;
        this.g = 0;
    }

    public static void a(String str) {
        C4287i8.c().a.getClass();
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException(AbstractC8235ym.k("Cannot invoke ", str, " on a background thread"));
        }
    }

    public final void b(AbstractC2191ak0 abstractC2191ak0) {
        if (abstractC2191ak0.b) {
            if (!abstractC2191ak0.d()) {
                abstractC2191ak0.a(false);
                return;
            }
            int i = abstractC2191ak0.c;
            int i2 = this.g;
            if (i >= i2) {
                return;
            }
            abstractC2191ak0.c = i2;
            abstractC2191ak0.a.r0(this.e);
        }
    }

    public final void c(AbstractC2191ak0 abstractC2191ak0) {
        if (this.h) {
            this.i = true;
            return;
        }
        this.h = true;
        do {
            this.i = false;
            if (abstractC2191ak0 != null) {
                b(abstractC2191ak0);
                abstractC2191ak0 = null;
            } else {
                WU0 wu0 = this.b;
                wu0.getClass();
                UU0 uu0 = new UU0(wu0);
                wu0.c.put(uu0, Boolean.FALSE);
                while (uu0.hasNext()) {
                    b((AbstractC2191ak0) ((Map.Entry) uu0.next()).getValue());
                    if (this.i) {
                        break;
                    }
                }
            }
        } while (this.i);
        this.h = false;
    }

    public Object d() {
        Object obj = this.e;
        if (obj != k) {
            return obj;
        }
        return null;
    }

    public final void e(InterfaceC0903Li0 interfaceC0903Li0, InterfaceC3677ex0 interfaceC3677ex0) {
        a("observe");
        if (((a) interfaceC0903Li0.getLifecycle()).c == EnumC0201Ci0.a) {
            return;
        }
        LiveData$LifecycleBoundObserver liveData$LifecycleBoundObserver = new LiveData$LifecycleBoundObserver(this, interfaceC0903Li0, interfaceC3677ex0);
        AbstractC2191ak0 abstractC2191ak0 = (AbstractC2191ak0) this.b.d(interfaceC3677ex0, liveData$LifecycleBoundObserver);
        if (abstractC2191ak0 != null && !abstractC2191ak0.c(interfaceC0903Li0)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (abstractC2191ak0 != null) {
            return;
        }
        interfaceC0903Li0.getLifecycle().a(liveData$LifecycleBoundObserver);
    }

    public final void f(InterfaceC3677ex0 interfaceC3677ex0) {
        a("observeForever");
        C1997Zj0 c1997Zj0 = new C1997Zj0(this, interfaceC3677ex0);
        AbstractC2191ak0 abstractC2191ak0 = (AbstractC2191ak0) this.b.d(interfaceC3677ex0, c1997Zj0);
        if (abstractC2191ak0 instanceof LiveData$LifecycleBoundObserver) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (abstractC2191ak0 != null) {
            return;
        }
        c1997Zj0.a(true);
    }

    public void g() {
    }

    public void h() {
    }

    public void i(InterfaceC3677ex0 interfaceC3677ex0) {
        a("removeObserver");
        AbstractC2191ak0 abstractC2191ak0 = (AbstractC2191ak0) this.b.h(interfaceC3677ex0);
        if (abstractC2191ak0 == null) {
            return;
        }
        abstractC2191ak0.b();
        abstractC2191ak0.a(false);
    }

    public abstract void j(Object obj);

    public b() {
        this.a = new Object();
        this.b = new WU0();
        this.c = 0;
        Object obj = k;
        this.f = obj;
        this.j = new GR0(29, this);
        this.e = obj;
        this.g = -1;
    }
}
