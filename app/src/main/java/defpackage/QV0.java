package defpackage;

import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.bridge.JSExceptionHandler;
import com.facebook.react.uimanager.UIManagerModule;

/* loaded from: classes2.dex */
public final class QV0 extends GuardedRunnable {
    public final /* synthetic */ RV0 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QV0(RV0 rv0, int i, int i2, JSExceptionHandler jSExceptionHandler) {
        super(jSExceptionHandler);
        this.a = rv0;
        this.b = i;
        this.c = i2;
    }

    @Override // com.facebook.react.bridge.GuardedRunnable
    public final void runGuarded() {
        RV0 rv0 = this.a;
        UIManagerModule uIManagerModule = (UIManagerModule) rv0.getReactContext().getNativeModule(UIManagerModule.class);
        if (uIManagerModule != null) {
            uIManagerModule.updateNodeSize(rv0.getId(), this.b, this.c);
        }
    }
}
