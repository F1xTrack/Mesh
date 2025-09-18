package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Build;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.StatusCallback;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.location.ActivityTransitionRequest;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.zzb;
import com.google.android.gms.tasks.Task;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: ak1 */
/* loaded from: classes.dex */
public final class C2192ak1 implements InterfaceC1103Nx0, InterfaceC0476Fw, RemoteCall {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public /* synthetic */ C2192ak1() {
        this.a = 5;
    }

    private final void c(Task task) {
        synchronized (((C1296Qj1) this.b).a) {
            C1296Qj1 c1296Qj1 = (C1296Qj1) this.b;
            ArrayList arrayList = (ArrayList) c1296Qj1.b;
            if (arrayList == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.MutableCollection<T>");
            }
            AbstractC5543ke1.a(arrayList).remove(c1296Qj1);
        }
        O90.e(task, "it");
        if (!task.k()) {
            ((InterfaceC2213ar1) this.c).a(task.h());
            return;
        }
        InterfaceC2213ar1 interfaceC2213ar1 = (InterfaceC2213ar1) this.c;
        Object objI = task.i();
        O90.e(objI, "it.result");
        String str = ((P7) objI).a;
        C1296Qj1 c1296Qj12 = (C1296Qj1) this.b;
        Object objI2 = task.i();
        O90.e(objI2, "it.result");
        int i = ((P7) objI2).b;
        c1296Qj12.getClass();
        interfaceC2213ar1.a(str, i != 1 ? i != 2 ? EnumC1323Qs1.UNKNOWN : EnumC1323Qs1.DEVELOPER : EnumC1323Qs1.APP);
    }

    public View a(int i, int i2, int i3, int i4) {
        InterfaceC1998Zj1 interfaceC1998Zj1 = (InterfaceC1998Zj1) this.b;
        int iF = interfaceC1998Zj1.f();
        int iH = interfaceC1998Zj1.h();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        while (i != i2) {
            View viewT = interfaceC1998Zj1.t(i);
            int iE = interfaceC1998Zj1.e(viewT);
            int iU = interfaceC1998Zj1.u(viewT);
            S31 s31 = (S31) this.c;
            s31.b = iF;
            s31.c = iH;
            s31.d = iE;
            s31.e = iU;
            if (i3 != 0) {
                s31.a = i3;
                if (s31.a()) {
                    return viewT;
                }
            }
            if (i4 != 0) {
                s31.a = i4;
                if (s31.a()) {
                    view = viewT;
                }
            }
            i += i5;
        }
        return view;
    }

    @Override // com.google.android.gms.common.api.internal.RemoteCall
    public void accept(Object obj, Object obj2) throws RemoteException {
        switch (this.a) {
            case 4:
                Api api = C8083xy1.a;
                C7130sy1 c7130sy1 = new C7130sy1((S81) obj2);
                ActivityTransitionRequest activityTransitionRequest = (ActivityTransitionRequest) this.b;
                Preconditions.checkNotNull(activityTransitionRequest, "activityTransitionRequest must be specified.");
                PendingIntent pendingIntent = (PendingIntent) this.c;
                Preconditions.checkNotNull(pendingIntent, "PendingIntent must be specified.");
                Preconditions.checkNotNull(c7130sy1, "ResultHolder not provided.");
                StatusCallback statusCallback = new StatusCallback(c7130sy1);
                C2341bW1 c2341bW1 = (C2341bW1) ((InterfaceC3600eX1) ((C3555eI1) obj).getService());
                Parcel parcelZza = c2341bW1.zza();
                LC1.c(parcelZza, activityTransitionRequest);
                LC1.c(parcelZza, pendingIntent);
                LC1.d(parcelZza, statusCallback);
                c2341bW1.zzc(72, parcelZza);
                break;
            case 5:
            default:
                Api api2 = C8083xy1.a;
                C7130sy1 c7130sy12 = new C7130sy1((S81) obj2);
                zzb zzbVar = (zzb) this.b;
                Preconditions.checkNotNull(zzbVar, "ActivityRecognitionRequest can't be null.");
                PendingIntent pendingIntent2 = (PendingIntent) this.c;
                Preconditions.checkNotNull(pendingIntent2, "PendingIntent must be specified.");
                Preconditions.checkNotNull(c7130sy12, "ResultHolder not provided.");
                StatusCallback statusCallback2 = new StatusCallback(c7130sy12);
                C2341bW1 c2341bW12 = (C2341bW1) ((InterfaceC3600eX1) ((C3555eI1) obj).getService());
                Parcel parcelZza2 = c2341bW12.zza();
                LC1.c(parcelZza2, zzbVar);
                LC1.c(parcelZza2, pendingIntent2);
                LC1.d(parcelZza2, statusCallback2);
                c2341bW12.zzc(70, parcelZza2);
                break;
            case 6:
                ((C8325zE1) obj).i((GeofencingRequest) this.b, (PendingIntent) this.c, (S81) obj2);
                break;
        }
    }

    public boolean b(View view) {
        InterfaceC1998Zj1 interfaceC1998Zj1 = (InterfaceC1998Zj1) this.b;
        int iF = interfaceC1998Zj1.f();
        int iH = interfaceC1998Zj1.h();
        int iE = interfaceC1998Zj1.e(view);
        int iU = interfaceC1998Zj1.u(view);
        S31 s31 = (S31) this.c;
        s31.b = iF;
        s31.c = iH;
        s31.d = iE;
        s31.e = iU;
        s31.a = 24579;
        return s31.a();
    }

    public InterfaceC0877Kz1 d(C6860rY0 c6860rY0, InterfaceC0877Kz1 interfaceC0877Kz1) {
        AbstractC6955s22.m(c6860rY0);
        if (!(interfaceC0877Kz1 instanceof C2275bA1)) {
            return interfaceC0877Kz1;
        }
        C2275bA1 c2275bA1 = (C2275bA1) interfaceC0877Kz1;
        ArrayList arrayList = c2275bA1.b;
        HashMap map = (HashMap) this.b;
        String str = c2275bA1.a;
        return (map.containsKey(str) ? (C6408pA1) map.get(str) : (C6408pA1) this.c).a(str, c6860rY0, arrayList);
    }

    public void e(C6408pA1 c6408pA1) {
        Iterator it = c6408pA1.a.iterator();
        while (it.hasNext()) {
            ((HashMap) this.b).put(((EnumC4301iC1) it.next()).toString(), c6408pA1);
        }
    }

    @Override // defpackage.InterfaceC0476Fw
    public String getString(String str, String str2) {
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.b;
        String str3 = (String) concurrentHashMap.get(str);
        if (str3 != null) {
            return str3;
        }
        String strC = ((InterfaceC7910x3) ((C6273oT0) this.c).a).c(str);
        if (strC == null) {
            return null;
        }
        concurrentHashMap.put(str, strC);
        return strC;
    }

    @Override // defpackage.InterfaceC1103Nx0
    public void onComplete(Task task) {
        switch (this.a) {
            case 1:
                c(task);
                return;
            default:
                C7524v12 c7524v12 = (C7524v12) this.b;
                S81 s81 = (S81) this.c;
                synchronized (c7524v12.f) {
                    c7524v12.e.remove(s81);
                }
                return;
        }
    }

    public String toString() {
        switch (this.a) {
            case 3:
                return "SecurityResourcesReader{mKey=, encrypt=true}";
            default:
                return super.toString();
        }
    }

    public C2192ak1(Context context, String str) {
        String str2;
        InterfaceC1317Qq1 c2216as1;
        this.a = 3;
        this.b = new ConcurrentHashMap();
        C6273oT0 c6273oT0 = new C6273oT0();
        String strA = E12.a(context, str, "agc_plugin_", "crypto");
        if (strA != null) {
            try {
                str2 = new String(AbstractC2252b30.a(strA), "utf-8");
            } catch (UnsupportedEncodingException | IllegalArgumentException e) {
                e.getMessage();
            }
        } else {
            str2 = null;
        }
        if (TextUtils.isEmpty(str2) || Build.VERSION.SDK_INT < 26) {
            C0145Bp1 c0145Bp1 = new C0145Bp1();
            c0145Bp1.b = context;
            c0145Bp1.a = str;
            c2216as1 = c0145Bp1;
        } else {
            c2216as1 = new C2216as1(context, str);
        }
        c6273oT0.a = c2216as1;
        this.c = c6273oT0;
    }

    public /* synthetic */ C2192ak1(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public C2192ak1(Context context) {
        this.a = 2;
        this.b = context;
        this.c = LB.b(new S51(7, this));
    }

    public C2192ak1(InterfaceC1998Zj1 interfaceC1998Zj1) {
        this.a = 0;
        this.b = interfaceC1998Zj1;
        S31 s31 = new S31();
        s31.a = 0;
        this.c = s31;
    }
}
