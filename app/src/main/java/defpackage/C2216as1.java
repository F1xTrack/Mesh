package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.android.billingclient.api.BillingClient;
import com.vk.push.common.AppInfo;
import com.vk.push.common.Logger;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: as1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2216as1 implements InterfaceC1317Qq1, InterfaceC7910x3, InterfaceC5680lM1 {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object d;

    public /* synthetic */ C2216as1(int i) {
        this.a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0066 A[Catch: all -> 0x000d, TryCatch #0 {all -> 0x000d, blocks: (B:4:0x000a, B:21:0x006a, B:24:0x008e, B:13:0x0022, B:15:0x004c, B:17:0x0057, B:19:0x0062, B:20:0x0066), top: B:29:0x000a }] */
    /* JADX WARN: Type inference failed for: r8v8, types: [java.lang.String] */
    @Override // defpackage.InterfaceC5680lM1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(java.lang.String r5, int r6, java.io.IOException r7, byte[] r8, java.util.Map r9) {
        /*
            r4 = this;
            java.lang.Object r5 = r4.d
            lY1 r5 = (defpackage.C5716lY1) r5
            defpackage.RI1.p(r5)
            r9 = 0
            if (r8 != 0) goto L10
            byte[] r8 = new byte[r9]     // Catch: java.lang.Throwable -> Ld
            goto L10
        Ld:
            r6 = move-exception
            goto La8
        L10:
            java.lang.Object r0 = r4.c
            ZY1 r0 = (defpackage.ZY1) r0
            r1 = 200(0xc8, float:2.8E-43)
            java.lang.Object r2 = r4.b
            java.lang.String r2 = (java.lang.String) r2
            if (r6 == r1) goto L20
            r1 = 204(0xcc, float:2.86E-43)
            if (r6 != r1) goto L6a
        L20:
            if (r7 != 0) goto L6a
            Uz1 r7 = r5.c     // Catch: java.lang.Throwable -> Ld
            defpackage.C5716lY1.w(r7)     // Catch: java.lang.Throwable -> Ld
            long r0 = r0.a     // Catch: java.lang.Throwable -> Ld
            java.lang.Long r8 = java.lang.Long.valueOf(r0)     // Catch: java.lang.Throwable -> Ld
            r7.S1(r8)     // Catch: java.lang.Throwable -> Ld
            OL1 r7 = r5.n()     // Catch: java.lang.Throwable -> Ld
            rx r7 = r7.o     // Catch: java.lang.Throwable -> Ld
            java.lang.String r8 = "Successfully uploaded batch from upload queue. appId, status"
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> Ld
            r7.b(r2, r6, r8)     // Catch: java.lang.Throwable -> Ld
            Py1 r6 = r5.U()     // Catch: java.lang.Throwable -> Ld
            GJ1 r7 = defpackage.IB1.I0     // Catch: java.lang.Throwable -> Ld
            r8 = 0
            boolean r6 = r6.E1(r8, r7)     // Catch: java.lang.Throwable -> Ld
            if (r6 == 0) goto L66
            rM1 r6 = r5.b     // Catch: java.lang.Throwable -> Ld
            defpackage.C5716lY1.w(r6)     // Catch: java.lang.Throwable -> Ld
            boolean r6 = r6.E1()     // Catch: java.lang.Throwable -> Ld
            if (r6 == 0) goto L66
            Uz1 r6 = r5.c     // Catch: java.lang.Throwable -> Ld
            defpackage.C5716lY1.w(r6)     // Catch: java.lang.Throwable -> Ld
            boolean r6 = r6.I2(r2)     // Catch: java.lang.Throwable -> Ld
            if (r6 == 0) goto L66
            r5.V(r2)     // Catch: java.lang.Throwable -> Ld
            goto La2
        L66:
            r5.H()     // Catch: java.lang.Throwable -> Ld
            goto La2
        L6a:
            java.lang.String r1 = new java.lang.String     // Catch: java.lang.Throwable -> Ld
            java.nio.charset.Charset r3 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.Throwable -> Ld
            r1.<init>(r8, r3)     // Catch: java.lang.Throwable -> Ld
            int r8 = r1.length()     // Catch: java.lang.Throwable -> Ld
            r3 = 32
            int r8 = java.lang.Math.min(r3, r8)     // Catch: java.lang.Throwable -> Ld
            java.lang.String r8 = r1.substring(r9, r8)     // Catch: java.lang.Throwable -> Ld
            OL1 r1 = r5.n()     // Catch: java.lang.Throwable -> Ld
            rx r1 = r1.l     // Catch: java.lang.Throwable -> Ld
            java.lang.String r3 = "Network upload failed. Will retry later. appId, status, error"
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> Ld
            if (r7 != 0) goto L8e
            r7 = r8
        L8e:
            r1.e(r3, r2, r6, r7)     // Catch: java.lang.Throwable -> Ld
            Uz1 r6 = r5.c     // Catch: java.lang.Throwable -> Ld
            defpackage.C5716lY1.w(r6)     // Catch: java.lang.Throwable -> Ld
            long r7 = r0.a     // Catch: java.lang.Throwable -> Ld
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch: java.lang.Throwable -> Ld
            r6.o2(r7)     // Catch: java.lang.Throwable -> Ld
            r5.H()     // Catch: java.lang.Throwable -> Ld
        La2:
            r5.u = r9
            r5.E()
            return
        La8:
            r5.u = r9
            r5.E()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2216as1.a(java.lang.String, int, java.io.IOException, byte[], java.util.Map):void");
    }

    public void b(Object obj) {
        HashSet hashSet = (HashSet) this.d;
        hashSet.remove(obj);
        if (hashSet.size() == 0) {
            ((Handler) this.b).post(new C5550kh(5, this));
        }
    }

    @Override // defpackage.InterfaceC7910x3
    public String c(String str) throws JSONException {
        X11 x11;
        X11 x112 = (X11) this.d;
        String str2 = (String) this.c;
        Context context = (Context) this.b;
        if (x112 == null) {
            String strA = E12.a(context, str2, "agc_plugin_", "crypto_component");
            if (strA != null) {
                try {
                    JSONObject jSONObject = new JSONObject(new String(AbstractC2252b30.a(strA), "utf-8"));
                    x11 = new X11(new C6928rv(jSONObject.getString("rx"), jSONObject.getString("ry"), jSONObject.getString("rz"), jSONObject.getString("salt"), jSONObject.getString("algorithm"), jSONObject.getInt("iterationCount")));
                } catch (UnsupportedEncodingException | IllegalArgumentException | JSONException e) {
                    e.getMessage();
                }
                this.d = x11;
            } else {
                x11 = null;
                this.d = x11;
            }
        }
        if (((X11) this.d) == null) {
            this.d = new X11(new C6928rv(E12.a(context, str2, "agc_", "/AD91D45E3E72DB6989DDCB13287E75061FABCB933D886E6C6ABEF0939B577138"), E12.a(context, str2, "agc_", "/B314B3BF013DF5AC4134E880AF3D2B7C9FFBE8F0305EAC1C898145E2BCF1F21C"), E12.a(context, str2, "agc_", "/C767BD8FDF53E53D059BE95B09E2A71056F5F180AECC62836B287ACA5793421B"), E12.a(context, str2, "agc_", "/DCB3E6D4C2CF80F30D89CDBC412C964DA8381BB84668769391FBCC3E329AD0FD"), "PBKDF2WithHmacSHA1", 5000));
        }
        return ((X11) this.d).o(E12.a(context, str2, "agc_plugin_", str));
    }

    public Object clone() {
        switch (this.a) {
            case 3:
                C4254hy1 c4254hy1 = (C4254hy1) ((C4254hy1) this.b).clone();
                C2216as1 c2216as1 = new C2216as1(3);
                c2216as1.b = c4254hy1;
                c2216as1.c = (C4254hy1) c4254hy1.clone();
                c2216as1.d = new ArrayList();
                Iterator it = ((ArrayList) this.d).iterator();
                while (it.hasNext()) {
                    ((ArrayList) c2216as1.d).add((C4254hy1) ((C4254hy1) it.next()).clone());
                }
                return c2216as1;
            default:
                return super.clone();
        }
    }

    @Override // defpackage.InterfaceC1317Qq1
    public C1239Pq1 d(AppInfo appInfo, S51 s51) {
        List listE = AbstractC8259yu.e(appInfo);
        C5782lu1 c5782lu1 = new C5782lu1((String) this.c, (Context) this.b, listE, (Logger) this.d, s51);
        Context context = c5782lu1.getContext();
        List<AppInfo> preferredHosts = c5782lu1.getPreferredHosts();
        Logger logger = c5782lu1.getLogger();
        O90.f(context, "context");
        O90.f(preferredHosts, "preferredHosts");
        O90.f(logger, "logger");
        S51 s512 = c5782lu1.n;
        O90.f(s512, "onNoHostToBind");
        return new C1239Pq1(new C6352ot1(c5782lu1, new C1086Nr1(context, preferredHosts, logger, s512)), new C6845rT0(c5782lu1), c5782lu1);
    }

    public byte[] e(C3961gQ1 c3961gQ1) {
        C3303cz1 c3303cz1;
        InterfaceC1802Ww0 interfaceC1802Ww0;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            HashMap map = (HashMap) this.b;
            c3303cz1 = new C3303cz1(byteArrayOutputStream, map, (HashMap) this.c, (C1731Vy1) this.d);
            interfaceC1802Ww0 = (InterfaceC1802Ww0) map.get(C3961gQ1.class);
        } catch (IOException unused) {
        }
        if (interfaceC1802Ww0 == null) {
            throw new C8163yO("No encoder for ".concat(String.valueOf(C3961gQ1.class)));
        }
        interfaceC1802Ww0.a(c3961gQ1, c3303cz1);
        return byteArrayOutputStream.toByteArray();
    }

    public C2216as1(Context context, String str) {
        this.a = 2;
        this.b = context;
        this.c = str;
    }

    public C2216as1(HashMap map, HashMap map2, C1731Vy1 c1731Vy1) {
        this.a = 4;
        this.b = map;
        this.c = map2;
        this.d = c1731Vy1;
    }

    public C2216as1(Context context, String str, Logger logger) {
        this.a = 1;
        O90.f(logger, "logger");
        this.b = context;
        this.c = str;
        this.d = logger;
    }

    public C2216as1(BillingClient billingClient) {
        this.a = 0;
        Handler handler = new Handler(Looper.getMainLooper());
        this.c = billingClient;
        this.d = new HashSet();
        this.b = handler;
    }

    public C2216as1(C5716lY1 c5716lY1, String str, ZY1 zy1) {
        this.a = 6;
        this.b = str;
        this.c = zy1;
        this.d = c5716lY1;
    }
}
