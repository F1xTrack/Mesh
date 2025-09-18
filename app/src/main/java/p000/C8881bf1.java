package p000;

import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.UIManagerModule;

/* renamed from: bf1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8881bf1 extends GuardedRunnable {

    /* renamed from: a */
    public final /* synthetic */ int f17111a;

    /* renamed from: b */
    public final /* synthetic */ int f17112b;

    /* renamed from: c */
    public final /* synthetic */ int f17113c;

    /* renamed from: d */
    public final /* synthetic */ UIManagerModule f17114d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8881bf1(UIManagerModule uIManagerModule, ReactApplicationContext reactApplicationContext, int i, int i2, int i3) {
        super(reactApplicationContext);
        this.f17114d = uIManagerModule;
        this.f17111a = i;
        this.f17112b = i2;
        this.f17113c = i3;
    }

    @Override // com.facebook.react.bridge.GuardedRunnable
    public final void runGuarded() {
        UIManagerModule uIManagerModule = this.f17114d;
        DM0 dm0M24384u = uIManagerModule.mUIImplementation.f15073d.m24384u(this.f17111a);
        if (dm0M24384u == null) {
            AbstractC3929dS.m17683p("ReactNative");
        } else {
            EM0 em0 = (EM0) dm0M24384u;
            em0.f2670v = Integer.valueOf(this.f17112b);
            em0.f2671w = Integer.valueOf(this.f17113c);
        }
        uIManagerModule.mUIImplementation.m9570f(-1);
    }
}
