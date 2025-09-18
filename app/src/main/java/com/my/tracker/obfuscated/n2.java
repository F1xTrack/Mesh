package com.my.tracker.obfuscated;

import android.text.TextUtils;
import android.util.Base64;
import com.my.tracker.MyTrackerConfig;
import com.my.tracker.obfuscated.t0;
import defpackage.AbstractC8235ym;
import defpackage.N61;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes2.dex */
public final class n2 {
    final p2 a;
    final z2 b;
    final int c;

    public static class a implements t0.a {
        private final t2[] a;
        private long b;

        private a(t2[] t2VarArr) {
            this.a = t2VarArr;
        }

        public static a a(t2[] t2VarArr) {
            return new a(t2VarArr);
        }

        public t2[] b() {
            return this.a;
        }

        public String toString() {
            String strJoin = TextUtils.join(StringUtils.COMMA, this.a);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                a(byteArrayOutputStream);
            } catch (Exception unused) {
            }
            return "[ChunkProtobufPacket]\n| sendTimestamp = " + this.b + "\n| contain " + this.a.length + " packets: " + strJoin + "\n| content (base64): " + Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0) + "\n[/ChunkProtobufPacket]";
        }

        @Override // com.my.tracker.obfuscated.t0.a
        public void a(OutputStream outputStream) throws IOException {
            r rVar = new r(16384);
            r rVar2 = new r(16384);
            for (t2 t2Var : this.a) {
                rVar.a();
                rVar2.a();
                a(t2Var, rVar2);
                rVar.a(1, rVar2);
                rVar.a(outputStream);
            }
        }

        @Override // com.my.tracker.obfuscated.t0.a
        public String a() {
            return "application/octet-stream";
        }

        public void a(long j) {
            this.b = j;
        }

        private void a(t2 t2Var, r rVar) {
            try {
                rVar.b(t2Var.b());
                rVar.a(4, this.b);
            } catch (Exception unused) {
                y2.b("TimeSpentPacketSender: something went wrong while extracting protobuf data, return empty result");
            }
        }
    }

    private n2(int i, z2 z2Var, p2 p2Var) {
        this.c = i;
        this.a = p2Var;
        this.b = z2Var;
    }

    private a b() throws Exception {
        t2[] t2VarArrA = this.a.a(this.c);
        int length = t2VarArrA == null ? 0 : t2VarArrA.length;
        StringBuilder sbN = AbstractC8235ym.n(length, "TimeSpentPacketSender: got database chunk, size = ", ", requested = ");
        sbN.append(this.c);
        y2.a(sbN.toString());
        if (length != 0) {
            return a.a(t2VarArrA);
        }
        throw new Exception("database chunk is empty, nothing to send");
    }

    public void a(a aVar) {
        t2[] t2VarArrB = aVar.b();
        int length = t2VarArrB.length;
        long[] jArr = new long[length];
        for (int i = 0; i < t2VarArrB.length; i++) {
            jArr[i] = t2VarArrB[i].a();
        }
        this.a.a(jArr);
        y2.a("TimeSpentPacketSender: successfully deleted " + length + " packets from repository");
    }

    public void c() {
        y2.a("TimeSpentPacketSender: i'm notified about new packet");
        m.e(new N61(24, this));
    }

    public void a() {
        y2.a("TimeSpentPacketSender: start flushing database chunk...");
        try {
            a aVarB = b();
            b(aVarB);
            a(aVarB);
            y2.a("TimeSpentPacketSender: database chunk successfully flushed");
        } catch (Exception e) {
            y2.b("TimeSpentPacketSender: Something went wrong while flushing database chunk:\n" + e.getMessage());
        }
    }

    public static n2 a(int i, z2 z2Var, p2 p2Var) {
        return new n2(i, z2Var, p2Var);
    }

    public void b(a aVar) throws Exception {
        MyTrackerConfig.OkHttpClientProvider okHttpClientProviderN = this.b.n();
        String strP = this.b.p();
        aVar.a(System.currentTimeMillis());
        if (y2.a()) {
            y2.a("TimeSpentPacketSender: This packet will be sent now:\n" + aVar);
        }
        if (!t0.a(aVar, okHttpClientProviderN, true).a(strP).c()) {
            throw new Exception("packet didn't delivered to server");
        }
        y2.a("TimeSpentPacketSender: packet successfully delivered to server");
    }
}
