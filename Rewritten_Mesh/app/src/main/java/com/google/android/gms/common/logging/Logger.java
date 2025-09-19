package com.google.android.gms.common.logging;

import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.GmsLogger;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Locale;

@KeepForSdk
/* loaded from: classes.dex */
public class Logger {
    private final String zza;
    private final String zzb;
    private final GmsLogger zzc;
    private final int zzd;

    @KeepForSdk
    public Logger(String str, String... strArr) {
        String string;
        if (strArr.length == 0) {
            string = "";
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append('[');
            for (String str2 : strArr) {
                if (sb.length() > 1) {
                    sb.append(StringUtils.COMMA);
                }
                sb.append(str2);
            }
            sb.append("] ");
            string = sb.toString();
        }
        this.zzb = string;
        this.zza = str;
        this.zzc = new GmsLogger(str);
        int i = 2;
        while (i <= 7 && !Log.isLoggable(this.zza, i)) {
            i++;
        }
        this.zzd = i;
    }

    @KeepForSdk
    /* renamed from: d */
    public void m11123d(String str, Object... objArr) {
        if (isLoggable(3)) {
            format(str, objArr);
        }
    }

    @KeepForSdk
    /* renamed from: e */
    public void m11124e(String str, Throwable th, Object... objArr) {
        format(str, objArr);
    }

    @KeepForSdk
    public String format(String str, Object... objArr) {
        if (objArr != null && objArr.length > 0) {
            str = String.format(Locale.US, str, objArr);
        }
        return this.zzb.concat(str);
    }

    @KeepForSdk
    public String getTag() {
        return this.zza;
    }

    @KeepForSdk
    /* renamed from: i */
    public void m11126i(String str, Object... objArr) {
        format(str, objArr);
    }

    @KeepForSdk
    public boolean isLoggable(int i) {
        return this.zzd <= i;
    }

    @KeepForSdk
    /* renamed from: v */
    public void m11127v(String str, Throwable th, Object... objArr) {
        if (isLoggable(2)) {
            format(str, objArr);
        }
    }

    @KeepForSdk
    /* renamed from: w */
    public void m11129w(String str, Object... objArr) {
        format(str, objArr);
    }

    @KeepForSdk
    public void wtf(Throwable th) {
    }

    @KeepForSdk
    /* renamed from: e */
    public void m11125e(String str, Object... objArr) {
        format(str, objArr);
    }

    @KeepForSdk
    public void wtf(String str, Throwable th, Object... objArr) {
        format(str, objArr);
    }

    @KeepForSdk
    /* renamed from: v */
    public void m11128v(String str, Object... objArr) {
        if (isLoggable(2)) {
            format(str, objArr);
        }
    }
}
