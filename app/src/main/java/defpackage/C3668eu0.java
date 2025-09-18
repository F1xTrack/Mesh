package defpackage;

import com.facebook.react.animated.a;
import com.facebook.react.bridge.Callback;

/* renamed from: eu0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3668eu0 extends AbstractC5208iu0 {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ C3668eu0(int i, Object obj, int i2) {
        this.b = i2;
        this.c = i;
        this.d = obj;
    }

    @Override // defpackage.AbstractC5208iu0
    public final void a(a aVar) {
        switch (this.b) {
            case 0:
                aVar.j(this.c, (Callback) this.d);
                break;
            default:
                aVar.q(this.c, (C1204Pf) this.d);
                break;
        }
    }
}
