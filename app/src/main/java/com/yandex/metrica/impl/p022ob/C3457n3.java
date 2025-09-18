package com.yandex.metrica.impl.p022ob;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.os.Handler;
import com.yandex.metrica.AppMetricaDeviceIDListener;
import com.yandex.metrica.C3802u;
import com.yandex.metrica.C3806y;
import com.yandex.metrica.DeferredDeeplinkListener;
import com.yandex.metrica.DeferredDeeplinkParametersListener;
import com.yandex.metrica.IIdentifierCallback;
import com.yandex.metrica.YandexMetricaConfig;
import java.util.Collections;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.n3 */
/* loaded from: classes2.dex */
public class C3457n3 implements InterfaceC3195d1 {

    /* renamed from: n */
    private static final EnumMap<IIdentifierCallback.Reason, AppMetricaDeviceIDListener.Reason> f24291n;

    /* renamed from: a */
    private final Context f24292a;

    /* renamed from: b */
    private final C2601F9 f24293b;

    /* renamed from: c */
    private final C2685Ii f24294c;

    /* renamed from: d */
    private final C2558Dg f24295d;

    /* renamed from: e */
    private final C2969U3 f24296e;

    /* renamed from: f */
    private final C3404l2 f24297f;

    /* renamed from: g */
    private final C3456n2 f24298g;

    /* renamed from: h */
    private final C3636u0 f24299h;

    /* renamed from: i */
    private final C3127ab f24300i;

    /* renamed from: j */
    private final C2516C f24301j;

    /* renamed from: k */
    private final C2669I2 f24302k;

    /* renamed from: l */
    private volatile C3611t1 f24303l;

    /* renamed from: m */
    private IIdentifierCallback f24304m;

    /* renamed from: com.yandex.metrica.impl.ob.n3$a */
    public class a implements IIdentifierCallback {

        /* renamed from: a */
        final /* synthetic */ AppMetricaDeviceIDListener f24305a;

        public a(AppMetricaDeviceIDListener appMetricaDeviceIDListener) {
            this.f24305a = appMetricaDeviceIDListener;
        }

        @Override // com.yandex.metrica.IIdentifierCallback
        public void onReceive(Map<String, String> map) {
            C3457n3.m16475a(C3457n3.this, (IIdentifierCallback) null);
            this.f24305a.onLoaded(map.get("appmetrica_device_id_hash"));
        }

        @Override // com.yandex.metrica.IIdentifierCallback
        public void onRequestError(IIdentifierCallback.Reason reason) {
            C3457n3.m16475a(C3457n3.this, (IIdentifierCallback) null);
            this.f24305a.onError((AppMetricaDeviceIDListener.Reason) C3457n3.f24291n.get(reason));
        }
    }

    static {
        EnumMap<IIdentifierCallback.Reason, AppMetricaDeviceIDListener.Reason> enumMap = new EnumMap<>(IIdentifierCallback.Reason.class);
        f24291n = enumMap;
        enumMap.put((EnumMap<IIdentifierCallback.Reason, AppMetricaDeviceIDListener.Reason>) IIdentifierCallback.Reason.UNKNOWN, (IIdentifierCallback.Reason) AppMetricaDeviceIDListener.Reason.UNKNOWN);
        enumMap.put((EnumMap<IIdentifierCallback.Reason, AppMetricaDeviceIDListener.Reason>) IIdentifierCallback.Reason.INVALID_RESPONSE, (IIdentifierCallback.Reason) AppMetricaDeviceIDListener.Reason.INVALID_RESPONSE);
        enumMap.put((EnumMap<IIdentifierCallback.Reason, AppMetricaDeviceIDListener.Reason>) IIdentifierCallback.Reason.NETWORK, (IIdentifierCallback.Reason) AppMetricaDeviceIDListener.Reason.NETWORK);
    }

    public C3457n3(Context context, InterfaceC3169c1 interfaceC3169c1) {
        this(context.getApplicationContext(), interfaceC3169c1, new C2601F9(C2877Qa.m14815a(context.getApplicationContext()).m14827c()));
    }

    /* renamed from: a */
    public static /* synthetic */ IIdentifierCallback m16475a(C3457n3 c3457n3, IIdentifierCallback iIdentifierCallback) {
        c3457n3.f24304m = null;
        return null;
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3066Y0
    /* renamed from: b */
    public InterfaceC3041X0 mo14670b() {
        return this.f24297f;
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3195d1
    /* renamed from: c */
    public void mo14799c(C3802u c3802u) {
        this.f24297f.m16347c(c3802u);
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3195d1
    /* renamed from: d */
    public C3611t1 mo14800d() {
        return this.f24303l;
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3689w1
    public void setStatisticsSending(boolean z) {
        this.f24303l.m16807b().setStatisticsSending(z);
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3689w1
    public void setUserProfileID(String str) {
        this.f24303l.m16807b().setUserProfileID(str);
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3195d1
    /* renamed from: a */
    public void mo14797a(YandexMetricaConfig yandexMetricaConfig, C3806y c3806y) {
        this.f24300i.m15605a(this.f24292a, this.f24294c).m15538a(yandexMetricaConfig, this.f24294c.m14362c());
        C2689Im c2689ImM17346b = AbstractC3788zm.m17346b(c3806y.apiKey);
        C3736xm c3736xmM17345a = AbstractC3788zm.m17345a(c3806y.apiKey);
        this.f24299h.getClass();
        if (this.f24303l != null) {
            if (c2689ImM17346b.m17370c()) {
                c2689ImM17346b.m17368c("Appmetrica already has been activated!");
                return;
            }
            return;
        }
        this.f24295d.m13999a();
        this.f24294c.m14355a(c2689ImM17346b);
        this.f24294c.m14358a(c3806y.f25542b);
        this.f24294c.m14359a(c3806y.f25541a);
        this.f24294c.m14357a((String) null);
        if (C2968U2.m15244a((Object) null)) {
            this.f24294c.m14361b("api");
        }
        this.f24296e.m15259b(c3806y);
        this.f24298g.m16455a(c3806y.locationTracking, c3806y.statisticsSending, (Boolean) null);
        C3585s1 c3585s1M16346a = this.f24297f.m16346a(c3806y, false, this.f24293b);
        this.f24303l = new C3611t1(c3585s1M16346a, new C3558r0(c3585s1M16346a));
        this.f24301j.m13944a(this.f24303l.m16806a());
        this.f24302k.m14279a(c3585s1M16346a);
        this.f24294c.m14365g();
        C2968U2.m15231a(c3806y.apiKey);
        if (Boolean.TRUE.equals(c3806y.logs)) {
            c2689ImM17346b.m17372e();
            c3736xmM17345a.m17372e();
            C2689Im.m14369g().m17372e();
            C3736xm.m17196g().m17372e();
            return;
        }
        c2689ImM17346b.m17371d();
        c3736xmM17345a.m17371d();
        C2689Im.m14369g().m17371d();
        C3736xm.m17196g().m17371d();
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3689w1
    /* renamed from: b */
    public void mo14493b(boolean z) {
        this.f24303l.m16807b().mo14493b(z);
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3195d1
    /* renamed from: c */
    public String mo14798c() {
        return this.f24294c.m14360b();
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3689w1
    /* renamed from: c */
    public void mo14385c(String str, String str2) {
        this.f24303l.m16807b().mo14385c(str, str2);
    }

    private C3457n3(Context context, InterfaceC3169c1 interfaceC3169c1, C2601F9 c2601f9) {
        this(context, interfaceC3169c1, c2601f9, new C3040X(context), new C3483o3(), C3065Y.m15442g(), new C3127ab());
    }

    public C3457n3(Context context, InterfaceC3169c1 interfaceC3169c1, C2601F9 c2601f9, C3040X c3040x, C3483o3 c3483o3, C3065Y c3065y, C3127ab c3127ab) {
        this.f24292a = context;
        this.f24293b = c2601f9;
        Handler handlerMo14723c = interfaceC3169c1.mo14723c();
        C2969U3 c2969u3M16527a = c3483o3.m16527a(context, c3483o3.m16529a(handlerMo14723c, this));
        this.f24296e = c2969u3M16527a;
        C3636u0 c3636u0M15448f = c3065y.m15448f();
        this.f24299h = c3636u0M15448f;
        C3456n2 c3456n2M16530a = c3483o3.m16530a(c2969u3M16527a, context, interfaceC3169c1.mo14722b());
        this.f24298g = c3456n2M16530a;
        c3636u0M15448f.m16887a(c3456n2M16530a);
        c3040x.m14807a(context);
        C2685Ii c2685IiM16526a = c3483o3.m16526a(context, c3456n2M16530a, c2601f9, handlerMo14723c);
        this.f24294c = c2685IiM16526a;
        this.f24301j = interfaceC3169c1.mo14719a();
        this.f24300i = c3127ab;
        c3456n2M16530a.m16449a(c2685IiM16526a);
        this.f24295d = c3483o3.m16525a(c3456n2M16530a, c2601f9, handlerMo14723c);
        this.f24297f = c3483o3.m16528a(context, c2969u3M16527a, c3456n2M16530a, handlerMo14723c, c2685IiM16526a);
        this.f24302k = c3065y.m15452k();
    }

    @Override // com.yandex.metrica.impl.p022ob.ResultReceiverC3454n0.a
    /* renamed from: a */
    public void mo14366a(int i, Bundle bundle) {
        this.f24294c.m14353a(bundle, (InterfaceC3758yi) null);
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3195d1
    /* renamed from: a */
    public void mo14795a(DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
        this.f24295d.m14001a(deferredDeeplinkParametersListener);
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3195d1
    /* renamed from: a */
    public void mo14794a(DeferredDeeplinkListener deferredDeeplinkListener) {
        this.f24295d.m14000a(deferredDeeplinkListener);
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3195d1
    /* renamed from: a */
    public void mo14793a(AppMetricaDeviceIDListener appMetricaDeviceIDListener) {
        a aVar = new a(appMetricaDeviceIDListener);
        this.f24304m = aVar;
        this.f24294c.m14354a(aVar, Collections.singletonList("appmetrica_device_id_hash"), this.f24296e.m15254a());
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3195d1
    /* renamed from: a */
    public InterfaceC3016W0 mo14791a(C3802u c3802u) {
        return this.f24297f.mo14669b(c3802u);
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3195d1
    /* renamed from: a */
    public String mo14792a() {
        return this.f24294c.m14364e();
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3195d1
    /* renamed from: a */
    public void mo14796a(IIdentifierCallback iIdentifierCallback, List<String> list) {
        this.f24294c.m14354a(iIdentifierCallback, list, this.f24296e.m15254a());
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3689w1
    /* renamed from: a */
    public void mo14483a(Location location) {
        this.f24303l.m16807b().mo14483a(location);
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3689w1
    /* renamed from: a */
    public void mo14490a(boolean z) {
        this.f24303l.m16807b().mo14490a(z);
    }
}
