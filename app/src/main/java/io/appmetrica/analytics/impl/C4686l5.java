package io.appmetrica.analytics.impl;

import android.content.Context;
import defpackage.AbstractC8259yu;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Pair;

/* renamed from: io.appmetrica.analytics.impl.l5 */
/* loaded from: classes2.dex */
public class C4686l5 {
    public final C4638j5 a;
    public final C4662k5 b;
    protected final Context c;
    public final Z4 d;
    public final C4 e;
    public final AbstractC4519e5 f;
    protected final C4583gl g;
    public final Bg h;
    public final D8 i;
    public final ICommonExecutor j;
    public final C5027zb k;
    public final int l;

    public C4686l5(Context context, Z4 z4, C4 c4, AbstractC4519e5 abstractC4519e5, C4583gl c4583gl, Bg bg, ICommonExecutor iCommonExecutor, int i, C5027zb c5027zb) {
        this(context, z4, c4, abstractC4519e5, c4583gl, bg, iCommonExecutor, new D8(), i, new C4638j5(c4.a), new C4662k5(context, z4), c5027zb);
    }

    public static V8 c(C4567g5 c4567g5) {
        return new V8(c4567g5);
    }

    public final I8 a() {
        Context context = this.c;
        Z4 z4 = this.d;
        return new I8(new N8(context, z4), this.l);
    }

    public final L6 b(C4567g5 c4567g5) {
        return new L6(c4567g5, Z6.a(this.c).c(this.d), new H6(c4567g5.c()), new C4569g7());
    }

    public final C4638j5 d() {
        return this.a;
    }

    public final C4662k5 e() {
        return this.b;
    }

    public final tn f() {
        tn tnVar;
        xn y9;
        wn wnVarA = C4667ka.C.A();
        Z4 z4 = this.d;
        synchronized (wnVarA) {
            try {
                String strValueOf = String.valueOf(z4);
                LinkedHashMap linkedHashMap = wnVarA.b;
                Object tnVar2 = linkedHashMap.get(strValueOf);
                if (tnVar2 == null) {
                    C4743ne c4743ne = new C4743ne(Z6.a(wnVarA.a).b(z4));
                    if (z4.d()) {
                        String str = "appmetrica_vital_" + z4.b + ".dat";
                        y9 = new C4734n5(AbstractC8259yu.f(new Pair(str, new Y9(wnVarA.a, str)), new Pair("appmetrica_vital_main.dat", new Y9(wnVarA.a, "appmetrica_vital_main.dat"))));
                    } else {
                        y9 = new Y9(wnVarA.a, "appmetrica_vital_" + z4.b + ".dat");
                    }
                    tnVar2 = new tn(c4743ne, y9, strValueOf);
                    linkedHashMap.put(strValueOf, tnVar2);
                }
                tnVar = (tn) tnVar2;
            } catch (Throwable th) {
                throw th;
            }
        }
        return tnVar;
    }

    public C4686l5(Context context, Z4 z4, C4 c4, AbstractC4519e5 abstractC4519e5, C4583gl c4583gl, Bg bg, ICommonExecutor iCommonExecutor, D8 d8, int i, C4638j5 c4638j5, C4662k5 c4662k5, C5027zb c5027zb) {
        this.c = context;
        this.d = z4;
        this.e = c4;
        this.f = abstractC4519e5;
        this.g = c4583gl;
        this.h = bg;
        this.j = iCommonExecutor;
        this.i = d8;
        this.l = i;
        this.a = c4638j5;
        this.b = c4662k5;
        this.k = c5027zb;
    }

    public final Mj c() {
        return new Mj(this.c, this.d);
    }

    public final Mh d(C4567g5 c4567g5) {
        Mh mh = new Mh(c4567g5, this.f.a(), this.j);
        C5027zb c5027zb = this.k;
        synchronized (c5027zb) {
            c5027zb.c.add(mh);
        }
        return mh;
    }

    public final C4602hg a(C4567g5 c4567g5) {
        return new C4602hg(new Cg(c4567g5, this.h, new T3()), this.g, new C5032zg(this.e));
    }

    public static Uj a(C4567g5 c4567g5, tn tnVar, C4543f5 c4543f5) {
        Tj tj = new Tj(tnVar);
        return new Uj(c4567g5, tj, c4543f5, new C4524ea(c4567g5, tj, new Xj(c4567g5.g(), C4524ea.g), AbstractC4658k1.a(), new SystemTimeProvider()), new G2(c4567g5, tj, new Xj(c4567g5.g(), "background"), AbstractC4658k1.a(), new SystemTimeProvider()), new J9(c4567g5.a));
    }

    public static C4444b5 b() {
        return new C4444b5();
    }

    public final C4619i9 a(C4743ne c4743ne, tn tnVar, Uj uj, L6 l6, C4439b0 c4439b0, Mj mj, Mh mh) {
        return new C4619i9(c4743ne, tnVar, uj, l6, c4439b0, this.i, mj, this.l, new C4615i5(mh), new P8(tnVar, new Q8(tnVar)), new SystemTimeProvider());
    }

    public static Kh a(C4567g5 c4567g5, V8 v8) {
        return new Kh(v8, c4567g5);
    }

    public static D5 a(L6 l6) {
        return new D5(l6);
    }

    public static C4789pc a(L6 l6, C4602hg c4602hg) {
        return new C4789pc(l6, c4602hg);
    }

    public static C4762o9 a(ArrayList arrayList, InterfaceC4833r9 interfaceC4833r9) {
        return new C4762o9(arrayList, interfaceC4833r9);
    }

    public final D3 a(C4743ne c4743ne) {
        Context context = this.c;
        return new D3(context, c4743ne, context.getPackageName(), new SafePackageManager());
    }
}
