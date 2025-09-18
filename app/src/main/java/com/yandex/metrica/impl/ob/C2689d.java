package com.yandex.metrica.impl.ob;

import java.io.IOException;

/* renamed from: com.yandex.metrica.impl.ob.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2689d extends IOException {
    public C2689d(String str) {
        super(str);
    }

    public static C2689d a() {
        return new C2689d("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static C2689d b() {
        return new C2689d("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
    }
}
