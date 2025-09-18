package defpackage;

import android.location.LocationManager;
import com.facebook.react.bridge.Promise;
import java.util.Timer;

/* renamed from: a10 */
/* loaded from: classes.dex */
public final class C2053a10 {
    public final LocationManager a;
    public Timer b;
    public Y00 c;
    public Promise d;

    public C2053a10(LocationManager locationManager) {
        this.a = locationManager;
    }

    public final void a() {
        Timer timer = this.b;
        if (timer != null) {
            timer.cancel();
        }
        Y00 y00 = this.c;
        if (y00 != null) {
            this.a.removeUpdates(y00);
        }
    }
}
