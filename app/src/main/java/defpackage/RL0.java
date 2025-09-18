package defpackage;

import com.facebook.react.bridge.ReactContext;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class RL0 implements LK0 {
    public final /* synthetic */ QL0 a;

    public RL0(QL0 ql0, boolean z) {
        this.a = ql0;
    }

    @Override // defpackage.LK0
    public final void onReactContextInitialized(ReactContext reactContext) {
        Iterator it = this.a.d.iterator();
        if (it.hasNext()) {
            throw AbstractC8235ym.d(it);
        }
    }
}
