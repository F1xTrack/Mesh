package p000;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Api;

/* renamed from: Ry1 */
/* loaded from: classes.dex */
public final class C8247Ry1 extends AbstractC9336fA1 {
    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final void doExecute(Api.AnyClient anyClient) throws RemoteException {
        S81 s81M22159a = C9976kA1.m22159a(this);
        InterfaceC9254eX1 interfaceC9254eX1 = (InterfaceC9254eX1) ((C11900zE1) anyClient).getService();
        BinderC11517wD1 binderC11517wD1 = new BinderC11517wD1(null, s81M22159a);
        C8863bW1 c8863bW1 = (C8863bW1) interfaceC9254eX1;
        Parcel parcelZza = c8863bW1.zza();
        LC1.m4926d(parcelZza, binderC11517wD1);
        c8863bW1.zzc(67, parcelZza);
    }
}
