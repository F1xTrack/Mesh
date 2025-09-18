package com.p018my.tracker.obfuscated;

import com.p018my.tracker.obfuscated.C2310e1;
import com.p018my.tracker.obfuscated.InterfaceC2390y1;

/* renamed from: com.my.tracker.obfuscated.z1 */
/* loaded from: classes2.dex */
final class C2394z1 implements InterfaceC2390y1 {

    /* renamed from: a */
    private final C2310e1 f20170a;

    /* renamed from: com.my.tracker.obfuscated.z1$a */
    public static final class a implements InterfaceC2390y1.a {

        /* renamed from: a */
        private final C2310e1 f20171a;

        /* renamed from: b */
        private final C2310e1.c f20172b;

        public a(C2310e1 c2310e1, C2310e1.c cVar) {
            this.f20171a = c2310e1;
            this.f20172b = cVar;
        }

        @Override // com.p018my.tracker.obfuscated.InterfaceC2390y1.a
        /* renamed from: b */
        public boolean mo13561b() {
            return this.f20172b.m12930b();
        }

        @Override // com.p018my.tracker.obfuscated.InterfaceC2390y1.a
        /* renamed from: c */
        public long mo13562c() {
            return this.f20172b.m12938c();
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f20172b.close();
        }

        @Override // com.p018my.tracker.obfuscated.InterfaceC2390y1.a
        /* renamed from: d */
        public InterfaceC2390y1.b mo13563d() {
            return new b(this.f20171a.m12917e(this.f20172b.m12937a()));
        }

        @Override // com.p018my.tracker.obfuscated.InterfaceC2390y1.a
        /* renamed from: g */
        public long mo13564g() {
            return this.f20172b.m12939g();
        }

        @Override // com.p018my.tracker.obfuscated.InterfaceC2390y1.a
        /* renamed from: l */
        public byte[] mo13565l() {
            return this.f20172b.m12940l();
        }
    }

    /* renamed from: com.my.tracker.obfuscated.z1$b */
    public static final class b implements InterfaceC2390y1.b {

        /* renamed from: a */
        private final C2310e1.d f20173a;

        public b(C2310e1.d dVar) {
            this.f20173a = dVar;
        }

        @Override // com.p018my.tracker.obfuscated.InterfaceC2390y1.b
        /* renamed from: b */
        public boolean mo13566b() {
            return this.f20173a.m12930b();
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f20173a.close();
        }

        @Override // com.p018my.tracker.obfuscated.InterfaceC2390y1.b
        /* renamed from: e */
        public long mo13567e() {
            return this.f20173a.m12941e();
        }
    }

    public C2394z1(C2310e1 c2310e1) {
        this.f20170a = c2310e1;
    }

    @Override // com.p018my.tracker.obfuscated.InterfaceC2390y1
    /* renamed from: a */
    public InterfaceC2390y1.a mo13560a() {
        C2310e1 c2310e1 = this.f20170a;
        return new a(c2310e1, c2310e1.m12925i());
    }
}
