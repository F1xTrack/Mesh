package defpackage;

import android.app.Activity;
import android.app.Dialog;

/* renamed from: Tt, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC1558Tt implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Activity b;

    public /* synthetic */ RunnableC1558Tt(Activity activity, int i) {
        this.a = i;
        this.b = activity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.recreate();
                break;
            case 1:
                this.b.getWindow().setFlags(8192, 8192);
                break;
            case 2:
                this.b.getWindow().clearFlags(8192);
                break;
            case 3:
                this.b.getWindow().setFlags(8192, 8192);
                break;
            default:
                Dialog dialog = NS1.a;
                if (dialog != null && dialog.isShowing()) {
                    Activity activity = this.b;
                    boolean zIsDestroyed = activity.isDestroyed();
                    if (!activity.isFinishing() && !zIsDestroyed) {
                        NS1.a.dismiss();
                    }
                    NS1.a = null;
                    break;
                }
                break;
        }
    }
}
