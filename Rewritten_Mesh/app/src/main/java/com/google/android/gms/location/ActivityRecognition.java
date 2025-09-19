package com.google.android.gms.location;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import p000.C11738xy1;
import p000.C8933c32;

/* loaded from: classes.dex */
public class ActivityRecognition {

    @Deprecated
    public static final Api<Api.ApiOptions.NoOptions> API = C11738xy1.f45917a;

    @Deprecated
    public static final ActivityRecognitionApi ActivityRecognitionApi = new C8933c32();

    private ActivityRecognition() {
    }

    public static ActivityRecognitionClient getClient(Activity activity) {
        return new C11738xy1(activity, C11738xy1.f45917a, Api.ApiOptions.NO_OPTIONS, GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    public static ActivityRecognitionClient getClient(Context context) {
        return new C11738xy1(context, C11738xy1.f45917a, Api.ApiOptions.NO_OPTIONS, GoogleApi.Settings.DEFAULT_SETTINGS);
    }
}
