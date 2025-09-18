package p000;

import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.bridge.JSExceptionHandler;
import com.facebook.react.uimanager.UIManagerModule;

/* loaded from: classes2.dex */
public final class QV0 extends GuardedRunnable {

    /* renamed from: a */
    public final /* synthetic */ RV0 f9650a;

    /* renamed from: b */
    public final /* synthetic */ int f9651b;

    /* renamed from: c */
    public final /* synthetic */ int f9652c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QV0(RV0 rv0, int i, int i2, JSExceptionHandler jSExceptionHandler) {
        super(jSExceptionHandler);
        this.f9650a = rv0;
        this.f9651b = i;
        this.f9652c = i2;
    }

    @Override // com.facebook.react.bridge.GuardedRunnable
    public final void runGuarded() {
        RV0 rv0 = this.f9650a;
        UIManagerModule uIManagerModule = (UIManagerModule) rv0.getReactContext().getNativeModule(UIManagerModule.class);
        if (uIManagerModule != null) {
            uIManagerModule.updateNodeSize(rv0.getId(), this.f9651b, this.f9652c);
        }
    }
}
