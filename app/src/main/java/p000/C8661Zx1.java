package p000;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.StatusCallback;
import com.google.android.gms.common.internal.Preconditions;

/* renamed from: Zx1 */
/* loaded from: classes.dex */
public final /* synthetic */ class C8661Zx1 implements RemoteCall {

    /* renamed from: a */
    public final /* synthetic */ int f15240a;

    /* renamed from: b */
    public final /* synthetic */ PendingIntent f15241b;

    public /* synthetic */ C8661Zx1(int i, PendingIntent pendingIntent) {
        this.f15240a = i;
        this.f15241b = pendingIntent;
    }

    @Override // com.google.android.gms.common.api.internal.RemoteCall
    public final void accept(Object obj, Object obj2) throws RemoteException {
        PendingIntent pendingIntent = this.f15241b;
        C9224eI1 c9224eI1 = (C9224eI1) obj;
        S81 s81 = (S81) obj2;
        switch (this.f15240a) {
            case 0:
                Api api = C11738xy1.f45917a;
                C11100sy1 c11100sy1 = new C11100sy1(s81);
                Preconditions.checkNotNull(pendingIntent, "PendingIntent must be specified.");
                Preconditions.checkNotNull(c11100sy1, "ResultHolder not provided.");
                StatusCallback statusCallback = new StatusCallback(c11100sy1);
                C8863bW1 c8863bW1 = (C8863bW1) ((InterfaceC9254eX1) c9224eI1.getService());
                Parcel parcelZza = c8863bW1.zza();
                LC1.m4925c(parcelZza, pendingIntent);
                LC1.m4926d(parcelZza, statusCallback);
                c8863bW1.zzc(69, parcelZza);
                break;
            default:
                Api api2 = C11738xy1.f45917a;
                C11100sy1 c11100sy12 = new C11100sy1(s81);
                Preconditions.checkNotNull(c11100sy12, "ResultHolder not provided.");
                StatusCallback statusCallback2 = new StatusCallback(c11100sy12);
                C8863bW1 c8863bW12 = (C8863bW1) ((InterfaceC9254eX1) c9224eI1.getService());
                Parcel parcelZza2 = c8863bW12.zza();
                LC1.m4925c(parcelZza2, pendingIntent);
                LC1.m4926d(parcelZza2, statusCallback2);
                c8863bW12.zzc(73, parcelZza2);
                break;
        }
    }
}
