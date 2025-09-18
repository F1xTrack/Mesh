package defpackage;

import com.facebook.react.animated.a;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReadableMap;

/* renamed from: Zt0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2027Zt0 extends AbstractC5208iu0 {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ ReadableMap d;
    public final /* synthetic */ Callback e;

    public C2027Zt0(int i, ReadableMap readableMap, Callback callback, int i2) {
        this.b = i;
        this.c = i2;
        this.d = readableMap;
        this.e = callback;
    }

    @Override // defpackage.AbstractC5208iu0
    public final void a(a aVar) {
        aVar.p(this.b, this.d, this.e, this.c);
    }
}
