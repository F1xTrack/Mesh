package p000;

import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.uimanager.UIManagerModule;

/* loaded from: classes.dex */
public final class YK0 extends GuardedRunnable {

    /* renamed from: a */
    public final /* synthetic */ ZK0 f14247a;

    /* renamed from: b */
    public final /* synthetic */ int f14248b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YK0(S91 s91, ZK0 zk0, int i) {
        super(s91);
        this.f14247a = zk0;
        this.f14248b = i;
    }

    @Override // com.facebook.react.bridge.GuardedRunnable
    public final void runGuarded() {
        ZK0 zk0 = this.f14247a;
        UIManagerModule uIManagerModule = (UIManagerModule) zk0.getReactContext().f10602a.getNativeModule(UIManagerModule.class);
        if (uIManagerModule != null) {
            uIManagerModule.updateNodeSize(this.f14248b, zk0.f14856c, zk0.f14857d);
        }
    }
}
