package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Api;

/* renamed from: Ry1 */
/* loaded from: classes.dex */
public final class C1419Ry1 extends AbstractC3722fA1 {
    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final void doExecute(Api.AnyClient anyClient) throws RemoteException {
        S81 s81A = C5453kA1.a(this);
        InterfaceC3600eX1 interfaceC3600eX1 = (InterfaceC3600eX1) ((C8325zE1) anyClient).getService();
        BinderC7752wD1 binderC7752wD1 = new BinderC7752wD1(null, s81A);
        C2341bW1 c2341bW1 = (C2341bW1) interfaceC3600eX1;
        Parcel parcelZza = c2341bW1.zza();
        LC1.d(parcelZza, binderC7752wD1);
        c2341bW1.zzc(67, parcelZza);
    }
}
