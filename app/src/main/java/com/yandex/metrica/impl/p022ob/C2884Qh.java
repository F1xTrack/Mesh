package com.yandex.metrica.impl.p022ob;

import android.net.Uri;
import android.util.Base64;
import java.net.Socket;
import java.util.HashMap;

/* renamed from: com.yandex.metrica.impl.ob.Qh */
/* loaded from: classes2.dex */
class C2884Qh extends AbstractC3134ai {

    /* renamed from: f */
    private final String f22020f;

    /* renamed from: com.yandex.metrica.impl.ob.Qh$a */
    public class a extends HashMap<String, String> {

        /* renamed from: a */
        final /* synthetic */ byte[] f22021a;

        public a(C2884Qh c2884Qh, byte[] bArr) {
            this.f22021a = bArr;
            put("Content-Type", "text/plain; charset=utf-8");
            put("Access-Control-Allow-Origin", "*");
            put("Access-Control-Allow-Methods", "GET");
            put("Content-Length", String.valueOf(bArr.length));
        }
    }

    public C2884Qh(Socket socket, Uri uri, InterfaceC3290gi interfaceC3290gi, C2585Ei c2585Ei, String str, C3316hi c3316hi) {
        super(socket, uri, interfaceC3290gi, c2585Ei, c3316hi);
        this.f22020f = str;
    }

    @Override // com.yandex.metrica.impl.p022ob.AbstractC3134ai
    /* renamed from: a */
    public void mo14850a() {
        try {
            byte[] bArrEncode = Base64.encode(new C3295gn().m16016a(this.f22020f.getBytes()), 0);
            m15616a("HTTP/1.1 200 OK", new a(this, bArrEncode), bArrEncode);
        } catch (Throwable unused) {
        }
    }
}
