package com.google.android.gms.location;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import p000.C10236mC1;
import p000.C11896zC1;
import p000.C9214eD1;
import p000.C9976kA1;
import p000.RB1;
import p000.YC1;

/* loaded from: classes.dex */
public class LocationServices {

    @Deprecated
    public static final Api<Api.ApiOptions.NoOptions> API = RB1.f10060b;

    @Deprecated
    public static final FusedLocationProviderApi FusedLocationApi = new C9976kA1();

    @Deprecated
    public static final GeofencingApi GeofencingApi = new C10236mC1();

    @Deprecated
    public static final SettingsApi SettingsApi = new YC1();

    private LocationServices() {
    }

    public static FusedLocationProviderClient getFusedLocationProviderClient(Activity activity) {
        return new RB1(activity, RB1.f10060b, Api.ApiOptions.NO_OPTIONS, GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    public static GeofencingClient getGeofencingClient(Activity activity) {
        return new C11896zC1(activity, RB1.f10060b, Api.ApiOptions.NO_OPTIONS, GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    public static SettingsClient getSettingsClient(Activity activity) {
        return new C9214eD1(activity, RB1.f10060b, Api.ApiOptions.NO_OPTIONS, GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    public static FusedLocationProviderClient getFusedLocationProviderClient(Context context) {
        return new RB1(context, RB1.f10060b, Api.ApiOptions.NO_OPTIONS, GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    public static GeofencingClient getGeofencingClient(Context context) {
        return new C11896zC1(context, RB1.f10060b, Api.ApiOptions.NO_OPTIONS, GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    public static SettingsClient getSettingsClient(Context context) {
        return new C9214eD1(context, RB1.f10060b, Api.ApiOptions.NO_OPTIONS, GoogleApi.Settings.DEFAULT_SETTINGS);
    }
}
