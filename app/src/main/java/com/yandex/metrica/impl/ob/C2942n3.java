package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.os.Handler;
import com.yandex.metrica.AppMetricaDeviceIDListener;
import com.yandex.metrica.DeferredDeeplinkListener;
import com.yandex.metrica.DeferredDeeplinkParametersListener;
import com.yandex.metrica.IIdentifierCallback;
import com.yandex.metrica.YandexMetricaConfig;
import java.util.Collections;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.n3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2942n3 implements InterfaceC2691d1 {
    private static final EnumMap<IIdentifierCallback.Reason, AppMetricaDeviceIDListener.Reason> n;
    private final Context a;
    private final F9 b;
    private final Ii c;
    private final Dg d;
    private final U3 e;
    private final C2891l2 f;
    private final C2941n2 g;
    private final C3113u0 h;
    private final C2626ab i;
    private final C j;
    private final I2 k;
    private volatile C3089t1 l;
    private IIdentifierCallback m;

    /* renamed from: com.yandex.metrica.impl.ob.n3$a */
    public class a implements IIdentifierCallback {
        final /* synthetic */ AppMetricaDeviceIDListener a;

        public a(AppMetricaDeviceIDListener appMetricaDeviceIDListener) {
            this.a = appMetricaDeviceIDListener;
        }

        @Override // com.yandex.metrica.IIdentifierCallback
        public void onReceive(Map<String, String> map) {
            C2942n3.a(C2942n3.this, (IIdentifierCallback) null);
            this.a.onLoaded(map.get("appmetrica_device_id_hash"));
        }

        @Override // com.yandex.metrica.IIdentifierCallback
        public void onRequestError(IIdentifierCallback.Reason reason) {
            C2942n3.a(C2942n3.this, (IIdentifierCallback) null);
            this.a.onError((AppMetricaDeviceIDListener.Reason) C2942n3.n.get(reason));
        }
    }

    static {
        EnumMap<IIdentifierCallback.Reason, AppMetricaDeviceIDListener.Reason> enumMap = new EnumMap<>(IIdentifierCallback.Reason.class);
        n = enumMap;
        enumMap.put((EnumMap<IIdentifierCallback.Reason, AppMetricaDeviceIDListener.Reason>) IIdentifierCallback.Reason.UNKNOWN, (IIdentifierCallback.Reason) AppMetricaDeviceIDListener.Reason.UNKNOWN);
        enumMap.put((EnumMap<IIdentifierCallback.Reason, AppMetricaDeviceIDListener.Reason>) IIdentifierCallback.Reason.INVALID_RESPONSE, (IIdentifierCallback.Reason) AppMetricaDeviceIDListener.Reason.INVALID_RESPONSE);
        enumMap.put((EnumMap<IIdentifierCallback.Reason, AppMetricaDeviceIDListener.Reason>) IIdentifierCallback.Reason.NETWORK, (IIdentifierCallback.Reason) AppMetricaDeviceIDListener.Reason.NETWORK);
    }

    public C2942n3(Context context, InterfaceC2666c1 interfaceC2666c1) {
        this(context.getApplicationContext(), interfaceC2666c1, new F9(Qa.a(context.getApplicationContext()).c()));
    }

    public static /* synthetic */ IIdentifierCallback a(C2942n3 c2942n3, IIdentifierCallback iIdentifierCallback) {
        c2942n3.m = null;
        return null;
    }

    @Override // com.yandex.metrica.impl.ob.Y0
    public X0 b() {
        return this.f;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2691d1
    public void c(com.yandex.metrica.u uVar) {
        this.f.c(uVar);
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2691d1
    public C3089t1 d() {
        return this.l;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC3169w1
    public void setStatisticsSending(boolean z) {
        this.l.b().setStatisticsSending(z);
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC3169w1
    public void setUserProfileID(String str) {
        this.l.b().setUserProfileID(str);
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2691d1
    public void a(YandexMetricaConfig yandexMetricaConfig, com.yandex.metrica.y yVar) {
        this.i.a(this.a, this.c).a(yandexMetricaConfig, this.c.c());
        Im imB = AbstractC3265zm.b(yVar.apiKey);
        C3215xm c3215xmA = AbstractC3265zm.a(yVar.apiKey);
        this.h.getClass();
        if (this.l != null) {
            if (imB.c()) {
                imB.c("Appmetrica already has been activated!");
                return;
            }
            return;
        }
        this.d.a();
        this.c.a(imB);
        this.c.a(yVar.b);
        this.c.a(yVar.a);
        this.c.a((String) null);
        if (U2.a((Object) null)) {
            this.c.b("api");
        }
        this.e.b(yVar);
        this.g.a(yVar.locationTracking, yVar.statisticsSending, (Boolean) null);
        C3064s1 c3064s1A = this.f.a(yVar, false, this.b);
        this.l = new C3089t1(c3064s1A, new C3038r0(c3064s1A));
        this.j.a(this.l.a());
        this.k.a(c3064s1A);
        this.c.g();
        U2.a(yVar.apiKey);
        if (Boolean.TRUE.equals(yVar.logs)) {
            imB.e();
            c3215xmA.e();
            Im.g().e();
            C3215xm.g().e();
            return;
        }
        imB.d();
        c3215xmA.d();
        Im.g().d();
        C3215xm.g().d();
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC3169w1
    public void b(boolean z) {
        this.l.b().b(z);
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2691d1
    public String c() {
        return this.c.b();
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC3169w1
    public void c(String str, String str2) {
        this.l.b().c(str, str2);
    }

    private C2942n3(Context context, InterfaceC2666c1 interfaceC2666c1, F9 f9) {
        this(context, interfaceC2666c1, f9, new X(context), new C2967o3(), Y.g(), new C2626ab());
    }

    public C2942n3(Context context, InterfaceC2666c1 interfaceC2666c1, F9 f9, X x, C2967o3 c2967o3, Y y, C2626ab c2626ab) {
        this.a = context;
        this.b = f9;
        Handler handlerC = interfaceC2666c1.c();
        U3 u3A = c2967o3.a(context, c2967o3.a(handlerC, this));
        this.e = u3A;
        C3113u0 c3113u0F = y.f();
        this.h = c3113u0F;
        C2941n2 c2941n2A = c2967o3.a(u3A, context, interfaceC2666c1.b());
        this.g = c2941n2A;
        c3113u0F.a(c2941n2A);
        x.a(context);
        Ii iiA = c2967o3.a(context, c2941n2A, f9, handlerC);
        this.c = iiA;
        this.j = interfaceC2666c1.a();
        this.i = c2626ab;
        c2941n2A.a(iiA);
        this.d = c2967o3.a(c2941n2A, f9, handlerC);
        this.f = c2967o3.a(context, u3A, c2941n2A, handlerC, iiA);
        this.k = y.k();
    }

    @Override // com.yandex.metrica.impl.ob.ResultReceiverC2939n0.a
    public void a(int i, Bundle bundle) {
        this.c.a(bundle, (InterfaceC3236yi) null);
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2691d1
    public void a(DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
        this.d.a(deferredDeeplinkParametersListener);
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2691d1
    public void a(DeferredDeeplinkListener deferredDeeplinkListener) {
        this.d.a(deferredDeeplinkListener);
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2691d1
    public void a(AppMetricaDeviceIDListener appMetricaDeviceIDListener) {
        a aVar = new a(appMetricaDeviceIDListener);
        this.m = aVar;
        this.c.a(aVar, Collections.singletonList("appmetrica_device_id_hash"), this.e.a());
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2691d1
    public W0 a(com.yandex.metrica.u uVar) {
        return this.f.b(uVar);
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2691d1
    public String a() {
        return this.c.e();
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2691d1
    public void a(IIdentifierCallback iIdentifierCallback, List<String> list) {
        this.c.a(iIdentifierCallback, list, this.e.a());
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC3169w1
    public void a(Location location) {
        this.l.b().a(location);
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC3169w1
    public void a(boolean z) {
        this.l.b().a(z);
    }
}
