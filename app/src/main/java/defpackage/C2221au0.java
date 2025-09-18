package defpackage;

import com.facebook.react.animated.a;

/* renamed from: au0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2221au0 extends AbstractC5208iu0 {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;

    public /* synthetic */ C2221au0(int i, int i2, int i3) {
        this.b = i3;
        this.c = i;
        this.d = i2;
    }

    @Override // defpackage.AbstractC5208iu0
    public final void a(a aVar) {
        switch (this.b) {
            case 0:
                aVar.c(this.c, this.d);
                break;
            case 1:
                aVar.f(this.c, this.d);
                break;
            case 2:
                aVar.b(this.c, this.d);
                break;
            default:
                aVar.e(this.c, this.d);
                break;
        }
    }
}
