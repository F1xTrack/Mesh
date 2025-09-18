package io.appmetrica.analytics.impl;

import android.content.Context;
import com.vk.push.core.analytics.AnalyticsBaseParamsConstantsKt;
import defpackage.O90;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;
import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: io.appmetrica.analytics.impl.il */
/* loaded from: classes2.dex */
public final class C4630il implements InterfaceC4702ll {
    public volatile C4583gl a;
    public final CopyOnWriteArrayList b = new CopyOnWriteArrayList();

    @Override // io.appmetrica.analytics.impl.InterfaceC4702ll
    public final void a(C4583gl c4583gl) {
        this.a = c4583gl;
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((InterfaceC4702ll) it.next()).a(c4583gl);
        }
    }

    public final void b(InterfaceC4702ll interfaceC4702ll) {
        this.b.remove(interfaceC4702ll);
    }

    public final void b(Context context) {
        String strOptStringOrNull;
        ProtobufStateStorage<Object> protobufStateStorageA = Rl.a(C4678kl.class).a(context);
        sn snVarA = C4667ka.h().A().a();
        synchronized (snVarA) {
            strOptStringOrNull = JsonUtils.optStringOrNull(snVarA.a.a(), AnalyticsBaseParamsConstantsKt.DEVICE_ID);
        }
        a(new C4583gl(strOptStringOrNull, snVarA.a(), (C4678kl) protobufStateStorageA.read()));
    }

    public final C4583gl a() {
        C4583gl c4583gl = this.a;
        if (c4583gl != null) {
            return c4583gl;
        }
        O90.o("startupState");
        throw null;
    }

    public final void a(InterfaceC4702ll interfaceC4702ll) {
        this.b.add(interfaceC4702ll);
        if (this.a != null) {
            C4583gl c4583gl = this.a;
            if (c4583gl != null) {
                interfaceC4702ll.a(c4583gl);
            } else {
                O90.o("startupState");
                throw null;
            }
        }
    }
}
