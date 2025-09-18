package defpackage;

import com.facebook.react.animated.a;
import com.facebook.react.bridge.ReadableMap;

/* renamed from: gu0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4050gu0 extends AbstractC5208iu0 {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ ReadableMap d;

    public /* synthetic */ C4050gu0(int i, int i2, ReadableMap readableMap) {
        this.b = i2;
        this.c = i;
        this.d = readableMap;
    }

    @Override // defpackage.AbstractC5208iu0
    public final void a(a aVar) {
        switch (this.b) {
            case 0:
                aVar.d(this.c, this.d);
                break;
            default:
                aVar.u(this.c, this.d);
                break;
        }
    }
}
