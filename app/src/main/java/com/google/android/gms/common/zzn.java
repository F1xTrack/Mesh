package com.google.android.gms.common;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.StrictMode;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.zzaf;
import com.google.android.gms.common.internal.zzag;
import com.google.android.gms.common.util.AndroidUtilsLight;
import com.google.android.gms.common.util.Hex;
import java.security.MessageDigest;
import java.util.concurrent.Callable;
import p000.BinderC8916bx0;
import p000.C0590JM;
import p000.C0778MM;

/* loaded from: classes.dex */
final class zzn {
    private static volatile zzag zze;
    private static Context zzg;
    static final zzl zza = new zzf(zzj.zze("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bsù/\u008eQí"));
    static final zzl zzb = new zzg(zzj.zze("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad×árÊkì"));
    static final zzl zzc = new zzh(zzj.zze("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0"));
    static final zzl zzd = new zzi(zzj.zze("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0"));
    private static final Object zzf = new Object();

    public static zzw zza(String str, zzj zzjVar, boolean z, boolean z2) {
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return zzh(str, zzjVar, z, z2);
        } finally {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        }
    }

    public static zzw zzb(String str, boolean z, boolean z2, boolean z3) {
        return zzi(str, z, false, false, true);
    }

    public static zzw zzc(String str, boolean z, boolean z2, boolean z3) {
        return zzi(str, z, false, false, false);
    }

    public static /* synthetic */ String zzd(boolean z, String str, zzj zzjVar) throws Exception {
        String str2 = (z || !zzh(str, zzjVar, true, false).zza) ? "not allowed" : "debug cert rejected";
        MessageDigest messageDigestZza = AndroidUtilsLight.zza("SHA-256");
        Preconditions.checkNotNull(messageDigestZza);
        return str2 + ": pkg=" + str + ", sha256=" + Hex.bytesToStringLowercase(messageDigestZza.digest(zzjVar.zzf())) + ", atk=" + z + ", ver=12451000.false";
    }

    public static synchronized void zze(Context context) {
        if (zzg == null) {
            if (context != null) {
                zzg = context.getApplicationContext();
            }
        }
    }

    public static boolean zzf() {
        boolean zZzg;
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            zzj();
            zZzg = zze.zzg();
        } catch (C0590JM | RemoteException unused) {
            zZzg = false;
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            throw th;
        }
        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        return zZzg;
    }

    public static boolean zzg() {
        boolean zZzi;
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            zzj();
            zZzi = zze.zzi();
        } catch (C0590JM | RemoteException unused) {
            zZzi = false;
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            throw th;
        }
        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        return zZzi;
    }

    private static zzw zzh(final String str, final zzj zzjVar, final boolean z, boolean z2) {
        try {
            zzj();
            Preconditions.checkNotNull(zzg);
            try {
                return zze.zzh(new zzs(str, zzjVar, z, z2), new BinderC8916bx0(zzg.getPackageManager())) ? zzw.zzb() : new zzu(new Callable() { // from class: com.google.android.gms.common.zze
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return zzn.zzd(z, str, zzjVar);
                    }
                }, null);
            } catch (RemoteException e) {
                return zzw.zzd("module call", e);
            }
        } catch (C0590JM e2) {
            return zzw.zzd("module init: ".concat(String.valueOf(e2.getMessage())), e2);
        }
    }

    private static zzw zzi(String str, boolean z, boolean z2, boolean z3, boolean z4) {
        zzw zzwVarZzd;
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            Preconditions.checkNotNull(zzg);
            try {
                zzj();
                zzo zzoVar = new zzo(str, z, false, new BinderC8916bx0(zzg), false, true);
                try {
                    zzq zzqVarZze = z4 ? zze.zze(zzoVar) : zze.zzf(zzoVar);
                    if (zzqVarZze.zzb()) {
                        zzwVarZzd = zzw.zzf(zzqVarZze.zzc());
                    } else {
                        String strZza = zzqVarZze.zza();
                        PackageManager.NameNotFoundException nameNotFoundException = zzqVarZze.zzd() == 4 ? new PackageManager.NameNotFoundException() : null;
                        if (strZza == null) {
                            strZza = "error checking package certificate";
                        }
                        zzwVarZzd = zzw.zzg(zzqVarZze.zzc(), zzqVarZze.zzd(), strZza, nameNotFoundException);
                    }
                } catch (RemoteException e) {
                    zzwVarZzd = zzw.zzd("module call", e);
                }
            } catch (C0590JM e2) {
                zzwVarZzd = zzw.zzd("module init: ".concat(String.valueOf(e2.getMessage())), e2);
            }
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            return zzwVarZzd;
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            throw th;
        }
    }

    private static void zzj() throws C0590JM {
        if (zze != null) {
            return;
        }
        Preconditions.checkNotNull(zzg);
        synchronized (zzf) {
            try {
                if (zze == null) {
                    zze = zzaf.zzb(C0778MM.m5342c(zzg, C0778MM.f7103e, "com.google.android.gms.googlecertificates").m5348b("com.google.android.gms.common.GoogleCertificatesImpl"));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
