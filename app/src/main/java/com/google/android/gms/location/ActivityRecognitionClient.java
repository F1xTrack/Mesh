package com.google.android.gms.location;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.HasApiKey;
import com.google.android.gms.tasks.Task;

/* loaded from: classes.dex */
public interface ActivityRecognitionClient extends HasApiKey<Api.ApiOptions.NoOptions> {
    Task removeActivityTransitionUpdates(PendingIntent pendingIntent);

    Task removeActivityUpdates(PendingIntent pendingIntent);

    Task removeSleepSegmentUpdates(PendingIntent pendingIntent);

    Task requestActivityTransitionUpdates(ActivityTransitionRequest activityTransitionRequest, PendingIntent pendingIntent);

    Task requestActivityUpdates(long j, PendingIntent pendingIntent);

    Task requestSleepSegmentUpdates(PendingIntent pendingIntent, SleepSegmentRequest sleepSegmentRequest);
}
