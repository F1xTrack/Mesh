package defpackage;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class UU0 extends VU0 implements Iterator {
    public TU0 a;
    public boolean b = true;
    public final /* synthetic */ WU0 c;

    public UU0(WU0 wu0) {
        this.c = wu0;
    }

    @Override // defpackage.VU0
    public final void a(TU0 tu0) {
        TU0 tu02 = this.a;
        if (tu0 == tu02) {
            TU0 tu03 = tu02.d;
            this.a = tu03;
            this.b = tu03 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.b) {
            return this.c.a != null;
        }
        TU0 tu0 = this.a;
        return (tu0 == null || tu0.c == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.b) {
            this.b = false;
            this.a = this.c.a;
        } else {
            TU0 tu0 = this.a;
            this.a = tu0 != null ? tu0.c : null;
        }
        return this.a;
    }
}
