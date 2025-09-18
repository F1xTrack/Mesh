package com.p018my.tracker.obfuscated;

import com.p018my.tracker.obfuscated.C2310e1;
import com.p018my.tracker.obfuscated.InterfaceC2292a2;

/* renamed from: com.my.tracker.obfuscated.b2 */
/* loaded from: classes2.dex */
final class C2297b2 implements InterfaceC2292a2 {

    /* renamed from: a */
    private final C2310e1 f19767a;

    /* renamed from: b */
    private final String f19768b;

    /* renamed from: com.my.tracker.obfuscated.b2$a */
    public static final class a implements InterfaceC2292a2.a {

        /* renamed from: a */
        private final C2310e1 f19769a;

        /* renamed from: b */
        private final C2310e1.f f19770b;

        public a(C2310e1 c2310e1, C2310e1.f fVar) {
            this.f19769a = c2310e1;
            this.f19770b = fVar;
        }

        @Override // com.p018my.tracker.obfuscated.InterfaceC2292a2.a
        /* renamed from: a */
        public long mo12775a() {
            return this.f19770b.m12946a();
        }

        @Override // com.p018my.tracker.obfuscated.InterfaceC2292a2.a
        /* renamed from: b */
        public boolean mo12776b() {
            return this.f19770b.m12930b();
        }

        @Override // com.p018my.tracker.obfuscated.InterfaceC2292a2.a
        /* renamed from: c */
        public long mo12777c() {
            return this.f19770b.m12947c();
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f19770b.close();
        }

        @Override // com.p018my.tracker.obfuscated.InterfaceC2292a2.a
        /* renamed from: d */
        public InterfaceC2292a2.b mo12778d() {
            return new b(this.f19769a.m12924h(this.f19770b.m12946a()));
        }

        @Override // com.p018my.tracker.obfuscated.InterfaceC2292a2.a
        /* renamed from: k */
        public String mo12779k() {
            return this.f19770b.m12948k();
        }
    }

    /* renamed from: com.my.tracker.obfuscated.b2$b */
    public static final class b implements InterfaceC2292a2.b {

        /* renamed from: a */
        private final C2310e1.g f19771a;

        public b(C2310e1.g gVar) {
            this.f19771a = gVar;
        }

        @Override // com.p018my.tracker.obfuscated.InterfaceC2292a2.b
        /* renamed from: b */
        public boolean mo12780b() {
            return this.f19771a.m12930b();
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f19771a.close();
        }

        @Override // com.p018my.tracker.obfuscated.InterfaceC2292a2.b
        /* renamed from: f */
        public boolean mo12781f() {
            return this.f19771a.m12952o();
        }

        @Override // com.p018my.tracker.obfuscated.InterfaceC2292a2.b
        /* renamed from: h */
        public long mo12782h() {
            return this.f19771a.m12951n();
        }

        @Override // com.p018my.tracker.obfuscated.InterfaceC2292a2.b
        /* renamed from: j */
        public long mo12783j() {
            return this.f19771a.m12950m();
        }
    }

    public C2297b2(C2310e1 c2310e1, String str) {
        this.f19767a = c2310e1;
        this.f19768b = str;
    }

    @Override // com.p018my.tracker.obfuscated.InterfaceC2292a2
    /* renamed from: a */
    public InterfaceC2292a2.a mo12774a() {
        C2310e1 c2310e1 = this.f19767a;
        return new a(c2310e1, c2310e1.m12899a(this.f19768b));
    }
}
