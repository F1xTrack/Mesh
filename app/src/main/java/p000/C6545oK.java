package p000;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: oK */
/* loaded from: classes2.dex */
public final class C6545oK implements Closeable {

    /* renamed from: a */
    public final String f38950a;

    /* renamed from: b */
    public final long f38951b;

    /* renamed from: c */
    public final ArrayList f38952c;

    /* renamed from: d */
    public final /* synthetic */ C6673qK f38953d;

    public C6545oK(C6673qK c6673qK, String str, long j, ArrayList arrayList, long[] jArr) {
        O90.m5968f(str, "key");
        O90.m5968f(jArr, "lengths");
        this.f38953d = c6673qK;
        this.f38950a = str;
        this.f38951b = j;
        this.f38952c = arrayList;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        Iterator it = this.f38952c.iterator();
        while (it.hasNext()) {
            AbstractC7433Ch1.m1275d((U21) it.next());
        }
    }
}
