package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import com.google.android.gms.location.FusedLocationProviderClient;

/* loaded from: classes.dex */
public final class S11 implements D10 {
    public final Context a;

    public /* synthetic */ S11(Context context) {
        this.a = context;
    }

    public FusedLocationProviderClient a() {
        return new FusedLocationProviderClient(this.a);
    }

    @Override // defpackage.D10
    public Object get() {
        return (ConnectivityManager) this.a.getSystemService("connectivity");
    }
}
