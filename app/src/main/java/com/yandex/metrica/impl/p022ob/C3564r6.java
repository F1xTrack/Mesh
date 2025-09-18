package com.yandex.metrica.impl.p022ob;

/* renamed from: com.yandex.metrica.impl.ob.r6 */
/* loaded from: classes2.dex */
public class C3564r6 {

    /* renamed from: a */
    private final EnumC3772z6 f24585a;

    /* renamed from: b */
    private final Long f24586b;

    /* renamed from: c */
    private final Long f24587c;

    /* renamed from: d */
    private final Integer f24588d;

    /* renamed from: e */
    private final Long f24589e;

    /* renamed from: f */
    private final Boolean f24590f;

    /* renamed from: g */
    private final Long f24591g;

    /* renamed from: h */
    private final Long f24592h;

    /* renamed from: com.yandex.metrica.impl.ob.r6$b */
    public static final class b {

        /* renamed from: a */
        public Long f24593a;

        /* renamed from: b */
        private EnumC3772z6 f24594b;

        /* renamed from: c */
        private Long f24595c;

        /* renamed from: d */
        private Long f24596d;

        /* renamed from: e */
        private Integer f24597e;

        /* renamed from: f */
        private Long f24598f;

        /* renamed from: g */
        private Boolean f24599g;

        /* renamed from: h */
        private Long f24600h;

        private b(C3616t6 c3616t6) {
            this.f24594b = c3616t6.m16810b();
            this.f24597e = c3616t6.m16809a();
        }

        /* renamed from: a */
        public b m16669a(Long l) {
            this.f24596d = l;
            return this;
        }

        /* renamed from: b */
        public b m16670b(Long l) {
            this.f24598f = l;
            return this;
        }

        /* renamed from: c */
        public b m16671c(Long l) {
            this.f24595c = l;
            return this;
        }

        /* renamed from: d */
        public b m16672d(Long l) {
            this.f24600h = l;
            return this;
        }

        /* renamed from: a */
        public b m16668a(Boolean bool) {
            this.f24599g = bool;
            return this;
        }
    }

    /* renamed from: a */
    public EnumC3772z6 m16655a() {
        return this.f24585a;
    }

    /* renamed from: b */
    public long m16657b(long j) {
        Long l = this.f24589e;
        return l == null ? j : l.longValue();
    }

    /* renamed from: c */
    public long m16658c(long j) {
        Long l = this.f24586b;
        return l == null ? j : l.longValue();
    }

    /* renamed from: d */
    public long m16659d(long j) {
        Long l = this.f24592h;
        return l == null ? j : l.longValue();
    }

    /* renamed from: e */
    public long m16660e(long j) {
        Long l = this.f24591g;
        return l == null ? j : l.longValue();
    }

    private C3564r6(b bVar) {
        this.f24585a = bVar.f24594b;
        this.f24588d = bVar.f24597e;
        this.f24586b = bVar.f24595c;
        this.f24587c = bVar.f24596d;
        this.f24589e = bVar.f24598f;
        this.f24590f = bVar.f24599g;
        this.f24591g = bVar.f24600h;
        this.f24592h = bVar.f24593a;
    }

    /* renamed from: a */
    public long m16654a(long j) {
        Long l = this.f24587c;
        return l == null ? j : l.longValue();
    }

    /* renamed from: a */
    public int m16653a(int i) {
        Integer num = this.f24588d;
        return num == null ? i : num.intValue();
    }

    /* renamed from: a */
    public boolean m16656a(boolean z) {
        Boolean bool = this.f24590f;
        return bool == null ? z : bool.booleanValue();
    }
}
