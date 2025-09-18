package p000;

import android.content.Intent;
import com.facebook.react.bridge.ReactContext;

/* loaded from: classes2.dex */
public final class FJ0 implements LK0 {

    /* renamed from: a */
    public final /* synthetic */ GJ0 f3151a;

    /* renamed from: b */
    public final /* synthetic */ int f3152b;

    /* renamed from: c */
    public final /* synthetic */ int f3153c;

    /* renamed from: d */
    public final /* synthetic */ Intent f3154d;

    public FJ0(GJ0 gj0, int i, int i2, Intent intent) {
        this.f3151a = gj0;
        this.f3152b = i;
        this.f3153c = i2;
        this.f3154d = intent;
    }

    @Override // p000.LK0
    public final void onReactContextInitialized(ReactContext reactContext) {
        GJ0 gj0 = this.f3151a;
        gj0.f3682g.getReactInstanceManager().m6644o(this);
        gj0.f3682g.onActivityResult(this.f3152b, this.f3153c, this.f3154d);
    }
}
