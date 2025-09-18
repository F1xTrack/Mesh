package defpackage;

import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import com.facebook.react.bridge.Promise;
import java.util.TimerTask;

/* loaded from: classes.dex */
public final class Z00 extends TimerTask {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public Z00(C2053a10 c2053a10, Promise promise) {
        this.c = c2053a10;
        this.b = promise;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                C2053a10 c2053a10 = (C2053a10) this.c;
                try {
                    ((Promise) this.b).reject("TIMEOUT", "Location timed out");
                    c2053a10.a();
                    c2053a10.d = null;
                    c2053a10.b = null;
                    c2053a10.c = null;
                    break;
                } catch (Exception e) {
                    e.printStackTrace();
                    return;
                }
            default:
                ((AccessibilityManager) this.b).sendAccessibilityEvent((AccessibilityEvent) this.c);
                break;
        }
    }

    public Z00(AccessibilityManager accessibilityManager, AccessibilityEvent accessibilityEvent) {
        this.b = accessibilityManager;
        this.c = accessibilityEvent;
    }
}
