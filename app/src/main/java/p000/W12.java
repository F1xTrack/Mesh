package p000;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes.dex */
public final class W12 extends AbstractC11749y22 {

    /* renamed from: a */
    public final /* synthetic */ PendingIntent f12937a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W12(GoogleApiClient googleApiClient, PendingIntent pendingIntent) {
        super(googleApiClient);
        this.f12937a = pendingIntent;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final void doExecute(Api.AnyClient anyClient) throws RemoteException {
        C9224eI1 c9224eI1 = (C9224eI1) anyClient;
        c9224eI1.getClass();
        PendingIntent pendingIntent = this.f12937a;
        Preconditions.checkNotNull(pendingIntent);
        C8863bW1 c8863bW1 = (C8863bW1) ((InterfaceC9254eX1) c9224eI1.getService());
        Parcel parcelZza = c8863bW1.zza();
        LC1.m4925c(parcelZza, pendingIntent);
        c8863bW1.zzc(6, parcelZza);
        setResult((W12) Status.RESULT_SUCCESS);
    }
}
