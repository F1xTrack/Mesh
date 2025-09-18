package p000;

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
public final class E01 extends GmsClient implements InterfaceC8789ax1 {

    /* renamed from: e */
    public static final /* synthetic */ int f2336e = 0;

    /* renamed from: a */
    public final boolean f2337a;

    /* renamed from: b */
    public final ClientSettings f2338b;

    /* renamed from: c */
    public final Bundle f2339c;

    /* renamed from: d */
    public final Integer f2340d;

    public E01(Context context, Looper looper, ClientSettings clientSettings, Bundle bundle, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, 44, clientSettings, connectionCallbacks, onConnectionFailedListener);
        this.f2337a = true;
        this.f2338b = clientSettings;
        this.f2339c = bundle;
        this.f2340d = clientSettings.zab();
    }

    @Override // p000.InterfaceC8789ax1
    /* renamed from: a */
    public final void mo1972a(AbstractBinderC8451Vw1 abstractBinderC8451Vw1) {
        Preconditions.checkNotNull(abstractBinderC8451Vw1, "Expecting a valid ISignInCallbacks");
        try {
            try {
                Account accountOrDefault = this.f2338b.getAccountOrDefault();
                zat zatVar = new zat(accountOrDefault, ((Integer) Preconditions.checkNotNull(this.f2340d)).intValue(), "<<default account>>".equals(accountOrDefault.name) ? Y41.m9209a(getContext()).m9211b() : null);
                C9050cx1 c9050cx1 = (C9050cx1) getService();
                C9562gx1 c9562gx1 = new C9562gx1(1, zatVar);
                Parcel parcelZaa = c9050cx1.zaa();
                AbstractC8399Uw1.m8204c(parcelZaa, c9562gx1);
                AbstractC8399Uw1.m8205d(parcelZaa, abstractBinderC8451Vw1);
                c9050cx1.zac(12, parcelZaa);
            } catch (RemoteException unused) {
            }
        } catch (RemoteException unused2) {
            abstractBinderC8451Vw1.zab(new C9946jx1(1, new ConnectionResult(8, null), null));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.InterfaceC8789ax1
    /* renamed from: b */
    public final void mo1973b(IAccountAccessor iAccountAccessor, boolean z) {
        try {
            C9050cx1 c9050cx1 = (C9050cx1) getService();
            int iIntValue = ((Integer) Preconditions.checkNotNull(this.f2340d)).intValue();
            Parcel parcelZaa = c9050cx1.zaa();
            AbstractC8399Uw1.m8205d(parcelZaa, iAccountAccessor);
            parcelZaa.writeInt(iIntValue);
            parcelZaa.writeInt(z ? 1 : 0);
            c9050cx1.zac(9, parcelZaa);
        } catch (RemoteException unused) {
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return iInterfaceQueryLocalInterface instanceof C9050cx1 ? (C9050cx1) iInterfaceQueryLocalInterface : new C9050cx1(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final Bundle getGetServiceRequestExtraArgs() {
        ClientSettings clientSettings = this.f2338b;
        boolean zEquals = getContext().getPackageName().equals(clientSettings.getRealClientPackageName());
        Bundle bundle = this.f2339c;
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
        return this.f2337a;
    }

    @Override // p000.InterfaceC8789ax1
    public final void zaa() {
        try {
            C9050cx1 c9050cx1 = (C9050cx1) getService();
            int iIntValue = ((Integer) Preconditions.checkNotNull(this.f2340d)).intValue();
            Parcel parcelZaa = c9050cx1.zaa();
            parcelZaa.writeInt(iIntValue);
            c9050cx1.zac(7, parcelZaa);
        } catch (RemoteException unused) {
        }
    }

    @Override // p000.InterfaceC8789ax1
    public final void zab() {
        connect(new BaseGmsClient.LegacyClientCallbackAdapter());
    }
}
