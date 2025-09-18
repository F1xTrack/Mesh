package defpackage;

import android.R;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.SparseIntArray;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.location.LastLocationRequest;
import com.google.android.gms.tasks.Task;
import com.yandex.varioqub.config.model.ConfigValue;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class L21 implements InterfaceC4393ih1, InterfaceC3660er1, InterfaceC1651Uy, RemoteCall, InterfaceC3973gU1, InterfaceC5680lM1 {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ L21(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.InterfaceC4042gr1
    public /* bridge */ /* synthetic */ Object a() {
        return new C1878Xv1((C8077xw1) ((InterfaceC4042gr1) this.b).a());
    }

    @Override // com.google.android.gms.common.api.internal.RemoteCall
    public void accept(Object obj, Object obj2) throws RemoteException {
        switch (this.a) {
            case 7:
                Api.ClientKey clientKey = RB1.a;
                ((C8325zE1) obj).j((LastLocationRequest) this.b, (S81) obj2);
                break;
            default:
                C3555eI1 c3555eI1 = (C3555eI1) obj;
                Api api = C8083xy1.a;
                c3555eI1.getClass();
                PendingIntent pendingIntent = (PendingIntent) this.b;
                Preconditions.checkNotNull(pendingIntent);
                C2341bW1 c2341bW1 = (C2341bW1) ((InterfaceC3600eX1) c3555eI1.getService());
                Parcel parcelZza = c2341bW1.zza();
                LC1.c(parcelZza, pendingIntent);
                c2341bW1.zzc(6, parcelZza);
                ((S81) obj2).b(null);
                break;
        }
    }

    @Override // defpackage.InterfaceC3973gU1
    public void b(int i, IOException iOException, byte[] bArr) {
        OL1 ol1;
        OL1 ol12;
        C3386dP1 c3386dP1 = (C3386dP1) this.b;
        if ((i != 200 && i != 204 && i != 304) || iOException != null) {
            OL1 ol13 = c3386dP1.i;
            C3386dP1.e(ol13);
            ol13.j.b(Integer.valueOf(i), iOException, "Network Request for Deferred Deep Link failed. response, exception");
            return;
        }
        UM1 um1 = c3386dP1.h;
        C5910mZ1 c5910mZ1 = c3386dP1.l;
        C3386dP1.b(um1);
        um1.v.a(true);
        OL1 ol14 = c3386dP1.i;
        if (bArr == null || bArr.length == 0) {
            C3386dP1.e(ol14);
            ol14.n.d("Deferred Deep Link response empty.");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(new String(bArr));
            String strOptString = jSONObject.optString("deeplink", "");
            if (TextUtils.isEmpty(strOptString)) {
                C3386dP1.e(ol14);
                ol14.n.d("Deferred Deep Link is empty.");
            } else {
                String strOptString2 = jSONObject.optString("gclid", "");
                String strOptString3 = jSONObject.optString("gbraid", "");
                String strOptString4 = jSONObject.optString("gad_source", "");
                double dOptDouble = jSONObject.optDouble("timestamp", ConfigValue.DOUBLE_DEFAULT_VALUE);
                Bundle bundle = new Bundle();
                C3386dP1.b(c5910mZ1);
                C3386dP1 c3386dP12 = (C3386dP1) c5910mZ1.b;
                if (TextUtils.isEmpty(strOptString)) {
                    ol12 = ol14;
                } else {
                    try {
                        ol12 = ol14;
                    } catch (JSONException e) {
                        e = e;
                        ol12 = ol14;
                    }
                    try {
                        ol14 = null;
                        List<ResolveInfo> listQueryIntentActivities = c3386dP12.a.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(strOptString)), 0);
                        if (listQueryIntentActivities != null && !listQueryIntentActivities.isEmpty()) {
                            if (!TextUtils.isEmpty(strOptString3)) {
                                bundle.putString("gbraid", strOptString3);
                            }
                            if (!TextUtils.isEmpty(strOptString4)) {
                                bundle.putString("gad_source", strOptString4);
                            }
                            bundle.putString("gclid", strOptString2);
                            bundle.putString("_cis", "ddp");
                            c3386dP1.p.X1("auto", "_cmp", bundle);
                            if (!TextUtils.isEmpty(strOptString) && c5910mZ1.f2(strOptString, dOptDouble)) {
                                c3386dP12.a.sendBroadcast(new Intent("android.google.analytics.action.DEEPLINK_ACTION"));
                            }
                        }
                    } catch (JSONException e2) {
                        e = e2;
                        ol1 = ol12;
                        C3386dP1.e(ol1);
                        ol1.g.c(e, "Failed to parse the Deferred Deep Link response. exception");
                    }
                }
                C3386dP1.e(ol12);
                ol1 = ol12;
                try {
                    ol1.j.e("Deferred Deep Link validation failed. gclid, gbraid, deep link", strOptString2, strOptString3, strOptString);
                } catch (JSONException e3) {
                    e = e3;
                    C3386dP1.e(ol1);
                    ol1.g.c(e, "Failed to parse the Deferred Deep Link response. exception");
                }
            }
        } catch (JSONException e4) {
            e = e4;
            ol1 = ol14;
        }
    }

    @Override // defpackage.InterfaceC7602vR
    public C0468Ft0 c() {
        return (C0468Ft0) this.b;
    }

    @Override // defpackage.InterfaceC4393ih1
    public InterfaceC5361jh1 d() {
        return new C5629l51(C0873Ky0.a((C0468Ft0) this.b));
    }

    public void e() {
        View view = (View) this.b;
        if (view != null) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public void f(Exception exc) {
        R81 r81 = (R81) this.b;
        synchronized (r81.a) {
            try {
                if (r81.b) {
                    throw new IllegalStateException("Cannot set the error on a completed task.");
                }
                r81.b = true;
                r81.e = exc;
                r81.a.notifyAll();
                r81.g();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void g() {
        View viewFindViewById;
        View view = (View) this.b;
        if (view == null) {
            return;
        }
        if (view.isInEditMode() || view.onCheckIsTextEditor()) {
            view.requestFocus();
            viewFindViewById = view;
        } else {
            viewFindViewById = view.getRootView().findFocus();
        }
        if (viewFindViewById == null) {
            viewFindViewById = view.getRootView().findViewById(R.id.content);
        }
        if (viewFindViewById == null || !viewFindViewById.hasWindowFocus()) {
            return;
        }
        viewFindViewById.post(new K21(0, viewFindViewById));
    }

    public void h(int i, int i2) {
        ((WE1) this.b).o(i, (i2 >> 31) ^ (i2 + i2));
    }

    public void i(int i, long j) {
        ((WE1) this.b).q(i, (j >> 63) ^ (j + j));
    }

    public void j(int i, List list) {
        boolean z = list instanceof VH1;
        int i2 = 0;
        WE1 we1 = (WE1) this.b;
        if (!z) {
            while (i2 < list.size()) {
                we1.m(i, (String) list.get(i2));
                i2++;
            }
            return;
        }
        VH1 vh1 = (VH1) list;
        while (i2 < list.size()) {
            Object objZza = vh1.zza();
            if (objZza instanceof String) {
                we1.m(i, (String) objZza);
            } else {
                we1.f(i, (JE1) objZza);
            }
            i2++;
        }
    }

    public void k(int i, int i2) {
        ((WE1) this.b).o(i, i2);
    }

    public void l(int i, long j) {
        ((WE1) this.b).q(i, j);
    }

    public void m(int i, boolean z) {
        WE1 we1 = (WE1) this.b;
        we1.p(i << 3);
        we1.d(z ? (byte) 1 : (byte) 0);
    }

    public void n(int i, JE1 je1) {
        ((WE1) this.b).f(i, je1);
    }

    public void o(int i, List list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            ((WE1) this.b).f(i, (JE1) list.get(i2));
        }
    }

    public void p(int i, double d) {
        ((WE1) this.b).i(i, Double.doubleToRawLongBits(d));
    }

    public void q(int i, int i2) {
        ((WE1) this.b).k(i, i2);
    }

    public void r(int i, int i2) {
        ((WE1) this.b).g(i, i2);
    }

    public void s(int i, long j) {
        ((WE1) this.b).i(i, j);
    }

    public void t(float f, int i) {
        ((WE1) this.b).g(i, Float.floatToRawIntBits(f));
    }

    @Override // defpackage.InterfaceC1651Uy
    public /* bridge */ /* synthetic */ Object then(Task task) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll((List) this.b);
        return AbstractC3782fU1.e(arrayList);
    }

    public void u(int i, Object obj, InterfaceC8153yK1 interfaceC8153yK1) {
        WE1 we1 = (WE1) this.b;
        we1.n(i, 3);
        interfaceC8153yK1.h((DD1) obj, we1.a);
        we1.n(i, 4);
    }

    public void v(int i, int i2) {
        ((WE1) this.b).k(i, i2);
    }

    public void w(int i, long j) {
        ((WE1) this.b).q(i, j);
    }

    public void x(int i, Object obj, InterfaceC8153yK1 interfaceC8153yK1) {
        DD1 dd1 = (DD1) obj;
        WE1 we1 = (WE1) this.b;
        we1.p((i << 3) | 2);
        we1.p(dd1.b(interfaceC8153yK1));
        interfaceC8153yK1.h(dd1, we1.a);
    }

    public void y(int i, int i2) {
        ((WE1) this.b).g(i, i2);
    }

    public void z(int i, long j) {
        ((WE1) this.b).i(i, j);
    }

    public /* synthetic */ L21(int i, boolean z) {
        this.a = i;
    }

    public L21(List list) {
        this.a = 6;
        this.b = list;
    }

    @Override // defpackage.InterfaceC5680lM1
    public void a(String str, int i, IOException iOException, byte[] bArr, Map map) {
        ((C5716lY1) this.b).k(str, i, iOException, bArr, map);
    }

    public L21(WE1 we1) {
        this.a = 8;
        Charset charset = AbstractC7574vH1.a;
        this.b = we1;
        we1.a = this;
    }

    public L21(int i) {
        this.a = i;
        switch (i) {
            case 3:
                this.b = new SparseIntArray();
                break;
            default:
                this.b = new R81();
                break;
        }
    }

    public L21(C0468Ft0 c0468Ft0) {
        Object objW;
        this.a = 1;
        this.b = c0468Ft0;
        Object objW2 = null;
        try {
            objW = c0468Ft0.w(C81.S0);
        } catch (IllegalArgumentException unused) {
            objW = null;
        }
        Class cls = (Class) objW;
        if (cls != null && !cls.equals(C5438k51.class)) {
            throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
        }
        ((C0468Ft0) this.b).e(InterfaceC5361jh1.c1, EnumC5743lh1.e);
        C0572Hc c0572Hc = C81.S0;
        C0468Ft0 c0468Ft02 = (C0468Ft0) this.b;
        c0468Ft02.e(c0572Hc, C5438k51.class);
        try {
            objW2 = c0468Ft02.w(C81.R0);
        } catch (IllegalArgumentException unused2) {
        }
        if (objW2 == null) {
            c0468Ft02.e(C81.R0, C5438k51.class.getCanonicalName() + "-" + UUID.randomUUID());
        }
    }
}
