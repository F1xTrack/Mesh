package defpackage;

import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;

/* loaded from: classes.dex */
public final class P20 implements LK0 {
    public final /* synthetic */ M20 a;
    public final /* synthetic */ QK0 b;
    public final /* synthetic */ Q20 c;

    public P20(Q20 q20, M20 m20, QK0 qk0) {
        this.c = q20;
        this.a = m20;
        this.b = qk0;
    }

    @Override // defpackage.LK0
    public final void onReactContextInitialized(ReactContext reactContext) {
        Q20 q20 = this.c;
        q20.getClass();
        N20 n20C = N20.c(reactContext);
        n20C.a(q20);
        UiThreadUtil.runOnUiThread(new RunnableC1492Sx(q20, n20C, this.a, 3, false));
        this.b.o(this);
    }
}
