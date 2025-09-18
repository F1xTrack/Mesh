package com.yandex.metrica.impl.ob;

/* renamed from: com.yandex.metrica.impl.ob.r6, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3044r6 {
    private final EnumC3249z6 a;
    private final Long b;
    private final Long c;
    private final Integer d;
    private final Long e;
    private final Boolean f;
    private final Long g;
    private final Long h;

    /* renamed from: com.yandex.metrica.impl.ob.r6$b */
    public static final class b {
        public Long a;
        private EnumC3249z6 b;
        private Long c;
        private Long d;
        private Integer e;
        private Long f;
        private Boolean g;
        private Long h;

        private b(C3094t6 c3094t6) {
            this.b = c3094t6.b();
            this.e = c3094t6.a();
        }

        public b a(Long l) {
            this.d = l;
            return this;
        }

        public b b(Long l) {
            this.f = l;
            return this;
        }

        public b c(Long l) {
            this.c = l;
            return this;
        }

        public b d(Long l) {
            this.h = l;
            return this;
        }

        public b a(Boolean bool) {
            this.g = bool;
            return this;
        }
    }

    public EnumC3249z6 a() {
        return this.a;
    }

    public long b(long j) {
        Long l = this.e;
        return l == null ? j : l.longValue();
    }

    public long c(long j) {
        Long l = this.b;
        return l == null ? j : l.longValue();
    }

    public long d(long j) {
        Long l = this.h;
        return l == null ? j : l.longValue();
    }

    public long e(long j) {
        Long l = this.g;
        return l == null ? j : l.longValue();
    }

    private C3044r6(b bVar) {
        this.a = bVar.b;
        this.d = bVar.e;
        this.b = bVar.c;
        this.c = bVar.d;
        this.e = bVar.f;
        this.f = bVar.g;
        this.g = bVar.h;
        this.h = bVar.a;
    }

    public long a(long j) {
        Long l = this.c;
        return l == null ? j : l.longValue();
    }

    public int a(int i) {
        Integer num = this.d;
        return num == null ? i : num.intValue();
    }

    public boolean a(boolean z) {
        Boolean bool = this.f;
        return bool == null ? z : bool.booleanValue();
    }
}
