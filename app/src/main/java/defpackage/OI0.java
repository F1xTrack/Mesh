package defpackage;

import android.app.Activity;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.killserver.screenshotprev.RNScreenshotPreventModule;

/* loaded from: classes2.dex */
public final class OI0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Activity b;
    public final /* synthetic */ RNScreenshotPreventModule c;

    public /* synthetic */ OI0(RNScreenshotPreventModule rNScreenshotPreventModule, Activity activity, int i) {
        this.a = i;
        this.c = rNScreenshotPreventModule;
        this.b = activity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                RNScreenshotPreventModule rNScreenshotPreventModule = this.c;
                RelativeLayout relativeLayout = rNScreenshotPreventModule.overlayLayout;
                Activity activity = this.b;
                if (relativeLayout != null) {
                    ((ViewGroup) activity.getWindow().getDecorView().getRootView()).removeView(rNScreenshotPreventModule.overlayLayout);
                    rNScreenshotPreventModule.overlayLayout = null;
                }
                activity.getWindow().clearFlags(8192);
                break;
            default:
                Activity activity2 = this.b;
                ViewGroup viewGroup = (ViewGroup) activity2.getWindow().getDecorView().getRootView();
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                RNScreenshotPreventModule rNScreenshotPreventModule2 = this.c;
                viewGroup.addView(rNScreenshotPreventModule2.overlayLayout, layoutParams);
                if ((activity2.getWindow().getAttributes().flags & 8192) == 0) {
                    rNScreenshotPreventModule2.secureFlagWasSet = false;
                    break;
                } else {
                    activity2.getWindow().clearFlags(8192);
                    rNScreenshotPreventModule2.secureFlagWasSet = true;
                    break;
                }
        }
    }
}
