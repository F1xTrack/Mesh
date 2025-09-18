package defpackage;

import com.facebook.react.bridge.WritableMap;

/* loaded from: classes2.dex */
public abstract class S00 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public S00(R00 r00) {
        O90.f(r00, "handler");
        this.a = r00.z;
        this.b = r00.d;
        this.c = r00.f;
        this.d = r00.D;
    }

    public void a(WritableMap writableMap) {
        writableMap.putInt("numberOfPointers", this.a);
        writableMap.putInt("handlerTag", this.b);
        writableMap.putInt("state", this.c);
        writableMap.putInt("pointerType", this.d);
    }
}
