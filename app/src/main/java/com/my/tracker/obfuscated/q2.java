package com.my.tracker.obfuscated;

import android.content.Context;
import com.my.tracker.obfuscated.k2;
import defpackage.AbstractC8235ym;
import defpackage.C2171ad1;
import java.util.ArrayList;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class q2 implements p2 {
    final int a;
    c2 b;
    k2 c = null;
    int d = Integer.MIN_VALUE;

    private q2(int i, c2 c2Var) {
        this.a = i;
        this.b = c2Var;
        y2.a("TimeSpentRepository: repository created but not initialized. Will initialized when first timespent tick will arrive");
    }

    private boolean c() {
        return this.c != null && this.d >= 0;
    }

    public static /* synthetic */ k2 d() {
        return null;
    }

    @Override // com.my.tracker.obfuscated.p2
    public synchronized void a(long[] jArr) {
        try {
            k2 k2Var = this.c;
            Objects.requireNonNull(k2Var);
            k2Var.a(jArr);
        } catch (Exception unused) {
            String str = "TimeSpentRepository: something went wrong while deleting " + jArr.length + " packets from db";
            y2.b(str);
            throw new Exception(str);
        }
    }

    public void b() throws Exception {
        if (c()) {
            return;
        }
        y2.a("TimeSpentRepository: initializing repository...");
        try {
            k2 k2Var = (k2) this.b.a();
            this.c = k2Var;
            this.d = k2Var.a();
            this.b = new C2171ad1(8);
            y2.a("TimeSpentRepository: successfully initialized, current size = " + this.d + ", max size = " + this.a);
        } catch (Exception e) {
            y2.b("TimeSpentRepository: error occured while initialization repository, repository not initialized", e);
            this.c = null;
            this.d = Integer.MIN_VALUE;
            throw e;
        }
    }

    private void a() throws Exception {
        int i = (this.d - this.a) + 1;
        try {
            k2 k2Var = this.c;
            Objects.requireNonNull(k2Var);
            int iA = k2Var.a(i);
            this.d -= iA;
            y2.a("TimeSpentRepository: successfully deleted " + iA + "(requested = " + i + ") oldest tick packets from db, currentDbSize = " + this.d + " (reason: need free up space for new packet)");
        } catch (Exception e) {
            StringBuilder sbN = AbstractC8235ym.n(i, "TimeSpentRepository: something went wrong while trying to delete oldest", " tick packets from db (reason: need free up space for new packet, maxSize = ");
            sbN.append(this.a);
            sbN.append(", current size = ");
            sbN.append(this.d);
            sbN.append("), can't store new tick packet");
            y2.b(sbN.toString(), e);
            throw new Exception(e);
        }
    }

    @Override // com.my.tracker.obfuscated.p2
    public synchronized t2[] a(int i) {
        t2[] t2VarArr;
        try {
            k2 k2Var = this.c;
            Objects.requireNonNull(k2Var);
            k2.b bVarB = k2Var.b(i);
            try {
                ArrayList arrayList = new ArrayList(i);
                while (bVarB.b()) {
                    arrayList.add(new t2(bVarB.n(), bVarB.m()));
                }
                y2.a("TimeSpentRepository: read " + arrayList.size() + " freshest packets from db");
                t2VarArr = arrayList.isEmpty() ? null : (t2[]) arrayList.toArray(new t2[0]);
                bVarB.close();
            } finally {
            }
        } catch (Throwable th) {
            y2.b("TimeSpentRepository: error while reading " + i + " freshest tick packets", th);
            return null;
        }
        return t2VarArr;
    }

    public static /* synthetic */ k2 a(String str, Context context) {
        try {
            return k2.a(str, context);
        } catch (Exception e) {
            y2.b("TimeSpentRepository: can't initialize sql database", e);
            throw new RuntimeException(e);
        }
    }

    public static q2 a(int i, z2 z2Var, Context context) {
        return new q2(i, new io.sentry.react.c(context, z2Var.g()));
    }

    @Override // com.my.tracker.obfuscated.p2
    public synchronized void a(long j, byte[] bArr) {
        try {
            if (!c()) {
                b();
            }
            if (this.d >= this.a) {
                try {
                    a();
                } catch (Exception e) {
                    y2.b("TimeSpentRepository: free up database failed, can't put new TimeSpentTick (reason: db still full)");
                    throw new Exception(e);
                }
            }
            try {
                long jA = this.c.a(j, bArr);
                this.d++;
                y2.a("TimeSpentRepository: successfully stored new tick packet to db, tickPacketId = " + jA + " (current db size = " + this.d + ")");
            } catch (Exception e2) {
                y2.b("TimeSpentRepository: something went wrong while saving new tick packet in database, this tick wouldn't be stored");
                throw new Exception(e2);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
