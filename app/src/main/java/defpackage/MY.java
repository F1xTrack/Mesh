package defpackage;

import android.view.FrameMetrics;
import android.view.Window;
import android.view.Window$OnFrameMetricsAvailableListener;

/* loaded from: classes.dex */
public final class MY implements Window$OnFrameMetricsAvailableListener {
    public final /* synthetic */ NY a;

    public MY(NY ny) {
        this.a = ny;
    }

    public final void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i) {
        NY ny = this.a;
        if ((ny.j & 1) != 0) {
            NY.o(ny.k[0], frameMetrics.getMetric(8));
        }
        NY ny2 = this.a;
        if ((ny2.j & 2) != 0) {
            NY.o(ny2.k[1], frameMetrics.getMetric(1));
        }
        NY ny3 = this.a;
        if ((ny3.j & 4) != 0) {
            NY.o(ny3.k[2], frameMetrics.getMetric(3));
        }
        NY ny4 = this.a;
        if ((ny4.j & 8) != 0) {
            NY.o(ny4.k[3], frameMetrics.getMetric(4));
        }
        NY ny5 = this.a;
        if ((ny5.j & 16) != 0) {
            NY.o(ny5.k[4], frameMetrics.getMetric(5));
        }
        NY ny6 = this.a;
        if ((ny6.j & 64) != 0) {
            NY.o(ny6.k[6], frameMetrics.getMetric(7));
        }
        NY ny7 = this.a;
        if ((ny7.j & 32) != 0) {
            NY.o(ny7.k[5], frameMetrics.getMetric(6));
        }
        NY ny8 = this.a;
        if ((ny8.j & 128) != 0) {
            NY.o(ny8.k[7], frameMetrics.getMetric(0));
        }
        NY ny9 = this.a;
        if ((ny9.j & 256) != 0) {
            NY.o(ny9.k[8], frameMetrics.getMetric(2));
        }
    }
}
