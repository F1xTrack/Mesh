package p000;

import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.google.mlkit.vision.barcode.internal.zzh;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class FM0 implements Callable {

    /* renamed from: a */
    public final /* synthetic */ int f3171a;

    /* renamed from: b */
    public final /* synthetic */ Object f3172b;

    /* renamed from: c */
    public final /* synthetic */ Object f3173c;

    public /* synthetic */ FM0(zzh zzhVar, E80 e80) {
        this.f3171a = 1;
        this.f3172b = zzhVar;
        this.f3173c = e80;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        EU1 eu1;
        Object obj = this.f3173c;
        Object obj2 = this.f3172b;
        switch (this.f3171a) {
            case 0:
                String str = (String) obj2;
                try {
                    GM0 gm0 = (GM0) obj;
                    return new BitmapDrawable(gm0.getResources(), (str.startsWith("http://") || str.startsWith("https://") || str.startsWith("file://") || str.startsWith("asset://") || str.startsWith("data:")) ? BitmapFactory.decodeStream(FirebasePerfUrlConnection.openStream(new URL(str))) : BitmapFactory.decodeResource(gm0.getResources(), gm0.getResources().getIdentifier(str, "drawable", gm0.getContext().getPackageName())));
                } catch (Exception e) {
                    e.printStackTrace();
                    return null;
                }
            case 1:
                E80 e80 = (E80) obj;
                zzh zzhVar = (zzh) obj2;
                HashMap map = EU1.f2721f;
                NV1.m5729D();
                int i = KV1.f6133a;
                NV1.m5729D();
                if (Boolean.parseBoolean("")) {
                    HashMap map2 = EU1.f2721f;
                    if (map2.get("detectorTaskWithResource#run") == null) {
                        map2.put("detectorTaskWithResource#run", new EU1("detectorTaskWithResource#run"));
                    }
                    eu1 = (EU1) map2.get("detectorTaskWithResource#run");
                } else {
                    eu1 = AU1.f210g;
                }
                eu1.mo195m();
                try {
                    List listM23800g = zzhVar.f18534b.m23800g(e80);
                    eu1.close();
                    return listM23800g;
                } catch (Throwable th) {
                    try {
                        eu1.close();
                    } catch (Throwable th2) {
                        try {
                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                        } catch (Exception unused) {
                        }
                    }
                    throw th;
                }
            case 2:
                BinderC10262mP1 binderC10262mP1 = (BinderC10262mP1) obj;
                binderC10262mP1.f37671a.m22486f0();
                C8405Uz1 c8405Uz1 = binderC10262mP1.f37671a.f37125c;
                C10152lY1.m22451w(c8405Uz1);
                return c8405Uz1.m8217E2((String) obj2);
            case 3:
                BinderC10262mP1 binderC10262mP12 = (BinderC10262mP1) obj;
                binderC10262mP12.f37671a.m22486f0();
                return new C7781Iz1(binderC10262mP12.f37671a.m22479b(((EY1) obj2).f2754a));
            default:
                EY1 ey1 = (EY1) obj2;
                C10152lY1 c10152lY1 = (C10152lY1) obj;
                XQ1 xq1M22461J = c10152lY1.m22461J((String) Preconditions.checkNotNull(ey1.f2754a));
                TQ1 tq1 = TQ1.ANALYTICS_STORAGE;
                if (xq1M22461J.m9048i(tq1) && XQ1.m9043d(100, ey1.f2774u).m9048i(tq1)) {
                    return c10152lY1.m22491i(ey1).m6335g();
                }
                c10152lY1.mo6070n().f8386o.m24555d("Analytics storage consent denied. Returning null app instance id");
                return null;
        }
    }

    public /* synthetic */ FM0(Object obj, int i, Object obj2) {
        this.f3171a = i;
        this.f3173c = obj;
        this.f3172b = obj2;
    }
}
