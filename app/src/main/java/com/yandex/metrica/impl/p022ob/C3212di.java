package com.yandex.metrica.impl.p022ob;

import android.net.Uri;
import java.net.Socket;
import java.util.HashMap;
import java.util.Set;

/* renamed from: com.yandex.metrica.impl.ob.di */
/* loaded from: classes2.dex */
public class C3212di extends AbstractC3134ai {
    public C3212di(Socket socket, Uri uri, InterfaceC3290gi interfaceC3290gi, C2585Ei c2585Ei, C3316hi c3316hi) {
        super(socket, uri, interfaceC3290gi, c2585Ei, c3316hi);
    }

    @Override // com.yandex.metrica.impl.p022ob.AbstractC3134ai
    /* renamed from: a */
    public void mo14850a() throws Throwable {
        Set<String> queryParameterNames = this.f23066d.getQueryParameterNames();
        HashMap map = new HashMap();
        for (String str : queryParameterNames) {
            map.put(str, this.f23066d.getQueryParameter(str));
        }
        map.remove("t");
        m15616a("HTTP/1.1 200 OK", new HashMap(), new byte[0]);
        ((RunnableC3368ji) this.f23064b).m16185a(map, this.f23063a.getLocalPort(), this.f23067e);
    }
}
