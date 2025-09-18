package p000;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.android.billingclient.api.BillingClient;
import com.p019vk.push.common.AppInfo;
import com.p019vk.push.common.Logger;
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
public final class C8779as1 implements InterfaceC8179Qq1, InterfaceC7114x3, InterfaceC10128lM1 {

    /* renamed from: a */
    public final /* synthetic */ int f16639a;

    /* renamed from: b */
    public Object f16640b;

    /* renamed from: c */
    public Object f16641c;

    /* renamed from: d */
    public Object f16642d;

    public /* synthetic */ C8779as1(int i) {
        this.f16639a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0066 A[Catch: all -> 0x000d, TryCatch #0 {all -> 0x000d, blocks: (B:4:0x000a, B:21:0x006a, B:24:0x008e, B:13:0x0022, B:15:0x004c, B:17:0x0057, B:19:0x0062, B:20:0x0066), top: B:29:0x000a }] */
    /* JADX WARN: Type inference failed for: r8v8, types: [java.lang.String] */
    @Override // p000.InterfaceC10128lM1
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo4870a(java.lang.String r5, int r6, java.io.IOException r7, byte[] r8, java.util.Map r9) {
        /*
            r4 = this;
            java.lang.Object r5 = r4.f16642d
            lY1 r5 = (p000.C10152lY1) r5
            p000.RI1.m6952p(r5)
            r9 = 0
            if (r8 != 0) goto L10
            byte[] r8 = new byte[r9]     // Catch: java.lang.Throwable -> Ld
            goto L10
        Ld:
            r6 = move-exception
            goto La8
        L10:
            java.lang.Object r0 = r4.f16641c
            ZY1 r0 = (p000.ZY1) r0
            r1 = 200(0xc8, float:2.8E-43)
            java.lang.Object r2 = r4.f16640b
            java.lang.String r2 = (java.lang.String) r2
            if (r6 == r1) goto L20
            r1 = 204(0xcc, float:2.86E-43)
            if (r6 != r1) goto L6a
        L20:
            if (r7 != 0) goto L6a
            Uz1 r7 = r5.f37125c     // Catch: java.lang.Throwable -> Ld
            p000.C10152lY1.m22451w(r7)     // Catch: java.lang.Throwable -> Ld
            long r0 = r0.f14966a     // Catch: java.lang.Throwable -> Ld
            java.lang.Long r8 = java.lang.Long.valueOf(r0)     // Catch: java.lang.Throwable -> Ld
            r7.m8237S1(r8)     // Catch: java.lang.Throwable -> Ld
            OL1 r7 = r5.mo6070n()     // Catch: java.lang.Throwable -> Ld
            rx r7 = r7.f8386o     // Catch: java.lang.Throwable -> Ld
            java.lang.String r8 = "Successfully uploaded batch from upload queue. appId, status"
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> Ld
            r7.m24553b(r2, r6, r8)     // Catch: java.lang.Throwable -> Ld
            Py1 r6 = r5.m22472U()     // Catch: java.lang.Throwable -> Ld
            GJ1 r7 = p000.IB1.f4745I0     // Catch: java.lang.Throwable -> Ld
            r8 = 0
            boolean r6 = r6.m6511E1(r8, r7)     // Catch: java.lang.Throwable -> Ld
            if (r6 == 0) goto L66
            rM1 r6 = r5.f37124b     // Catch: java.lang.Throwable -> Ld
            p000.C10152lY1.m22451w(r6)     // Catch: java.lang.Throwable -> Ld
            boolean r6 = r6.m24323E1()     // Catch: java.lang.Throwable -> Ld
            if (r6 == 0) goto L66
            Uz1 r6 = r5.f37125c     // Catch: java.lang.Throwable -> Ld
            p000.C10152lY1.m22451w(r6)     // Catch: java.lang.Throwable -> Ld
            boolean r6 = r6.m8225I2(r2)     // Catch: java.lang.Throwable -> Ld
            if (r6 == 0) goto L66
            r5.m22473V(r2)     // Catch: java.lang.Throwable -> Ld
            goto La2
        L66:
            r5.m22459H()     // Catch: java.lang.Throwable -> Ld
            goto La2
        L6a:
            java.lang.String r1 = new java.lang.String     // Catch: java.lang.Throwable -> Ld
            java.nio.charset.Charset r3 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.Throwable -> Ld
            r1.<init>(r8, r3)     // Catch: java.lang.Throwable -> Ld
            int r8 = r1.length()     // Catch: java.lang.Throwable -> Ld
            r3 = 32
            int r8 = java.lang.Math.min(r3, r8)     // Catch: java.lang.Throwable -> Ld
            java.lang.String r8 = r1.substring(r9, r8)     // Catch: java.lang.Throwable -> Ld
            OL1 r1 = r5.mo6070n()     // Catch: java.lang.Throwable -> Ld
            rx r1 = r1.f8383l     // Catch: java.lang.Throwable -> Ld
            java.lang.String r3 = "Network upload failed. Will retry later. appId, status, error"
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> Ld
            if (r7 != 0) goto L8e
            r7 = r8
        L8e:
            r1.m24556e(r3, r2, r6, r7)     // Catch: java.lang.Throwable -> Ld
            Uz1 r6 = r5.f37125c     // Catch: java.lang.Throwable -> Ld
            p000.C10152lY1.m22451w(r6)     // Catch: java.lang.Throwable -> Ld
            long r7 = r0.f14966a     // Catch: java.lang.Throwable -> Ld
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch: java.lang.Throwable -> Ld
            r6.m8258o2(r7)     // Catch: java.lang.Throwable -> Ld
            r5.m22459H()     // Catch: java.lang.Throwable -> Ld
        La2:
            r5.f37143u = r9
            r5.m22456E()
            return
        La8:
            r5.f37143u = r9
            r5.m22456E()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C8779as1.mo4870a(java.lang.String, int, java.io.IOException, byte[], java.util.Map):void");
    }

    /* renamed from: b */
    public void m10355b(Object obj) {
        HashSet hashSet = (HashSet) this.f16642d;
        hashSet.remove(obj);
        if (hashSet.size() == 0) {
            ((Handler) this.f16640b).post(new C6316kh(5, this));
        }
    }

    @Override // p000.InterfaceC7114x3
    /* renamed from: c */
    public String mo886c(String str) throws JSONException {
        X11 x11;
        X11 x112 = (X11) this.f16642d;
        String str2 = (String) this.f16641c;
        Context context = (Context) this.f16640b;
        if (x112 == null) {
            String strM1983a = E12.m1983a(context, str2, "agc_plugin_", "crypto_component");
            if (strM1983a != null) {
                try {
                    JSONObject jSONObject = new JSONObject(new String(AbstractC8803b30.m10418a(strM1983a), "utf-8"));
                    x11 = new X11(new C6790rv(jSONObject.getString("rx"), jSONObject.getString("ry"), jSONObject.getString("rz"), jSONObject.getString("salt"), jSONObject.getString("algorithm"), jSONObject.getInt("iterationCount")));
                } catch (UnsupportedEncodingException | IllegalArgumentException | JSONException e) {
                    e.getMessage();
                }
                this.f16642d = x11;
            } else {
                x11 = null;
                this.f16642d = x11;
            }
        }
        if (((X11) this.f16642d) == null) {
            this.f16642d = new X11(new C6790rv(E12.m1983a(context, str2, "agc_", "/AD91D45E3E72DB6989DDCB13287E75061FABCB933D886E6C6ABEF0939B577138"), E12.m1983a(context, str2, "agc_", "/B314B3BF013DF5AC4134E880AF3D2B7C9FFBE8F0305EAC1C898145E2BCF1F21C"), E12.m1983a(context, str2, "agc_", "/C767BD8FDF53E53D059BE95B09E2A71056F5F180AECC62836B287ACA5793421B"), E12.m1983a(context, str2, "agc_", "/DCB3E6D4C2CF80F30D89CDBC412C964DA8381BB84668769391FBCC3E329AD0FD"), "PBKDF2WithHmacSHA1", 5000));
        }
        return ((X11) this.f16642d).m8920o(E12.m1983a(context, str2, "agc_plugin_", str));
    }

    public Object clone() {
        switch (this.f16639a) {
            case 3:
                C9692hy1 c9692hy1 = (C9692hy1) ((C9692hy1) this.f16640b).clone();
                C8779as1 c8779as1 = new C8779as1(3);
                c8779as1.f16640b = c9692hy1;
                c8779as1.f16641c = (C9692hy1) c9692hy1.clone();
                c8779as1.f16642d = new ArrayList();
                Iterator it = ((ArrayList) this.f16642d).iterator();
                while (it.hasNext()) {
                    ((ArrayList) c8779as1.f16642d).add((C9692hy1) ((C9692hy1) it.next()).clone());
                }
                return c8779as1;
            default:
                return super.clone();
        }
    }

    @Override // p000.InterfaceC8179Qq1
    /* renamed from: d */
    public C8127Pq1 mo887d(AppInfo appInfo, S51 s51) {
        List listM26274e = AbstractC7230yu.m26274e(appInfo);
        C10196lu1 c10196lu1 = new C10196lu1((String) this.f16641c, (Context) this.f16640b, listM26274e, (Logger) this.f16642d, s51);
        Context context = c10196lu1.getContext();
        List<AppInfo> preferredHosts = c10196lu1.getPreferredHosts();
        Logger logger = c10196lu1.getLogger();
        O90.m5968f(context, "context");
        O90.m5968f(preferredHosts, "preferredHosts");
        O90.m5968f(logger, "logger");
        S51 s512 = c10196lu1.f37355n;
        O90.m5968f(s512, "onNoHostToBind");
        return new C8127Pq1(new C10578ot1(c10196lu1, new C8025Nr1(context, preferredHosts, logger, s512)), new C10909rT0(c10196lu1), c10196lu1);
    }

    /* renamed from: e */
    public byte[] m10356e(C9496gQ1 c9496gQ1) {
        C9054cz1 c9054cz1;
        InterfaceC8502Ww0 interfaceC8502Ww0;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            HashMap map = (HashMap) this.f16640b;
            c9054cz1 = new C9054cz1(byteArrayOutputStream, map, (HashMap) this.f16641c, (C8455Vy1) this.f16642d);
            interfaceC8502Ww0 = (InterfaceC8502Ww0) map.get(C9496gQ1.class);
        } catch (IOException unused) {
        }
        if (interfaceC8502Ww0 == null) {
            throw new C7198yO("No encoder for ".concat(String.valueOf(C9496gQ1.class)));
        }
        interfaceC8502Ww0.mo104a(c9496gQ1, c9054cz1);
        return byteArrayOutputStream.toByteArray();
    }

    public C8779as1(Context context, String str) {
        this.f16639a = 2;
        this.f16640b = context;
        this.f16641c = str;
    }

    public C8779as1(HashMap map, HashMap map2, C8455Vy1 c8455Vy1) {
        this.f16639a = 4;
        this.f16640b = map;
        this.f16641c = map2;
        this.f16642d = c8455Vy1;
    }

    public C8779as1(Context context, String str, Logger logger) {
        this.f16639a = 1;
        O90.m5968f(logger, "logger");
        this.f16640b = context;
        this.f16641c = str;
        this.f16642d = logger;
    }

    public C8779as1(BillingClient billingClient) {
        this.f16639a = 0;
        Handler handler = new Handler(Looper.getMainLooper());
        this.f16641c = billingClient;
        this.f16642d = new HashSet();
        this.f16640b = handler;
    }

    public C8779as1(C10152lY1 c10152lY1, String str, ZY1 zy1) {
        this.f16639a = 6;
        this.f16640b = str;
        this.f16641c = zy1;
        this.f16642d = c10152lY1;
    }
}
