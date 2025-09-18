package defpackage;

import com.facebook.react.animated.a;
import com.facebook.react.bridge.JSApplicationCausedNativeException;
import com.facebook.react.bridge.ReadableMap;

/* renamed from: Ns0 */
/* loaded from: classes.dex */
public final class C1088Ns0 extends C0823Kh1 {
    public final a h;
    public final int i;
    public final double j;

    public C1088Ns0(ReadableMap readableMap, a aVar) {
        O90.f(readableMap, "config");
        O90.f(aVar, "nativeAnimatedNodesManager");
        this.h = aVar;
        this.i = readableMap.getInt("input");
        this.j = readableMap.getDouble("modulus");
    }

    @Override // defpackage.C0823Kh1, defpackage.T4
    public final String c() {
        int i = this.d;
        String strC = super.c();
        StringBuilder sbN = AbstractC8235ym.n(i, "NativeAnimatedNodesManager[", "] inputNode: ");
        sbN.append(this.i);
        sbN.append(" modulus: ");
        sbN.append(this.j);
        sbN.append(" super: ");
        sbN.append(strC);
        return sbN.toString();
    }

    @Override // defpackage.T4
    public final void d() {
        T4 t4I = this.h.i(this.i);
        if (!(t4I instanceof C0823Kh1)) {
            throw new JSApplicationCausedNativeException("Illegal node ID set as an input for Animated.modulus node");
        }
        double dF = ((C0823Kh1) t4I).f();
        double d = this.j;
        this.e = ((dF % d) + d) % d;
    }
}
