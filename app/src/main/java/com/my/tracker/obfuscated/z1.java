package com.my.tracker.obfuscated;

import com.my.tracker.obfuscated.e1;
import com.my.tracker.obfuscated.y1;

/* loaded from: classes2.dex */
final class z1 implements y1 {
    private final e1 a;

    public static final class a implements y1.a {
        private final e1 a;
        private final e1.c b;

        public a(e1 e1Var, e1.c cVar) {
            this.a = e1Var;
            this.b = cVar;
        }

        @Override // com.my.tracker.obfuscated.y1.a
        public boolean b() {
            return this.b.b();
        }

        @Override // com.my.tracker.obfuscated.y1.a
        public long c() {
            return this.b.c();
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.b.close();
        }

        @Override // com.my.tracker.obfuscated.y1.a
        public y1.b d() {
            return new b(this.a.e(this.b.a()));
        }

        @Override // com.my.tracker.obfuscated.y1.a
        public long g() {
            return this.b.g();
        }

        @Override // com.my.tracker.obfuscated.y1.a
        public byte[] l() {
            return this.b.l();
        }
    }

    public static final class b implements y1.b {
        private final e1.d a;

        public b(e1.d dVar) {
            this.a = dVar;
        }

        @Override // com.my.tracker.obfuscated.y1.b
        public boolean b() {
            return this.a.b();
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.a.close();
        }

        @Override // com.my.tracker.obfuscated.y1.b
        public long e() {
            return this.a.e();
        }
    }

    public z1(e1 e1Var) {
        this.a = e1Var;
    }

    @Override // com.my.tracker.obfuscated.y1
    public y1.a a() {
        e1 e1Var = this.a;
        return new a(e1Var, e1Var.i());
    }
}
