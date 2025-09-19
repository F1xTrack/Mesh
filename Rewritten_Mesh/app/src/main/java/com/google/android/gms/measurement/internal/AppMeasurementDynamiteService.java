package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.DynamiteApi;
import io.sentry.android.core.RunnableC5914w;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import p000.AO1;
import p000.AR1;
import p000.AbstractBinderC10242mF1;
import p000.BinderC8916bx0;
import p000.C0533IS;
import p000.C0701L7;
import p000.C10282mZ1;
import p000.C10362nB1;
import p000.C11268uG1;
import p000.C11412vO1;
import p000.C11894zB1;
import p000.C4049fN;
import p000.C7119x8;
import p000.C7397Bp1;
import p000.C7933Lx1;
import p000.C8143Py1;
import p000.C8739aY1;
import p000.C9092dG1;
import p000.C9108dO1;
import p000.C9110dP1;
import p000.C9870jL1;
import p000.C9888jU1;
import p000.CU1;
import p000.FR1;
import p000.GJ1;
import p000.IB1;
import p000.InterfaceC11266uF1;
import p000.InterfaceC11648xF1;
import p000.InterfaceC9197e50;
import p000.JU1;
import p000.OF1;
import p000.OL1;
import p000.OR1;
import p000.QM1;
import p000.QX1;
import p000.RO1;
import p000.RS1;
import p000.RunnableC11662xM1;
import p000.RunnableC11676xT1;
import p000.RunnableC1267U8;
import p000.RunnableC1420WZ;
import p000.RunnableC1483XZ;
import p000.RunnableC6704qp;
import p000.RunnableC9628hS1;
import p000.UF1;
import p000.ZR1;

@DynamiteApi
/* loaded from: classes.dex */
public class AppMeasurementDynamiteService extends AbstractBinderC10242mF1 {

    /* renamed from: a */
    public C9110dP1 f18050a;

    /* renamed from: b */
    public final C7119x8 f18051b;

    public static void $r8$lambda$W3cgi1t5N0SU6fYxM9Fsh5qQfPc(AppMeasurementDynamiteService appMeasurementDynamiteService, InterfaceC11648xF1 interfaceC11648xF1) {
        try {
            interfaceC11648xF1.mo3337v();
        } catch (RemoteException e) {
            OL1 ol1 = ((C9110dP1) Preconditions.checkNotNull(appMeasurementDynamiteService.f18050a)).f26039i;
            C9110dP1.m17592e(ol1);
            ol1.f8381j.m24554c(e, "Failed to call IDynamiteUploadBatchesCallback");
        }
    }

    public AppMeasurementDynamiteService() {
        super("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        this.f18050a = null;
        this.f18051b = new C7119x8();
    }

    /* renamed from: H */
    public final void m11132H() {
        if (this.f18050a == null) {
            throw new IllegalStateException("Attempting to perform action before initialize.");
        }
    }

    /* renamed from: I */
    public final void m11133I(String str, InterfaceC11266uF1 interfaceC11266uF1) {
        m11132H();
        C10282mZ1 c10282mZ1 = this.f18050a.f26042l;
        C9110dP1.m17589b(c10282mZ1);
        c10282mZ1.m22877R1(str, interfaceC11266uF1);
    }

    @Override // p000.InterfaceC8701aF1
    public void beginAdUnitExposure(String str, long j) throws RemoteException {
        m11132H();
        C7933Lx1 c7933Lx1 = this.f18050a.f26047q;
        C9110dP1.m17591d(c7933Lx1);
        c7933Lx1.m5161A1(j, str);
    }

    @Override // p000.InterfaceC8701aF1
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) throws RemoteException {
        m11132H();
        FR1 fr1 = this.f18050a.f26046p;
        C9110dP1.m17590c(fr1);
        fr1.m2639I1(str, str2, bundle);
    }

    @Override // p000.InterfaceC8701aF1
    public void clearMeasurementEnabled(long j) throws RemoteException {
        m11132H();
        FR1 fr1 = this.f18050a.f26046p;
        C9110dP1.m17590c(fr1);
        fr1.m18793A1();
        fr1.mo6071p0().m25412E1(new RO1(fr1, null, false, 5));
    }

    @Override // p000.InterfaceC8701aF1
    public void endAdUnitExposure(String str, long j) throws RemoteException {
        m11132H();
        C7933Lx1 c7933Lx1 = this.f18050a.f26047q;
        C9110dP1.m17591d(c7933Lx1);
        c7933Lx1.m5165E1(j, str);
    }

    @Override // p000.InterfaceC8701aF1
    public void generateEventId(InterfaceC11266uF1 interfaceC11266uF1) throws RemoteException {
        m11132H();
        C10282mZ1 c10282mZ1 = this.f18050a.f26042l;
        C9110dP1.m17589b(c10282mZ1);
        long jM22865F2 = c10282mZ1.m22865F2();
        m11132H();
        C10282mZ1 c10282mZ12 = this.f18050a.f26042l;
        C9110dP1.m17589b(c10282mZ12);
        c10282mZ12.m22879T1(interfaceC11266uF1, jM22865F2);
    }

    @Override // p000.InterfaceC8701aF1
    public void getAppInstanceId(InterfaceC11266uF1 interfaceC11266uF1) throws RemoteException {
        m11132H();
        C11412vO1 c11412vO1 = this.f18050a.f26040j;
        C9110dP1.m17592e(c11412vO1);
        c11412vO1.m25412E1(new RunnableC1483XZ(this, interfaceC11266uF1, false, 29));
    }

    @Override // p000.InterfaceC8701aF1
    public void getCachedAppInstanceId(InterfaceC11266uF1 interfaceC11266uF1) throws RemoteException {
        m11132H();
        FR1 fr1 = this.f18050a.f26046p;
        C9110dP1.m17590c(fr1);
        m11133I((String) fr1.f3209h.get(), interfaceC11266uF1);
    }

    @Override // p000.InterfaceC8701aF1
    public void getConditionalUserProperties(String str, String str2, InterfaceC11266uF1 interfaceC11266uF1) throws RemoteException {
        m11132H();
        C11412vO1 c11412vO1 = this.f18050a.f26040j;
        C9110dP1.m17592e(c11412vO1);
        c11412vO1.m25412E1(new RunnableC6704qp(this, interfaceC11266uF1, str, str2, 10, false));
    }

    @Override // p000.InterfaceC8701aF1
    public void getCurrentScreenClass(InterfaceC11266uF1 interfaceC11266uF1) throws RemoteException {
        m11132H();
        FR1 fr1 = this.f18050a.f26046p;
        C9110dP1.m17590c(fr1);
        JU1 ju1 = ((C9110dP1) fr1.f11615b).f26045o;
        C9110dP1.m17590c(ju1);
        CU1 cu1 = ju1.f5547d;
        m11133I(cu1 != null ? cu1.f1400b : null, interfaceC11266uF1);
    }

    @Override // p000.InterfaceC8701aF1
    public void getCurrentScreenName(InterfaceC11266uF1 interfaceC11266uF1) throws RemoteException {
        m11132H();
        FR1 fr1 = this.f18050a.f26046p;
        C9110dP1.m17590c(fr1);
        JU1 ju1 = ((C9110dP1) fr1.f11615b).f26045o;
        C9110dP1.m17590c(ju1);
        CU1 cu1 = ju1.f5547d;
        m11133I(cu1 != null ? cu1.f1399a : null, interfaceC11266uF1);
    }

    @Override // p000.InterfaceC8701aF1
    public void getGmpAppId(InterfaceC11266uF1 interfaceC11266uF1) throws Resources.NotFoundException, RemoteException {
        m11132H();
        FR1 fr1 = this.f18050a.f26046p;
        C9110dP1.m17590c(fr1);
        C9110dP1 c9110dP1 = (C9110dP1) fr1.f11615b;
        String string = c9110dP1.f26032b;
        if (string == null) {
            string = null;
            try {
                Context context = c9110dP1.f26031a;
                String strM173a = c9110dP1.f26049s;
                Preconditions.checkNotNull(context);
                Resources resources = context.getResources();
                if (TextUtils.isEmpty(strM173a)) {
                    strM173a = AO1.m173a(context);
                }
                int identifier = resources.getIdentifier("google_app_id", "string", strM173a);
                if (identifier != 0) {
                    try {
                        string = resources.getString(identifier);
                    } catch (Resources.NotFoundException unused) {
                    }
                }
            } catch (IllegalStateException e) {
                OL1 ol1 = c9110dP1.f26039i;
                C9110dP1.m17592e(ol1);
                ol1.f8378g.m24554c(e, "getGoogleAppId failed with exception");
            }
        }
        m11133I(string, interfaceC11266uF1);
    }

    @Override // p000.InterfaceC8701aF1
    public void getMaxUserProperties(String str, InterfaceC11266uF1 interfaceC11266uF1) throws RemoteException {
        m11132H();
        C9110dP1.m17590c(this.f18050a.f26046p);
        Preconditions.checkNotEmpty(str);
        m11132H();
        C10282mZ1 c10282mZ1 = this.f18050a.f26042l;
        C9110dP1.m17589b(c10282mZ1);
        c10282mZ1.m22878S1(interfaceC11266uF1, 25);
    }

    @Override // p000.InterfaceC8701aF1
    public void getSessionId(InterfaceC11266uF1 interfaceC11266uF1) throws RemoteException {
        m11132H();
        FR1 fr1 = this.f18050a.f26046p;
        C9110dP1.m17590c(fr1);
        fr1.mo6071p0().m25412E1(new RunnableC11676xT1(fr1, 0, interfaceC11266uF1));
    }

    @Override // p000.InterfaceC8701aF1
    public void getTestFlag(InterfaceC11266uF1 interfaceC11266uF1, int i) throws RemoteException {
        m11132H();
        if (i == 0) {
            C10282mZ1 c10282mZ1 = this.f18050a.f26042l;
            C9110dP1.m17589b(c10282mZ1);
            FR1 fr1 = this.f18050a.f26046p;
            C9110dP1.m17590c(fr1);
            AtomicReference atomicReference = new AtomicReference();
            c10282mZ1.m22877R1((String) fr1.mo6071p0().m25416z1(atomicReference, 15000L, "String test flag value", new RunnableC9628hS1(fr1, atomicReference, 1)), interfaceC11266uF1);
            return;
        }
        if (i == 1) {
            C10282mZ1 c10282mZ12 = this.f18050a.f26042l;
            C9110dP1.m17589b(c10282mZ12);
            FR1 fr12 = this.f18050a.f26046p;
            C9110dP1.m17590c(fr12);
            AtomicReference atomicReference2 = new AtomicReference();
            c10282mZ12.m22879T1(interfaceC11266uF1, ((Long) fr12.mo6071p0().m25416z1(atomicReference2, 15000L, "long test flag value", new OR1(fr12, atomicReference2, 2))).longValue());
            return;
        }
        if (i == 2) {
            C10282mZ1 c10282mZ13 = this.f18050a.f26042l;
            C9110dP1.m17589b(c10282mZ13);
            FR1 fr13 = this.f18050a.f26046p;
            C9110dP1.m17590c(fr13);
            AtomicReference atomicReference3 = new AtomicReference();
            double dDoubleValue = ((Double) fr13.mo6071p0().m25416z1(atomicReference3, 15000L, "double test flag value", new RunnableC9628hS1(fr13, atomicReference3, 2))).doubleValue();
            Bundle bundle = new Bundle();
            bundle.putDouble("r", dDoubleValue);
            try {
                interfaceC11266uF1.zza(bundle);
                return;
            } catch (RemoteException e) {
                OL1 ol1 = ((C9110dP1) c10282mZ13.f11615b).f26039i;
                C9110dP1.m17592e(ol1);
                ol1.f8381j.m24554c(e, "Error returning double value to wrapper");
                return;
            }
        }
        if (i == 3) {
            C10282mZ1 c10282mZ14 = this.f18050a.f26042l;
            C9110dP1.m17589b(c10282mZ14);
            FR1 fr14 = this.f18050a.f26046p;
            C9110dP1.m17590c(fr14);
            AtomicReference atomicReference4 = new AtomicReference();
            c10282mZ14.m22878S1(interfaceC11266uF1, ((Integer) fr14.mo6071p0().m25416z1(atomicReference4, 15000L, "int test flag value", new OR1(fr14, atomicReference4, 3))).intValue());
            return;
        }
        if (i != 4) {
            return;
        }
        C10282mZ1 c10282mZ15 = this.f18050a.f26042l;
        C9110dP1.m17589b(c10282mZ15);
        FR1 fr15 = this.f18050a.f26046p;
        C9110dP1.m17590c(fr15);
        AtomicReference atomicReference5 = new AtomicReference();
        c10282mZ15.m22882W1(interfaceC11266uF1, ((Boolean) fr15.mo6071p0().m25416z1(atomicReference5, 15000L, "boolean test flag value", new OR1(fr15, atomicReference5, 1))).booleanValue());
    }

    @Override // p000.InterfaceC8701aF1
    public void getUserProperties(String str, String str2, boolean z, InterfaceC11266uF1 interfaceC11266uF1) throws RemoteException {
        m11132H();
        C11412vO1 c11412vO1 = this.f18050a.f26040j;
        C9110dP1.m17592e(c11412vO1);
        c11412vO1.m25412E1(new QM1(this, interfaceC11266uF1, str, str2, z, 1));
    }

    @Override // p000.InterfaceC8701aF1
    public void initForTests(Map map) throws RemoteException {
        m11132H();
    }

    @Override // p000.InterfaceC8701aF1
    public void initialize(InterfaceC9197e50 interfaceC9197e50, C9092dG1 c9092dG1, long j) throws RemoteException {
        C9110dP1 c9110dP1 = this.f18050a;
        if (c9110dP1 == null) {
            this.f18050a = C9110dP1.m17588a((Context) Preconditions.checkNotNull((Context) BinderC8916bx0.m10547H(interfaceC9197e50)), c9092dG1, Long.valueOf(j));
            return;
        }
        OL1 ol1 = c9110dP1.f26039i;
        C9110dP1.m17592e(ol1);
        ol1.f8381j.m24555d("Attempting to initialize multiple times");
    }

    @Override // p000.InterfaceC8701aF1
    public void isDataCollectionEnabled(InterfaceC11266uF1 interfaceC11266uF1) throws RemoteException {
        m11132H();
        C11412vO1 c11412vO1 = this.f18050a.f26040j;
        C9110dP1.m17592e(c11412vO1);
        c11412vO1.m25412E1(new RunnableC11676xT1(this, 7, interfaceC11266uF1));
    }

    @Override // p000.InterfaceC8701aF1
    public void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) throws RemoteException {
        m11132H();
        FR1 fr1 = this.f18050a.f26046p;
        C9110dP1.m17590c(fr1);
        fr1.m2640J1(str, str2, bundle, z, z2, j);
    }

    @Override // p000.InterfaceC8701aF1
    public void logEventAndBundle(String str, String str2, Bundle bundle, InterfaceC11266uF1 interfaceC11266uF1, long j) throws RemoteException {
        m11132H();
        Preconditions.checkNotEmpty(str2);
        (bundle != null ? new Bundle(bundle) : new Bundle()).putString("_o", "app");
        C11894zB1 c11894zB1 = new C11894zB1(str2, new C10362nB1(bundle), "app", j);
        C11412vO1 c11412vO1 = this.f18050a.f26040j;
        C9110dP1.m17592e(c11412vO1);
        c11412vO1.m25412E1(new RunnableC6704qp(this, interfaceC11266uF1, c11894zB1, str, 9, false));
    }

    @Override // p000.InterfaceC8701aF1
    public void logHealthData(int i, String str, InterfaceC9197e50 interfaceC9197e50, InterfaceC9197e50 interfaceC9197e502, InterfaceC9197e50 interfaceC9197e503) throws RemoteException {
        m11132H();
        Object objM10547H = interfaceC9197e50 == null ? null : BinderC8916bx0.m10547H(interfaceC9197e50);
        Object objM10547H2 = interfaceC9197e502 == null ? null : BinderC8916bx0.m10547H(interfaceC9197e502);
        Object objM10547H3 = interfaceC9197e503 != null ? BinderC8916bx0.m10547H(interfaceC9197e503) : null;
        OL1 ol1 = this.f18050a.f26039i;
        C9110dP1.m17592e(ol1);
        ol1.m6028C1(i, true, false, str, objM10547H, objM10547H2, objM10547H3);
    }

    @Override // p000.InterfaceC8701aF1
    public void onActivityCreated(InterfaceC9197e50 interfaceC9197e50, Bundle bundle, long j) throws RemoteException {
        m11132H();
        onActivityCreatedByScionActivityInfo(C11268uG1.m25147i0((Activity) Preconditions.checkNotNull((Activity) BinderC8916bx0.m10547H(interfaceC9197e50))), bundle, j);
    }

    @Override // p000.InterfaceC8701aF1
    public void onActivityCreatedByScionActivityInfo(C11268uG1 c11268uG1, Bundle bundle, long j) {
        m11132H();
        FR1 fr1 = this.f18050a.f26046p;
        C9110dP1.m17590c(fr1);
        C0533IS c0533is = fr1.f3205d;
        if (c0533is != null) {
            FR1 fr12 = this.f18050a.f26046p;
            C9110dP1.m17590c(fr12);
            fr12.m2647R1();
            c0533is.m3872k(c11268uG1, bundle);
        }
    }

    @Override // p000.InterfaceC8701aF1
    public void onActivityDestroyed(InterfaceC9197e50 interfaceC9197e50, long j) throws RemoteException {
        m11132H();
        onActivityDestroyedByScionActivityInfo(C11268uG1.m25147i0((Activity) Preconditions.checkNotNull((Activity) BinderC8916bx0.m10547H(interfaceC9197e50))), j);
    }

    @Override // p000.InterfaceC8701aF1
    public void onActivityDestroyedByScionActivityInfo(C11268uG1 c11268uG1, long j) throws RemoteException {
        m11132H();
        FR1 fr1 = this.f18050a.f26046p;
        C9110dP1.m17590c(fr1);
        C0533IS c0533is = fr1.f3205d;
        if (c0533is != null) {
            FR1 fr12 = this.f18050a.f26046p;
            C9110dP1.m17590c(fr12);
            fr12.m2647R1();
            c0533is.m3871j(c11268uG1);
        }
    }

    @Override // p000.InterfaceC8701aF1
    public void onActivityPaused(InterfaceC9197e50 interfaceC9197e50, long j) throws RemoteException {
        m11132H();
        onActivityPausedByScionActivityInfo(C11268uG1.m25147i0((Activity) Preconditions.checkNotNull((Activity) BinderC8916bx0.m10547H(interfaceC9197e50))), j);
    }

    @Override // p000.InterfaceC8701aF1
    public void onActivityPausedByScionActivityInfo(C11268uG1 c11268uG1, long j) throws RemoteException {
        m11132H();
        FR1 fr1 = this.f18050a.f26046p;
        C9110dP1.m17590c(fr1);
        C0533IS c0533is = fr1.f3205d;
        if (c0533is != null) {
            FR1 fr12 = this.f18050a.f26046p;
            C9110dP1.m17590c(fr12);
            fr12.m2647R1();
            c0533is.m3873l(c11268uG1);
        }
    }

    @Override // p000.InterfaceC8701aF1
    public void onActivityResumed(InterfaceC9197e50 interfaceC9197e50, long j) throws RemoteException {
        m11132H();
        onActivityResumedByScionActivityInfo(C11268uG1.m25147i0((Activity) Preconditions.checkNotNull((Activity) BinderC8916bx0.m10547H(interfaceC9197e50))), j);
    }

    @Override // p000.InterfaceC8701aF1
    public void onActivityResumedByScionActivityInfo(C11268uG1 c11268uG1, long j) throws RemoteException {
        m11132H();
        FR1 fr1 = this.f18050a.f26046p;
        C9110dP1.m17590c(fr1);
        C0533IS c0533is = fr1.f3205d;
        if (c0533is != null) {
            FR1 fr12 = this.f18050a.f26046p;
            C9110dP1.m17590c(fr12);
            fr12.m2647R1();
            c0533is.m3875n(c11268uG1);
        }
    }

    @Override // p000.InterfaceC8701aF1
    public void onActivitySaveInstanceState(InterfaceC9197e50 interfaceC9197e50, InterfaceC11266uF1 interfaceC11266uF1, long j) throws RemoteException {
        m11132H();
        onActivitySaveInstanceStateByScionActivityInfo(C11268uG1.m25147i0((Activity) Preconditions.checkNotNull((Activity) BinderC8916bx0.m10547H(interfaceC9197e50))), interfaceC11266uF1, j);
    }

    @Override // p000.InterfaceC8701aF1
    public void onActivitySaveInstanceStateByScionActivityInfo(C11268uG1 c11268uG1, InterfaceC11266uF1 interfaceC11266uF1, long j) throws RemoteException {
        m11132H();
        FR1 fr1 = this.f18050a.f26046p;
        C9110dP1.m17590c(fr1);
        C0533IS c0533is = fr1.f3205d;
        Bundle bundle = new Bundle();
        if (c0533is != null) {
            FR1 fr12 = this.f18050a.f26046p;
            C9110dP1.m17590c(fr12);
            fr12.m2647R1();
            c0533is.m3874m(c11268uG1, bundle);
        }
        try {
            interfaceC11266uF1.zza(bundle);
        } catch (RemoteException e) {
            OL1 ol1 = this.f18050a.f26039i;
            C9110dP1.m17592e(ol1);
            ol1.f8381j.m24554c(e, "Error returning bundle value to wrapper");
        }
    }

    @Override // p000.InterfaceC8701aF1
    public void onActivityStarted(InterfaceC9197e50 interfaceC9197e50, long j) throws RemoteException {
        m11132H();
        onActivityStartedByScionActivityInfo(C11268uG1.m25147i0((Activity) Preconditions.checkNotNull((Activity) BinderC8916bx0.m10547H(interfaceC9197e50))), j);
    }

    @Override // p000.InterfaceC8701aF1
    public void onActivityStartedByScionActivityInfo(C11268uG1 c11268uG1, long j) throws RemoteException {
        m11132H();
        FR1 fr1 = this.f18050a.f26046p;
        C9110dP1.m17590c(fr1);
        if (fr1.f3205d != null) {
            FR1 fr12 = this.f18050a.f26046p;
            C9110dP1.m17590c(fr12);
            fr12.m2647R1();
        }
    }

    @Override // p000.InterfaceC8701aF1
    public void onActivityStopped(InterfaceC9197e50 interfaceC9197e50, long j) throws RemoteException {
        m11132H();
        onActivityStoppedByScionActivityInfo(C11268uG1.m25147i0((Activity) Preconditions.checkNotNull((Activity) BinderC8916bx0.m10547H(interfaceC9197e50))), j);
    }

    @Override // p000.InterfaceC8701aF1
    public void onActivityStoppedByScionActivityInfo(C11268uG1 c11268uG1, long j) throws RemoteException {
        m11132H();
        FR1 fr1 = this.f18050a.f26046p;
        C9110dP1.m17590c(fr1);
        if (fr1.f3205d != null) {
            FR1 fr12 = this.f18050a.f26046p;
            C9110dP1.m17590c(fr12);
            fr12.m2647R1();
        }
    }

    @Override // p000.InterfaceC8701aF1
    public void performAction(Bundle bundle, InterfaceC11266uF1 interfaceC11266uF1, long j) throws RemoteException {
        m11132H();
        interfaceC11266uF1.zza(null);
    }

    @Override // p000.InterfaceC8701aF1
    public void registerOnMeasurementEventListener(OF1 of1) throws RemoteException {
        Object c0701l7;
        m11132H();
        synchronized (this.f18051b) {
            try {
                c0701l7 = (AR1) this.f18051b.getOrDefault(Integer.valueOf(of1.zza()), null);
                if (c0701l7 == null) {
                    c0701l7 = new C0701L7(this, of1);
                    this.f18051b.put(Integer.valueOf(of1.zza()), c0701l7);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        FR1 fr1 = this.f18050a.f26046p;
        C9110dP1.m17590c(fr1);
        fr1.m18793A1();
        Preconditions.checkNotNull(c0701l7);
        if (fr1.f3207f.add(c0701l7)) {
            return;
        }
        fr1.mo6070n().f8381j.m24555d("OnEventListener already registered");
    }

    @Override // p000.InterfaceC8701aF1
    public void resetAnalyticsData(long j) throws RemoteException {
        m11132H();
        FR1 fr1 = this.f18050a.f26046p;
        C9110dP1.m17590c(fr1);
        fr1.m2652W1(null);
        fr1.mo6071p0().m25412E1(new RS1(fr1, j, 1));
    }

    @Override // p000.InterfaceC8701aF1
    public void retrieveAndUploadBatches(InterfaceC11648xF1 interfaceC11648xF1) throws MalformedURLException {
        AtomicReference atomicReference;
        m11132H();
        C8143Py1 c8143Py1 = this.f18050a.f26037g;
        GJ1 gj1 = IB1.f4753M0;
        if (c8143Py1.m6511E1(null, gj1)) {
            FR1 fr1 = this.f18050a.f26046p;
            C9110dP1.m17590c(fr1);
            if (((C9110dP1) fr1.f11615b).f26037g.m6511E1(null, gj1)) {
                fr1.m18793A1();
                if (fr1.mo6071p0().m25414G1()) {
                    fr1.mo6070n().f8378g.m24555d("Cannot retrieve and upload batches from analytics worker thread");
                    return;
                }
                if (Thread.currentThread() == fr1.mo6071p0().f44355e) {
                    fr1.mo6070n().f8378g.m24555d("Cannot retrieve and upload batches from analytics network thread");
                    return;
                }
                if (C4049fN.m18225p()) {
                    fr1.mo6070n().f8378g.m24555d("Cannot retrieve and upload batches from main thread");
                    return;
                }
                fr1.mo6070n().f8386o.m24555d("[sgtm] Started client-side batch upload work.");
                int i = 0;
                boolean z = false;
                int i2 = 0;
                while (!z) {
                    fr1.mo6070n().f8386o.m24555d("[sgtm] Getting upload batches from service (FE)");
                    AtomicReference atomicReference2 = new AtomicReference();
                    C11412vO1 c11412vO1Mo6071p0 = fr1.mo6071p0();
                    RunnableC9628hS1 runnableC9628hS1 = new RunnableC9628hS1();
                    runnableC9628hS1.f28425c = fr1;
                    runnableC9628hS1.f28424b = atomicReference2;
                    c11412vO1Mo6071p0.m25416z1(atomicReference2, 10000L, "[sgtm] Getting upload batches", runnableC9628hS1);
                    C8739aY1 c8739aY1 = (C8739aY1) atomicReference2.get();
                    if (c8739aY1 == null || c8739aY1.f15555a.isEmpty()) {
                        break;
                    }
                    fr1.mo6070n().f8386o.m24554c(Integer.valueOf(c8739aY1.f15555a.size()), "[sgtm] Retrieved upload batches. count");
                    int size = c8739aY1.f15555a.size() + i;
                    for (QX1 qx1 : c8739aY1.f15555a) {
                        try {
                            URL url = new URI(qx1.f9661c).toURL();
                            atomicReference = new AtomicReference();
                            C9870jL1 c9870jL1M17597j = ((C9110dP1) fr1.f11615b).m17597j();
                            c9870jL1M17597j.m18793A1();
                            Preconditions.checkNotNull(c9870jL1M17597j.f35076h);
                            String str = c9870jL1M17597j.f35076h;
                            fr1.mo6070n().f8386o.m24556e("[sgtm] Uploading data from app. row_id, url, uncompressed size", Long.valueOf(qx1.f9659a), qx1.f9661c, Integer.valueOf(qx1.f9660b.length));
                            if (!TextUtils.isEmpty(qx1.f9665g)) {
                                fr1.mo6070n().f8386o.m24553b(Long.valueOf(qx1.f9659a), qx1.f9665g, "[sgtm] Uploading data from app. row_id");
                            }
                            HashMap map = new HashMap();
                            for (String str2 : qx1.f9662d.keySet()) {
                                String string = qx1.f9662d.getString(str2);
                                if (!TextUtils.isEmpty(string)) {
                                    map.put(str2, string);
                                }
                            }
                            C9888jU1 c9888jU1 = ((C9110dP1) fr1.f11615b).f26048r;
                            C9110dP1.m17592e(c9888jU1);
                            byte[] bArr = qx1.f9660b;
                            C7397Bp1 c7397Bp1 = new C7397Bp1();
                            c7397Bp1.f1052b = fr1;
                            c7397Bp1.f1051a = atomicReference;
                            c7397Bp1.f1053c = qx1;
                            c9888jU1.m7367w1();
                            Preconditions.checkNotNull(url);
                            Preconditions.checkNotNull(bArr);
                            Preconditions.checkNotNull(c7397Bp1);
                            c9888jU1.mo6071p0().m25409B1(new RunnableC11662xM1(c9888jU1, str, url, bArr, map, c7397Bp1));
                            try {
                                C10282mZ1 c10282mZ1M7852u1 = fr1.m7852u1();
                                long jCurrentTimeMillis = ((C9110dP1) c10282mZ1M7852u1.f11615b).f26044n.currentTimeMillis() + 60000;
                                synchronized (atomicReference) {
                                    for (long jCurrentTimeMillis2 = 60000; atomicReference.get() == null && jCurrentTimeMillis2 > 0; jCurrentTimeMillis2 = jCurrentTimeMillis - ((C9110dP1) c10282mZ1M7852u1.f11615b).f26044n.currentTimeMillis()) {
                                        try {
                                            atomicReference.wait(jCurrentTimeMillis2);
                                        } catch (Throwable th) {
                                            throw th;
                                        }
                                    }
                                }
                            } catch (InterruptedException unused) {
                                fr1.mo6070n().f8381j.m24555d("[sgtm] Interrupted waiting for uploading batch");
                            }
                        } catch (MalformedURLException | URISyntaxException e) {
                            fr1.mo6070n().f8378g.m24556e("[sgtm] Bad upload url for row_id", qx1.f9661c, Long.valueOf(qx1.f9659a), e);
                        }
                        if (atomicReference.get() != Boolean.TRUE) {
                            z = true;
                            break;
                        }
                        i2++;
                    }
                    i = size;
                }
                fr1.mo6070n().f8386o.m24553b(Integer.valueOf(i), Integer.valueOf(i2), "[sgtm] Completed client-side batch upload work. total, success");
                $r8$lambda$W3cgi1t5N0SU6fYxM9Fsh5qQfPc(this, interfaceC11648xF1);
            }
        }
    }

    @Override // p000.InterfaceC8701aF1
    public void setConditionalUserProperty(Bundle bundle, long j) throws RemoteException {
        m11132H();
        if (bundle == null) {
            OL1 ol1 = this.f18050a.f26039i;
            C9110dP1.m17592e(ol1);
            ol1.f8378g.m24555d("Conditional user property must not be null");
        } else {
            FR1 fr1 = this.f18050a.f26046p;
            C9110dP1.m17590c(fr1);
            fr1.m2636F1(bundle, j);
        }
    }

    @Override // p000.InterfaceC8701aF1
    public void setConsent(Bundle bundle, long j) throws RemoteException {
        m11132H();
        FR1 fr1 = this.f18050a.f26046p;
        C9110dP1.m17590c(fr1);
        C11412vO1 c11412vO1Mo6071p0 = fr1.mo6071p0();
        RunnableC5914w runnableC5914w = new RunnableC5914w();
        runnableC5914w.f33860c = fr1;
        runnableC5914w.f33861d = bundle;
        runnableC5914w.f33859b = j;
        c11412vO1Mo6071p0.m25413F1(runnableC5914w);
    }

    @Override // p000.InterfaceC8701aF1
    public void setConsentThirdParty(Bundle bundle, long j) throws RemoteException {
        m11132H();
        FR1 fr1 = this.f18050a.f26046p;
        C9110dP1.m17590c(fr1);
        fr1.m2635E1(bundle, -20, j);
    }

    @Override // p000.InterfaceC8701aF1
    public void setCurrentScreen(InterfaceC9197e50 interfaceC9197e50, String str, String str2, long j) throws RemoteException {
        m11132H();
        setCurrentScreenByScionActivityInfo(C11268uG1.m25147i0((Activity) Preconditions.checkNotNull((Activity) BinderC8916bx0.m10547H(interfaceC9197e50))), str, str2, j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x008b, code lost:
    
        if (r0 > 500) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b6, code lost:
    
        if (r0 > 500) goto L29;
     */
    @Override // p000.InterfaceC8701aF1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setCurrentScreenByScionActivityInfo(p000.C11268uG1 r3, java.lang.String r4, java.lang.String r5, long r6) throws android.os.RemoteException {
        /*
            r2 = this;
            r2.m11132H()
            dP1 r6 = r2.f18050a
            JU1 r6 = r6.f26045o
            p000.C9110dP1.m17590c(r6)
            java.lang.Object r7 = r6.f11615b
            dP1 r7 = (p000.C9110dP1) r7
            Py1 r7 = r7.f26037g
            boolean r7 = r7.m6513G1()
            if (r7 != 0) goto L23
            OL1 r3 = r6.mo6070n()
            rx r3 = r3.f8383l
            java.lang.String r4 = "setCurrentScreen cannot be called while screen reporting is disabled."
            r3.m24555d(r4)
            goto Lfb
        L23:
            CU1 r7 = r6.f5547d
            if (r7 != 0) goto L34
            OL1 r3 = r6.mo6070n()
            rx r3 = r3.f8383l
            java.lang.String r4 = "setCurrentScreen cannot be called while no activity active"
            r3.m24555d(r4)
            goto Lfb
        L34:
            java.util.concurrent.ConcurrentHashMap r0 = r6.f5550g
            int r1 = r3.f43627a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r0 = r0.get(r1)
            if (r0 != 0) goto L4f
            OL1 r3 = r6.mo6070n()
            rx r3 = r3.f8383l
            java.lang.String r4 = "setCurrentScreen must be called with an activity in the activity lifecycle"
            r3.m24555d(r4)
            goto Lfb
        L4f:
            if (r5 != 0) goto L57
            java.lang.String r5 = r3.f43628b
            java.lang.String r5 = r6.m4334H1(r5)
        L57:
            java.lang.String r0 = r7.f1400b
            boolean r0 = java.util.Objects.equals(r0, r5)
            java.lang.String r7 = r7.f1399a
            boolean r7 = java.util.Objects.equals(r7, r4)
            if (r0 == 0) goto L74
            if (r7 == 0) goto L74
            OL1 r3 = r6.mo6070n()
            rx r3 = r3.f8383l
            java.lang.String r4 = "setCurrentScreen cannot be called with the same class and name"
            r3.m24555d(r4)
            goto Lfb
        L74:
            r7 = 500(0x1f4, float:7.0E-43)
            if (r4 == 0) goto La1
            int r0 = r4.length()
            if (r0 <= 0) goto L8d
            int r0 = r4.length()
            java.lang.Object r1 = r6.f11615b
            dP1 r1 = (p000.C9110dP1) r1
            Py1 r1 = r1.f26037g
            r1.getClass()
            if (r0 <= r7) goto La1
        L8d:
            OL1 r3 = r6.mo6070n()
            rx r3 = r3.f8383l
            int r4 = r4.length()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.String r5 = "Invalid screen name length in setCurrentScreen. Length"
            r3.m24554c(r4, r5)
            goto Lfb
        La1:
            if (r5 == 0) goto Lcc
            int r0 = r5.length()
            if (r0 <= 0) goto Lb8
            int r0 = r5.length()
            java.lang.Object r1 = r6.f11615b
            dP1 r1 = (p000.C9110dP1) r1
            Py1 r1 = r1.f26037g
            r1.getClass()
            if (r0 <= r7) goto Lcc
        Lb8:
            OL1 r3 = r6.mo6070n()
            rx r3 = r3.f8383l
            int r4 = r5.length()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.String r5 = "Invalid class name length in setCurrentScreen. Length"
            r3.m24554c(r4, r5)
            goto Lfb
        Lcc:
            OL1 r7 = r6.mo6070n()
            rx r7 = r7.f8386o
            if (r4 != 0) goto Ld7
            java.lang.String r0 = "null"
            goto Ld8
        Ld7:
            r0 = r4
        Ld8:
            java.lang.String r1 = "Setting current screen to name, class"
            r7.m24553b(r0, r5, r1)
            CU1 r7 = new CU1
            mZ1 r0 = r6.m7852u1()
            long r0 = r0.m22865F2()
            r7.<init>(r4, r5, r0)
            java.util.concurrent.ConcurrentHashMap r4 = r6.f5550g
            int r5 = r3.f43627a
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4.put(r5, r7)
            java.lang.String r3 = r3.f43628b
            r4 = 1
            r6.m4330D1(r3, r7, r4)
        Lfb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.AppMeasurementDynamiteService.setCurrentScreenByScionActivityInfo(uG1, java.lang.String, java.lang.String, long):void");
    }

    @Override // p000.InterfaceC8701aF1
    public void setDataCollectionEnabled(boolean z) throws RemoteException {
        m11132H();
        FR1 fr1 = this.f18050a.f26046p;
        C9110dP1.m17590c(fr1);
        fr1.m18793A1();
        fr1.mo6071p0().m25412E1(new RunnableC1267U8(fr1, z, 4));
    }

    @Override // p000.InterfaceC8701aF1
    public void setDefaultEventParameters(Bundle bundle) {
        m11132H();
        FR1 fr1 = this.f18050a.f26046p;
        C9110dP1.m17590c(fr1);
        Bundle bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
        C11412vO1 c11412vO1Mo6071p0 = fr1.mo6071p0();
        ZR1 zr1 = new ZR1();
        zr1.f14895c = fr1;
        zr1.f14894b = bundle2;
        c11412vO1Mo6071p0.m25412E1(zr1);
    }

    @Override // p000.InterfaceC8701aF1
    public void setEventInterceptor(OF1 of1) throws RemoteException {
        m11132H();
        C9108dO1 c9108dO1 = new C9108dO1(this, 4, of1);
        C11412vO1 c11412vO1 = this.f18050a.f26040j;
        C9110dP1.m17592e(c11412vO1);
        if (!c11412vO1.m25414G1()) {
            C11412vO1 c11412vO12 = this.f18050a.f26040j;
            C9110dP1.m17592e(c11412vO12);
            c11412vO12.m25412E1(new RO1(this, c9108dO1, false, 6));
            return;
        }
        FR1 fr1 = this.f18050a.f26046p;
        C9110dP1.m17590c(fr1);
        fr1.mo7681v1();
        fr1.m18793A1();
        C9108dO1 c9108dO12 = fr1.f3206e;
        if (c9108dO1 != c9108dO12) {
            Preconditions.checkState(c9108dO12 == null, "EventInterceptor already set.");
        }
        fr1.f3206e = c9108dO1;
    }

    @Override // p000.InterfaceC8701aF1
    public void setInstanceIdProvider(UF1 uf1) throws RemoteException {
        m11132H();
    }

    @Override // p000.InterfaceC8701aF1
    public void setMeasurementEnabled(boolean z, long j) throws RemoteException {
        m11132H();
        FR1 fr1 = this.f18050a.f26046p;
        C9110dP1.m17590c(fr1);
        Boolean boolValueOf = Boolean.valueOf(z);
        fr1.m18793A1();
        fr1.mo6071p0().m25412E1(new RO1(fr1, boolValueOf, false, 5));
    }

    @Override // p000.InterfaceC8701aF1
    public void setMinimumSessionDuration(long j) throws RemoteException {
        m11132H();
    }

    @Override // p000.InterfaceC8701aF1
    public void setSessionTimeoutDuration(long j) throws RemoteException {
        m11132H();
        FR1 fr1 = this.f18050a.f26046p;
        C9110dP1.m17590c(fr1);
        fr1.mo6071p0().m25412E1(new RS1(fr1, j, 0));
    }

    @Override // p000.InterfaceC8701aF1
    public void setSgtmDebugInfo(Intent intent) throws RemoteException {
        m11132H();
        FR1 fr1 = this.f18050a.f26046p;
        C9110dP1.m17590c(fr1);
        Uri data = intent.getData();
        if (data == null) {
            fr1.mo6070n().f8384m.m24555d("Activity intent has no data. Preview Mode was not enabled.");
            return;
        }
        String queryParameter = data.getQueryParameter("sgtm_debug_enable");
        C9110dP1 c9110dP1 = (C9110dP1) fr1.f11615b;
        if (queryParameter == null || !queryParameter.equals("1")) {
            fr1.mo6070n().f8384m.m24555d("Preview Mode was not enabled.");
            c9110dP1.f26037g.f9377d = null;
            return;
        }
        String queryParameter2 = data.getQueryParameter("sgtm_preview_key");
        if (TextUtils.isEmpty(queryParameter2)) {
            return;
        }
        fr1.mo6070n().f8384m.m24554c(queryParameter2, "Preview Mode was enabled. Using the sgtmPreviewKey: ");
        c9110dP1.f26037g.f9377d = queryParameter2;
    }

    @Override // p000.InterfaceC8701aF1
    public void setUserId(String str, long j) throws RemoteException {
        m11132H();
        FR1 fr1 = this.f18050a.f26046p;
        C9110dP1.m17590c(fr1);
        if (str != null && TextUtils.isEmpty(str)) {
            OL1 ol1 = ((C9110dP1) fr1.f11615b).f26039i;
            C9110dP1.m17592e(ol1);
            ol1.f8381j.m24555d("User ID must be non-empty or null");
        } else {
            C11412vO1 c11412vO1Mo6071p0 = fr1.mo6071p0();
            RunnableC1420WZ runnableC1420WZ = new RunnableC1420WZ();
            runnableC1420WZ.f13260b = fr1;
            runnableC1420WZ.f13261c = str;
            c11412vO1Mo6071p0.m25412E1(runnableC1420WZ);
            fr1.m2641K1(null, "_id", str, true, j);
        }
    }

    @Override // p000.InterfaceC8701aF1
    public void setUserProperty(String str, String str2, InterfaceC9197e50 interfaceC9197e50, boolean z, long j) throws SecurityException, RemoteException {
        m11132H();
        Object objM10547H = BinderC8916bx0.m10547H(interfaceC9197e50);
        FR1 fr1 = this.f18050a.f26046p;
        C9110dP1.m17590c(fr1);
        fr1.m2641K1(str, str2, objM10547H, z, j);
    }

    @Override // p000.InterfaceC8701aF1
    public void unregisterOnMeasurementEventListener(OF1 of1) throws RemoteException {
        Object c0701l7;
        m11132H();
        synchronized (this.f18051b) {
            c0701l7 = (AR1) this.f18051b.remove(Integer.valueOf(of1.zza()));
        }
        if (c0701l7 == null) {
            c0701l7 = new C0701L7(this, of1);
        }
        FR1 fr1 = this.f18050a.f26046p;
        C9110dP1.m17590c(fr1);
        fr1.m18793A1();
        Preconditions.checkNotNull(c0701l7);
        if (fr1.f3207f.remove(c0701l7)) {
            return;
        }
        fr1.mo6070n().f8381j.m24555d("OnEventListener had not been registered");
    }
}
