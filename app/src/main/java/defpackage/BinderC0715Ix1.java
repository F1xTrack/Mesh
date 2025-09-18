package defpackage;

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
public final class BinderC0715Ix1 extends AbstractBinderC3854fs1 {
    public final RevocationBoundService b;

    public BinderC0715Ix1(RevocationBoundService revocationBoundService) {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService");
        this.b = revocationBoundService;
    }

    @Override // defpackage.AbstractBinderC3854fs1
    public final boolean H(int i, Parcel parcel, Parcel parcel2) {
        PendingResult pendingResultExecute;
        RevocationBoundService revocationBoundService = this.b;
        if (i == 1) {
            I();
            Y41 y41A = Y41.a(revocationBoundService);
            GoogleSignInAccount googleSignInAccountB = y41A.b();
            GoogleSignInOptions googleSignInOptionsC = GoogleSignInOptions.k;
            if (googleSignInAccountB != null) {
                googleSignInOptionsC = y41A.c();
            }
            N10 n10 = new N10(revocationBoundService, AbstractC1423Sa.a, (GoogleSignInOptions) Preconditions.checkNotNull(googleSignInOptionsC), new GoogleApi.Settings.Builder().setMapper(new ApiExceptionMapper()).build());
            if (googleSignInAccountB != null) {
                GoogleApiClient googleApiClientAsGoogleApiClient = n10.asGoogleApiClient();
                Context applicationContext = n10.getApplicationContext();
                boolean z = n10.a() == 3;
                AbstractC0403Ex1.a.d("Revoking access", new Object[0]);
                String strE = Y41.a(applicationContext).e("refreshToken");
                AbstractC0403Ex1.a(applicationContext);
                if (!z) {
                    pendingResultExecute = googleApiClientAsGoogleApiClient.execute(new C0247Cx1(googleApiClientAsGoogleApiClient));
                } else if (strE == null) {
                    Logger logger = RunnableC7127sx1.c;
                    pendingResultExecute = PendingResults.immediateFailedResult(new Status(4), null);
                } else {
                    RunnableC7127sx1 runnableC7127sx1 = new RunnableC7127sx1(strE);
                    new Thread(runnableC7127sx1).start();
                    pendingResultExecute = runnableC7127sx1.b;
                }
                PendingResultUtil.toVoidTask(pendingResultExecute);
            } else {
                GoogleApiClient googleApiClientAsGoogleApiClient2 = n10.asGoogleApiClient();
                Context applicationContext2 = n10.getApplicationContext();
                boolean z2 = n10.a() == 3;
                AbstractC0403Ex1.a.d("Signing out", new Object[0]);
                AbstractC0403Ex1.a(applicationContext2);
                PendingResultUtil.toVoidTask(z2 ? PendingResults.immediatePendingResult(Status.RESULT_SUCCESS, googleApiClientAsGoogleApiClient2) : googleApiClientAsGoogleApiClient2.execute(new C0169Bx1(googleApiClientAsGoogleApiClient2)));
            }
        } else {
            if (i != 2) {
                return false;
            }
            I();
            C0481Fx1.A(revocationBoundService).B();
        }
        return true;
    }

    public final void I() {
        if (!UidVerifier.isGooglePlayServicesUid(this.b, Binder.getCallingUid())) {
            throw new SecurityException(AbstractC8235ym.g(Binder.getCallingUid(), "Calling UID ", " is not Google Play services."));
        }
    }
}
