package defpackage;

import com.facebook.react.animated.a;
import com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.bridge.ReadableMap;

/* renamed from: cc1 */
/* loaded from: classes.dex */
public final class C2549cc1 extends T4 {
    public final a e;
    public final int f;
    public final int g;
    public final int h;
    public final JavaOnlyMap i;

    public C2549cc1(ReadableMap readableMap, a aVar) {
        this.e = aVar;
        this.f = readableMap.getInt("animationId");
        this.g = readableMap.getInt("toValue");
        this.h = readableMap.getInt("value");
        this.i = JavaOnlyMap.deepClone(readableMap.getMap("animationConfig"));
    }

    @Override // defpackage.T4
    public final String c() {
        return "TrackingAnimatedNode[" + this.d + "]: animationID: " + this.f + " toValueNode: " + this.g + " valueNode: " + this.h + " animationConfig: " + this.i;
    }

    @Override // defpackage.T4
    public final void d() {
        int i = this.g;
        a aVar = this.e;
        double dF = ((C0823Kh1) aVar.i(i)).f();
        JavaOnlyMap javaOnlyMap = this.i;
        javaOnlyMap.putDouble("toValue", dF);
        aVar.p(this.f, javaOnlyMap, null, this.h);
    }
}
