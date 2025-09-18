package p000;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.location.ActivityRecognitionClient;
import com.google.android.gms.location.ActivityTransitionRequest;
import com.google.android.gms.location.SleepSegmentRequest;
import com.google.android.gms.location.zza;
import com.google.android.gms.location.zzb;
import com.google.android.gms.location.zzm;
import com.google.android.gms.tasks.Task;

/* renamed from: xy1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11738xy1 extends GoogleApi implements ActivityRecognitionClient {

    /* renamed from: a */
    public static final Api f45917a = new Api("ActivityRecognition.API", new C9564gy1(), new Api.ClientKey());

    @Override // com.google.android.gms.location.ActivityRecognitionClient
    public final Task removeActivityTransitionUpdates(PendingIntent pendingIntent) {
        return doWrite(TaskApiCall.builder().run(new C8661Zx1(1, pendingIntent)).setMethodKey(2406).build());
    }

    @Override // com.google.android.gms.location.ActivityRecognitionClient
    public final Task removeActivityUpdates(PendingIntent pendingIntent) {
        return doWrite(TaskApiCall.builder().run(new L21(11, pendingIntent)).setMethodKey(2402).build());
    }

    @Override // com.google.android.gms.location.ActivityRecognitionClient
    public final Task removeSleepSegmentUpdates(PendingIntent pendingIntent) {
        return doWrite(TaskApiCall.builder().run(new C8661Zx1(0, pendingIntent)).setMethodKey(2411).build());
    }

    @Override // com.google.android.gms.location.ActivityRecognitionClient
    public final Task requestActivityTransitionUpdates(ActivityTransitionRequest activityTransitionRequest, PendingIntent pendingIntent) {
        activityTransitionRequest.zza(getContextAttributionTag());
        return doWrite(TaskApiCall.builder().run(new C8763ak1(activityTransitionRequest, 4, pendingIntent)).setMethodKey(2405).build());
    }

    @Override // com.google.android.gms.location.ActivityRecognitionClient
    public final Task requestActivityUpdates(long j, PendingIntent pendingIntent) {
        zza zzaVar = new zza();
        zzaVar.zza(j);
        zzb zzbVarZzb = zzaVar.zzb();
        zzbVarZzb.zza(getContextAttributionTag());
        return doWrite(TaskApiCall.builder().run(new C8763ak1(zzbVarZzb, 8, pendingIntent)).setMethodKey(2401).build());
    }

    @Override // com.google.android.gms.location.ActivityRecognitionClient
    public final Task requestSleepSegmentUpdates(PendingIntent pendingIntent, SleepSegmentRequest sleepSegmentRequest) {
        Preconditions.checkNotNull(pendingIntent, "PendingIntent must be specified.");
        return doRead(TaskApiCall.builder().run(new C8389Ur1(this, pendingIntent, sleepSegmentRequest)).setFeatures(zzm.zzb).setMethodKey(2410).build());
    }
}
