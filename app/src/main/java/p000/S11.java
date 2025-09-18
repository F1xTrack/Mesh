package p000;

import android.content.Context;
import android.net.ConnectivityManager;
import com.google.android.gms.location.FusedLocationProviderClient;

/* loaded from: classes.dex */
public final class S11 implements D10 {

    /* renamed from: a */
    public final Context f10537a;

    /* renamed from: a */
    public FusedLocationProviderClient m7148a() {
        return new FusedLocationProviderClient(this.f10537a);
    }

    @Override // p000.D10
    public Object get() {
        return (ConnectivityManager) this.f10537a.getSystemService("connectivity");
    }
}
