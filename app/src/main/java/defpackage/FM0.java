package defpackage;

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
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ FM0(zzh zzhVar, E80 e80) {
        this.a = 1;
        this.b = zzhVar;
        this.c = e80;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        EU1 eu1;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (this.a) {
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
                HashMap map = EU1.f;
                NV1.D();
                int i = KV1.a;
                NV1.D();
                if (Boolean.parseBoolean("")) {
                    HashMap map2 = EU1.f;
                    if (map2.get("detectorTaskWithResource#run") == null) {
                        map2.put("detectorTaskWithResource#run", new EU1("detectorTaskWithResource#run"));
                    }
                    eu1 = (EU1) map2.get("detectorTaskWithResource#run");
                } else {
                    eu1 = AU1.g;
                }
                eu1.m();
                try {
                    List listG = zzhVar.b.g(e80);
                    eu1.close();
                    return listG;
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
                BinderC5880mP1 binderC5880mP1 = (BinderC5880mP1) obj;
                binderC5880mP1.a.f0();
                C1656Uz1 c1656Uz1 = binderC5880mP1.a.c;
                C5716lY1.w(c1656Uz1);
                return c1656Uz1.E2((String) obj2);
            case 3:
                BinderC5880mP1 binderC5880mP12 = (BinderC5880mP1) obj;
                binderC5880mP12.a.f0();
                return new C0721Iz1(binderC5880mP12.a.b(((EY1) obj2).a));
            default:
                EY1 ey1 = (EY1) obj2;
                C5716lY1 c5716lY1 = (C5716lY1) obj;
                XQ1 xq1J = c5716lY1.J((String) Preconditions.checkNotNull(ey1.a));
                TQ1 tq1 = TQ1.ANALYTICS_STORAGE;
                if (xq1J.i(tq1) && XQ1.d(100, ey1.u).i(tq1)) {
                    return c5716lY1.i(ey1).g();
                }
                c5716lY1.n().o.d("Analytics storage consent denied. Returning null app instance id");
                return null;
        }
    }

    public /* synthetic */ FM0(Object obj, int i, Object obj2) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }
}
