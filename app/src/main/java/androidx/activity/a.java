package androidx.activity;

import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import defpackage.AbstractC0357Ei0;
import defpackage.C0402Ex0;
import defpackage.C0480Fx0;
import defpackage.C0558Gx0;
import defpackage.C0714Ix0;
import defpackage.C2085aB;
import defpackage.C6018n8;
import defpackage.EnumC0201Ci0;
import defpackage.InterfaceC0903Li0;
import defpackage.MB;
import defpackage.O90;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class a {
    public final Runnable a;
    public final C6018n8 b = new C6018n8();
    public MB c;
    public final OnBackInvokedCallback d;
    public OnBackInvokedDispatcher e;
    public boolean f;
    public boolean g;

    public a(Runnable runnable) {
        this.a = runnable;
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            this.d = i >= 34 ? C0714Ix0.a.a(new C0402Ex0(this, 0), new C0402Ex0(this, 1), new C0480Fx0(this, 0), new C0480Fx0(this, 1)) : C0558Gx0.a.a(new C0480Fx0(this, 2));
        }
    }

    public final void a(InterfaceC0903Li0 interfaceC0903Li0, MB mb) {
        O90.f(mb, "onBackPressedCallback");
        AbstractC0357Ei0 lifecycle = interfaceC0903Li0.getLifecycle();
        if (((androidx.lifecycle.a) lifecycle).c == EnumC0201Ci0.a) {
            return;
        }
        mb.b.add(new OnBackPressedDispatcher$LifecycleOnBackPressedCancellable(this, lifecycle, mb));
        e();
        mb.c = new C2085aB(0, this, a.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0, 4);
    }

    public final void b() {
        Object objPrevious;
        if (this.c == null) {
            C6018n8 c6018n8 = this.b;
            ListIterator<E> listIterator = c6018n8.listIterator(c6018n8.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                } else {
                    objPrevious = listIterator.previous();
                    if (((MB) objPrevious).a) {
                        break;
                    }
                }
            }
        }
        this.c = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    public final void c() {
        MB mbPrevious;
        MB mb = this.c;
        if (mb == null) {
            C6018n8 c6018n8 = this.b;
            ListIterator listIterator = c6018n8.listIterator(c6018n8.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    mbPrevious = 0;
                    break;
                } else {
                    mbPrevious = listIterator.previous();
                    if (((MB) mbPrevious).a) {
                        break;
                    }
                }
            }
            mb = mbPrevious;
        }
        this.c = null;
        if (mb != null) {
            mb.a();
            return;
        }
        Runnable runnable = this.a;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void d(boolean z) {
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.e;
        OnBackInvokedCallback onBackInvokedCallback = this.d;
        if (onBackInvokedDispatcher == null || onBackInvokedCallback == null) {
            return;
        }
        C0558Gx0 c0558Gx0 = C0558Gx0.a;
        if (z && !this.f) {
            c0558Gx0.b(onBackInvokedDispatcher, 0, onBackInvokedCallback);
            this.f = true;
        } else {
            if (z || !this.f) {
                return;
            }
            c0558Gx0.c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f = false;
        }
    }

    public final void e() {
        boolean z = this.g;
        C6018n8 c6018n8 = this.b;
        boolean z2 = false;
        if (!(c6018n8 instanceof Collection) || !c6018n8.isEmpty()) {
            Iterator<E> it = c6018n8.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((MB) it.next()).a) {
                    z2 = true;
                    break;
                }
            }
        }
        this.g = z2;
        if (z2 == z || Build.VERSION.SDK_INT < 33) {
            return;
        }
        d(z2);
    }
}
