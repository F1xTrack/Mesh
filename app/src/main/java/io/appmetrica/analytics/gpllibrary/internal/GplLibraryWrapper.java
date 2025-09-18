package io.appmetrica.analytics.gpllibrary.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.LocationListener;
import android.os.Looper;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationRequest;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public class GplLibraryWrapper implements IGplLibraryWrapper {
    public static final String FUSED_PROVIDER = "fused";

    /* renamed from: a */
    private final FusedLocationProviderClient f29800a;

    /* renamed from: b */
    private final LocationListener f29801b;

    /* renamed from: c */
    private final LocationCallback f29802c;

    /* renamed from: d */
    private final Looper f29803d;

    /* renamed from: e */
    private final Executor f29804e;

    /* renamed from: f */
    private final long f29805f;

    /* renamed from: io.appmetrica.analytics.gpllibrary.internal.GplLibraryWrapper$1 */
    public static /* synthetic */ class C43331 {

        /* renamed from: a */
        static final /* synthetic */ int[] f29806a;

        static {
            int[] iArr = new int[Priority.values().length];
            f29806a = iArr;
            try {
                iArr[Priority.PRIORITY_LOW_POWER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f29806a[Priority.PRIORITY_BALANCED_POWER_ACCURACY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f29806a[Priority.PRIORITY_HIGH_ACCURACY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static class ClientProvider {

        /* renamed from: a */
        private final Context f29807a;

        public ClientProvider(Context context) {
            this.f29807a = context;
        }

        /* renamed from: a */
        public final FusedLocationProviderClient m19170a() {
            return new FusedLocationProviderClient(this.f29807a);
        }
    }

    public enum Priority {
        PRIORITY_NO_POWER,
        PRIORITY_LOW_POWER,
        PRIORITY_BALANCED_POWER_ACCURACY,
        PRIORITY_HIGH_ACCURACY
    }

    public GplLibraryWrapper(Context context, LocationListener locationListener, Looper looper, Executor executor, long j) throws Throwable {
        this(new ClientProvider(context), locationListener, looper, executor, j);
    }

    @Override // io.appmetrica.analytics.gpllibrary.internal.IGplLibraryWrapper
    @SuppressLint({"MissingPermission"})
    public void startLocationUpdates(Priority priority) throws Throwable {
        FusedLocationProviderClient fusedLocationProviderClient = this.f29800a;
        LocationRequest interval = LocationRequest.create().setInterval(this.f29805f);
        int i = C43331.f29806a[priority.ordinal()];
        fusedLocationProviderClient.requestLocationUpdates(interval.setPriority(i != 1 ? i != 2 ? i != 3 ? 105 : 100 : 102 : 104), this.f29802c, this.f29803d);
    }

    @Override // io.appmetrica.analytics.gpllibrary.internal.IGplLibraryWrapper
    public void stopLocationUpdates() throws Throwable {
        this.f29800a.removeLocationUpdates(this.f29802c);
    }

    @Override // io.appmetrica.analytics.gpllibrary.internal.IGplLibraryWrapper
    @SuppressLint({"MissingPermission"})
    public void updateLastKnownLocation() throws Throwable {
        this.f29800a.getLastLocation().mo11138e(this.f29804e, new GplOnSuccessListener(this.f29801b));
    }

    public GplLibraryWrapper(ClientProvider clientProvider, LocationListener locationListener, Looper looper, Executor executor, long j) {
        this.f29800a = clientProvider.m19170a();
        this.f29801b = locationListener;
        this.f29803d = looper;
        this.f29804e = executor;
        this.f29805f = j;
        this.f29802c = new GplLocationCallback(locationListener);
    }
}
