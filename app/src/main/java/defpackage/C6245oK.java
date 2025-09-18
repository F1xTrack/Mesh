package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: oK */
/* loaded from: classes2.dex */
public final class C6245oK implements Closeable {
    public final String a;
    public final long b;
    public final ArrayList c;
    public final /* synthetic */ C6627qK d;

    public C6245oK(C6627qK c6627qK, String str, long j, ArrayList arrayList, long[] jArr) {
        O90.f(str, "key");
        O90.f(jArr, "lengths");
        this.d = c6627qK;
        this.a = str;
        this.b = j;
        this.c = arrayList;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            AbstractC0199Ch1.d((U21) it.next());
        }
    }
}
