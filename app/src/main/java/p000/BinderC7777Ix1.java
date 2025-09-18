package p000;

import android.content.Context;
import android.os.Binder;
import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.RevocationBoundService;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.PendingResults;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.ApiExceptionMapper;
import com.google.android.gms.common.internal.PendingResultUtil;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.logging.Logger;
import com.google.android.gms.common.util.UidVerifier;

/* renamed from: Ix1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC7777Ix1 extends AbstractBinderC9424fs1 {

    /* renamed from: b */
    public final RevocationBoundService f5231b;

    public BinderC7777Ix1(RevocationBoundService revocationBoundService) {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService");
        this.f5231b = revocationBoundService;
    }

    @Override // p000.AbstractBinderC9424fs1
    /* renamed from: H */
    public final boolean mo416H(int i, Parcel parcel, Parcel parcel2) {
        PendingResult pendingResultExecute;
        RevocationBoundService revocationBoundService = this.f5231b;
        if (i == 1) {
            m4088I();
            Y41 y41M9209a = Y41.m9209a(revocationBoundService);
            GoogleSignInAccount googleSignInAccountM9211b = y41M9209a.m9211b();
            GoogleSignInOptions googleSignInOptionsM9212c = GoogleSignInOptions.f18019k;
            if (googleSignInAccountM9211b != null) {
                googleSignInOptionsM9212c = y41M9209a.m9212c();
            }
            N10 n10 = new N10(revocationBoundService, AbstractC1169Sa.f10859a, (GoogleSignInOptions) Preconditions.checkNotNull(googleSignInOptionsM9212c), new GoogleApi.Settings.Builder().setMapper(new ApiExceptionMapper()).build());
            if (googleSignInAccountM9211b != null) {
                GoogleApiClient googleApiClientAsGoogleApiClient = n10.asGoogleApiClient();
                Context applicationContext = n10.getApplicationContext();
                boolean z = n10.m5520a() == 3;
                AbstractC7569Ex1.f2983a.m11123d("Revoking access", new Object[0]);
                String strM9214e = Y41.m9209a(applicationContext).m9214e("refreshToken");
                AbstractC7569Ex1.m2459a(applicationContext);
                if (!z) {
                    pendingResultExecute = googleApiClientAsGoogleApiClient.execute(new C7465Cx1(googleApiClientAsGoogleApiClient));
                } else if (strM9214e == null) {
                    Logger logger = RunnableC11098sx1.f42739c;
                    pendingResultExecute = PendingResults.immediateFailedResult(new Status(4), null);
                } else {
                    RunnableC11098sx1 runnableC11098sx1 = new RunnableC11098sx1(strM9214e);
                    new Thread(runnableC11098sx1).start();
                    pendingResultExecute = runnableC11098sx1.f42741b;
                }
                PendingResultUtil.toVoidTask(pendingResultExecute);
            } else {
                GoogleApiClient googleApiClientAsGoogleApiClient2 = n10.asGoogleApiClient();
                Context applicationContext2 = n10.getApplicationContext();
                boolean z2 = n10.m5520a() == 3;
                AbstractC7569Ex1.f2983a.m11123d("Signing out", new Object[0]);
                AbstractC7569Ex1.m2459a(applicationContext2);
                PendingResultUtil.toVoidTask(z2 ? PendingResults.immediatePendingResult(Status.RESULT_SUCCESS, googleApiClientAsGoogleApiClient2) : googleApiClientAsGoogleApiClient2.execute(new C7413Bx1(googleApiClientAsGoogleApiClient2)));
            }
        } else {
            if (i != 2) {
                return false;
            }
            m4088I();
            C7621Fx1.m2835A(revocationBoundService).m2838B();
        }
        return true;
    }

    /* renamed from: I */
    public final void m4088I() {
        if (!UidVerifier.isGooglePlayServicesUid(this.f5231b, Binder.getCallingUid())) {
            throw new SecurityException(AbstractC7222ym.m26230g(Binder.getCallingUid(), "Calling UID ", " is not Google Play services."));
        }
    }
}
