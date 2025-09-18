package defpackage;

import android.app.Activity;
import android.os.Bundle;
import com.facebook.react.ReactRootView;

/* loaded from: classes.dex */
public final class BJ0 extends VJ0 {
    public final /* synthetic */ int i = 0;
    public final /* synthetic */ CJ0 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BJ0(CJ0 cj0, Activity activity, PL0 pl0, Bundle bundle, boolean z) {
        super(activity, pl0, bundle, z);
        this.j = cj0;
    }

    @Override // defpackage.VJ0
    public final ReactRootView a() {
        switch (this.i) {
            case 0:
                ReactRootView reactRootViewCreateRootView = this.j.createRootView();
                if (reactRootViewCreateRootView == null) {
                    break;
                }
                break;
            default:
                ReactRootView reactRootViewCreateRootView2 = ((GJ0) this.j).createRootView();
                if (reactRootViewCreateRootView2 == null) {
                    break;
                }
                break;
        }
        return super.a();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BJ0(Bundle bundle, GJ0 gj0, Activity activity, PL0 pl0) {
        super(activity, pl0, bundle);
        this.j = gj0;
    }
}
