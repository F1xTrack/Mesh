package androidx.activity;

import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.C1742a;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import p000.AbstractC7538Ei0;
import p000.C0767MB;
import p000.C1648aB;
import p000.C6470n8;
import p000.C7568Ex0;
import p000.C7620Fx0;
import p000.C7672Gx0;
import p000.C7776Ix0;
import p000.EnumC7434Ci0;
import p000.InterfaceC7902Li0;
import p000.O90;

/* renamed from: androidx.activity.a */
/* loaded from: classes.dex */
public final class C1690a {

    /* renamed from: a */
    public final Runnable f15742a;

    /* renamed from: b */
    public final C6470n8 f15743b = new C6470n8();

    /* renamed from: c */
    public C0767MB f15744c;

    /* renamed from: d */
    public final OnBackInvokedCallback f15745d;

    /* renamed from: e */
    public OnBackInvokedDispatcher f15746e;

    /* renamed from: f */
    public boolean f15747f;

    /* renamed from: g */
    public boolean f15748g;

    public C1690a(Runnable runnable) {
        this.f15742a = runnable;
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            this.f15745d = i >= 34 ? C7776Ix0.f5230a.m4087a(new C7568Ex0(this, 0), new C7568Ex0(this, 1), new C7620Fx0(this, 0), new C7620Fx0(this, 1)) : C7672Gx0.f3971a.m3201a(new C7620Fx0(this, 2));
        }
    }

    /* renamed from: a */
    public final void m9819a(InterfaceC7902Li0 interfaceC7902Li0, C0767MB c0767mb) {
        O90.m5968f(c0767mb, "onBackPressedCallback");
        AbstractC7538Ei0 lifecycle = interfaceC7902Li0.getLifecycle();
        if (((C1742a) lifecycle).f16309c == EnumC7434Ci0.f1586a) {
            return;
        }
        c0767mb.f7027b.add(new OnBackPressedDispatcher$LifecycleOnBackPressedCancellable(this, lifecycle, c0767mb));
        m9823e();
        c0767mb.f7028c = new C1648aB(0, this, C1690a.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0, 4);
    }

    /* renamed from: b */
    public final void m9820b() {
        Object objPrevious;
        if (this.f15744c == null) {
            C6470n8 c6470n8 = this.f15743b;
            ListIterator<E> listIterator = c6470n8.listIterator(c6470n8.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                } else {
                    objPrevious = listIterator.previous();
                    if (((C0767MB) objPrevious).f7026a) {
                        break;
                    }
                }
            }
        }
        this.f15744c = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    /* renamed from: c */
    public final void m9821c() {
        C0767MB c0767mbPrevious;
        C0767MB c0767mb = this.f15744c;
        if (c0767mb == null) {
            C6470n8 c6470n8 = this.f15743b;
            ListIterator listIterator = c6470n8.listIterator(c6470n8.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    c0767mbPrevious = 0;
                    break;
                } else {
                    c0767mbPrevious = listIterator.previous();
                    if (((C0767MB) c0767mbPrevious).f7026a) {
                        break;
                    }
                }
            }
            c0767mb = c0767mbPrevious;
        }
        this.f15744c = null;
        if (c0767mb != null) {
            c0767mb.m5283a();
            return;
        }
        Runnable runnable = this.f15742a;
        if (runnable != null) {
            runnable.run();
        }
    }

    /* renamed from: d */
    public final void m9822d(boolean z) {
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f15746e;
        OnBackInvokedCallback onBackInvokedCallback = this.f15745d;
        if (onBackInvokedDispatcher == null || onBackInvokedCallback == null) {
            return;
        }
        C7672Gx0 c7672Gx0 = C7672Gx0.f3971a;
        if (z && !this.f15747f) {
            c7672Gx0.m3202b(onBackInvokedDispatcher, 0, onBackInvokedCallback);
            this.f15747f = true;
        } else {
            if (z || !this.f15747f) {
                return;
            }
            c7672Gx0.m3203c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f15747f = false;
        }
    }

    /* renamed from: e */
    public final void m9823e() {
        boolean z = this.f15748g;
        C6470n8 c6470n8 = this.f15743b;
        boolean z2 = false;
        if (!(c6470n8 instanceof Collection) || !c6470n8.isEmpty()) {
            Iterator<E> it = c6470n8.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((C0767MB) it.next()).f7026a) {
                    z2 = true;
                    break;
                }
            }
        }
        this.f15748g = z2;
        if (z2 == z || Build.VERSION.SDK_INT < 33) {
            return;
        }
        m9822d(z2);
    }
}
