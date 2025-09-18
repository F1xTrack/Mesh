package p000;

import com.facebook.react.animated.C1881a;
import com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.bridge.ReadableMap;

/* renamed from: cc1 */
/* loaded from: classes.dex */
public final class C9003cc1 extends AbstractC1200T4 {

    /* renamed from: e */
    public final C1881a f17649e;

    /* renamed from: f */
    public final int f17650f;

    /* renamed from: g */
    public final int f17651g;

    /* renamed from: h */
    public final int f17652h;

    /* renamed from: i */
    public final JavaOnlyMap f17653i;

    public C9003cc1(ReadableMap readableMap, C1881a c1881a) {
        this.f17649e = c1881a;
        this.f17650f = readableMap.getInt("animationId");
        this.f17651g = readableMap.getInt("toValue");
        this.f17652h = readableMap.getInt("value");
        this.f17653i = JavaOnlyMap.deepClone(readableMap.getMap("animationConfig"));
    }

    @Override // p000.AbstractC1200T4
    /* renamed from: c */
    public final String mo2442c() {
        return "TrackingAnimatedNode[" + this.f11143d + "]: animationID: " + this.f17650f + " toValueNode: " + this.f17651g + " valueNode: " + this.f17652h + " animationConfig: " + this.f17653i;
    }

    @Override // p000.AbstractC1200T4
    /* renamed from: d */
    public final void mo3769d() {
        int i = this.f17651g;
        C1881a c1881a = this.f17649e;
        double dM4701f = ((C7849Kh1) c1881a.m10932i(i)).m4701f();
        JavaOnlyMap javaOnlyMap = this.f17653i;
        javaOnlyMap.putDouble("toValue", dM4701f);
        c1881a.m10939p(this.f17650f, javaOnlyMap, null, this.f17652h);
    }
}
