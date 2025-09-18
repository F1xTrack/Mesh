package p000;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.LocationRequest;

/* renamed from: mz1 */
/* loaded from: classes.dex */
public final class C10334mz1 extends AbstractC9336fA1 {

    /* renamed from: a */
    public final /* synthetic */ PendingIntent f38024a;

    /* renamed from: b */
    public final /* synthetic */ LocationRequest f38025b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10334mz1(GoogleApiClient googleApiClient, LocationRequest locationRequest, PendingIntent pendingIntent) {
        super(googleApiClient);
        this.f38024a = pendingIntent;
        this.f38025b = locationRequest;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) {
        ((C11900zE1) anyClient).m26346m(this.f38024a, this.f38025b, C9976kA1.m22159a(this));
    }
}
