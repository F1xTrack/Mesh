package p000;

import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;

/* loaded from: classes.dex */
public final class P20 implements LK0 {

    /* renamed from: a */
    public final /* synthetic */ M20 f8789a;

    /* renamed from: b */
    public final /* synthetic */ QK0 f8790b;

    /* renamed from: c */
    public final /* synthetic */ Q20 f8791c;

    public P20(Q20 q20, M20 m20, QK0 qk0) {
        this.f8791c = q20;
        this.f8789a = m20;
        this.f8790b = qk0;
    }

    @Override // p000.LK0
    public final void onReactContextInitialized(ReactContext reactContext) {
        Q20 q20 = this.f8791c;
        q20.getClass();
        N20 n20M5523c = N20.m5523c(reactContext);
        n20M5523c.m5524a(q20);
        UiThreadUtil.runOnUiThread(new RunnableC1192Sx(q20, n20M5523c, this.f8789a, 3, false));
        this.f8790b.m6644o(this);
    }
}
