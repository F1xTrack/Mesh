package p000;

import android.content.Context;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;

/* renamed from: zY1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11940zY1 extends GoogleApi implements InterfaceC0889O7 {

    /* renamed from: c */
    public static final Api f46870c = new Api("AppSet.API", new C8735aW1(), new Api.ClientKey());

    /* renamed from: a */
    public final Context f46871a;

    /* renamed from: b */
    public final GoogleApiAvailabilityLight f46872b;

    public C11940zY1(Context context, GoogleApiAvailabilityLight googleApiAvailabilityLight) {
        super(context, (Api<Api.ApiOptions.NoOptions>) f46870c, Api.ApiOptions.NO_OPTIONS, GoogleApi.Settings.DEFAULT_SETTINGS);
        this.f46871a = context;
        this.f46872b = googleApiAvailabilityLight;
    }
}
