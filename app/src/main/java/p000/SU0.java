package p000;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class SU0 extends VU0 implements Iterator {

    /* renamed from: a */
    public TU0 f10809a;

    /* renamed from: b */
    public TU0 f10810b;

    /* renamed from: c */
    public final /* synthetic */ int f10811c;

    public SU0(TU0 tu0, TU0 tu02, int i) {
        this.f10811c = i;
        this.f10809a = tu02;
        this.f10810b = tu0;
    }

    @Override // p000.VU0
    /* renamed from: a */
    public final void mo7372a(TU0 tu0) {
        TU0 tu02;
        TU0 tu0M7373b = null;
        if (this.f10809a == tu0 && tu0 == this.f10810b) {
            this.f10810b = null;
            this.f10809a = null;
        }
        TU0 tu03 = this.f10809a;
        if (tu03 == tu0) {
            switch (this.f10811c) {
                case 0:
                    tu02 = tu03.f11399d;
                    break;
                default:
                    tu02 = tu03.f11398c;
                    break;
            }
            this.f10809a = tu02;
        }
        TU0 tu04 = this.f10810b;
        if (tu04 == tu0) {
            TU0 tu05 = this.f10809a;
            if (tu04 != tu05 && tu05 != null) {
                tu0M7373b = m7373b(tu04);
            }
            this.f10810b = tu0M7373b;
        }
    }

    /* renamed from: b */
    public final TU0 m7373b(TU0 tu0) {
        switch (this.f10811c) {
            case 0:
                return tu0.f11398c;
            default:
                return tu0.f11399d;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f10810b != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        TU0 tu0 = this.f10810b;
        TU0 tu02 = this.f10809a;
        this.f10810b = (tu0 == tu02 || tu02 == null) ? null : m7373b(tu0);
        return tu0;
    }
}
