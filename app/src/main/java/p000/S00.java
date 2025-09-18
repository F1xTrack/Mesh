package p000;

import com.facebook.react.bridge.WritableMap;

/* loaded from: classes2.dex */
public abstract class S00 {

    /* renamed from: a */
    public final int f10524a;

    /* renamed from: b */
    public final int f10525b;

    /* renamed from: c */
    public final int f10526c;

    /* renamed from: d */
    public final int f10527d;

    public S00(R00 r00) {
        O90.m5968f(r00, "handler");
        this.f10524a = r00.f9925z;
        this.f10525b = r00.f9903d;
        this.f10526c = r00.f9905f;
        this.f10527d = r00.f9894D;
    }

    /* renamed from: a */
    public void mo315a(WritableMap writableMap) {
        writableMap.putInt("numberOfPointers", this.f10524a);
        writableMap.putInt("handlerTag", this.f10525b);
        writableMap.putInt("state", this.f10526c);
        writableMap.putInt("pointerType", this.f10527d);
    }
}
