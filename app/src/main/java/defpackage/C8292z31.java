package defpackage;

import android.os.CancellationSignal;
import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.WindowInsetsAnimationController;
import java.util.ArrayList;

/* renamed from: z31 */
/* loaded from: classes.dex */
public final class C8292z31 {
    public final C1016Mu0 c;
    public A31 j;
    public float k;
    public float a = 0.0f;
    public float b = Float.MAX_VALUE;
    public boolean d = false;
    public final float e = -3.4028235E38f;
    public long f = 0;
    public final ArrayList h = new ArrayList();
    public final ArrayList i = new ArrayList();
    public final float g = 1.0f;

    public C8292z31(CC0 cc0) {
        this.c = new C1016Mu0(13, cc0);
    }

    public final void a() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be canceled on the main thread");
        }
        if (this.d) {
            b();
        }
        float f = this.k;
        if (f != Float.MAX_VALUE) {
            A31 a31 = this.j;
            if (a31 == null) {
                this.j = new A31(f);
            } else {
                a31.i = f;
            }
            this.k = Float.MAX_VALUE;
        }
    }

    public final void b() {
        ArrayList arrayList;
        this.d = false;
        ThreadLocal threadLocal = C5245j5.f;
        if (threadLocal.get() == null) {
            threadLocal.set(new C5245j5());
        }
        C5245j5 c5245j5 = (C5245j5) threadLocal.get();
        c5245j5.a.remove(this);
        ArrayList arrayList2 = c5245j5.b;
        int iIndexOf = arrayList2.indexOf(this);
        if (iIndexOf >= 0) {
            arrayList2.set(iIndexOf, null);
            c5245j5.e = true;
        }
        this.f = 0L;
        int i = 0;
        while (true) {
            arrayList = this.h;
            if (i >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i) != null) {
                C2226aw c2226aw = ((C1829Xf0) arrayList.get(i)).a;
                O90.f(c2226aw, "this$0");
                if (equals((C8292z31) c2226aw.g)) {
                    c2226aw.g = null;
                }
                C5826m71 c5826m71 = (C5826m71) c2226aw.b;
                if (c5826m71 == null) {
                    CancellationSignal cancellationSignal = (CancellationSignal) c2226aw.d;
                    if (cancellationSignal != null) {
                        cancellationSignal.cancel();
                    }
                } else {
                    J80 j80I = c5826m71.i();
                    C5996n11 c5996n11 = (C5996n11) c5826m71.b;
                    J80 j80C = J80.c(((WindowInsetsAnimationController) c5996n11.b).getShownStateInsets());
                    J80 j80C2 = J80.c(((WindowInsetsAnimationController) c5996n11.b).getHiddenStateInsets());
                    int i2 = j80C.d;
                    int i3 = j80I.d;
                    if (i3 == i2) {
                        c5826m71.g(true);
                    } else if (i3 == j80C2.d) {
                        c5826m71.g(false);
                    } else if (((WindowInsetsAnimationController) c5996n11.b).getCurrentFraction() >= 0.15f) {
                        c5826m71.g(!c2226aw.c);
                    } else {
                        c5826m71.g(c2226aw.c);
                    }
                }
            }
            i++;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    public final void c(float f) {
        ((C8277z) ((CC0) this.c.b).c).invoke(Float.valueOf(f));
        int i = 0;
        while (true) {
            ArrayList arrayList = this.i;
            if (i >= arrayList.size()) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    if (arrayList.get(size) == null) {
                        arrayList.remove(size);
                    }
                }
                return;
            }
            if (arrayList.get(i) != null) {
                arrayList.get(i).getClass();
                throw new ClassCastException();
            }
            i++;
        }
    }
}
