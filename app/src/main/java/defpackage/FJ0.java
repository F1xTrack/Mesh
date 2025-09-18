package defpackage;

import android.content.Intent;
import com.facebook.react.bridge.ReactContext;

/* loaded from: classes2.dex */
public final class FJ0 implements LK0 {
    public final /* synthetic */ GJ0 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Intent d;

    public FJ0(GJ0 gj0, int i, int i2, Intent intent) {
        this.a = gj0;
        this.b = i;
        this.c = i2;
        this.d = intent;
    }

    @Override // defpackage.LK0
    public final void onReactContextInitialized(ReactContext reactContext) {
        GJ0 gj0 = this.a;
        gj0.g.getReactInstanceManager().o(this);
        gj0.g.onActivityResult(this.b, this.c, this.d);
    }
}
