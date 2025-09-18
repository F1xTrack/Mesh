package com.yandex.metrica.impl.ob;

import java.io.IOException;
import java.net.ServerSocket;

/* loaded from: classes2.dex */
class Rh implements InterfaceC2758fi {
    @Override // com.yandex.metrica.impl.ob.InterfaceC2758fi
    public ServerSocket a(int i) throws IOException {
        return new ServerSocket(i);
    }
}
