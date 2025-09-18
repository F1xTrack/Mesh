package defpackage;

import android.util.SparseArray;
import com.facebook.react.animated.a;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;

/* renamed from: Xt0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1871Xt0 extends AbstractC5208iu0 {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ double d;

    public /* synthetic */ C1871Xt0(double d, int i, int i2) {
        this.b = i2;
        this.c = i;
        this.d = d;
    }

    @Override // defpackage.AbstractC5208iu0
    public final void a(a aVar) {
        switch (this.b) {
            case 0:
                aVar.o(this.c, this.d);
                return;
            default:
                SparseArray sparseArray = aVar.a;
                int i = this.c;
                T4 t4 = (T4) sparseArray.get(i);
                if (t4 == null || !(t4 instanceof C0823Kh1)) {
                    throw new JSApplicationIllegalArgumentException(AbstractC8235ym.g(i, "setAnimatedNodeOffset: Animated node [", "] does not exist, or is not a 'value' node"));
                }
                ((C0823Kh1) t4).f = this.d;
                aVar.c.put(i, t4);
                return;
        }
    }
}
