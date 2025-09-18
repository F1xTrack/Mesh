package com.p018my.tracker.obfuscated;

import android.content.Context;
import com.p018my.tracker.obfuscated.C2335k2;
import io.sentry.react.C6119c;
import java.util.ArrayList;
import java.util.Objects;
import p000.AbstractC7222ym;
import p000.C8749ad1;

/* renamed from: com.my.tracker.obfuscated.q2 */
/* loaded from: classes2.dex */
public final class C2359q2 implements InterfaceC2355p2 {

    /* renamed from: a */
    final int f20104a;

    /* renamed from: b */
    InterfaceC2302c2 f20105b;

    /* renamed from: c */
    C2335k2 f20106c = null;

    /* renamed from: d */
    int f20107d = Integer.MIN_VALUE;

    private C2359q2(int i, InterfaceC2302c2 interfaceC2302c2) {
        this.f20104a = i;
        this.f20105b = interfaceC2302c2;
        AbstractC2391y2.m13568a("TimeSpentRepository: repository created but not initialized. Will initialized when first timespent tick will arrive");
    }

    /* renamed from: c */
    private boolean m13453c() {
        return this.f20106c != null && this.f20107d >= 0;
    }

    /* renamed from: d */
    public static /* synthetic */ C2335k2 m13454d() {
        return null;
    }

    @Override // com.p018my.tracker.obfuscated.InterfaceC2355p2
    /* renamed from: a */
    public synchronized void mo13391a(long[] jArr) {
        try {
            C2335k2 c2335k2 = this.f20106c;
            Objects.requireNonNull(c2335k2);
            c2335k2.m13280a(jArr);
        } catch (Exception unused) {
            String str = "TimeSpentRepository: something went wrong while deleting " + jArr.length + " packets from db";
            AbstractC2391y2.m13572b(str);
            throw new Exception(str);
        }
    }

    /* renamed from: b */
    public void m13457b() throws Exception {
        if (m13453c()) {
            return;
        }
        AbstractC2391y2.m13568a("TimeSpentRepository: initializing repository...");
        try {
            C2335k2 c2335k2 = (C2335k2) this.f20105b.mo9774a();
            this.f20106c = c2335k2;
            this.f20107d = c2335k2.m13276a();
            this.f20105b = new C8749ad1(8);
            AbstractC2391y2.m13568a("TimeSpentRepository: successfully initialized, current size = " + this.f20107d + ", max size = " + this.f20104a);
        } catch (Exception e) {
            AbstractC2391y2.m13573b("TimeSpentRepository: error occured while initialization repository, repository not initialized", e);
            this.f20106c = null;
            this.f20107d = Integer.MIN_VALUE;
            throw e;
        }
    }

    /* renamed from: a */
    private void m13452a() throws Exception {
        int i = (this.f20107d - this.f20104a) + 1;
        try {
            C2335k2 c2335k2 = this.f20106c;
            Objects.requireNonNull(c2335k2);
            int iM13277a = c2335k2.m13277a(i);
            this.f20107d -= iM13277a;
            AbstractC2391y2.m13568a("TimeSpentRepository: successfully deleted " + iM13277a + "(requested = " + i + ") oldest tick packets from db, currentDbSize = " + this.f20107d + " (reason: need free up space for new packet)");
        } catch (Exception e) {
            StringBuilder sbM26237n = AbstractC7222ym.m26237n(i, "TimeSpentRepository: something went wrong while trying to delete oldest", " tick packets from db (reason: need free up space for new packet, maxSize = ");
            sbM26237n.append(this.f20104a);
            sbM26237n.append(", current size = ");
            sbM26237n.append(this.f20107d);
            sbM26237n.append("), can't store new tick packet");
            AbstractC2391y2.m13573b(sbM26237n.toString(), e);
            throw new Exception(e);
        }
    }

    @Override // com.p018my.tracker.obfuscated.InterfaceC2355p2
    /* renamed from: a */
    public synchronized C2371t2[] mo13392a(int i) {
        C2371t2[] c2371t2Arr;
        try {
            C2335k2 c2335k2 = this.f20106c;
            Objects.requireNonNull(c2335k2);
            C2335k2.b bVarM13281b = c2335k2.m13281b(i);
            try {
                ArrayList arrayList = new ArrayList(i);
                while (bVarM13281b.m13282b()) {
                    arrayList.add(new C2371t2(bVarM13281b.m13284n(), bVarM13281b.m13283m()));
                }
                AbstractC2391y2.m13568a("TimeSpentRepository: read " + arrayList.size() + " freshest packets from db");
                c2371t2Arr = arrayList.isEmpty() ? null : (C2371t2[]) arrayList.toArray(new C2371t2[0]);
                bVarM13281b.close();
            } finally {
            }
        } catch (Throwable th) {
            AbstractC2391y2.m13573b("TimeSpentRepository: error while reading " + i + " freshest tick packets", th);
            return null;
        }
        return c2371t2Arr;
    }

    /* renamed from: a */
    public static /* synthetic */ C2335k2 m13450a(String str, Context context) {
        try {
            return C2335k2.m13275a(str, context);
        } catch (Exception e) {
            AbstractC2391y2.m13573b("TimeSpentRepository: can't initialize sql database", e);
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public static C2359q2 m13451a(int i, C2395z2 c2395z2, Context context) {
        return new C2359q2(i, new C6119c(context, c2395z2.m13607g()));
    }

    @Override // com.p018my.tracker.obfuscated.InterfaceC2355p2
    /* renamed from: a */
    public synchronized void mo13390a(long j, byte[] bArr) {
        try {
            if (!m13453c()) {
                m13457b();
            }
            if (this.f20107d >= this.f20104a) {
                try {
                    m13452a();
                } catch (Exception e) {
                    AbstractC2391y2.m13572b("TimeSpentRepository: free up database failed, can't put new TimeSpentTick (reason: db still full)");
                    throw new Exception(e);
                }
            }
            try {
                long jM13279a = this.f20106c.m13279a(j, bArr);
                this.f20107d++;
                AbstractC2391y2.m13568a("TimeSpentRepository: successfully stored new tick packet to db, tickPacketId = " + jM13279a + " (current db size = " + this.f20107d + ")");
            } catch (Exception e2) {
                AbstractC2391y2.m13572b("TimeSpentRepository: something went wrong while saving new tick packet in database, this tick wouldn't be stored");
                throw new Exception(e2);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
