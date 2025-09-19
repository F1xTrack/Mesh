package com.google.android.gms.common.util;

import android.app.Application;
import android.os.Build;
import android.os.Process;
import android.os.StrictMode;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import p000.C6838sg;
import p000.H12;

@KeepForSdk
/* loaded from: classes.dex */
public class ProcessUtils {
    private static String zza;
    private static int zzb;
    private static Boolean zzc;

    private ProcessUtils() {
    }

    @KeepForSdk
    public static String getMyProcessName() throws Throwable {
        BufferedReader bufferedReader;
        String str;
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads;
        if (zza == null) {
            if (Build.VERSION.SDK_INT >= 28) {
                zza = Application.getProcessName();
            } else {
                int iMyPid = zzb;
                if (iMyPid == 0) {
                    iMyPid = Process.myPid();
                    zzb = iMyPid;
                }
                String strTrim = null;
                strTrim = null;
                strTrim = null;
                BufferedReader bufferedReader2 = null;
                if (iMyPid > 0) {
                    try {
                        str = "/proc/" + iMyPid + "/cmdline";
                        threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    } catch (IOException unused) {
                        bufferedReader = null;
                    } catch (Throwable th) {
                        th = th;
                    }
                    try {
                        bufferedReader = new BufferedReader(new FileReader(str));
                        try {
                            String line = bufferedReader.readLine();
                            Preconditions.checkNotNull(line);
                            strTrim = line.trim();
                        } catch (IOException unused2) {
                        } catch (Throwable th2) {
                            th = th2;
                            bufferedReader2 = bufferedReader;
                            IOUtils.closeQuietly(bufferedReader2);
                            throw th;
                        }
                        IOUtils.closeQuietly(bufferedReader);
                    } finally {
                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                    }
                }
                zza = strTrim;
            }
        }
        return zza;
    }

    public static boolean zza() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Boolean boolValueOf = zzc;
        if (boolValueOf == null) {
            if (PlatformVersion.isAtLeastP()) {
                boolValueOf = Boolean.valueOf(Process.isIsolated());
            } else {
                try {
                    Object objInvoke = Process.class.getDeclaredMethod("isIsolated", new Class[0]).invoke(null, new Object[0]);
                    Object[] objArr = new Object[0];
                    if (objInvoke == null) {
                        throw new C6838sg(H12.m3241b("expected a non-null reference", objArr));
                    }
                    boolValueOf = (Boolean) objInvoke;
                } catch (ReflectiveOperationException unused) {
                    boolValueOf = Boolean.FALSE;
                }
            }
            zzc = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }
}
