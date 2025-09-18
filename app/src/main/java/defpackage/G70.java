package defpackage;

import android.util.Size;
import android.view.Surface;

/* loaded from: classes.dex */
public final class G70 extends AbstractC4314iH {
    public final /* synthetic */ int o = 1;
    public final Object p;

    public G70(Surface surface, Size size, int i) {
        super(size, i);
        this.p = surface;
    }

    @Override // defpackage.AbstractC4314iH
    public final InterfaceFutureC0750Jj0 f() {
        switch (this.o) {
            case 0:
                return AbstractC1500Sz1.g((Surface) this.p);
            default:
                return ((Z61) this.p).g;
        }
    }

    public G70(Surface surface) {
        this.p = surface;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G70(Z61 z61, Size size) {
        super(size, 34);
        this.p = z61;
    }
}
