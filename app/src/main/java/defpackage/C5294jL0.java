package defpackage;

import com.facebook.react.bridge.ReactApplicationContext;

/* renamed from: jL0 */
/* loaded from: classes.dex */
public final class C5294jL0 extends IS0 {
    public final String a;
    public final ReactApplicationContext b;
    public final IS0 c;
    public final boolean d;

    public C5294jL0(ReactApplicationContext reactApplicationContext, String str, IS0 is0, boolean z) {
        this.b = reactApplicationContext;
        this.a = str;
        this.c = is0;
        this.d = z;
    }

    @Override // defpackage.IS0
    public final long o() {
        return this.c.o();
    }

    @Override // defpackage.IS0
    public final C1859Xp0 p() {
        return this.c.p();
    }

    @Override // defpackage.IS0
    public final InterfaceC0827Kj w() {
        return JI1.b(new C4327iL0(this, this.c.w()));
    }
}
