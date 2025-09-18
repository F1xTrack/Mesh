package defpackage;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;

/* renamed from: s12, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6951s12 extends AbstractC8099y22 {
    public final /* synthetic */ long a;
    public final /* synthetic */ PendingIntent b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6951s12(GoogleApiClient googleApiClient, long j, PendingIntent pendingIntent) {
        super(googleApiClient);
        this.a = j;
        this.b = pendingIntent;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final void doExecute(Api.AnyClient anyClient) throws RemoteException {
        C3555eI1 c3555eI1 = (C3555eI1) anyClient;
        PendingIntent pendingIntent = this.b;
        Preconditions.checkNotNull(pendingIntent);
        long j = this.a;
        Preconditions.checkArgument(j >= 0, "detectionIntervalMillis must be >= 0");
        C2341bW1 c2341bW1 = (C2341bW1) ((InterfaceC3600eX1) c3555eI1.getService());
        Parcel parcelZza = c2341bW1.zza();
        parcelZza.writeLong(j);
        int i = LC1.a;
        parcelZza.writeInt(1);
        LC1.c(parcelZza, pendingIntent);
        c2341bW1.zzc(5, parcelZza);
        setResult((C6951s12) Status.RESULT_SUCCESS);
    }
}
