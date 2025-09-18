package defpackage;

import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.uimanager.UIManagerModule;

/* loaded from: classes.dex */
public final class YK0 extends GuardedRunnable {
    public final /* synthetic */ ZK0 a;
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YK0(S91 s91, ZK0 zk0, int i) {
        super(s91);
        this.a = zk0;
        this.b = i;
    }

    @Override // com.facebook.react.bridge.GuardedRunnable
    public final void runGuarded() {
        ZK0 zk0 = this.a;
        UIManagerModule uIManagerModule = (UIManagerModule) zk0.getReactContext().a.getNativeModule(UIManagerModule.class);
        if (uIManagerModule != null) {
            uIManagerModule.updateNodeSize(this.b, zk0.c, zk0.d);
        }
    }
}
