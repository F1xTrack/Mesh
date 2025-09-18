package defpackage;

import android.os.Build;
import android.view.View;
import java.io.Serializable;
import java.util.ConcurrentModificationException;

/* renamed from: an0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2200an0 {
    public int a;
    public int b;
    public int c;
    public final Serializable d;

    public AbstractC2200an0(C2391bn0 c2391bn0) {
        O90.f(c2391bn0, "map");
        this.d = c2391bn0;
        this.b = -1;
        this.c = c2391bn0.h;
        d();
    }

    public void a() {
        if (((C2391bn0) this.d).h != this.c) {
            throw new ConcurrentModificationException();
        }
    }

    public abstract Object b(View view);

    public abstract void c(View view, Object obj);

    public void d() {
        while (true) {
            int i = this.a;
            C2391bn0 c2391bn0 = (C2391bn0) this.d;
            if (i >= c2391bn0.f || c2391bn0.c[i] >= 0) {
                return;
            } else {
                this.a = i + 1;
            }
        }
    }

    public void e(View view, Object obj) {
        Object tag;
        if (Build.VERSION.SDK_INT >= this.b) {
            c(view, obj);
            return;
        }
        if (Build.VERSION.SDK_INT >= this.b) {
            tag = b(view);
        } else {
            tag = view.getTag(this.a);
            if (!((Class) this.d).isInstance(tag)) {
                tag = null;
            }
        }
        if (f(tag, obj)) {
            A1 a1C = AbstractC6897rk1.c(view);
            if (a1C == null) {
                a1C = new A1();
            }
            AbstractC6897rk1.n(view, a1C);
            view.setTag(this.a, obj);
            AbstractC6897rk1.h(this.c, view);
        }
    }

    public abstract boolean f(Object obj, Object obj2);

    public boolean hasNext() {
        return this.a < ((C2391bn0) this.d).f;
    }

    public void remove() {
        a();
        if (this.b == -1) {
            throw new IllegalStateException("Call next() before removing element from the iterator.");
        }
        C2391bn0 c2391bn0 = (C2391bn0) this.d;
        c2391bn0.c();
        c2391bn0.n(this.b);
        this.b = -1;
        this.c = c2391bn0.h;
    }

    public AbstractC2200an0(int i, Class cls, int i2, int i3) {
        this.a = i;
        this.d = cls;
        this.c = i2;
        this.b = i3;
    }
}
