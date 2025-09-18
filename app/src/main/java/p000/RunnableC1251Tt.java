package p000;

import android.app.Activity;
import android.app.Dialog;

/* renamed from: Tt */
/* loaded from: classes2.dex */
public final class RunnableC1251Tt implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f11575a;

    /* renamed from: b */
    public final /* synthetic */ Activity f11576b;

    public /* synthetic */ RunnableC1251Tt(Activity activity, int i) {
        this.f11575a = i;
        this.f11576b = activity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f11575a) {
            case 0:
                this.f11576b.recreate();
                break;
            case 1:
                this.f11576b.getWindow().setFlags(8192, 8192);
                break;
            case 2:
                this.f11576b.getWindow().clearFlags(8192);
                break;
            case 3:
                this.f11576b.getWindow().setFlags(8192, 8192);
                break;
            default:
                Dialog dialog = NS1.f7793a;
                if (dialog != null && dialog.isShowing()) {
                    Activity activity = this.f11576b;
                    boolean zIsDestroyed = activity.isDestroyed();
                    if (!activity.isFinishing() && !zIsDestroyed) {
                        NS1.f7793a.dismiss();
                    }
                    NS1.f7793a = null;
                    break;
                }
                break;
        }
    }
}
