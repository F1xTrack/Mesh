package p000;

import android.os.Build;
import android.view.View;
import java.io.Serializable;
import java.util.ConcurrentModificationException;

/* renamed from: an0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC8768an0 {

    /* renamed from: a */
    public int f15692a;

    /* renamed from: b */
    public int f15693b;

    /* renamed from: c */
    public int f15694c;

    /* renamed from: d */
    public final Serializable f15695d;

    public AbstractC8768an0(C8896bn0 c8896bn0) {
        O90.m5968f(c8896bn0, "map");
        this.f15695d = c8896bn0;
        this.f15693b = -1;
        this.f15694c = c8896bn0.f17152h;
        m9816d();
    }

    /* renamed from: a */
    public void m9813a() {
        if (((C8896bn0) this.f15695d).f17152h != this.f15694c) {
            throw new ConcurrentModificationException();
        }
    }

    /* renamed from: b */
    public abstract Object mo9814b(View view);

    /* renamed from: c */
    public abstract void mo9815c(View view, Object obj);

    /* renamed from: d */
    public void m9816d() {
        while (true) {
            int i = this.f15692a;
            C8896bn0 c8896bn0 = (C8896bn0) this.f15695d;
            if (i >= c8896bn0.f17150f || c8896bn0.f17147c[i] >= 0) {
                return;
            } else {
                this.f15692a = i + 1;
            }
        }
    }

    /* renamed from: e */
    public void m9817e(View view, Object obj) {
        Object tag;
        if (Build.VERSION.SDK_INT >= this.f15693b) {
            mo9815c(view, obj);
            return;
        }
        if (Build.VERSION.SDK_INT >= this.f15693b) {
            tag = mo9814b(view);
        } else {
            tag = view.getTag(this.f15692a);
            if (!((Class) this.f15695d).isInstance(tag)) {
                tag = null;
            }
        }
        if (mo9818f(tag, obj)) {
            C0002A1 c0002a1M24471c = AbstractC10944rk1.m24471c(view);
            if (c0002a1M24471c == null) {
                c0002a1M24471c = new C0002A1();
            }
            AbstractC10944rk1.m24482n(view, c0002a1M24471c);
            view.setTag(this.f15692a, obj);
            AbstractC10944rk1.m24476h(this.f15694c, view);
        }
    }

    /* renamed from: f */
    public abstract boolean mo9818f(Object obj, Object obj2);

    public boolean hasNext() {
        return this.f15692a < ((C8896bn0) this.f15695d).f17150f;
    }

    public void remove() {
        m9813a();
        if (this.f15693b == -1) {
            throw new IllegalStateException("Call next() before removing element from the iterator.");
        }
        C8896bn0 c8896bn0 = (C8896bn0) this.f15695d;
        c8896bn0.m10511c();
        c8896bn0.m10520n(this.f15693b);
        this.f15693b = -1;
        this.f15694c = c8896bn0.f17152h;
    }

    public AbstractC8768an0(int i, Class cls, int i2, int i3) {
        this.f15692a = i;
        this.f15695d = cls;
        this.f15694c = i2;
        this.f15693b = i3;
    }
}
