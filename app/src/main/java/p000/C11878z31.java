package p000;

import android.os.CancellationSignal;
import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.WindowInsetsAnimationController;
import java.util.ArrayList;

/* renamed from: z31 */
/* loaded from: classes.dex */
public final class C11878z31 {

    /* renamed from: c */
    public final C7978Mu0 f46608c;

    /* renamed from: j */
    public A31 f46615j;

    /* renamed from: k */
    public float f46616k;

    /* renamed from: a */
    public float f46606a = 0.0f;

    /* renamed from: b */
    public float f46607b = Float.MAX_VALUE;

    /* renamed from: d */
    public boolean f46609d = false;

    /* renamed from: e */
    public final float f46610e = -3.4028235E38f;

    /* renamed from: f */
    public long f46611f = 0;

    /* renamed from: h */
    public final ArrayList f46613h = new ArrayList();

    /* renamed from: i */
    public final ArrayList f46614i = new ArrayList();

    /* renamed from: g */
    public final float f46612g = 1.0f;

    public C11878z31(CC0 cc0) {
        this.f46608c = new C7978Mu0(13, cc0);
    }

    /* renamed from: a */
    public final void m26307a() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be canceled on the main thread");
        }
        if (this.f46609d) {
            m26308b();
        }
        float f = this.f46616k;
        if (f != Float.MAX_VALUE) {
            A31 a31 = this.f46615j;
            if (a31 == null) {
                this.f46615j = new A31(f);
            } else {
                a31.f42i = f;
            }
            this.f46616k = Float.MAX_VALUE;
        }
    }

    /* renamed from: b */
    public final void m26308b() {
        ArrayList arrayList;
        this.f46609d = false;
        ThreadLocal threadLocal = C6215j5.f34903f;
        if (threadLocal.get() == null) {
            threadLocal.set(new C6215j5());
        }
        C6215j5 c6215j5 = (C6215j5) threadLocal.get();
        c6215j5.f34904a.remove(this);
        ArrayList arrayList2 = c6215j5.f34905b;
        int iIndexOf = arrayList2.indexOf(this);
        if (iIndexOf >= 0) {
            arrayList2.set(iIndexOf, null);
            c6215j5.f34908e = true;
        }
        this.f46611f = 0L;
        int i = 0;
        while (true) {
            arrayList = this.f46613h;
            if (i >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i) != null) {
                C1753aw c1753aw = ((C8520Xf0) arrayList.get(i)).f13891a;
                O90.m5968f(c1753aw, "this$0");
                if (equals((C11878z31) c1753aw.f16687g)) {
                    c1753aw.f16687g = null;
                }
                C10226m71 c10226m71 = (C10226m71) c1753aw.f16682b;
                if (c10226m71 == null) {
                    CancellationSignal cancellationSignal = (CancellationSignal) c1753aw.f16684d;
                    if (cancellationSignal != null) {
                        cancellationSignal.cancel();
                    }
                } else {
                    J80 j80M22682i = c10226m71.m22682i();
                    C10339n11 c10339n11 = (C10339n11) c10226m71.f37493b;
                    J80 j80M4202c = J80.m4202c(((WindowInsetsAnimationController) c10339n11.f38046b).getShownStateInsets());
                    J80 j80M4202c2 = J80.m4202c(((WindowInsetsAnimationController) c10339n11.f38046b).getHiddenStateInsets());
                    int i2 = j80M4202c.f5355d;
                    int i3 = j80M22682i.f5355d;
                    if (i3 == i2) {
                        c10226m71.m22680g(true);
                    } else if (i3 == j80M4202c2.f5355d) {
                        c10226m71.m22680g(false);
                    } else if (((WindowInsetsAnimationController) c10339n11.f38046b).getCurrentFraction() >= 0.15f) {
                        c10226m71.m22680g(!c1753aw.f16683c);
                    } else {
                        c10226m71.m22680g(c1753aw.f16683c);
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

    /* renamed from: c */
    public final void m26309c(float f) {
        ((C7236z) ((CC0) this.f46608c.f7393b).f1251c).invoke(Float.valueOf(f));
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f46614i;
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
