package io.appmetrica.analytics.impl;

import android.content.Context;
import com.p019vk.push.core.analytics.AnalyticsBaseParamsConstantsKt;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;
import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import p000.O90;

/* renamed from: io.appmetrica.analytics.impl.il */
/* loaded from: classes2.dex */
public final class C5205il implements InterfaceC5280ll {

    /* renamed from: a */
    public volatile C5155gl f31946a;

    /* renamed from: b */
    public final CopyOnWriteArrayList f31947b = new CopyOnWriteArrayList();

    @Override // io.appmetrica.analytics.impl.InterfaceC5280ll
    /* renamed from: a */
    public final void mo19206a(C5155gl c5155gl) {
        this.f31946a = c5155gl;
        Iterator it = this.f31947b.iterator();
        while (it.hasNext()) {
            ((InterfaceC5280ll) it.next()).mo19206a(c5155gl);
        }
    }

    /* renamed from: b */
    public final void m20581b(InterfaceC5280ll interfaceC5280ll) {
        this.f31947b.remove(interfaceC5280ll);
    }

    /* renamed from: b */
    public final void m20580b(Context context) {
        String strOptStringOrNull;
        ProtobufStateStorage<Object> protobufStateStorageM19823a = C4789Rl.m19787a(C5255kl.class).m19823a(context);
        C5457sn c5457snM21189a = C5244ka.m20614h().m20615A().m21189a();
        synchronized (c5457snM21189a) {
            strOptStringOrNull = JsonUtils.optStringOrNull(c5457snM21189a.f32586a.m21151a(), AnalyticsBaseParamsConstantsKt.DEVICE_ID);
        }
        mo19206a(new C5155gl(strOptStringOrNull, c5457snM21189a.m21057a(), (C5255kl) protobufStateStorageM19823a.read()));
    }

    /* renamed from: a */
    public final C5155gl m20578a() {
        C5155gl c5155gl = this.f31946a;
        if (c5155gl != null) {
            return c5155gl;
        }
        O90.m5977o("startupState");
        throw null;
    }

    /* renamed from: a */
    public final void m20579a(InterfaceC5280ll interfaceC5280ll) {
        this.f31947b.add(interfaceC5280ll);
        if (this.f31946a != null) {
            C5155gl c5155gl = this.f31946a;
            if (c5155gl != null) {
                interfaceC5280ll.mo19206a(c5155gl);
            } else {
                O90.m5977o("startupState");
                throw null;
            }
        }
    }
}
