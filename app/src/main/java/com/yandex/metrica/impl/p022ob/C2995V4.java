package com.yandex.metrica.impl.p022ob;

import android.net.Uri;
import android.text.TextUtils;
import com.yandex.metrica.impl.p022ob.AbstractC2942T1;
import com.yandex.metrica.impl.p022ob.C3020W4;
import com.yandex.metrica.impl.p022ob.C3662v0;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.io.UnsupportedEncodingException;

/* renamed from: com.yandex.metrica.impl.ob.V4 */
/* loaded from: classes2.dex */
public class C2995V4 extends AbstractC3042X1<C3445mh, C3662v0.a> {

    /* renamed from: o */
    private final InterfaceC3070Y4 f22508o;

    /* renamed from: p */
    private final C3376k0 f22509p;

    /* renamed from: q */
    private final C3095Z4 f22510q;

    /* renamed from: r */
    private final C3020W4.b f22511r;

    /* renamed from: s */
    private final InterfaceC2839Om f22512s;

    /* renamed from: t */
    private C3684vm f22513t;

    /* renamed from: u */
    private final String f22514u;

    /* renamed from: v */
    private final C2675I8 f22515v;

    /* renamed from: w */
    private C3045X4 f22516w;

    public C2995V4(InterfaceC3070Y4 interfaceC3070Y4, C3376k0 c3376k0, C3095Z4 c3095z4, C2675I8 c2675i8) {
        this(interfaceC3070Y4, c3376k0, c3095z4, c2675i8, new C3020W4.b(), new C2814Nm(), new C3684vm(), new C3445mh(), new C3610t0());
    }

    @Override // com.yandex.metrica.impl.p022ob.AbstractC2942T1
    /* renamed from: A */
    public boolean mo14535A() {
        return super.mo14535A() & (!m15158m());
    }

    @Override // com.yandex.metrica.impl.p022ob.AbstractC2942T1
    /* renamed from: a */
    public void mo14458a(Uri.Builder builder) {
        C3445mh c3445mh = (C3445mh) this.f22346j;
        C3045X4 c3045x4 = this.f22516w;
        c3445mh.getClass();
        builder.appendPath("diagnostic");
        builder.appendQueryParameter(CommonUrlParts.DEVICE_ID, c3045x4.m15783g());
        builder.appendQueryParameter(CommonUrlParts.UUID, c3045x4.m15800x());
        builder.appendQueryParameter(CommonUrlParts.APP_PLATFORM, ConstantDeviceInfo.APP_PLATFORM);
        builder.appendQueryParameter(CommonUrlParts.ANALYTICS_SDK_VERSION_NAME, "5.0.0");
        builder.appendQueryParameter(CommonUrlParts.ANALYTICS_SDK_BUILD_NUMBER, "45001354");
        builder.appendQueryParameter(CommonUrlParts.ANALYTICS_SDK_BUILD_TYPE, c3045x4.m15787k());
        if (c3045x4.m15787k().contains("source") && !TextUtils.isEmpty("f6c3700f69aeb2f115563bfb01aee99b5faed63c")) {
            builder.appendQueryParameter("commit_hash", "f6c3700f69aeb2f115563bfb01aee99b5faed63c");
        }
        builder.appendQueryParameter(CommonUrlParts.APP_VERSION, c3045x4.m15782f());
        builder.appendQueryParameter(CommonUrlParts.APP_VERSION_CODE, c3045x4.m15774b());
        builder.appendQueryParameter(CommonUrlParts.MODEL, c3045x4.m15790n());
        builder.appendQueryParameter("manufacturer", c3045x4.m15789m());
        builder.appendQueryParameter("os_version", c3045x4.m15792p());
        builder.appendQueryParameter(CommonUrlParts.OS_API_LEVEL, String.valueOf(c3045x4.m15791o()));
        builder.appendQueryParameter(CommonUrlParts.SCREEN_WIDTH, String.valueOf(c3045x4.m15798v()));
        builder.appendQueryParameter(CommonUrlParts.SCREEN_HEIGHT, String.valueOf(c3045x4.m15797u()));
        builder.appendQueryParameter(CommonUrlParts.SCREEN_DPI, String.valueOf(c3045x4.m15796t()));
        builder.appendQueryParameter(CommonUrlParts.SCALE_FACTOR, String.valueOf(c3045x4.m15795s()));
        builder.appendQueryParameter(CommonUrlParts.LOCALE, c3045x4.m15788l());
        builder.appendQueryParameter(CommonUrlParts.DEVICE_TYPE, c3045x4.m15786j());
        builder.appendQueryParameter("app_id", c3045x4.m15793q());
        builder.appendQueryParameter("api_key_128", c3045x4.m15415C());
        builder.appendQueryParameter("app_debuggable", c3045x4.m16000A());
        builder.appendQueryParameter(CommonUrlParts.ROOT_STATUS, c3045x4.m15785i());
        builder.appendQueryParameter(CommonUrlParts.APP_FRAMEWORK, c3045x4.m15776c());
    }

    @Override // com.yandex.metrica.impl.p022ob.AbstractC2942T1
    /* renamed from: b */
    public void mo14460b(Throwable th) {
    }

    @Override // com.yandex.metrica.impl.p022ob.AbstractC2942T1
    /* renamed from: o */
    public boolean mo14462o() throws UnsupportedEncodingException {
        byte[] bArrM15299b;
        C3045X4 c3045x4Mo15169a = this.f22508o.mo15169a();
        this.f22516w = c3045x4Mo15169a;
        boolean zM15801y = c3045x4Mo15169a.m15801y();
        boolean zM15249b = C2968U2.m15249b(this.f22516w.m15416D());
        if (!zM15801y || zM15249b) {
            return false;
        }
        m15146a(this.f22516w.m15416D());
        C3020W4.b bVar = this.f22511r;
        C3376k0 c3376k0 = this.f22509p;
        C3045X4 c3045x4 = this.f22516w;
        C3095Z4 c3095z4 = this.f22510q;
        C2675I8 c2675i8 = this.f22515v;
        bVar.getClass();
        byte[] bArrM15383a = new C3020W4(c3376k0, c3045x4, c3095z4, new C3328i4(c2675i8), new C2790Mn(1024, "diagnostic event name", AbstractC3788zm.m17344a()), new C2790Mn(204800, "diagnostic event value", AbstractC3788zm.m17344a()), new C2814Nm()).m15383a();
        try {
            this.f22513t.getClass();
            bArrM15299b = C2991V0.m15299b(bArrM15383a);
        } catch (Throwable unused) {
            bArrM15299b = null;
        }
        if (!C2968U2.m15246a(bArrM15299b)) {
            m15144a("Content-Encoding", "gzip");
            bArrM15383a = bArrM15299b;
        }
        mo15147a(bArrM15383a);
        return true;
    }

    @Override // com.yandex.metrica.impl.p022ob.AbstractC2942T1
    /* renamed from: p */
    public boolean mo15160p() {
        boolean zMo15160p = super.mo15160p();
        m15143a(this.f22512s.mo14674a());
        return zMo15160p;
    }

    @Override // com.yandex.metrica.impl.p022ob.AbstractC2942T1
    /* renamed from: r */
    public boolean mo14463r() {
        C3662v0.a aVarM15409B = m15409B();
        return aVarM15409B != null && "accepted".equals(aVarM15409B.f24972a);
    }

    @Override // com.yandex.metrica.impl.p022ob.AbstractC2942T1
    /* renamed from: t */
    public void mo14465t() {
    }

    public C2995V4(InterfaceC3070Y4 interfaceC3070Y4, C3376k0 c3376k0, C3095Z4 c3095z4, C2675I8 c2675i8, C3020W4.b bVar, InterfaceC2839Om interfaceC2839Om, C3684vm c3684vm, C3445mh c3445mh, C3610t0 c3610t0) {
        super(c3610t0, c3445mh);
        this.f22508o = interfaceC3070Y4;
        this.f22509p = c3376k0;
        this.f22510q = c3095z4;
        this.f22515v = c2675i8;
        this.f22511r = bVar;
        this.f22512s = interfaceC2839Om;
        this.f22513t = c3684vm;
        this.f22514u = C2995V4.class.getName() + "@" + Integer.toHexString(hashCode());
    }

    @Override // com.yandex.metrica.impl.p022ob.AbstractC2942T1
    /* renamed from: b */
    public AbstractC2942T1.a mo14459b() {
        return AbstractC2942T1.a.DIAGNOSTIC;
    }

    @Override // com.yandex.metrica.impl.p022ob.AbstractC2942T1
    /* renamed from: a */
    public String mo14457a() {
        return this.f22514u;
    }
}
