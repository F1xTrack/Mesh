package defpackage;

import android.app.job.JobInfo;
import android.hardware.camera2.params.OutputConfiguration;
import android.icu.text.DecimalFormat;
import android.icu.util.Measure;
import android.icu.util.MeasureUnit;
import android.net.Uri;

/* renamed from: yB0 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC8125yB0 {
    public static /* synthetic */ JobInfo.TriggerContentUri b(Uri uri, int i) {
        return new JobInfo.TriggerContentUri(uri, i);
    }

    public static /* bridge */ /* synthetic */ OutputConfiguration c(Object obj) {
        return (OutputConfiguration) obj;
    }

    public static /* bridge */ /* synthetic */ DecimalFormat d(Object obj) {
        return (DecimalFormat) obj;
    }

    public static /* synthetic */ Measure e(Double d, MeasureUnit measureUnit) {
        return new Measure(d, measureUnit);
    }

    public static /* bridge */ /* synthetic */ MeasureUnit f(Object obj) {
        return (MeasureUnit) obj;
    }

    public static /* synthetic */ void l() {
    }

    public static /* bridge */ /* synthetic */ boolean w(Object obj) {
        return obj instanceof DecimalFormat;
    }

    public static /* synthetic */ void z() {
    }
}
