package p000;

import android.view.FrameMetrics;
import android.view.Window;
import android.view.Window$OnFrameMetricsAvailableListener;

/* renamed from: MY */
/* loaded from: classes.dex */
public final class WindowOnFrameMetricsAvailableListenerC0790MY implements Window$OnFrameMetricsAvailableListener {

    /* renamed from: a */
    public final /* synthetic */ C0853NY f7217a;

    public WindowOnFrameMetricsAvailableListenerC0790MY(C0853NY c0853ny) {
        this.f7217a = c0853ny;
    }

    public final void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i) {
        C0853NY c0853ny = this.f7217a;
        if ((c0853ny.f7863j & 1) != 0) {
            C0853NY.m5777o(c0853ny.f7864k[0], frameMetrics.getMetric(8));
        }
        C0853NY c0853ny2 = this.f7217a;
        if ((c0853ny2.f7863j & 2) != 0) {
            C0853NY.m5777o(c0853ny2.f7864k[1], frameMetrics.getMetric(1));
        }
        C0853NY c0853ny3 = this.f7217a;
        if ((c0853ny3.f7863j & 4) != 0) {
            C0853NY.m5777o(c0853ny3.f7864k[2], frameMetrics.getMetric(3));
        }
        C0853NY c0853ny4 = this.f7217a;
        if ((c0853ny4.f7863j & 8) != 0) {
            C0853NY.m5777o(c0853ny4.f7864k[3], frameMetrics.getMetric(4));
        }
        C0853NY c0853ny5 = this.f7217a;
        if ((c0853ny5.f7863j & 16) != 0) {
            C0853NY.m5777o(c0853ny5.f7864k[4], frameMetrics.getMetric(5));
        }
        C0853NY c0853ny6 = this.f7217a;
        if ((c0853ny6.f7863j & 64) != 0) {
            C0853NY.m5777o(c0853ny6.f7864k[6], frameMetrics.getMetric(7));
        }
        C0853NY c0853ny7 = this.f7217a;
        if ((c0853ny7.f7863j & 32) != 0) {
            C0853NY.m5777o(c0853ny7.f7864k[5], frameMetrics.getMetric(6));
        }
        C0853NY c0853ny8 = this.f7217a;
        if ((c0853ny8.f7863j & 128) != 0) {
            C0853NY.m5777o(c0853ny8.f7864k[7], frameMetrics.getMetric(0));
        }
        C0853NY c0853ny9 = this.f7217a;
        if ((c0853ny9.f7863j & 256) != 0) {
            C0853NY.m5777o(c0853ny9.f7864k[8], frameMetrics.getMetric(2));
        }
    }
}
