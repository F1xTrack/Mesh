package p000;

import android.content.Context;
import android.os.SystemClock;
import com.google.android.gms.common.internal.LibraryVersion;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* renamed from: m32 */
/* loaded from: classes.dex */
public final class C10218m32 {

    /* renamed from: k */
    public static ZE1 f37448k;

    /* renamed from: l */
    public static final C10754qF1 f37449l;

    /* renamed from: a */
    public final String f37450a;

    /* renamed from: b */
    public final String f37451b;

    /* renamed from: c */
    public final C9962k32 f37452c;

    /* renamed from: d */
    public final C10848r01 f37453d;

    /* renamed from: e */
    public final C9450g32 f37454e;

    /* renamed from: f */
    public final C9450g32 f37455f;

    /* renamed from: g */
    public final String f37456g;

    /* renamed from: h */
    public final int f37457h;

    /* renamed from: i */
    public final HashMap f37458i = new HashMap();

    /* renamed from: j */
    public final HashMap f37459j = new HashMap();

    static {
        Object[] objArr = {"optional-module-barcode", "com.google.android.gms.vision.barcode"};
        Objects.requireNonNull(objArr[0]);
        Objects.requireNonNull(objArr[1]);
        f37449l = new C10754qF1(0, objArr);
    }

    public C10218m32(Context context, C10848r01 c10848r01, C9962k32 c9962k32, String str) {
        this.f37450a = context.getPackageName();
        this.f37451b = AbstractC1315Uu.m8199a(context);
        this.f37453d = c10848r01;
        this.f37452c = c9962k32;
        C11370v32.m25314B();
        this.f37456g = str;
        C7978Mu0 c7978Mu0M5464f = C7978Mu0.m5464f();
        CallableC6230jK callableC6230jK = new CallableC6230jK(8, this);
        c7978Mu0M5464f.getClass();
        this.f37454e = C7978Mu0.m5462O(callableC6230jK);
        C7978Mu0 c7978Mu0M5464f2 = C7978Mu0.m5464f();
        Objects.requireNonNull(c10848r01);
        CallableC9762iV1 callableC9762iV1 = new CallableC9762iV1(c10848r01, 2);
        c7978Mu0M5464f2.getClass();
        this.f37455f = C7978Mu0.m5462O(callableC9762iV1);
        C10754qF1 c10754qF1 = f37449l;
        this.f37457h = c10754qF1.containsKey(str) ? C0778MM.m5343d(context, (String) c10754qF1.get(str), false) : -1;
    }

    /* renamed from: a */
    public static long m22647a(ArrayList arrayList, double d) {
        return ((Long) arrayList.get(Math.max(((int) Math.ceil((d / 100.0d) * arrayList.size())) - 1, 0))).longValue();
    }

    /* renamed from: b */
    public final void m22648b(InterfaceC10090l32 interfaceC10090l32, EnumC10593p02 enumC10593p02) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (m22650d(enumC10593p02, jElapsedRealtime)) {
            this.f37458i.put(enumC10593p02, Long.valueOf(jElapsedRealtime));
            MM1.f7115a.execute(new RunnableC6704qp(this, interfaceC10090l32.zza(), enumC10593p02, m22649c(), 14));
        }
    }

    /* renamed from: c */
    public final String m22649c() {
        C9450g32 c9450g32 = this.f37454e;
        if (c9450g32.mo11144k()) {
            return (String) c9450g32.mo11142i();
        }
        return LibraryVersion.getInstance().getVersion(this.f37456g);
    }

    /* renamed from: d */
    public final boolean m22650d(EnumC10593p02 enumC10593p02, long j) {
        HashMap map = this.f37458i;
        return map.get(enumC10593p02) == null || j - ((Long) map.get(enumC10593p02)).longValue() > TimeUnit.SECONDS.toMillis(30L);
    }
}
