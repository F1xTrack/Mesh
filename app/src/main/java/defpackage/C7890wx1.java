package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.util.Base64;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;

/* renamed from: wx1 */
/* loaded from: classes.dex */
public final class C7890wx1 extends GmsClient {
    public final C8080xx1 a;

    public C7890wx1(Context context, Looper looper, ClientSettings clientSettings, C8080xx1 c8080xx1, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, 68, clientSettings, connectionCallbacks, onConnectionFailedListener);
        c8080xx1 = c8080xx1 == null ? C8080xx1.c : c8080xx1;
        N8 n8 = new N8(27, false);
        n8.b = Boolean.FALSE;
        C8080xx1 c8080xx12 = C8080xx1.c;
        c8080xx1.getClass();
        n8.b = Boolean.valueOf(c8080xx1.a);
        n8.c = c8080xx1.b;
        byte[] bArr = new byte[16];
        AbstractC6936rx1.a.nextBytes(bArr);
        n8.c = Base64.encodeToString(bArr, 11);
        this.a = new C8080xx1(n8);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
        return iInterfaceQueryLocalInterface instanceof C8270yx1 ? (C8270yx1) iInterfaceQueryLocalInterface : new C8270yx1(iBinder, "com.google.android.gms.auth.api.credentials.internal.ICredentialsService", 0);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final Bundle getGetServiceRequestExtraArgs() {
        C8080xx1 c8080xx1 = this.a;
        c8080xx1.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("consumer_package", null);
        bundle.putBoolean("force_save_dialog", c8080xx1.a);
        bundle.putString("log_session_id", c8080xx1.b);
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final int getMinApkVersion() {
        return 12800000;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String getServiceDescriptor() {
        return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String getStartServiceAction() {
        return "com.google.android.gms.auth.api.credentials.service.START";
    }
}
