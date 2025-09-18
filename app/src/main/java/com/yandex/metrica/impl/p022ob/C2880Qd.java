package com.yandex.metrica.impl.p022ob;

/* renamed from: com.yandex.metrica.impl.ob.Qd */
/* loaded from: classes2.dex */
public class C2880Qd {

    /* renamed from: a */
    private final b f22011a;

    /* renamed from: com.yandex.metrica.impl.ob.Qd$a */
    public interface a {
        /* renamed from: a */
        void mo13863a();

        /* renamed from: a */
        void mo13864a(String str, byte[] bArr);

        /* renamed from: b */
        String mo13865b();

        /* renamed from: c */
        void mo13866c();
    }

    /* renamed from: com.yandex.metrica.impl.ob.Qd$b */
    public static class b {
    }

    public C2880Qd() {
        this(new b());
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:20:0x0062
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1178)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    /* JADX WARN: Path cross not found for [B:18:0x0062, B:10:0x0038], limit reached: 26 */
    /* renamed from: a */
    public void m14847a(java.lang.String r3, com.yandex.metrica.impl.p022ob.C2880Qd.a r4) {
        /*
            r2 = this;
            com.yandex.metrica.impl.ob.Qd$b r0 = r2.f22011a     // Catch: java.lang.Throwable -> L62
            java.lang.String r1 = r4.mo13865b()     // Catch: java.lang.Throwable -> L62
            r0.getClass()     // Catch: java.lang.Throwable -> L62
            com.yandex.metrica.impl.ob.P0 r0 = com.yandex.metrica.impl.p022ob.C2842P0.m14728i()     // Catch: java.lang.Throwable -> L35
            com.yandex.metrica.impl.ob.Zd r0 = r0.m14753x()     // Catch: java.lang.Throwable -> L35
            javax.net.ssl.HttpsURLConnection r3 = r0.m15540a(r3)     // Catch: java.lang.Throwable -> L35
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L35
            if (r0 != 0) goto L20
            java.lang.String r0 = "If-None-Match"
            r3.setRequestProperty(r0, r1)     // Catch: java.lang.Throwable -> L35
        L20:
            r0 = 1
            r3.setInstanceFollowRedirects(r0)     // Catch: java.lang.Throwable -> L35
            java.lang.String r0 = "GET"
            r3.setRequestMethod(r0)     // Catch: java.lang.Throwable -> L35
            int r0 = com.yandex.metrica.impl.p022ob.AbstractC3004Vd.a.f22536a     // Catch: java.lang.Throwable -> L35
            r3.setConnectTimeout(r0)     // Catch: java.lang.Throwable -> L35
            r3.setReadTimeout(r0)     // Catch: java.lang.Throwable -> L35
            r3.connect()     // Catch: java.lang.Throwable -> L35
            goto L36
        L35:
            r3 = 0
        L36:
            if (r3 == 0) goto L62
            int r0 = r3.getResponseCode()     // Catch: java.lang.Throwable -> L62
            r1 = 200(0xc8, float:2.8E-43)
            if (r0 == r1) goto L49
            r3 = 304(0x130, float:4.26E-43)
            if (r0 == r3) goto L45
            goto L62
        L45:
            r4.mo13863a()     // Catch: java.lang.Throwable -> L62
            goto L65
        L49:
            java.lang.String r0 = "ETag"
            java.lang.String r0 = r3.getHeaderField(r0)     // Catch: java.lang.Throwable -> L62
            java.lang.String r0 = com.yandex.metrica.impl.p022ob.C2819O2.m14688b(r0)     // Catch: java.lang.Throwable -> L62
            java.io.InputStream r3 = r3.getInputStream()
            r1 = 2147483647(0x7fffffff, float:NaN)
            byte[] r3 = com.yandex.metrica.impl.p022ob.C2991V0.m15297a(r3, r1)
            r4.mo13864a(r0, r3)
            goto L65
        L62:
            r4.mo13866c()
        L65:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p022ob.C2880Qd.m14847a(java.lang.String, com.yandex.metrica.impl.ob.Qd$a):void");
    }

    public C2880Qd(b bVar) {
        this.f22011a = bVar;
    }
}
