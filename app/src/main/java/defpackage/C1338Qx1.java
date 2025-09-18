package defpackage;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.ConnectionCallbacks;
import com.google.android.gms.common.api.internal.OnConnectionFailedListener;
import com.google.android.gms.common.internal.ClientSettings;

/* renamed from: Qx1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1338Qx1 extends Api.AbstractClientBuilder {
    @Override // com.google.android.gms.common.api.Api.AbstractClientBuilder
    public final /* synthetic */ Api.Client buildClient(Context context, Looper looper, ClientSettings clientSettings, Object obj, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
        if (obj == null) {
            return new C3725fB1(context, looper, clientSettings, connectionCallbacks, onConnectionFailedListener);
        }
        throw new ClassCastException();
    }
}
