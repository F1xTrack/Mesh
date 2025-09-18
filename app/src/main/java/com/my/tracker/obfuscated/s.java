package com.my.tracker.obfuscated;

import com.my.tracker.obfuscated.t0;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes2.dex */
public class s implements t0.a {
    private final r a;

    public s(r rVar) {
        this.a = rVar;
    }

    @Override // com.my.tracker.obfuscated.t0.a
    public void a(OutputStream outputStream) throws IOException {
        this.a.a(outputStream);
    }

    @Override // com.my.tracker.obfuscated.t0.a
    public String a() {
        return "application/octet-stream";
    }
}
