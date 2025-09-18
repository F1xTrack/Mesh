package p000;

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
public final class C8763ak1 implements InterfaceC8036Nx0, InterfaceC0374Fw, RemoteCall {

    /* renamed from: a */
    public final /* synthetic */ int f15665a;

    /* renamed from: b */
    public Object f15666b;

    /* renamed from: c */
    public Object f15667c;

    public /* synthetic */ C8763ak1() {
        this.f15665a = 5;
    }

    /* renamed from: c */
    private final void m9801c(Task task) {
        synchronized (((C8165Qj1) this.f15666b).f9756a) {
            C8165Qj1 c8165Qj1 = (C8165Qj1) this.f15666b;
            ArrayList arrayList = (ArrayList) c8165Qj1.f9757b;
            if (arrayList == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.MutableCollection<T>");
            }
            AbstractC10036ke1.m22226a(arrayList).remove(c8165Qj1);
        }
        O90.m5967e(task, "it");
        if (!task.mo11144k()) {
            ((InterfaceC8777ar1) this.f15667c).mo10347a(task.mo11141h());
            return;
        }
        InterfaceC8777ar1 interfaceC8777ar1 = (InterfaceC8777ar1) this.f15667c;
        Object objMo11142i = task.mo11142i();
        O90.m5967e(objMo11142i, "it.result");
        String str = ((C0952P7) objMo11142i).f8865a;
        C8165Qj1 c8165Qj12 = (C8165Qj1) this.f15666b;
        Object objMo11142i2 = task.mo11142i();
        O90.m5967e(objMo11142i2, "it.result");
        int i = ((C0952P7) objMo11142i2).f8866b;
        c8165Qj12.getClass();
        interfaceC8777ar1.mo10346a(str, i != 1 ? i != 2 ? EnumC8183Qs1.UNKNOWN : EnumC8183Qs1.DEVELOPER : EnumC8183Qs1.APP);
    }

    /* renamed from: a */
    public View m9802a(int i, int i2, int i3, int i4) {
        InterfaceC8633Zj1 interfaceC8633Zj1 = (InterfaceC8633Zj1) this.f15666b;
        int iMo2897f = interfaceC8633Zj1.mo2897f();
        int iMo2899h = interfaceC8633Zj1.mo2899h();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        while (i != i2) {
            View viewMo2905t = interfaceC8633Zj1.mo2905t(i);
            int iMo2896e = interfaceC8633Zj1.mo2896e(viewMo2905t);
            int iMo2906u = interfaceC8633Zj1.mo2906u(viewMo2905t);
            S31 s31 = (S31) this.f15667c;
            s31.f10562b = iMo2897f;
            s31.f10563c = iMo2899h;
            s31.f10564d = iMo2896e;
            s31.f10565e = iMo2906u;
            if (i3 != 0) {
                s31.f10561a = i3;
                if (s31.m7173a()) {
                    return viewMo2905t;
                }
            }
            if (i4 != 0) {
                s31.f10561a = i4;
                if (s31.m7173a()) {
                    view = viewMo2905t;
                }
            }
            i += i5;
        }
        return view;
    }

    @Override // com.google.android.gms.common.api.internal.RemoteCall
    public void accept(Object obj, Object obj2) throws RemoteException {
        switch (this.f15665a) {
            case 4:
                Api api = C11738xy1.f45917a;
                C11100sy1 c11100sy1 = new C11100sy1((S81) obj2);
                ActivityTransitionRequest activityTransitionRequest = (ActivityTransitionRequest) this.f15666b;
                Preconditions.checkNotNull(activityTransitionRequest, "activityTransitionRequest must be specified.");
                PendingIntent pendingIntent = (PendingIntent) this.f15667c;
                Preconditions.checkNotNull(pendingIntent, "PendingIntent must be specified.");
                Preconditions.checkNotNull(c11100sy1, "ResultHolder not provided.");
                StatusCallback statusCallback = new StatusCallback(c11100sy1);
                C8863bW1 c8863bW1 = (C8863bW1) ((InterfaceC9254eX1) ((C9224eI1) obj).getService());
                Parcel parcelZza = c8863bW1.zza();
                LC1.m4925c(parcelZza, activityTransitionRequest);
                LC1.m4925c(parcelZza, pendingIntent);
                LC1.m4926d(parcelZza, statusCallback);
                c8863bW1.zzc(72, parcelZza);
                break;
            case 5:
            default:
                Api api2 = C11738xy1.f45917a;
                C11100sy1 c11100sy12 = new C11100sy1((S81) obj2);
                zzb zzbVar = (zzb) this.f15666b;
                Preconditions.checkNotNull(zzbVar, "ActivityRecognitionRequest can't be null.");
                PendingIntent pendingIntent2 = (PendingIntent) this.f15667c;
                Preconditions.checkNotNull(pendingIntent2, "PendingIntent must be specified.");
                Preconditions.checkNotNull(c11100sy12, "ResultHolder not provided.");
                StatusCallback statusCallback2 = new StatusCallback(c11100sy12);
                C8863bW1 c8863bW12 = (C8863bW1) ((InterfaceC9254eX1) ((C9224eI1) obj).getService());
                Parcel parcelZza2 = c8863bW12.zza();
                LC1.m4925c(parcelZza2, zzbVar);
                LC1.m4925c(parcelZza2, pendingIntent2);
                LC1.m4926d(parcelZza2, statusCallback2);
                c8863bW12.zzc(70, parcelZza2);
                break;
            case 6:
                ((C11900zE1) obj).m26342i((GeofencingRequest) this.f15666b, (PendingIntent) this.f15667c, (S81) obj2);
                break;
        }
    }

    /* renamed from: b */
    public boolean m9803b(View view) {
        InterfaceC8633Zj1 interfaceC8633Zj1 = (InterfaceC8633Zj1) this.f15666b;
        int iMo2897f = interfaceC8633Zj1.mo2897f();
        int iMo2899h = interfaceC8633Zj1.mo2899h();
        int iMo2896e = interfaceC8633Zj1.mo2896e(view);
        int iMo2906u = interfaceC8633Zj1.mo2906u(view);
        S31 s31 = (S31) this.f15667c;
        s31.f10562b = iMo2897f;
        s31.f10563c = iMo2899h;
        s31.f10564d = iMo2896e;
        s31.f10565e = iMo2906u;
        s31.f10561a = 24579;
        return s31.m7173a();
    }

    /* renamed from: d */
    public InterfaceC7885Kz1 m9804d(C10919rY0 c10919rY0, InterfaceC7885Kz1 interfaceC7885Kz1) {
        AbstractC10983s22.m24591m(c10919rY0);
        if (!(interfaceC7885Kz1 instanceof C8819bA1)) {
            return interfaceC7885Kz1;
        }
        C8819bA1 c8819bA1 = (C8819bA1) interfaceC7885Kz1;
        ArrayList arrayList = c8819bA1.f16855b;
        HashMap map = (HashMap) this.f15666b;
        String str = c8819bA1.f16854a;
        return (map.containsKey(str) ? (C10616pA1) map.get(str) : (C10616pA1) this.f15667c).m23629a(str, c10919rY0, arrayList);
    }

    /* renamed from: e */
    public void m9805e(C10616pA1 c10616pA1) {
        Iterator it = c10616pA1.f39879a.iterator();
        while (it.hasNext()) {
            ((HashMap) this.f15666b).put(((EnumC9724iC1) it.next()).toString(), c10616pA1);
        }
    }

    @Override // p000.InterfaceC0374Fw
    public String getString(String str, String str2) {
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f15666b;
        String str3 = (String) concurrentHashMap.get(str);
        if (str3 != null) {
            return str3;
        }
        String strMo886c = ((InterfaceC7114x3) ((C10525oT0) this.f15667c).f39025a).mo886c(str);
        if (strMo886c == null) {
            return null;
        }
        concurrentHashMap.put(str, strMo886c);
        return strMo886c;
    }

    @Override // p000.InterfaceC8036Nx0
    public void onComplete(Task task) {
        switch (this.f15665a) {
            case 1:
                m9801c(task);
                return;
            default:
                C11364v12 c11364v12 = (C11364v12) this.f15666b;
                S81 s81 = (S81) this.f15667c;
                synchronized (c11364v12.f44097f) {
                    c11364v12.f44096e.remove(s81);
                }
                return;
        }
    }

    public String toString() {
        switch (this.f15665a) {
            case 3:
                return "SecurityResourcesReader{mKey=, encrypt=true}";
            default:
                return super.toString();
        }
    }

    public C8763ak1(Context context, String str) {
        String str2;
        InterfaceC8179Qq1 c8779as1;
        this.f15665a = 3;
        this.f15666b = new ConcurrentHashMap();
        C10525oT0 c10525oT0 = new C10525oT0();
        String strM1983a = E12.m1983a(context, str, "agc_plugin_", "crypto");
        if (strM1983a != null) {
            try {
                str2 = new String(AbstractC8803b30.m10418a(strM1983a), "utf-8");
            } catch (UnsupportedEncodingException | IllegalArgumentException e) {
                e.getMessage();
            }
        } else {
            str2 = null;
        }
        if (TextUtils.isEmpty(str2) || Build.VERSION.SDK_INT < 26) {
            C7397Bp1 c7397Bp1 = new C7397Bp1();
            c7397Bp1.f1052b = context;
            c7397Bp1.f1051a = str;
            c8779as1 = c7397Bp1;
        } else {
            c8779as1 = new C8779as1(context, str);
        }
        c10525oT0.f39025a = c8779as1;
        this.f15667c = c10525oT0;
    }

    public /* synthetic */ C8763ak1(Object obj, int i, Object obj2) {
        this.f15665a = i;
        this.f15666b = obj;
        this.f15667c = obj2;
    }

    public C8763ak1(Context context) {
        this.f15665a = 2;
        this.f15666b = context;
        this.f15667c = AbstractC0705LB.m4915b(new S51(7, this));
    }

    public C8763ak1(InterfaceC8633Zj1 interfaceC8633Zj1) {
        this.f15665a = 0;
        this.f15666b = interfaceC8633Zj1;
        S31 s31 = new S31();
        s31.f10561a = 0;
        this.f15667c = s31;
    }
}
