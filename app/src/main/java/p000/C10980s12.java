package p000;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;

/* renamed from: s12, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10980s12 extends AbstractC11749y22 {

    /* renamed from: a */
    public final /* synthetic */ long f42202a;

    /* renamed from: b */
    public final /* synthetic */ PendingIntent f42203b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10980s12(GoogleApiClient googleApiClient, long j, PendingIntent pendingIntent) {
        super(googleApiClient);
        this.f42202a = j;
        this.f42203b = pendingIntent;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final void doExecute(Api.AnyClient anyClient) throws RemoteException {
        C9224eI1 c9224eI1 = (C9224eI1) anyClient;
        PendingIntent pendingIntent = this.f42203b;
        Preconditions.checkNotNull(pendingIntent);
        long j = this.f42202a;
        Preconditions.checkArgument(j >= 0, "detectionIntervalMillis must be >= 0");
        C8863bW1 c8863bW1 = (C8863bW1) ((InterfaceC9254eX1) c9224eI1.getService());
        Parcel parcelZza = c8863bW1.zza();
        parcelZza.writeLong(j);
        int i = LC1.f6548a;
        parcelZza.writeInt(1);
        LC1.m4925c(parcelZza, pendingIntent);
        c8863bW1.zzc(5, parcelZza);
        setResult((C10980s12) Status.RESULT_SUCCESS);
    }
}
