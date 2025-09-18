package p000;

import android.app.job.JobParameters;
import android.net.Uri;

/* loaded from: classes.dex */
public abstract class W71 {
    /* renamed from: a */
    public static String[] m8671a(JobParameters jobParameters) {
        return jobParameters.getTriggeredContentAuthorities();
    }

    /* renamed from: b */
    public static Uri[] m8672b(JobParameters jobParameters) {
        return jobParameters.getTriggeredContentUris();
    }
}
