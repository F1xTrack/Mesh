package p000;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;

/* renamed from: Cz1 */
/* loaded from: classes.dex */
public final class C7469Cz1 extends AbstractC9336fA1 {

    /* renamed from: a */
    public final /* synthetic */ PendingIntent f1790a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7469Cz1(GoogleApiClient googleApiClient, PendingIntent pendingIntent) {
        super(googleApiClient);
        this.f1790a = pendingIntent;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) {
        ((C11900zE1) anyClient).m26339f(this.f1790a, C9976kA1.m22159a(this));
    }
}
