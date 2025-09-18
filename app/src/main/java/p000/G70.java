package p000;

import android.util.Size;
import android.view.Surface;

/* loaded from: classes.dex */
public final class G70 extends AbstractC4232iH {

    /* renamed from: o */
    public final /* synthetic */ int f3593o = 1;

    /* renamed from: p */
    public final Object f3594p;

    public G70(Surface surface, Size size, int i) {
        super(size, i);
        this.f3594p = surface;
    }

    @Override // p000.AbstractC4232iH
    /* renamed from: f */
    public final InterfaceFutureC7800Jj0 mo2926f() {
        switch (this.f3593o) {
            case 0:
                return AbstractC8301Sz1.m7484g((Surface) this.f3594p);
            default:
                return ((Z61) this.f3594p).f14743g;
        }
    }

    public G70(Surface surface) {
        this.f3594p = surface;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G70(Z61 z61, Size size) {
        super(size, 34);
        this.f3594p = z61;
    }
}
