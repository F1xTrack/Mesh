package com.google.android.gms.common.internal;

import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
/* loaded from: classes.dex */
public final class GmsLogger {
    private final String zza;
    private final String zzb;

    @KeepForSdk
    public GmsLogger(String str) {
        this(str, null);
    }

    private final String zza(String str) {
        String str2 = this.zzb;
        return str2 == null ? str : str2.concat(str);
    }

    private final String zzb(String str, Object... objArr) {
        String str2 = this.zzb;
        String str3 = String.format(str, objArr);
        return str2 == null ? str3 : str2.concat(str3);
    }

    @KeepForSdk
    public boolean canLog(int i) {
        return Log.isLoggable(this.zza, i);
    }

    @KeepForSdk
    public boolean canLogPii() {
        return false;
    }

    @KeepForSdk
    /* renamed from: d */
    public void m11109d(String str, String str2) {
        if (canLog(3)) {
            zza(str2);
        }
    }

    @KeepForSdk
    /* renamed from: e */
    public void m11111e(String str, String str2) {
        if (canLog(6)) {
            zza(str2);
        }
    }

    @KeepForSdk
    public void efmt(String str, String str2, Object... objArr) {
        if (canLog(6)) {
            zzb(str2, objArr);
        }
    }

    @KeepForSdk
    /* renamed from: i */
    public void m11113i(String str, String str2) {
        if (canLog(4)) {
            zza(str2);
        }
    }

    @KeepForSdk
    public void pii(String str, String str2) {
    }

    @KeepForSdk
    /* renamed from: v */
    public void m11115v(String str, String str2) {
        if (canLog(2)) {
            zza(str2);
        }
    }

    @KeepForSdk
    /* renamed from: w */
    public void m11117w(String str, String str2) {
        if (canLog(5)) {
            zza(str2);
        }
    }

    @KeepForSdk
    public void wfmt(String str, String str2, Object... objArr) {
        if (canLog(5)) {
            zzb(str2, objArr);
        }
    }

    @KeepForSdk
    public void wtf(String str, String str2, Throwable th) {
        if (canLog(7)) {
            zza(str2);
            zza(str2);
        }
    }

    @KeepForSdk
    public GmsLogger(String str, String str2) {
        Preconditions.checkNotNull(str, "log tag cannot be null");
        Preconditions.checkArgument(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
        this.zza = str;
        this.zzb = (str2 == null || str2.length() <= 0) ? null : str2;
    }

    @KeepForSdk
    public void pii(String str, String str2, Throwable th) {
    }

    @KeepForSdk
    /* renamed from: d */
    public void m11110d(String str, String str2, Throwable th) {
        if (canLog(3)) {
            zza(str2);
        }
    }

    @KeepForSdk
    /* renamed from: e */
    public void m11112e(String str, String str2, Throwable th) {
        if (canLog(6)) {
            zza(str2);
        }
    }

    @KeepForSdk
    /* renamed from: i */
    public void m11114i(String str, String str2, Throwable th) {
        if (canLog(4)) {
            zza(str2);
        }
    }

    @KeepForSdk
    /* renamed from: v */
    public void m11116v(String str, String str2, Throwable th) {
        if (canLog(2)) {
            zza(str2);
        }
    }

    @KeepForSdk
    /* renamed from: w */
    public void m11118w(String str, String str2, Throwable th) {
        if (canLog(5)) {
            zza(str2);
        }
    }
}
