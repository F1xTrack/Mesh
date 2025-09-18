package p000;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class UU0 extends VU0 implements Iterator {

    /* renamed from: a */
    public TU0 f11810a;

    /* renamed from: b */
    public boolean f11811b = true;

    /* renamed from: c */
    public final /* synthetic */ WU0 f11812c;

    public UU0(WU0 wu0) {
        this.f11812c = wu0;
    }

    @Override // p000.VU0
    /* renamed from: a */
    public final void mo7372a(TU0 tu0) {
        TU0 tu02 = this.f11810a;
        if (tu0 == tu02) {
            TU0 tu03 = tu02.f11399d;
            this.f11810a = tu03;
            this.f11811b = tu03 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f11811b) {
            return this.f11812c.f13214a != null;
        }
        TU0 tu0 = this.f11810a;
        return (tu0 == null || tu0.f11398c == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f11811b) {
            this.f11811b = false;
            this.f11810a = this.f11812c.f13214a;
        } else {
            TU0 tu0 = this.f11810a;
            this.f11810a = tu0 != null ? tu0.f11398c : null;
        }
        return this.f11810a;
    }
}
