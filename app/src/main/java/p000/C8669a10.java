package p000;

import android.location.LocationManager;
import com.facebook.react.bridge.Promise;
import java.util.Timer;

/* renamed from: a10 */
/* loaded from: classes.dex */
public final class C8669a10 {

    /* renamed from: a */
    public final LocationManager f15284a;

    /* renamed from: b */
    public Timer f15285b;

    /* renamed from: c */
    public Y00 f15286c;

    /* renamed from: d */
    public Promise f15287d;

    public C8669a10(LocationManager locationManager) {
        this.f15284a = locationManager;
    }

    /* renamed from: a */
    public final void m9661a() {
        Timer timer = this.f15285b;
        if (timer != null) {
            timer.cancel();
        }
        Y00 y00 = this.f15286c;
        if (y00 != null) {
            this.f15284a.removeUpdates(y00);
        }
    }
}
