package defpackage;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes.dex */
public final class W12 extends AbstractC8099y22 {
    public final /* synthetic */ PendingIntent a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W12(GoogleApiClient googleApiClient, PendingIntent pendingIntent) {
        super(googleApiClient);
        this.a = pendingIntent;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final void doExecute(Api.AnyClient anyClient) throws RemoteException {
        C3555eI1 c3555eI1 = (C3555eI1) anyClient;
        c3555eI1.getClass();
        PendingIntent pendingIntent = this.a;
        Preconditions.checkNotNull(pendingIntent);
        C2341bW1 c2341bW1 = (C2341bW1) ((InterfaceC3600eX1) c3555eI1.getService());
        Parcel parcelZza = c2341bW1.zza();
        LC1.c(parcelZza, pendingIntent);
        c2341bW1.zzc(6, parcelZza);
        setResult((W12) Status.RESULT_SUCCESS);
    }
}
