package defpackage;

import com.google.android.gms.common.internal.Preconditions;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

/* renamed from: xM1 */
/* loaded from: classes.dex */
public final class RunnableC7969xM1 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final URL b;
    public final byte[] c;
    public final String d;
    public final Object e;
    public final Map f;
    public final /* synthetic */ U0 g;

    public RunnableC7969xM1(C6825rM1 c6825rM1, String str, URL url, byte[] bArr, Map map, InterfaceC5680lM1 interfaceC5680lM1) {
        this.g = c6825rM1;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(url);
        Preconditions.checkNotNull(interfaceC5680lM1);
        this.b = url;
        this.c = bArr;
        this.e = interfaceC5680lM1;
        this.d = str;
        this.f = map;
    }

    /* JADX WARN: Removed duplicated region for block: B:156:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0109 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0139 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void a() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 358
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.RunnableC7969xM1.a():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void b(int i, IOException iOException, byte[] bArr, Map map) {
        C7595vO1 c7595vO1P0 = ((C5322jU1) this.g).p0();
        RunnableC6086nU1 runnableC6086nU1 = new RunnableC6086nU1(0);
        runnableC6086nU1.c = this;
        runnableC6086nU1.b = i;
        runnableC6086nU1.d = iOException;
        runnableC6086nU1.e = bArr;
        c7595vO1P0.E1(runnableC6086nU1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0110 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:170:0x012d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.io.OutputStream] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 338
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.RunnableC7969xM1.run():void");
    }

    public RunnableC7969xM1(C5322jU1 c5322jU1, String str, URL url, byte[] bArr, HashMap map, InterfaceC3973gU1 interfaceC3973gU1) {
        this.g = c5322jU1;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(url);
        Preconditions.checkNotNull(interfaceC3973gU1);
        this.b = url;
        this.c = bArr;
        this.e = interfaceC3973gU1;
        this.d = str;
        this.f = map;
    }
}
