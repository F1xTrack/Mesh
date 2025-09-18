package com.google.android.gms.ads.identifier;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import com.google.android.gms.common.BlockingServiceConnection;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.annotation.KeepForSdkWithMembers;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.VisibleForTesting;
import com.yandex.varioqub.config.model.ConfigValue;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import p000.AbstractBinderC9732iG1;
import p000.C11008sE1;
import p000.IC1;
import p000.InterfaceC9096dI1;

@KeepForSdk
/* loaded from: classes.dex */
public class AdvertisingIdClient {
    BlockingServiceConnection zza;
    InterfaceC9096dI1 zzb;
    boolean zzc;
    final Object zzd;
    zzb zze;
    final long zzf;
    private final Context zzg;

    @KeepForSdkWithMembers
    public static final class Info {
        private final String zza;
        private final boolean zzb;

        @Deprecated
        public Info(String str, boolean z) {
            this.zza = str;
            this.zzb = z;
        }

        public String getId() {
            return this.zza;
        }

        public boolean isLimitAdTrackingEnabled() {
            return this.zzb;
        }

        public String toString() {
            String str = this.zza;
            boolean z = this.zzb;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 7);
            sb.append("{");
            sb.append(str);
            sb.append("}");
            sb.append(z);
            return sb.toString();
        }
    }

    @KeepForSdk
    public AdvertisingIdClient(Context context) {
        this(context, 30000L, false, false);
    }

    @KeepForSdk
    public static Info getAdvertisingIdInfo(Context context) throws GooglePlayServicesRepairableException, IllegalStateException, GooglePlayServicesNotAvailableException, IOException {
        AdvertisingIdClient advertisingIdClient = new AdvertisingIdClient(context, -1L, true, false);
        try {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            advertisingIdClient.zzb(false);
            Info infoZzd = advertisingIdClient.zzd(-1);
            advertisingIdClient.zzc(infoZzd, true, 0.0f, SystemClock.elapsedRealtime() - jElapsedRealtime, "", null);
            return infoZzd;
        } finally {
        }
    }

    @KeepForSdk
    public static boolean getIsAdIdFakeForDebugLogging(Context context) throws GooglePlayServicesRepairableException, GooglePlayServicesNotAvailableException, IOException {
        boolean z;
        AdvertisingIdClient advertisingIdClient = new AdvertisingIdClient(context, -1L, false, false);
        try {
            advertisingIdClient.zzb(false);
            Preconditions.checkNotMainThread("Calling this from your main thread can lead to deadlock");
            synchronized (advertisingIdClient) {
                try {
                    if (!advertisingIdClient.zzc) {
                        synchronized (advertisingIdClient.zzd) {
                            zzb zzbVar = advertisingIdClient.zze;
                            if (zzbVar == null || !zzbVar.zzb) {
                                throw new IOException("AdvertisingIdClient is not connected.");
                            }
                        }
                        try {
                            advertisingIdClient.zzb(false);
                            if (!advertisingIdClient.zzc) {
                                throw new IOException("AdvertisingIdClient cannot reconnect.");
                            }
                        } catch (Exception e) {
                            throw new IOException("AdvertisingIdClient cannot reconnect.", e);
                        }
                    }
                    Preconditions.checkNotNull(advertisingIdClient.zza);
                    Preconditions.checkNotNull(advertisingIdClient.zzb);
                    try {
                        C11008sE1 c11008sE1 = (C11008sE1) advertisingIdClient.zzb;
                        c11008sE1.getClass();
                        Parcel parcelObtain = Parcel.obtain();
                        parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                        Parcel parcelM24683G = c11008sE1.m24683G(6, parcelObtain);
                        int i = IC1.f4841a;
                        z = parcelM24683G.readInt() != 0;
                        parcelM24683G.recycle();
                    } catch (RemoteException unused) {
                        throw new IOException("Remote exception");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            advertisingIdClient.zze();
            return z;
        } finally {
            advertisingIdClient.zza();
        }
    }

    @ShowFirstParty
    @KeepForSdk
    public static void setShouldSkipGmsCoreVersionCheck(boolean z) {
    }

    private final Info zzd(int i) throws IOException {
        Info info;
        Preconditions.checkNotMainThread("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (!this.zzc) {
                    synchronized (this.zzd) {
                        zzb zzbVar = this.zze;
                        if (zzbVar == null || !zzbVar.zzb) {
                            throw new IOException("AdvertisingIdClient is not connected.");
                        }
                    }
                    try {
                        zzb(false);
                        if (!this.zzc) {
                            throw new IOException("AdvertisingIdClient cannot reconnect.");
                        }
                    } catch (Exception e) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.", e);
                    }
                }
                Preconditions.checkNotNull(this.zza);
                Preconditions.checkNotNull(this.zzb);
                try {
                    C11008sE1 c11008sE1 = (C11008sE1) this.zzb;
                    c11008sE1.getClass();
                    Parcel parcelObtain = Parcel.obtain();
                    parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    Parcel parcelM24683G = c11008sE1.m24683G(1, parcelObtain);
                    String string = parcelM24683G.readString();
                    parcelM24683G.recycle();
                    C11008sE1 c11008sE12 = (C11008sE1) this.zzb;
                    c11008sE12.getClass();
                    Parcel parcelObtain2 = Parcel.obtain();
                    parcelObtain2.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    int i2 = IC1.f4841a;
                    parcelObtain2.writeInt(1);
                    Parcel parcelM24683G2 = c11008sE12.m24683G(2, parcelObtain2);
                    boolean z = parcelM24683G2.readInt() != 0;
                    parcelM24683G2.recycle();
                    info = new Info(string, z);
                } catch (RemoteException unused) {
                    throw new IOException("Remote exception");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        zze();
        return info;
    }

    private final void zze() {
        synchronized (this.zzd) {
            zzb zzbVar = this.zze;
            if (zzbVar != null) {
                zzbVar.zza.countDown();
                try {
                    this.zze.join();
                } catch (InterruptedException unused) {
                }
            }
            long j = this.zzf;
            if (j > 0) {
                this.zze = new zzb(this, j);
            }
        }
    }

    public final void finalize() throws Throwable {
        zza();
        super.finalize();
    }

    @KeepForSdk
    public Info getInfo() throws IOException {
        return zzd(-1);
    }

    @KeepForSdk
    public void start() throws GooglePlayServicesRepairableException, IllegalStateException, GooglePlayServicesNotAvailableException, IOException {
        zzb(true);
    }

    public final void zza() {
        Preconditions.checkNotMainThread("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.zzg == null || this.zza == null) {
                    return;
                }
                try {
                    if (this.zzc) {
                        ConnectionTracker.getInstance().unbindService(this.zzg, this.zza);
                    }
                } catch (Throwable unused) {
                }
                this.zzc = false;
                this.zzb = null;
                this.zza = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @VisibleForTesting
    public final void zzb(boolean z) throws GooglePlayServicesRepairableException, IllegalStateException, GooglePlayServicesNotAvailableException, IOException {
        InterfaceC9096dI1 c11008sE1;
        Preconditions.checkNotMainThread("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.zzc) {
                    zza();
                }
                Context context = this.zzg;
                try {
                    context.getPackageManager().getPackageInfo("com.android.vending", 0);
                    int iIsGooglePlayServicesAvailable = GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(context, 12451000);
                    if (iIsGooglePlayServicesAvailable != 0 && iIsGooglePlayServicesAvailable != 2) {
                        throw new IOException("Google Play services not available");
                    }
                    BlockingServiceConnection blockingServiceConnection = new BlockingServiceConnection();
                    Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                    intent.setPackage("com.google.android.gms");
                    try {
                        if (!ConnectionTracker.getInstance().bindService(context, intent, blockingServiceConnection, 1)) {
                            throw new IOException("Connection failure");
                        }
                        this.zza = blockingServiceConnection;
                        try {
                            IBinder serviceWithTimeout = blockingServiceConnection.getServiceWithTimeout(10000L, TimeUnit.MILLISECONDS);
                            int i = AbstractBinderC9732iG1.f29014a;
                            if (serviceWithTimeout == null) {
                                c11008sE1 = null;
                            } else {
                                IInterface iInterfaceQueryLocalInterface = serviceWithTimeout.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                                c11008sE1 = iInterfaceQueryLocalInterface instanceof InterfaceC9096dI1 ? (InterfaceC9096dI1) iInterfaceQueryLocalInterface : new C11008sE1(serviceWithTimeout);
                            }
                            this.zzb = c11008sE1;
                            this.zzc = true;
                            if (z) {
                                zze();
                            }
                        } catch (InterruptedException unused) {
                            throw new IOException("Interrupted exception");
                        } catch (Throwable th) {
                            throw new IOException(th);
                        }
                    } finally {
                        IOException iOException = new IOException(th);
                    }
                } catch (PackageManager.NameNotFoundException unused2) {
                    throw new GooglePlayServicesNotAvailableException(9);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @VisibleForTesting
    public final boolean zzc(Info info, boolean z, float f, long j, String str, Throwable th) {
        if (Math.random() > ConfigValue.DOUBLE_DEFAULT_VALUE) {
            return false;
        }
        HashMap map = new HashMap();
        map.put("app_context", "1");
        if (info != null) {
            map.put(CommonUrlParts.LIMIT_AD_TRACKING, true != info.isLimitAdTrackingEnabled() ? "0" : "1");
            String id = info.getId();
            if (id != null) {
                map.put("ad_id_size", Integer.toString(id.length()));
            }
        }
        if (th != null) {
            map.put("error", th.getClass().getName());
        }
        map.put("tag", "AdvertisingIdClient");
        map.put("time_spent", Long.toString(j));
        new zza(this, map).start();
        return true;
    }

    @VisibleForTesting
    public AdvertisingIdClient(Context context, long j, boolean z, boolean z2) {
        Context applicationContext;
        this.zzd = new Object();
        Preconditions.checkNotNull(context);
        if (z && (applicationContext = context.getApplicationContext()) != null) {
            context = applicationContext;
        }
        this.zzg = context;
        this.zzc = false;
        this.zzf = j;
    }
}
