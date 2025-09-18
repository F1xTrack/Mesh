package p000;

import com.facebook.react.bridge.ReactContext;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class RL0 implements LK0 {

    /* renamed from: a */
    public final /* synthetic */ QL0 f10139a;

    public RL0(QL0 ql0, boolean z) {
        this.f10139a = ql0;
    }

    @Override // p000.LK0
    public final void onReactContextInitialized(ReactContext reactContext) {
        Iterator it = this.f10139a.f9591d.iterator();
        if (it.hasNext()) {
            throw AbstractC7222ym.m26227d(it);
        }
    }
}
