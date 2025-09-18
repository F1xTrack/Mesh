package p000;

import android.util.SparseArray;
import com.facebook.react.animated.C1881a;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;

/* renamed from: Xt0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8548Xt0 extends AbstractC9811iu0 {

    /* renamed from: b */
    public final /* synthetic */ int f14036b;

    /* renamed from: c */
    public final /* synthetic */ int f14037c;

    /* renamed from: d */
    public final /* synthetic */ double f14038d;

    public /* synthetic */ C8548Xt0(double d, int i, int i2) {
        this.f14036b = i2;
        this.f14037c = i;
        this.f14038d = d;
    }

    @Override // p000.AbstractC9811iu0
    /* renamed from: a */
    public final void mo9180a(C1881a c1881a) {
        switch (this.f14036b) {
            case 0:
                c1881a.m10938o(this.f14037c, this.f14038d);
                return;
            default:
                SparseArray sparseArray = c1881a.f17879a;
                int i = this.f14037c;
                AbstractC1200T4 abstractC1200T4 = (AbstractC1200T4) sparseArray.get(i);
                if (abstractC1200T4 == null || !(abstractC1200T4 instanceof C7849Kh1)) {
                    throw new JSApplicationIllegalArgumentException(AbstractC7222ym.m26230g(i, "setAnimatedNodeOffset: Animated node [", "] does not exist, or is not a 'value' node"));
                }
                ((C7849Kh1) abstractC1200T4).f6260f = this.f14038d;
                c1881a.f17881c.put(i, abstractC1200T4);
                return;
        }
    }
}
