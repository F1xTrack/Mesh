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
public final class C5525vg extends AbstractC5200ig {

    /* renamed from: b */
    public final C4710Od f32735b;

    /* renamed from: c */
    public final ProtobufStateStorage f32736c;

    /* renamed from: d */
    public final C4483F2 f32737d;

    /* renamed from: e */
    public final C5061d2 f32738e;

    /* renamed from: f */
    public final C5586y2 f32739f;

    public C5525vg(C5139g5 c5139g5, C4710Od c4710Od) {
        this(c5139g5, c4710Od, C4789Rl.m19787a(C4841U1.class).m19823a(c5139g5.getContext()), new C4483F2(c5139g5.getContext()), new C5061d2(), new C5586y2(c5139g5.getContext()));
    }

    @Override // io.appmetrica.analytics.impl.AbstractC5200ig
    /* renamed from: a */
    public final boolean mo19341a(C4821T5 c4821t5) {
        C5139g5 c5139g5 = this.f31942a;
        c5139g5.f31723b.toString();
        if (!c5139g5.f31743v.m21104c() || !c5139g5.m20433x()) {
            return false;
        }
        C4841U1 c4841u1 = (C4841U1) this.f32736c.read();
        List list = c4841u1.f30799a;
        C4459E2 c4459e2 = c4841u1.f30800b;
        C4483F2 c4483f2 = this.f32737d;
        c4483f2.getClass();
        C4841U1 c4841u12 = null;
        C4459E2 c4459e2M19221a = AndroidUtils.isApiAchieved(28) ? C4384B2.m19221a(c4483f2.f30120a, c4483f2.f30121b) : null;
        List list2 = c4841u1.f30801c;
        List list3 = (List) SystemServiceUtils.accessSystemServiceSafelyOrDefault(this.f32739f.f32836a, "getting available providers", "location manager", Collections.emptyList(), new C5561x2());
        C4710Od c4710Od = this.f32735b;
        Context context = this.f31942a.f31722a;
        c4710Od.getClass();
        ArrayList arrayListM20393a = new C5127fi(context, new SafePackageManager()).m20393a();
        if (CollectionUtils.areCollectionsEqual(arrayListM20393a, list)) {
            arrayListM20393a = null;
        }
        if (arrayListM20393a != null || !AbstractC5182hn.m20512a(c4459e2, c4459e2M19221a) || !CollectionUtils.areCollectionsEqual(list2, list3)) {
            if (arrayListM20393a != null) {
                list = arrayListM20393a;
            }
            c4841u12 = new C4841U1(list, c4459e2M19221a, list3);
        }
        if (c4841u12 != null) {
            C5193i9 c5193i9 = c5139g5.f31736o;
            C4821T5 c4821t5M19838a = C4821T5.m19838a(c4821t5, c4841u12.f30799a, c4841u12.f30800b, this.f32738e, c4841u12.f30801c);
            c5193i9.m20572a(c4821t5M19838a, C4859Uj.m19888a(c5193i9.f31919c.m19892b(c4821t5M19838a), c4821t5M19838a.f30769i));
            long jCurrentTimeSeconds = c5193i9.f31926j.currentTimeSeconds();
            c5193i9.f31928l = jCurrentTimeSeconds;
            c5193i9.f31917a.m20819a(jCurrentTimeSeconds).m20875b();
            this.f32736c.save(c4841u12);
            return false;
        }
        if (!c5139g5.m20409A()) {
            return false;
        }
        C5193i9 c5193i92 = c5139g5.f31736o;
        C4821T5 c4821t5M19838a2 = C4821T5.m19838a(c4821t5, c4841u1.f30799a, c4841u1.f30800b, this.f32738e, c4841u1.f30801c);
        c5193i92.m20572a(c4821t5M19838a2, C4859Uj.m19888a(c5193i92.f31919c.m19892b(c4821t5M19838a2), c4821t5M19838a2.f30769i));
        long jCurrentTimeSeconds2 = c5193i92.f31926j.currentTimeSeconds();
        c5193i92.f31928l = jCurrentTimeSeconds2;
        c5193i92.f31917a.m20819a(jCurrentTimeSeconds2).m20875b();
        return false;
    }

    public C5525vg(C5139g5 c5139g5, C4710Od c4710Od, ProtobufStateStorage protobufStateStorage, C4483F2 c4483f2, C5061d2 c5061d2, C5586y2 c5586y2) {
        super(c5139g5);
        this.f32735b = c4710Od;
        this.f32736c = protobufStateStorage;
        this.f32737d = c4483f2;
        this.f32738e = c5061d2;
        this.f32739f = c5586y2;
    }
}
