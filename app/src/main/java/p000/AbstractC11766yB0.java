package p000;

import android.app.job.JobInfo;
import android.hardware.camera2.params.OutputConfiguration;
import android.icu.text.DecimalFormat;
import android.icu.util.Measure;
import android.icu.util.MeasureUnit;
import android.net.Uri;

/* renamed from: yB0 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC11766yB0 {
    /* renamed from: b */
    public static /* synthetic */ JobInfo.TriggerContentUri m26066b(Uri uri, int i) {
        return new JobInfo.TriggerContentUri(uri, i);
    }

    /* renamed from: c */
    public static /* bridge */ /* synthetic */ OutputConfiguration m26067c(Object obj) {
        return (OutputConfiguration) obj;
    }

    /* renamed from: d */
    public static /* bridge */ /* synthetic */ DecimalFormat m26068d(Object obj) {
        return (DecimalFormat) obj;
    }

    /* renamed from: e */
    public static /* synthetic */ Measure m26069e(Double d, MeasureUnit measureUnit) {
        return new Measure(d, measureUnit);
    }

    /* renamed from: f */
    public static /* bridge */ /* synthetic */ MeasureUnit m26070f(Object obj) {
        return (MeasureUnit) obj;
    }

    /* renamed from: l */
    public static /* synthetic */ void m26076l() {
    }

    /* renamed from: w */
    public static /* bridge */ /* synthetic */ boolean m26087w(Object obj) {
        return obj instanceof DecimalFormat;
    }

    /* renamed from: z */
    public static /* synthetic */ void m26090z() {
    }
}
