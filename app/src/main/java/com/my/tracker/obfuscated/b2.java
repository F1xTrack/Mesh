package com.my.tracker.obfuscated;

import com.my.tracker.obfuscated.a2;
import com.my.tracker.obfuscated.e1;

/* loaded from: classes2.dex */
final class b2 implements a2 {
    private final e1 a;
    private final String b;

    public static final class a implements a2.a {
        private final e1 a;
        private final e1.f b;

        public a(e1 e1Var, e1.f fVar) {
            this.a = e1Var;
            this.b = fVar;
        }

        @Override // com.my.tracker.obfuscated.a2.a
        public long a() {
            return this.b.a();
        }

        @Override // com.my.tracker.obfuscated.a2.a
        public boolean b() {
            return this.b.b();
        }

        @Override // com.my.tracker.obfuscated.a2.a
        public long c() {
            return this.b.c();
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.b.close();
        }

        @Override // com.my.tracker.obfuscated.a2.a
        public a2.b d() {
            return new b(this.a.h(this.b.a()));
        }

        @Override // com.my.tracker.obfuscated.a2.a
        public String k() {
            return this.b.k();
        }
    }

    public static final class b implements a2.b {
        private final e1.g a;

        public b(e1.g gVar) {
            this.a = gVar;
        }

        @Override // com.my.tracker.obfuscated.a2.b
        public boolean b() {
            return this.a.b();
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.a.close();
        }

        @Override // com.my.tracker.obfuscated.a2.b
        public boolean f() {
            return this.a.o();
        }

        @Override // com.my.tracker.obfuscated.a2.b
        public long h() {
            return this.a.n();
        }

        @Override // com.my.tracker.obfuscated.a2.b
        public long j() {
            return this.a.m();
        }
    }

    public b2(e1 e1Var, String str) {
        this.a = e1Var;
        this.b = str;
    }

    @Override // com.my.tracker.obfuscated.a2
    public a2.a a() {
        e1 e1Var = this.a;
        return new a(e1Var, e1Var.a(this.b));
    }
}
