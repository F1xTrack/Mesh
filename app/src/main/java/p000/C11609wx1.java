package p000;

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
public final class C11609wx1 extends GmsClient {

    /* renamed from: a */
    public final C11736xx1 f45177a;

    public C11609wx1(Context context, Looper looper, ClientSettings clientSettings, C11736xx1 c11736xx1, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, 68, clientSettings, connectionCallbacks, onConnectionFailedListener);
        c11736xx1 = c11736xx1 == null ? C11736xx1.f45914c : c11736xx1;
        C0827N8 c0827n8 = new C0827N8(27, false);
        c0827n8.f7523b = Boolean.FALSE;
        C11736xx1 c11736xx12 = C11736xx1.f45914c;
        c11736xx1.getClass();
        c0827n8.f7523b = Boolean.valueOf(c11736xx1.f45915a);
        c0827n8.f7524c = c11736xx1.f45916b;
        byte[] bArr = new byte[16];
        AbstractC10970rx1.f42177a.nextBytes(bArr);
        c0827n8.f7524c = Base64.encodeToString(bArr, 11);
        this.f45177a = new C11736xx1(c0827n8);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
        return iInterfaceQueryLocalInterface instanceof C11863yx1 ? (C11863yx1) iInterfaceQueryLocalInterface : new C11863yx1(iBinder, "com.google.android.gms.auth.api.credentials.internal.ICredentialsService", 0);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final Bundle getGetServiceRequestExtraArgs() {
        C11736xx1 c11736xx1 = this.f45177a;
        c11736xx1.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("consumer_package", null);
        bundle.putBoolean("force_save_dialog", c11736xx1.f45915a);
        bundle.putString("log_session_id", c11736xx1.f45916b);
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
