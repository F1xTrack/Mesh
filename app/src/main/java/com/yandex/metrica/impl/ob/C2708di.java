package com.yandex.metrica.impl.ob;

import android.net.Uri;
import java.net.Socket;
import java.util.HashMap;
import java.util.Set;

/* renamed from: com.yandex.metrica.impl.ob.di, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2708di extends AbstractC2633ai {
    public C2708di(Socket socket, Uri uri, InterfaceC2783gi interfaceC2783gi, Ei ei, C2808hi c2808hi) {
        super(socket, uri, interfaceC2783gi, ei, c2808hi);
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC2633ai
    public void a() throws Throwable {
        Set<String> queryParameterNames = this.d.getQueryParameterNames();
        HashMap map = new HashMap();
        for (String str : queryParameterNames) {
            map.put(str, this.d.getQueryParameter(str));
        }
        map.remove("t");
        a("HTTP/1.1 200 OK", new HashMap(), new byte[0]);
        ((RunnableC2857ji) this.b).a(map, this.a.getLocalPort(), this.e);
    }
}
