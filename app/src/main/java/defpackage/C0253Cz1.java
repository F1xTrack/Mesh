package defpackage;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;

/* renamed from: Cz1 */
/* loaded from: classes.dex */
public final class C0253Cz1 extends AbstractC3722fA1 {
    public final /* synthetic */ PendingIntent a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0253Cz1(GoogleApiClient googleApiClient, PendingIntent pendingIntent) {
        super(googleApiClient);
        this.a = pendingIntent;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) {
        ((C8325zE1) anyClient).f(this.a, C5453kA1.a(this));
    }
}
