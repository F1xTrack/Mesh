package com.google.android.gms.common.internal;

import android.net.Uri;

/* loaded from: classes.dex */
public final class zzu {
    public static final /* synthetic */ int zza = 0;
    private static final Uri zzb;
    private static final Uri zzc;

    static {
        Uri uri = Uri.parse("https://plus.google.com/");
        zzb = uri;
        zzc = uri.buildUpon().appendPath("circles").appendPath("find").build();
    }
}
