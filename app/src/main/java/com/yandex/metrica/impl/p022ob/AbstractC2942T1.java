package com.yandex.metrica.impl.p022ob;

import android.net.Uri;
import com.yandex.metrica.impl.p022ob.InterfaceC3471nh;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: com.yandex.metrica.impl.ob.T1 */
/* loaded from: classes2.dex */
public abstract class AbstractC2942T1<T extends InterfaceC3471nh> {

    /* renamed from: a */
    private String f22337a;

    /* renamed from: d */
    private byte[] f22340d;

    /* renamed from: e */
    private int f22341e;

    /* renamed from: f */
    private byte[] f22342f;

    /* renamed from: g */
    protected Map<String, List<String>> f22343g;

    /* renamed from: i */
    private List<String> f22345i;

    /* renamed from: j */
    protected final T f22346j;

    /* renamed from: k */
    private Long f22347k;

    /* renamed from: l */
    private Integer f22348l;

    /* renamed from: b */
    private int f22338b = 1;

    /* renamed from: c */
    private final Map<String, List<String>> f22339c = new HashMap();

    /* renamed from: h */
    private int f22344h = -1;

    /* renamed from: m */
    private b f22349m = b.EMPTY;

    /* renamed from: com.yandex.metrica.impl.ob.T1$a */
    public enum a {
        REPORT,
        LOCATION,
        STARTUP,
        DIAGNOSTIC
    }

    /* renamed from: com.yandex.metrica.impl.ob.T1$b */
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

    public AbstractC2942T1(T t) {
        this.f22346j = t;
    }

    /* renamed from: A */
    public boolean mo14535A() {
        b bVar = this.f22349m;
        return (bVar == b.REMOVED || bVar == b.FINISHED || this.f22344h + 1 >= this.f22345i.size()) ? false : true;
    }

    /* renamed from: a */
    public abstract void mo14458a(Uri.Builder builder);

    /* renamed from: a */
    public final void m15145a(Throwable th) {
        b bVar = b.FAILED;
        if (m15141a(bVar)) {
            mo14460b(th);
            this.f22349m = bVar;
        }
    }

    /* renamed from: b */
    public abstract a mo14459b();

    /* renamed from: b */
    public abstract void mo14460b(Throwable th);

    /* renamed from: b */
    public void m15148b(byte[] bArr) {
        this.f22342f = bArr;
    }

    /* renamed from: c */
    public List<String> m15149c() {
        return this.f22345i;
    }

    /* renamed from: d */
    public AbstractC3004Vd m15150d() {
        return new C3029Wd(this.f22337a);
    }

    /* renamed from: e */
    public int m15151e() {
        return this.f22338b;
    }

    /* renamed from: f */
    public Map<String, List<String>> m15152f() {
        return this.f22339c;
    }

    /* renamed from: g */
    public byte[] m15153g() {
        return this.f22340d;
    }

    /* renamed from: h */
    public int m15154h() {
        return this.f22341e;
    }

    /* renamed from: i */
    public byte[] m15155i() {
        return this.f22342f;
    }

    /* renamed from: j */
    public C2535Ci mo14461j() {
        return null;
    }

    /* renamed from: k */
    public Long m15156k() {
        return this.f22347k;
    }

    /* renamed from: l */
    public Integer m15157l() {
        return this.f22348l;
    }

    /* renamed from: m */
    public boolean m15158m() {
        return this.f22341e == 400;
    }

    /* renamed from: n */
    public final boolean m15159n() {
        b bVar = b.PREPARING;
        if (!m15141a(bVar)) {
            return false;
        }
        this.f22349m = bVar;
        return mo14462o();
    }

    /* renamed from: o */
    public abstract boolean mo14462o();

    /* renamed from: p */
    public boolean mo15160p() {
        b bVar = b.EXECUTING;
        if (!m15141a(bVar)) {
            return false;
        }
        this.f22349m = bVar;
        int i = this.f22344h + 1;
        this.f22344h = i;
        Uri.Builder builderBuildUpon = Uri.parse(this.f22345i.get(i)).buildUpon();
        mo14458a(builderBuildUpon);
        this.f22337a = builderBuildUpon.build().toString();
        return true;
    }

    /* renamed from: q */
    public final boolean m15161q() {
        b bVar = b.SUCCESS;
        b bVar2 = b.FAILED;
        if (!m15141a(bVar, bVar2)) {
            return false;
        }
        boolean zMo14463r = mo14463r();
        if (zMo14463r) {
            this.f22349m = bVar;
        } else {
            this.f22349m = bVar2;
        }
        return zMo14463r;
    }

    /* renamed from: r */
    public abstract boolean mo14463r();

    /* renamed from: s */
    public void mo14464s() {
        b bVar = b.SHOULD_NOT_EXECUTE;
        if (m15141a(bVar)) {
            this.f22349m = bVar;
        }
    }

    /* renamed from: t */
    public abstract void mo14465t();

    /* renamed from: u */
    public final boolean m15162u() {
        b bVar = b.PENDING;
        if (!m15141a(bVar)) {
            return false;
        }
        boolean zMo15163v = mo15163v();
        this.f22349m = bVar;
        return zMo15163v;
    }

    /* renamed from: v */
    public boolean mo15163v() {
        return true;
    }

    /* renamed from: w */
    public void mo15164w() {
        b bVar = b.FINISHED;
        if (m15141a(bVar)) {
            b bVar2 = this.f22349m;
            if (bVar2 == b.SUCCESS) {
                mo14465t();
            } else if (bVar2 == b.FAILED || bVar2 == b.SHOULD_NOT_EXECUTE) {
                mo14466y();
            }
            this.f22349m = bVar;
        }
    }

    /* renamed from: x */
    public void mo15165x() {
        b bVar = b.REMOVED;
        if (m15141a(bVar)) {
            this.f22349m = bVar;
        }
    }

    /* renamed from: y */
    public void mo14466y() {
    }

    /* renamed from: z */
    public boolean mo14467z() {
        return false;
    }

    /* renamed from: a */
    public void mo15147a(byte[] bArr) {
        this.f22338b = 2;
        this.f22340d = bArr;
    }

    /* renamed from: a */
    public void m15142a(int i) {
        this.f22341e = i;
    }

    /* renamed from: a */
    public String mo14457a() {
        return getClass().getName();
    }

    /* renamed from: a */
    public void m15146a(List<String> list) {
        this.f22345i = list;
    }

    /* renamed from: a */
    public void m15144a(String str, String... strArr) {
        this.f22339c.put(str, Arrays.asList(strArr));
    }

    /* renamed from: a */
    public void m15143a(long j) {
        this.f22347k = Long.valueOf(j);
        this.f22348l = Integer.valueOf(C3323i.m16058a(TimeUnit.MILLISECONDS.toSeconds(j)));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:129:0x008a  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean m15141a(com.yandex.metrica.impl.p022ob.AbstractC2942T1.b... r8) {
        /*
            r7 = this;
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            com.yandex.metrica.impl.ob.T1$b r1 = r7.f22349m
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
            com.yandex.metrica.impl.ob.T1$b r5 = com.yandex.metrica.impl.p022ob.AbstractC2942T1.b.EMPTY
            if (r1 != r5) goto L1d
            goto L8a
        L1d:
            com.yandex.metrica.impl.ob.T1$b r5 = com.yandex.metrica.impl.p022ob.AbstractC2942T1.b.REMOVED
            if (r1 == r5) goto L22
            goto L23
        L22:
            r6 = r3
        L23:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r6)
            goto L8b
        L29:
            com.yandex.metrica.impl.ob.T1$b r5 = com.yandex.metrica.impl.p022ob.AbstractC2942T1.b.SUCCESS
            if (r1 == r5) goto L49
            com.yandex.metrica.impl.ob.T1$b r5 = com.yandex.metrica.impl.p022ob.AbstractC2942T1.b.FAILED
            if (r1 == r5) goto L49
            com.yandex.metrica.impl.ob.T1$b r5 = com.yandex.metrica.impl.p022ob.AbstractC2942T1.b.SHOULD_NOT_EXECUTE
            if (r1 == r5) goto L49
            com.yandex.metrica.impl.ob.T1$b r5 = com.yandex.metrica.impl.p022ob.AbstractC2942T1.b.PENDING
            if (r1 == r5) goto L49
            com.yandex.metrica.impl.ob.T1$b r5 = com.yandex.metrica.impl.p022ob.AbstractC2942T1.b.PREPARING
            if (r1 == r5) goto L49
            com.yandex.metrica.impl.ob.T1$b r5 = com.yandex.metrica.impl.p022ob.AbstractC2942T1.b.EXECUTING
            if (r1 != r5) goto L42
            goto L49
        L42:
            com.yandex.metrica.impl.ob.T1$b r5 = com.yandex.metrica.impl.p022ob.AbstractC2942T1.b.REMOVED
            if (r1 != r5) goto L8a
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            goto L8b
        L49:
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            goto L8b
        L4c:
            com.yandex.metrica.impl.ob.T1$b r5 = com.yandex.metrica.impl.p022ob.AbstractC2942T1.b.EXECUTING
            if (r1 != r5) goto L53
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            goto L8b
        L53:
            com.yandex.metrica.impl.ob.T1$b r5 = com.yandex.metrica.impl.p022ob.AbstractC2942T1.b.REMOVED
            if (r1 != r5) goto L8a
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            goto L8b
        L5a:
            com.yandex.metrica.impl.ob.T1$b r5 = com.yandex.metrica.impl.p022ob.AbstractC2942T1.b.PREPARING
            if (r1 == r5) goto L6e
            com.yandex.metrica.impl.ob.T1$b r5 = com.yandex.metrica.impl.p022ob.AbstractC2942T1.b.SUCCESS
            if (r1 == r5) goto L6e
            com.yandex.metrica.impl.ob.T1$b r5 = com.yandex.metrica.impl.p022ob.AbstractC2942T1.b.FAILED
            if (r1 != r5) goto L67
            goto L6e
        L67:
            com.yandex.metrica.impl.ob.T1$b r5 = com.yandex.metrica.impl.p022ob.AbstractC2942T1.b.REMOVED
            if (r1 != r5) goto L8a
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            goto L8b
        L6e:
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            goto L8b
        L71:
            com.yandex.metrica.impl.ob.T1$b r5 = com.yandex.metrica.impl.p022ob.AbstractC2942T1.b.PENDING
            if (r1 != r5) goto L78
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            goto L8b
        L78:
            com.yandex.metrica.impl.ob.T1$b r5 = com.yandex.metrica.impl.p022ob.AbstractC2942T1.b.REMOVED
            if (r1 != r5) goto L8a
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            goto L8b
        L7f:
            com.yandex.metrica.impl.ob.T1$b r5 = com.yandex.metrica.impl.p022ob.AbstractC2942T1.b.EMPTY
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
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p022ob.AbstractC2942T1.m15141a(com.yandex.metrica.impl.ob.T1$b[]):boolean");
    }
}
