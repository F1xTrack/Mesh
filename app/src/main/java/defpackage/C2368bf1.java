package defpackage;

import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.UIManagerModule;

/* renamed from: bf1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2368bf1 extends GuardedRunnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ UIManagerModule d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2368bf1(UIManagerModule uIManagerModule, ReactApplicationContext reactApplicationContext, int i, int i2, int i3) {
        super(reactApplicationContext);
        this.d = uIManagerModule;
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    @Override // com.facebook.react.bridge.GuardedRunnable
    public final void runGuarded() {
        UIManagerModule uIManagerModule = this.d;
        DM0 dm0U = uIManagerModule.mUIImplementation.d.u(this.a);
        if (dm0U == null) {
            AbstractC3393dS.p("ReactNative");
        } else {
            EM0 em0 = (EM0) dm0U;
            em0.v = Integer.valueOf(this.b);
            em0.w = Integer.valueOf(this.c);
        }
        uIManagerModule.mUIImplementation.f(-1);
    }
}
