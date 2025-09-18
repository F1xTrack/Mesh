package defpackage;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.StatusCallback;
import com.google.android.gms.common.internal.Preconditions;

/* renamed from: Zx1 */
/* loaded from: classes.dex */
public final /* synthetic */ class C2040Zx1 implements RemoteCall {
    public final /* synthetic */ int a;
    public final /* synthetic */ PendingIntent b;

    public /* synthetic */ C2040Zx1(int i, PendingIntent pendingIntent) {
        this.a = i;
        this.b = pendingIntent;
    }

    @Override // com.google.android.gms.common.api.internal.RemoteCall
    public final void accept(Object obj, Object obj2) throws RemoteException {
        PendingIntent pendingIntent = this.b;
        C3555eI1 c3555eI1 = (C3555eI1) obj;
        S81 s81 = (S81) obj2;
        switch (this.a) {
            case 0:
                Api api = C8083xy1.a;
                C7130sy1 c7130sy1 = new C7130sy1(s81);
                Preconditions.checkNotNull(pendingIntent, "PendingIntent must be specified.");
                Preconditions.checkNotNull(c7130sy1, "ResultHolder not provided.");
                StatusCallback statusCallback = new StatusCallback(c7130sy1);
                C2341bW1 c2341bW1 = (C2341bW1) ((InterfaceC3600eX1) c3555eI1.getService());
                Parcel parcelZza = c2341bW1.zza();
                LC1.c(parcelZza, pendingIntent);
                LC1.d(parcelZza, statusCallback);
                c2341bW1.zzc(69, parcelZza);
                break;
            default:
                Api api2 = C8083xy1.a;
                C7130sy1 c7130sy12 = new C7130sy1(s81);
                Preconditions.checkNotNull(c7130sy12, "ResultHolder not provided.");
                StatusCallback statusCallback2 = new StatusCallback(c7130sy12);
                C2341bW1 c2341bW12 = (C2341bW1) ((InterfaceC3600eX1) c3555eI1.getService());
                Parcel parcelZza2 = c2341bW12.zza();
                LC1.c(parcelZza2, pendingIntent);
                LC1.d(parcelZza2, statusCallback2);
                c2341bW12.zzc(73, parcelZza2);
                break;
        }
    }
}
