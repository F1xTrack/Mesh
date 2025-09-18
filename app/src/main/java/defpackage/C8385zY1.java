package defpackage;

import android.content.Context;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;

/* renamed from: zY1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8385zY1 extends GoogleApi implements O7 {
    public static final Api c = new Api("AppSet.API", new C2150aW1(), new Api.ClientKey());
    public final Context a;
    public final GoogleApiAvailabilityLight b;

    public C8385zY1(Context context, GoogleApiAvailabilityLight googleApiAvailabilityLight) {
        super(context, (Api<Api.ApiOptions.NoOptions>) c, Api.ApiOptions.NO_OPTIONS, GoogleApi.Settings.DEFAULT_SETTINGS);
        this.a = context;
        this.b = googleApiAvailabilityLight;
    }
}
