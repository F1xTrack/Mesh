package defpackage;

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
public final class C8460zx1 extends GmsClient {
    public final GoogleSignInOptions a;

    public C8460zx1(Context context, Looper looper, ClientSettings clientSettings, GoogleSignInOptions googleSignInOptions, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        O10 o10;
        super(context, looper, 91, clientSettings, connectionCallbacks, onConnectionFailedListener);
        if (googleSignInOptions != null) {
            o10 = new O10();
            o10.a = new HashSet();
            o10.h = new HashMap();
            Preconditions.checkNotNull(googleSignInOptions);
            o10.a = new HashSet(googleSignInOptions.b);
            o10.b = googleSignInOptions.e;
            o10.c = googleSignInOptions.f;
            o10.d = googleSignInOptions.d;
            o10.e = googleSignInOptions.g;
            o10.f = googleSignInOptions.c;
            o10.g = googleSignInOptions.h;
            o10.h = GoogleSignInOptions.m0(googleSignInOptions.i);
            o10.i = googleSignInOptions.j;
        } else {
            o10 = new O10();
            o10.a = new HashSet();
            o10.h = new HashMap();
        }
        byte[] bArr = new byte[16];
        AbstractC6936rx1.a.nextBytes(bArr);
        o10.i = Base64.encodeToString(bArr, 11);
        if (!clientSettings.getAllRequestedScopes().isEmpty()) {
            for (Scope scope : clientSettings.getAllRequestedScopes()) {
                HashSet hashSet = o10.a;
                hashSet.add(scope);
                hashSet.addAll(Arrays.asList(new Scope[0]));
            }
        }
        Scope scope2 = GoogleSignInOptions.n;
        HashSet hashSet2 = o10.a;
        if (hashSet2.contains(scope2)) {
            Scope scope3 = GoogleSignInOptions.m;
            if (hashSet2.contains(scope3)) {
                hashSet2.remove(scope3);
            }
        }
        if (o10.d && (o10.f == null || !hashSet2.isEmpty())) {
            o10.a.add(GoogleSignInOptions.l);
        }
        this.a = new GoogleSignInOptions(3, new ArrayList(hashSet2), o10.f, o10.d, o10.b, o10.c, o10.e, o10.g, o10.h, o10.i);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
        return iInterfaceQueryLocalInterface instanceof C0637Hx1 ? (C0637Hx1) iInterfaceQueryLocalInterface : new C0637Hx1(iBinder, "com.google.android.gms.auth.api.signin.internal.ISignInService", 0);
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
        AbstractC0403Ex1.a.d("getSignInIntent()", new Object[0]);
        SignInConfiguration signInConfiguration = new SignInConfiguration(context.getPackageName(), this.a);
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
