package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.zat;

/* loaded from: classes.dex */
public final class E01 extends GmsClient implements InterfaceC2231ax1 {
    public static final /* synthetic */ int e = 0;
    public final boolean a;
    public final ClientSettings b;
    public final Bundle c;
    public final Integer d;

    public E01(Context context, Looper looper, ClientSettings clientSettings, Bundle bundle, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, 44, clientSettings, connectionCallbacks, onConnectionFailedListener);
        this.a = true;
        this.b = clientSettings;
        this.c = bundle;
        this.d = clientSettings.zab();
    }

    @Override // defpackage.InterfaceC2231ax1
    public final void a(AbstractBinderC1725Vw1 abstractBinderC1725Vw1) {
        Preconditions.checkNotNull(abstractBinderC1725Vw1, "Expecting a valid ISignInCallbacks");
        try {
            try {
                Account accountOrDefault = this.b.getAccountOrDefault();
                zat zatVar = new zat(accountOrDefault, ((Integer) Preconditions.checkNotNull(this.d)).intValue(), "<<default account>>".equals(accountOrDefault.name) ? Y41.a(getContext()).b() : null);
                C3297cx1 c3297cx1 = (C3297cx1) getService();
                C4060gx1 c4060gx1 = new C4060gx1(1, zatVar);
                Parcel parcelZaa = c3297cx1.zaa();
                AbstractC1647Uw1.c(parcelZaa, c4060gx1);
                AbstractC1647Uw1.d(parcelZaa, abstractBinderC1725Vw1);
                c3297cx1.zac(12, parcelZaa);
            } catch (RemoteException unused) {
            }
        } catch (RemoteException unused2) {
            abstractBinderC1725Vw1.zab(new C5409jx1(1, new ConnectionResult(8, null), null));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.InterfaceC2231ax1
    public final void b(IAccountAccessor iAccountAccessor, boolean z) {
        try {
            C3297cx1 c3297cx1 = (C3297cx1) getService();
            int iIntValue = ((Integer) Preconditions.checkNotNull(this.d)).intValue();
            Parcel parcelZaa = c3297cx1.zaa();
            AbstractC1647Uw1.d(parcelZaa, iAccountAccessor);
            parcelZaa.writeInt(iIntValue);
            parcelZaa.writeInt(z ? 1 : 0);
            c3297cx1.zac(9, parcelZaa);
        } catch (RemoteException unused) {
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return iInterfaceQueryLocalInterface instanceof C3297cx1 ? (C3297cx1) iInterfaceQueryLocalInterface : new C3297cx1(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final Bundle getGetServiceRequestExtraArgs() {
        ClientSettings clientSettings = this.b;
        boolean zEquals = getContext().getPackageName().equals(clientSettings.getRealClientPackageName());
        Bundle bundle = this.c;
        if (!zEquals) {
            bundle.putString("com.google.android.gms.signin.internal.realClientPackageName", clientSettings.getRealClientPackageName());
        }
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final int getMinApkVersion() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String getServiceDescriptor() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String getStartServiceAction() {
        return "com.google.android.gms.signin.service.START";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final boolean requiresSignIn() {
        return this.a;
    }

    @Override // defpackage.InterfaceC2231ax1
    public final void zaa() {
        try {
            C3297cx1 c3297cx1 = (C3297cx1) getService();
            int iIntValue = ((Integer) Preconditions.checkNotNull(this.d)).intValue();
            Parcel parcelZaa = c3297cx1.zaa();
            parcelZaa.writeInt(iIntValue);
            c3297cx1.zac(7, parcelZaa);
        } catch (RemoteException unused) {
        }
    }

    @Override // defpackage.InterfaceC2231ax1
    public final void zab() {
        connect(new BaseGmsClient.LegacyClientCallbackAdapter());
    }
}
