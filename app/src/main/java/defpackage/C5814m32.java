package defpackage;

import android.content.Context;
import android.os.SystemClock;
import com.google.android.gms.common.internal.LibraryVersion;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* renamed from: m32 */
/* loaded from: classes.dex */
public final class C5814m32 {
    public static ZE1 k;
    public static final C6614qF1 l;
    public final String a;
    public final String b;
    public final C5432k32 c;
    public final C6755r01 d;
    public final C3892g32 e;
    public final C3892g32 f;
    public final String g;
    public final int h;
    public final HashMap i = new HashMap();
    public final HashMap j = new HashMap();

    static {
        Object[] objArr = {"optional-module-barcode", "com.google.android.gms.vision.barcode"};
        Objects.requireNonNull(objArr[0]);
        Objects.requireNonNull(objArr[1]);
        l = new C6614qF1(0, objArr);
    }

    public C5814m32(Context context, C6755r01 c6755r01, C5432k32 c5432k32, String str) {
        this.a = context.getPackageName();
        this.b = AbstractC1639Uu.a(context);
        this.d = c6755r01;
        this.c = c5432k32;
        C7532v32.B();
        this.g = str;
        C1016Mu0 c1016Mu0F = C1016Mu0.f();
        CallableC5290jK callableC5290jK = new CallableC5290jK(8, this);
        c1016Mu0F.getClass();
        this.e = C1016Mu0.O(callableC5290jK);
        C1016Mu0 c1016Mu0F2 = C1016Mu0.f();
        Objects.requireNonNull(c6755r01);
        CallableC4358iV1 callableC4358iV1 = new CallableC4358iV1(c6755r01, 2);
        c1016Mu0F2.getClass();
        this.f = C1016Mu0.O(callableC4358iV1);
        C6614qF1 c6614qF1 = l;
        this.h = c6614qF1.containsKey(str) ? MM.d(context, (String) c6614qF1.get(str), false) : -1;
    }

    public static long a(ArrayList arrayList, double d) {
        return ((Long) arrayList.get(Math.max(((int) Math.ceil((d / 100.0d) * arrayList.size())) - 1, 0))).longValue();
    }

    public final void b(InterfaceC5623l32 interfaceC5623l32, EnumC6375p02 enumC6375p02) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (d(enumC6375p02, jElapsedRealtime)) {
            this.i.put(enumC6375p02, Long.valueOf(jElapsedRealtime));
            MM1.a.execute(new RunnableC6720qp(this, interfaceC5623l32.zza(), enumC6375p02, c(), 14));
        }
    }

    public final String c() {
        C3892g32 c3892g32 = this.e;
        if (c3892g32.k()) {
            return (String) c3892g32.i();
        }
        return LibraryVersion.getInstance().getVersion(this.g);
    }

    public final boolean d(EnumC6375p02 enumC6375p02, long j) {
        HashMap map = this.i;
        return map.get(enumC6375p02) == null || j - ((Long) map.get(enumC6375p02)).longValue() > TimeUnit.SECONDS.toMillis(30L);
    }
}
