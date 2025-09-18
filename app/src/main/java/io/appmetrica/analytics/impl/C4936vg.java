package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.vg */
/* loaded from: classes2.dex */
public final class C4936vg extends AbstractC4625ig {
    public final Od b;
    public final ProtobufStateStorage c;
    public final F2 d;
    public final C4491d2 e;
    public final C4994y2 f;

    public C4936vg(C4567g5 c4567g5, Od od) {
        this(c4567g5, od, Rl.a(U1.class).a(c4567g5.getContext()), new F2(c4567g5.getContext()), new C4491d2(), new C4994y2(c4567g5.getContext()));
    }

    @Override // io.appmetrica.analytics.impl.AbstractC4625ig
    public final boolean a(T5 t5) {
        C4567g5 c4567g5 = this.a;
        c4567g5.b.toString();
        if (!c4567g5.v.c() || !c4567g5.x()) {
            return false;
        }
        U1 u1 = (U1) this.c.read();
        List list = u1.a;
        E2 e2 = u1.b;
        F2 f2 = this.d;
        f2.getClass();
        U1 u12 = null;
        E2 e2A = AndroidUtils.isApiAchieved(28) ? B2.a(f2.a, f2.b) : null;
        List list2 = u1.c;
        List list3 = (List) SystemServiceUtils.accessSystemServiceSafelyOrDefault(this.f.a, "getting available providers", "location manager", Collections.emptyList(), new C4970x2());
        Od od = this.b;
        Context context = this.a.a;
        od.getClass();
        ArrayList arrayListA = new C4556fi(context, new SafePackageManager()).a();
        if (CollectionUtils.areCollectionsEqual(arrayListA, list)) {
            arrayListA = null;
        }
        if (arrayListA != null || !hn.a(e2, e2A) || !CollectionUtils.areCollectionsEqual(list2, list3)) {
            if (arrayListA != null) {
                list = arrayListA;
            }
            u12 = new U1(list, e2A, list3);
        }
        if (u12 != null) {
            C4619i9 c4619i9 = c4567g5.o;
            T5 t5A = T5.a(t5, u12.a, u12.b, this.e, u12.c);
            c4619i9.a(t5A, Uj.a(c4619i9.c.b(t5A), t5A.i));
            long jCurrentTimeSeconds = c4619i9.j.currentTimeSeconds();
            c4619i9.l = jCurrentTimeSeconds;
            c4619i9.a.a(jCurrentTimeSeconds).b();
            this.c.save(u12);
            return false;
        }
        if (!c4567g5.A()) {
            return false;
        }
        C4619i9 c4619i92 = c4567g5.o;
        T5 t5A2 = T5.a(t5, u1.a, u1.b, this.e, u1.c);
        c4619i92.a(t5A2, Uj.a(c4619i92.c.b(t5A2), t5A2.i));
        long jCurrentTimeSeconds2 = c4619i92.j.currentTimeSeconds();
        c4619i92.l = jCurrentTimeSeconds2;
        c4619i92.a.a(jCurrentTimeSeconds2).b();
        return false;
    }

    public C4936vg(C4567g5 c4567g5, Od od, ProtobufStateStorage protobufStateStorage, F2 f2, C4491d2 c4491d2, C4994y2 c4994y2) {
        super(c4567g5);
        this.b = od;
        this.c = protobufStateStorage;
        this.d = f2;
        this.e = c4491d2;
        this.f = c4994y2;
    }
}
