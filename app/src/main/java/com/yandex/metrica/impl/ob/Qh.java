package com.yandex.metrica.impl.ob;

import android.net.Uri;
import android.util.Base64;
import java.net.Socket;
import java.util.HashMap;

/* loaded from: classes2.dex */
class Qh extends AbstractC2633ai {
    private final String f;

    public class a extends HashMap<String, String> {
        final /* synthetic */ byte[] a;

        public a(Qh qh, byte[] bArr) {
            this.a = bArr;
            put("Content-Type", "text/plain; charset=utf-8");
            put("Access-Control-Allow-Origin", "*");
            put("Access-Control-Allow-Methods", "GET");
            put("Content-Length", String.valueOf(bArr.length));
        }
    }

    public Qh(Socket socket, Uri uri, InterfaceC2783gi interfaceC2783gi, Ei ei, String str, C2808hi c2808hi) {
        super(socket, uri, interfaceC2783gi, ei, c2808hi);
        this.f = str;
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC2633ai
    public void a() {
        try {
            byte[] bArrEncode = Base64.encode(new C2788gn().a(this.f.getBytes()), 0);
            a("HTTP/1.1 200 OK", new a(this, bArrEncode), bArrEncode);
        } catch (Throwable unused) {
        }
    }
}
