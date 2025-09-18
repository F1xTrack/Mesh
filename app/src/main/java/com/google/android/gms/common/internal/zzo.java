package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.net.Uri;

/* loaded from: classes.dex */
public final class zzo {
    private static final Uri zza = new Uri.Builder().scheme(RemoteMessageConst.Notification.CONTENT).authority("com.google.android.gms.chimera").build();
    private final String zzb;
    private final String zzc;
    private final ComponentName zzd;
    private final int zze;
    private final boolean zzf;

    public zzo(ComponentName componentName, int i) {
        this.zzb = null;
        this.zzc = null;
        Preconditions.checkNotNull(componentName);
        this.zzd = componentName;
        this.zze = 4225;
        this.zzf = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzo)) {
            return false;
        }
        zzo zzoVar = (zzo) obj;
        return Objects.equal(this.zzb, zzoVar.zzb) && Objects.equal(this.zzc, zzoVar.zzc) && Objects.equal(this.zzd, zzoVar.zzd) && this.zzf == zzoVar.zzf;
    }

    public final int hashCode() {
        return Objects.hashCode(this.zzb, this.zzc, this.zzd, 4225, Boolean.valueOf(this.zzf));
    }

    public final String toString() {
        String str = this.zzb;
        if (str != null) {
            return str;
        }
        Preconditions.checkNotNull(this.zzd);
        return this.zzd.flattenToString();
    }

    public final ComponentName zza() {
        return this.zzd;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.content.Intent zzb(android.content.Context r5) throws com.google.android.gms.common.internal.zzaj, android.os.RemoteException {
        /*
            r4 = this;
            java.lang.String r0 = r4.zzb
            if (r0 == 0) goto L8c
            boolean r0 = r4.zzf
            r1 = 0
            if (r0 == 0) goto L7c
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r2 = r4.zzb
            java.lang.String r3 = "serviceActionBundleKey"
            r0.putString(r3, r2)
            android.content.ContentResolver r5 = r5.getContentResolver()     // Catch: java.lang.IllegalArgumentException -> L34 android.os.RemoteException -> L36
            android.net.Uri r2 = com.google.android.gms.common.internal.zzo.zza     // Catch: java.lang.IllegalArgumentException -> L34 android.os.RemoteException -> L36
            android.content.ContentProviderClient r5 = r5.acquireUnstableContentProviderClient(r2)     // Catch: java.lang.IllegalArgumentException -> L34 android.os.RemoteException -> L36
            if (r5 == 0) goto L38
            java.lang.String r2 = "serviceIntentCall"
            android.os.Bundle r0 = r5.call(r2, r1, r0)     // Catch: java.lang.Throwable -> L2f
            r5.release()     // Catch: java.lang.IllegalArgumentException -> L2b android.os.RemoteException -> L2d
            goto L4a
        L2b:
            r5 = move-exception
            goto L41
        L2d:
            r5 = move-exception
            goto L41
        L2f:
            r0 = move-exception
            r5.release()     // Catch: java.lang.IllegalArgumentException -> L34 android.os.RemoteException -> L36
            throw r0     // Catch: java.lang.IllegalArgumentException -> L34 android.os.RemoteException -> L36
        L34:
            r5 = move-exception
            goto L40
        L36:
            r5 = move-exception
            goto L40
        L38:
            android.os.RemoteException r5 = new android.os.RemoteException     // Catch: java.lang.IllegalArgumentException -> L34 android.os.RemoteException -> L36
            java.lang.String r0 = "Failed to acquire ContentProviderClient"
            r5.<init>(r0)     // Catch: java.lang.IllegalArgumentException -> L34 android.os.RemoteException -> L36
            throw r5     // Catch: java.lang.IllegalArgumentException -> L34 android.os.RemoteException -> L36
        L40:
            r0 = r1
        L41:
            java.lang.String r2 = "Dynamic intent resolution failed: "
            java.lang.String r5 = r5.toString()
            r2.concat(r5)
        L4a:
            if (r0 == 0) goto L6f
            java.lang.String r5 = "serviceResponseIntentKey"
            android.os.Parcelable r5 = r0.getParcelable(r5)
            r1 = r5
            android.content.Intent r1 = (android.content.Intent) r1
            if (r1 != 0) goto L6f
            java.lang.String r5 = "serviceMissingResolutionIntentKey"
            android.os.Parcelable r5 = r0.getParcelable(r5)
            android.app.PendingIntent r5 = (android.app.PendingIntent) r5
            if (r5 != 0) goto L62
            goto L6f
        L62:
            com.google.android.gms.common.internal.zzaj r0 = new com.google.android.gms.common.internal.zzaj
            com.google.android.gms.common.ConnectionResult r1 = new com.google.android.gms.common.ConnectionResult
            r2 = 25
            r1.<init>(r2, r5)
            r0.<init>(r1)
            throw r0
        L6f:
            if (r1 != 0) goto L7c
            java.lang.String r5 = r4.zzb
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r0 = "Dynamic lookup for intent failed for action: "
            r0.concat(r5)
        L7c:
            if (r1 != 0) goto L97
            java.lang.String r5 = r4.zzb
            android.content.Intent r0 = new android.content.Intent
            r0.<init>(r5)
            java.lang.String r5 = r4.zzc
            android.content.Intent r5 = r0.setPackage(r5)
            return r5
        L8c:
            android.content.Intent r5 = new android.content.Intent
            r5.<init>()
            android.content.ComponentName r0 = r4.zzd
            android.content.Intent r1 = r5.setComponent(r0)
        L97:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.zzo.zzb(android.content.Context):android.content.Intent");
    }

    public final String zzc() {
        return this.zzc;
    }

    public zzo(String str, int i, boolean z) {
        this(str, "com.google.android.gms", 4225, false);
    }

    public zzo(String str, String str2, int i, boolean z) {
        Preconditions.checkNotEmpty(str);
        this.zzb = str;
        Preconditions.checkNotEmpty(str2);
        this.zzc = str2;
        this.zzd = null;
        this.zze = 4225;
        this.zzf = z;
    }
}
