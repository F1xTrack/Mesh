package com.p018my.tracker.obfuscated;

import com.p018my.tracker.obfuscated.AbstractC2369t0;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: com.my.tracker.obfuscated.s */
/* loaded from: classes2.dex */
public class C2364s implements AbstractC2369t0.a {

    /* renamed from: a */
    private final C2360r f20118a;

    public C2364s(C2360r c2360r) {
        this.f20118a = c2360r;
    }

    @Override // com.p018my.tracker.obfuscated.AbstractC2369t0.a
    /* renamed from: a */
    public void mo13351a(OutputStream outputStream) throws IOException {
        this.f20118a.m13459a(outputStream);
    }

    @Override // com.p018my.tracker.obfuscated.AbstractC2369t0.a
    /* renamed from: a */
    public String mo13349a() {
        return "application/octet-stream";
    }
}
