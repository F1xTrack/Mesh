package p000;

import com.facebook.react.animated.C1881a;
import com.facebook.react.bridge.JSApplicationCausedNativeException;
import com.facebook.react.bridge.ReadableMap;

/* renamed from: Ns0 */
/* loaded from: classes.dex */
public final class C8026Ns0 extends C7849Kh1 {

    /* renamed from: h */
    public final C1881a f8096h;

    /* renamed from: i */
    public final int f8097i;

    /* renamed from: j */
    public final double f8098j;

    public C8026Ns0(ReadableMap readableMap, C1881a c1881a) {
        O90.m5968f(readableMap, "config");
        O90.m5968f(c1881a, "nativeAnimatedNodesManager");
        this.f8096h = c1881a;
        this.f8097i = readableMap.getInt("input");
        this.f8098j = readableMap.getDouble("modulus");
    }

    @Override // p000.C7849Kh1, p000.AbstractC1200T4
    /* renamed from: c */
    public final String mo2442c() {
        int i = this.f11143d;
        String strMo2442c = super.mo2442c();
        StringBuilder sbM26237n = AbstractC7222ym.m26237n(i, "NativeAnimatedNodesManager[", "] inputNode: ");
        sbM26237n.append(this.f8097i);
        sbM26237n.append(" modulus: ");
        sbM26237n.append(this.f8098j);
        sbM26237n.append(" super: ");
        sbM26237n.append(strMo2442c);
        return sbM26237n.toString();
    }

    @Override // p000.AbstractC1200T4
    /* renamed from: d */
    public final void mo3769d() {
        AbstractC1200T4 abstractC1200T4M10932i = this.f8096h.m10932i(this.f8097i);
        if (!(abstractC1200T4M10932i instanceof C7849Kh1)) {
            throw new JSApplicationCausedNativeException("Illegal node ID set as an input for Animated.modulus node");
        }
        double dM4701f = ((C7849Kh1) abstractC1200T4M10932i).m4701f();
        double d = this.f8098j;
        this.f6259e = ((dM4701f % d) + d) % d;
    }
}
