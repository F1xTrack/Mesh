package com.yandex.metrica.impl.ob;

import java.io.IOException;
import java.net.ServerSocket;

/* renamed from: com.yandex.metrica.impl.ob.fi, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC2758fi {

    /* renamed from: com.yandex.metrica.impl.ob.fi$a */
    public static class a extends Throwable {
        public a(String str, Throwable th) {
            super(str, th);
        }
    }

    ServerSocket a(int i) throws IOException, a;
}
