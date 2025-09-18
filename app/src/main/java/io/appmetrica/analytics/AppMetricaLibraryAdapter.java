package io.appmetrica.analytics;

import android.content.Context;
import io.appmetrica.analytics.impl.C5484u0;
import io.appmetrica.analytics.impl.C5520vb;
import kotlin.Pair;
import p000.AbstractC11077sn0;

/* loaded from: classes2.dex */
public class AppMetricaLibraryAdapter {

    /* renamed from: a */
    private static C5484u0 f29496a = new C5484u0();

    public static void activate(Context context) {
        f29496a.m21107a(context);
    }

    public static void reportEvent(String str, String str2, String str3) {
        C5484u0 c5484u0 = f29496a;
        C5520vb c5520vb = c5484u0.f32659b;
        c5520vb.f32727b.mo19211a(null);
        c5520vb.f32728c.mo19211a(str);
        c5520vb.f32729d.mo19211a(str2);
        c5520vb.f32730e.mo19211a(str3);
        c5484u0.f32660c.getClass();
        c5484u0.f32661d.getClass();
        ModulesFacade.reportEvent(ModuleEvent.newBuilder(4).withName("appmetrica_system_event_42").withAttributes(AbstractC11077sn0.m24780h(new Pair("sender", str), new Pair("event", str2), new Pair("payload", str3))).build());
    }

    public static void setProxy(C5484u0 c5484u0) {
        f29496a = c5484u0;
    }
}
