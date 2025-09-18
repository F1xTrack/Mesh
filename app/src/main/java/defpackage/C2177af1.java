package defpackage;

import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.UIManagerModule;

/* renamed from: af1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2177af1 extends GuardedRunnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ UIManagerModule c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2177af1(UIManagerModule uIManagerModule, ReactApplicationContext reactApplicationContext, int i, Object obj) {
        super(reactApplicationContext);
        this.c = uIManagerModule;
        this.a = i;
        this.b = obj;
    }

    @Override // com.facebook.react.bridge.GuardedRunnable
    public final void runGuarded() {
        C1983Ze1 c1983Ze1 = this.c.mUIImplementation;
        DM0 dm0U = c1983Ze1.d.u(this.a);
        if (dm0U == null) {
            AbstractC3393dS.p("ReactNative");
            return;
        }
        dm0U.e(this.b);
        C8216yf1 c8216yf1 = c1983Ze1.f;
        if (c8216yf1.h.isEmpty() && c8216yf1.g.isEmpty()) {
            c1983Ze1.f(-1);
        }
    }
}
