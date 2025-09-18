package defpackage;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class SU0 extends VU0 implements Iterator {
    public TU0 a;
    public TU0 b;
    public final /* synthetic */ int c;

    public SU0(TU0 tu0, TU0 tu02, int i) {
        this.c = i;
        this.a = tu02;
        this.b = tu0;
    }

    @Override // defpackage.VU0
    public final void a(TU0 tu0) {
        TU0 tu02;
        TU0 tu0B = null;
        if (this.a == tu0 && tu0 == this.b) {
            this.b = null;
            this.a = null;
        }
        TU0 tu03 = this.a;
        if (tu03 == tu0) {
            switch (this.c) {
                case 0:
                    tu02 = tu03.d;
                    break;
                default:
                    tu02 = tu03.c;
                    break;
            }
            this.a = tu02;
        }
        TU0 tu04 = this.b;
        if (tu04 == tu0) {
            TU0 tu05 = this.a;
            if (tu04 != tu05 && tu05 != null) {
                tu0B = b(tu04);
            }
            this.b = tu0B;
        }
    }

    public final TU0 b(TU0 tu0) {
        switch (this.c) {
            case 0:
                return tu0.c;
            default:
                return tu0.d;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        TU0 tu0 = this.b;
        TU0 tu02 = this.a;
        this.b = (tu0 == tu02 || tu02 == null) ? null : b(tu0);
        return tu0;
    }
}
