package p000;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.util.Base64;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.SignInConfiguration;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: zx1 */
/* loaded from: classes.dex */
public final class C11990zx1 extends GmsClient {

    /* renamed from: a */
    public final GoogleSignInOptions f47115a;

    public C11990zx1(Context context, Looper looper, ClientSettings clientSettings, GoogleSignInOptions googleSignInOptions, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        O10 o10;
        super(context, looper, 91, clientSettings, connectionCallbacks, onConnectionFailedListener);
        if (googleSignInOptions != null) {
            o10 = new O10();
            o10.f8166a = new HashSet();
            o10.f8173h = new HashMap();
            Preconditions.checkNotNull(googleSignInOptions);
            o10.f8166a = new HashSet(googleSignInOptions.f18025b);
            o10.f8167b = googleSignInOptions.f18028e;
            o10.f8168c = googleSignInOptions.f18029f;
            o10.f8169d = googleSignInOptions.f18027d;
            o10.f8170e = googleSignInOptions.f18030g;
            o10.f8171f = googleSignInOptions.f18026c;
            o10.f8172g = googleSignInOptions.f18031h;
            o10.f8173h = GoogleSignInOptions.m11105m0(googleSignInOptions.f18032i);
            o10.f8174i = googleSignInOptions.f18033j;
        } else {
            o10 = new O10();
            o10.f8166a = new HashSet();
            o10.f8173h = new HashMap();
        }
        byte[] bArr = new byte[16];
        AbstractC10970rx1.f42177a.nextBytes(bArr);
        o10.f8174i = Base64.encodeToString(bArr, 11);
        if (!clientSettings.getAllRequestedScopes().isEmpty()) {
            for (Scope scope : clientSettings.getAllRequestedScopes()) {
                HashSet hashSet = o10.f8166a;
                hashSet.add(scope);
                hashSet.addAll(Arrays.asList(new Scope[0]));
            }
        }
        Scope scope2 = GoogleSignInOptions.f18022n;
        HashSet hashSet2 = o10.f8166a;
        if (hashSet2.contains(scope2)) {
            Scope scope3 = GoogleSignInOptions.f18021m;
            if (hashSet2.contains(scope3)) {
                hashSet2.remove(scope3);
            }
        }
        if (o10.f8169d && (o10.f8171f == null || !hashSet2.isEmpty())) {
            o10.f8166a.add(GoogleSignInOptions.f18020l);
        }
        this.f47115a = new GoogleSignInOptions(3, new ArrayList(hashSet2), o10.f8171f, o10.f8169d, o10.f8167b, o10.f8168c, o10.f8170e, o10.f8172g, o10.f8173h, o10.f8174i);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
        return iInterfaceQueryLocalInterface instanceof C7725Hx1 ? (C7725Hx1) iInterfaceQueryLocalInterface : new C7725Hx1(iBinder, "com.google.android.gms.auth.api.signin.internal.ISignInService", 0);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final int getMinApkVersion() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String getServiceDescriptor() {
        return "com.google.android.gms.auth.api.signin.internal.ISignInService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final Intent getSignInIntent() {
        Context context = getContext();
        AbstractC7569Ex1.f2983a.m11123d("getSignInIntent()", new Object[0]);
        SignInConfiguration signInConfiguration = new SignInConfiguration(context.getPackageName(), this.f47115a);
        Intent intent = new Intent("com.google.android.gms.auth.GOOGLE_SIGN_IN");
        intent.setPackage(context.getPackageName());
        intent.setClass(context, SignInHubActivity.class);
        Bundle bundle = new Bundle();
        bundle.putParcelable("config", signInConfiguration);
        intent.putExtra("config", bundle);
        return intent;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String getStartServiceAction() {
        return "com.google.android.gms.auth.api.signin.service.START";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final boolean providesSignIn() {
        return true;
    }
}
