package com.yandex.metrica.impl.ob;

import android.net.Uri;
import com.yandex.metrica.impl.ob.InterfaceC2956nh;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public abstract class T1<T extends InterfaceC2956nh> {
    private String a;
    private byte[] d;
    private int e;
    private byte[] f;
    protected Map<String, List<String>> g;
    private List<String> i;
    protected final T j;
    private Long k;
    private Integer l;
    private int b = 1;
    private final Map<String, List<String>> c = new HashMap();
    private int h = -1;
    private b m = b.EMPTY;

    public enum a {
        REPORT,
        LOCATION,
        STARTUP,
        DIAGNOSTIC
    }

    public enum b {
        EMPTY,
        PENDING,
        PREPARING,
        EXECUTING,
        SUCCESS,
        FAILED,
        SHOULD_NOT_EXECUTE,
        FINISHED,
        REMOVED
    }

    public T1(T t) {
        this.j = t;
    }

    public boolean A() {
        b bVar = this.m;
        return (bVar == b.REMOVED || bVar == b.FINISHED || this.h + 1 >= this.i.size()) ? false : true;
    }

    public abstract void a(Uri.Builder builder);

    public final void a(Throwable th) {
        b bVar = b.FAILED;
        if (a(bVar)) {
            b(th);
            this.m = bVar;
        }
    }

    public abstract a b();

    public abstract void b(Throwable th);

    public void b(byte[] bArr) {
        this.f = bArr;
    }

    public List<String> c() {
        return this.i;
    }

    public Vd d() {
        return new Wd(this.a);
    }

    public int e() {
        return this.b;
    }

    public Map<String, List<String>> f() {
        return this.c;
    }

    public byte[] g() {
        return this.d;
    }

    public int h() {
        return this.e;
    }

    public byte[] i() {
        return this.f;
    }

    public Ci j() {
        return null;
    }

    public Long k() {
        return this.k;
    }

    public Integer l() {
        return this.l;
    }

    public boolean m() {
        return this.e == 400;
    }

    public final boolean n() {
        b bVar = b.PREPARING;
        if (!a(bVar)) {
            return false;
        }
        this.m = bVar;
        return o();
    }

    public abstract boolean o();

    public boolean p() {
        b bVar = b.EXECUTING;
        if (!a(bVar)) {
            return false;
        }
        this.m = bVar;
        int i = this.h + 1;
        this.h = i;
        Uri.Builder builderBuildUpon = Uri.parse(this.i.get(i)).buildUpon();
        a(builderBuildUpon);
        this.a = builderBuildUpon.build().toString();
        return true;
    }

    public final boolean q() {
        b bVar = b.SUCCESS;
        b bVar2 = b.FAILED;
        if (!a(bVar, bVar2)) {
            return false;
        }
        boolean zR = r();
        if (zR) {
            this.m = bVar;
        } else {
            this.m = bVar2;
        }
        return zR;
    }

    public abstract boolean r();

    public void s() {
        b bVar = b.SHOULD_NOT_EXECUTE;
        if (a(bVar)) {
            this.m = bVar;
        }
    }

    public abstract void t();

    public final boolean u() {
        b bVar = b.PENDING;
        if (!a(bVar)) {
            return false;
        }
        boolean zV = v();
        this.m = bVar;
        return zV;
    }

    public boolean v() {
        return true;
    }

    public void w() {
        b bVar = b.FINISHED;
        if (a(bVar)) {
            b bVar2 = this.m;
            if (bVar2 == b.SUCCESS) {
                t();
            } else if (bVar2 == b.FAILED || bVar2 == b.SHOULD_NOT_EXECUTE) {
                y();
            }
            this.m = bVar;
        }
    }

    public void x() {
        b bVar = b.REMOVED;
        if (a(bVar)) {
            this.m = bVar;
        }
    }

    public void y() {
    }

    public boolean z() {
        return false;
    }

    public void a(byte[] bArr) {
        this.b = 2;
        this.d = bArr;
    }

    public void a(int i) {
        this.e = i;
    }

    public String a() {
        return getClass().getName();
    }

    public void a(List<String> list) {
        this.i = list;
    }

    public void a(String str, String... strArr) {
        this.c.put(str, Arrays.asList(strArr));
    }

    public void a(long j) {
        this.k = Long.valueOf(j);
        this.l = Integer.valueOf(C2814i.a(TimeUnit.MILLISECONDS.toSeconds(j)));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:129:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean a(com.yandex.metrica.impl.ob.T1.b... r8) {
        /*
            r7 = this;
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            com.yandex.metrica.impl.ob.T1$b r1 = r7.m
            int r2 = r8.length
            r3 = 0
            r4 = r3
        L7:
            if (r4 >= r2) goto L99
            r5 = r8[r4]
            int r5 = r5.ordinal()
            r6 = 1
            switch(r5) {
                case 0: goto L8a;
                case 1: goto L7f;
                case 2: goto L71;
                case 3: goto L5a;
                case 4: goto L4c;
                case 5: goto L4c;
                case 6: goto L71;
                case 7: goto L29;
                case 8: goto L17;
                default: goto L13;
            }
        L13:
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            goto L8b
        L17:
            com.yandex.metrica.impl.ob.T1$b r5 = com.yandex.metrica.impl.ob.T1.b.EMPTY
            if (r1 != r5) goto L1d
            goto L8a
        L1d:
            com.yandex.metrica.impl.ob.T1$b r5 = com.yandex.metrica.impl.ob.T1.b.REMOVED
            if (r1 == r5) goto L22
            goto L23
        L22:
            r6 = r3
        L23:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r6)
            goto L8b
        L29:
            com.yandex.metrica.impl.ob.T1$b r5 = com.yandex.metrica.impl.ob.T1.b.SUCCESS
            if (r1 == r5) goto L49
            com.yandex.metrica.impl.ob.T1$b r5 = com.yandex.metrica.impl.ob.T1.b.FAILED
            if (r1 == r5) goto L49
            com.yandex.metrica.impl.ob.T1$b r5 = com.yandex.metrica.impl.ob.T1.b.SHOULD_NOT_EXECUTE
            if (r1 == r5) goto L49
            com.yandex.metrica.impl.ob.T1$b r5 = com.yandex.metrica.impl.ob.T1.b.PENDING
            if (r1 == r5) goto L49
            com.yandex.metrica.impl.ob.T1$b r5 = com.yandex.metrica.impl.ob.T1.b.PREPARING
            if (r1 == r5) goto L49
            com.yandex.metrica.impl.ob.T1$b r5 = com.yandex.metrica.impl.ob.T1.b.EXECUTING
            if (r1 != r5) goto L42
            goto L49
        L42:
            com.yandex.metrica.impl.ob.T1$b r5 = com.yandex.metrica.impl.ob.T1.b.REMOVED
            if (r1 != r5) goto L8a
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            goto L8b
        L49:
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            goto L8b
        L4c:
            com.yandex.metrica.impl.ob.T1$b r5 = com.yandex.metrica.impl.ob.T1.b.EXECUTING
            if (r1 != r5) goto L53
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            goto L8b
        L53:
            com.yandex.metrica.impl.ob.T1$b r5 = com.yandex.metrica.impl.ob.T1.b.REMOVED
            if (r1 != r5) goto L8a
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            goto L8b
        L5a:
            com.yandex.metrica.impl.ob.T1$b r5 = com.yandex.metrica.impl.ob.T1.b.PREPARING
            if (r1 == r5) goto L6e
            com.yandex.metrica.impl.ob.T1$b r5 = com.yandex.metrica.impl.ob.T1.b.SUCCESS
            if (r1 == r5) goto L6e
            com.yandex.metrica.impl.ob.T1$b r5 = com.yandex.metrica.impl.ob.T1.b.FAILED
            if (r1 != r5) goto L67
            goto L6e
        L67:
            com.yandex.metrica.impl.ob.T1$b r5 = com.yandex.metrica.impl.ob.T1.b.REMOVED
            if (r1 != r5) goto L8a
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            goto L8b
        L6e:
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            goto L8b
        L71:
            com.yandex.metrica.impl.ob.T1$b r5 = com.yandex.metrica.impl.ob.T1.b.PENDING
            if (r1 != r5) goto L78
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            goto L8b
        L78:
            com.yandex.metrica.impl.ob.T1$b r5 = com.yandex.metrica.impl.ob.T1.b.REMOVED
            if (r1 != r5) goto L8a
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            goto L8b
        L7f:
            com.yandex.metrica.impl.ob.T1$b r5 = com.yandex.metrica.impl.ob.T1.b.EMPTY
            if (r1 != r5) goto L84
            goto L85
        L84:
            r6 = r3
        L85:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r6)
            goto L8b
        L8a:
            r5 = 0
        L8b:
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            boolean r6 = r6.equals(r5)
            if (r6 != 0) goto L95
            r0 = r5
            goto L99
        L95:
            int r4 = r4 + 1
            goto L7
        L99:
            java.lang.Boolean r8 = java.lang.Boolean.TRUE
            r8.equals(r0)
            boolean r8 = r8.equals(r0)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.ob.T1.a(com.yandex.metrica.impl.ob.T1$b[]):boolean");
    }
}
