package p000;

import android.app.Activity;
import android.os.Bundle;
import com.facebook.react.ReactRootView;

/* loaded from: classes.dex */
public final class BJ0 extends VJ0 {

    /* renamed from: i */
    public final /* synthetic */ int f707i = 0;

    /* renamed from: j */
    public final /* synthetic */ CJ0 f708j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BJ0(CJ0 cj0, Activity activity, PL0 pl0, Bundle bundle, boolean z) {
        super(activity, pl0, bundle, z);
        this.f708j = cj0;
    }

    @Override // p000.VJ0
    /* renamed from: a */
    public final ReactRootView mo580a() {
        switch (this.f707i) {
            case 0:
                ReactRootView reactRootViewCreateRootView = this.f708j.createRootView();
                if (reactRootViewCreateRootView == null) {
                    break;
                }
                break;
            default:
                ReactRootView reactRootViewCreateRootView2 = ((GJ0) this.f708j).createRootView();
                if (reactRootViewCreateRootView2 == null) {
                    break;
                }
                break;
        }
        return super.mo580a();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BJ0(Bundle bundle, GJ0 gj0, Activity activity, PL0 pl0) {
        super(activity, pl0, bundle);
        this.f708j = gj0;
    }
}
