package com.p018my.tracker.obfuscated;

import android.text.TextUtils;
import android.util.Base64;
import com.p018my.tracker.MyTrackerConfig;
import com.p018my.tracker.obfuscated.AbstractC2369t0;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import p000.AbstractC7222ym;
import p000.N61;

/* renamed from: com.my.tracker.obfuscated.n2 */
/* loaded from: classes2.dex */
public final class C2347n2 {

    /* renamed from: a */
    final InterfaceC2355p2 f20063a;

    /* renamed from: b */
    final C2395z2 f20064b;

    /* renamed from: c */
    final int f20065c;

    /* renamed from: com.my.tracker.obfuscated.n2$a */
    public static class a implements AbstractC2369t0.a {

        /* renamed from: a */
        private final C2371t2[] f20066a;

        /* renamed from: b */
        private long f20067b;

        private a(C2371t2[] c2371t2Arr) {
            this.f20066a = c2371t2Arr;
        }

        /* renamed from: a */
        public static a m13347a(C2371t2[] c2371t2Arr) {
            return new a(c2371t2Arr);
        }

        /* renamed from: b */
        public C2371t2[] m13352b() {
            return this.f20066a;
        }

        public String toString() {
            String strJoin = TextUtils.join(StringUtils.COMMA, this.f20066a);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                mo13351a(byteArrayOutputStream);
            } catch (Exception unused) {
            }
            return "[ChunkProtobufPacket]\n| sendTimestamp = " + this.f20067b + "\n| contain " + this.f20066a.length + " packets: " + strJoin + "\n| content (base64): " + Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0) + "\n[/ChunkProtobufPacket]";
        }

        @Override // com.p018my.tracker.obfuscated.AbstractC2369t0.a
        /* renamed from: a */
        public void mo13351a(OutputStream outputStream) throws IOException {
            C2360r c2360r = new C2360r(16384);
            C2360r c2360r2 = new C2360r(16384);
            for (C2371t2 c2371t2 : this.f20066a) {
                c2360r.m13458a();
                c2360r2.m13458a();
                m13348a(c2371t2, c2360r2);
                c2360r.m13486a(1, c2360r2);
                c2360r.m13459a(outputStream);
            }
        }

        @Override // com.p018my.tracker.obfuscated.AbstractC2369t0.a
        /* renamed from: a */
        public String mo13349a() {
            return "application/octet-stream";
        }

        /* renamed from: a */
        public void m13350a(long j) {
            this.f20067b = j;
        }

        /* renamed from: a */
        private void m13348a(C2371t2 c2371t2, C2360r c2360r) {
            try {
                c2360r.m13491b(c2371t2.m13511b());
                c2360r.m13485a(4, this.f20067b);
            } catch (Exception unused) {
                AbstractC2391y2.m13572b("TimeSpentPacketSender: something went wrong while extracting protobuf data, return empty result");
            }
        }
    }

    private C2347n2(int i, C2395z2 c2395z2, InterfaceC2355p2 interfaceC2355p2) {
        this.f20065c = i;
        this.f20063a = interfaceC2355p2;
        this.f20064b = c2395z2;
    }

    /* renamed from: b */
    private a m13342b() throws Exception {
        C2371t2[] c2371t2ArrMo13392a = this.f20063a.mo13392a(this.f20065c);
        int length = c2371t2ArrMo13392a == null ? 0 : c2371t2ArrMo13392a.length;
        StringBuilder sbM26237n = AbstractC7222ym.m26237n(length, "TimeSpentPacketSender: got database chunk, size = ", ", requested = ");
        sbM26237n.append(this.f20065c);
        AbstractC2391y2.m13568a(sbM26237n.toString());
        if (length != 0) {
            return a.m13347a(c2371t2ArrMo13392a);
        }
        throw new Exception("database chunk is empty, nothing to send");
    }

    /* renamed from: a */
    public void m13344a(a aVar) {
        C2371t2[] c2371t2ArrM13352b = aVar.m13352b();
        int length = c2371t2ArrM13352b.length;
        long[] jArr = new long[length];
        for (int i = 0; i < c2371t2ArrM13352b.length; i++) {
            jArr[i] = c2371t2ArrM13352b[i].m13510a();
        }
        this.f20063a.mo13391a(jArr);
        AbstractC2391y2.m13568a("TimeSpentPacketSender: successfully deleted " + length + " packets from repository");
    }

    /* renamed from: c */
    public void m13346c() {
        AbstractC2391y2.m13568a("TimeSpentPacketSender: i'm notified about new packet");
        AbstractC2340m.m13294e(new N61(24, this));
    }

    /* renamed from: a */
    public void m13343a() {
        AbstractC2391y2.m13568a("TimeSpentPacketSender: start flushing database chunk...");
        try {
            a aVarM13342b = m13342b();
            m13345b(aVarM13342b);
            m13344a(aVarM13342b);
            AbstractC2391y2.m13568a("TimeSpentPacketSender: database chunk successfully flushed");
        } catch (Exception e) {
            AbstractC2391y2.m13572b("TimeSpentPacketSender: Something went wrong while flushing database chunk:\n" + e.getMessage());
        }
    }

    /* renamed from: a */
    public static C2347n2 m13341a(int i, C2395z2 c2395z2, InterfaceC2355p2 interfaceC2355p2) {
        return new C2347n2(i, c2395z2, interfaceC2355p2);
    }

    /* renamed from: b */
    public void m13345b(a aVar) throws Exception {
        MyTrackerConfig.OkHttpClientProvider okHttpClientProviderM13614n = this.f20064b.m13614n();
        String strM13616p = this.f20064b.m13616p();
        aVar.m13350a(System.currentTimeMillis());
        if (AbstractC2391y2.m13571a()) {
            AbstractC2391y2.m13568a("TimeSpentPacketSender: This packet will be sent now:\n" + aVar);
        }
        if (!AbstractC2369t0.m13497a(aVar, okHttpClientProviderM13614n, true).mo13274a(strM13616p).m13502c()) {
            throw new Exception("packet didn't delivered to server");
        }
        AbstractC2391y2.m13568a("TimeSpentPacketSender: packet successfully delivered to server");
    }
}
