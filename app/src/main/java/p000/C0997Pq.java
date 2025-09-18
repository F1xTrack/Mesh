package p000;

import java.util.Collections;
import java.util.List;

/* renamed from: Pq */
/* loaded from: classes.dex */
public final class C0997Pq implements U51 {

    /* renamed from: a */
    public final List f9295a;

    public /* synthetic */ C0997Pq(List list) {
        this.f9295a = list;
    }

    /* renamed from: a */
    public AbstractC1259U0 m6434a(String str, boolean z, boolean z2, Character ch) throws C0226Da {
        AbstractC11489w02 c8629Zh1;
        if (str.length() == 0) {
            return new C1155SM(10, null);
        }
        char cM25358w = AbstractC11374v51.m25358w(str);
        if (cM25358w != '{') {
            if (cM25358w != '}') {
                switch (cM25358w) {
                    case '[':
                        if (ch == null || '\\' != ch.charValue()) {
                            return m6434a(AbstractC11374v51.m25354s(1, str), true, false, Character.valueOf(cM25358w));
                        }
                        break;
                    case '\\':
                        if (ch == null || '\\' != ch.charValue()) {
                            return m6434a(AbstractC11374v51.m25354s(1, str), z, z2, Character.valueOf(cM25358w));
                        }
                        break;
                    case ']':
                        if (ch == null || '\\' != ch.charValue()) {
                            return m6434a(AbstractC11374v51.m25354s(1, str), false, false, Character.valueOf(cM25358w));
                        }
                        break;
                }
            } else if (ch == null || '\\' != ch.charValue()) {
                return m6434a(AbstractC11374v51.m25354s(1, str), false, false, Character.valueOf(cM25358w));
            }
        } else if (ch == null || '\\' != ch.charValue()) {
            return m6434a(AbstractC11374v51.m25354s(1, str), false, true, Character.valueOf(cM25358w));
        }
        if (!z) {
            return z2 ? new C0913OV(m6434a(AbstractC11374v51.m25354s(1, str), false, true, Character.valueOf(cM25358w)), cM25358w) : new C3998eZ(m6434a(AbstractC11374v51.m25354s(1, str), false, false, Character.valueOf(cM25358w)), cM25358w);
        }
        if (cM25358w == '-') {
            return new C7726Hy0(m6434a(AbstractC11374v51.m25354s(1, str), true, false, Character.valueOf(cM25358w)), new C7518Dy0());
        }
        if (cM25358w == '0') {
            return new C9148di1(m6434a(AbstractC11374v51.m25354s(1, str), true, false, Character.valueOf(cM25358w)), new C9015ci1());
        }
        if (cM25358w == '9') {
            return new C7726Hy0(m6434a(AbstractC11374v51.m25354s(1, str), true, false, Character.valueOf(cM25358w)), new C7674Gy0());
        }
        if (cM25358w == 'A') {
            return new C9148di1(m6434a(AbstractC11374v51.m25354s(1, str), true, false, Character.valueOf(cM25358w)), new C8887bi1());
        }
        if (cM25358w == '_') {
            return new C9148di1(m6434a(AbstractC11374v51.m25354s(1, str), true, false, Character.valueOf(cM25358w)), new C8577Yh1());
        }
        if (cM25358w == 'a') {
            return new C7726Hy0(m6434a(AbstractC11374v51.m25354s(1, str), true, false, Character.valueOf(cM25358w)), new C7622Fy0());
        }
        List<C8396Uv0> list = this.f9295a;
        if (cM25358w != 8230) {
            for (C8396Uv0 c8396Uv0 : list) {
                if (c8396Uv0.f12201a == cM25358w) {
                    String str2 = c8396Uv0.f12202b;
                    return c8396Uv0.f12203c ? new C7726Hy0(m6434a(AbstractC11374v51.m25354s(1, str), true, false, Character.valueOf(cM25358w)), new C7570Ey0(str2, cM25358w)) : new C9148di1(m6434a(AbstractC11374v51.m25354s(1, str), true, false, Character.valueOf(cM25358w)), new C8629Zh1(str2, cM25358w));
                }
            }
            throw new C0226Da(2);
        }
        if ((ch != null && ch.charValue() == '0') || (ch != null && ch.charValue() == '9')) {
            c8629Zh1 = new C9015ci1();
        } else if ((ch != null && ch.charValue() == 'A') || (ch != null && ch.charValue() == 'a')) {
            c8629Zh1 = new C8887bi1();
        } else if ((ch != null && ch.charValue() == '_') || (ch != null && ch.charValue() == '-')) {
            c8629Zh1 = new C8577Yh1();
        } else if (ch != null && ch.charValue() == 8230) {
            c8629Zh1 = new C8577Yh1();
        } else {
            if (ch == null || ch.charValue() != '[') {
                for (C8396Uv0 c8396Uv02 : list) {
                    char c = c8396Uv02.f12201a;
                    if (ch != null && c == ch.charValue()) {
                        c8629Zh1 = new C8629Zh1(c8396Uv02.f12202b, ch.charValue());
                    }
                }
                throw new C0226Da(2);
            }
            c8629Zh1 = new C8577Yh1();
        }
        return new C9148di1(c8629Zh1);
    }

    @Override // p000.U51
    /* renamed from: c */
    public int mo5855c(long j) {
        return j < 0 ? 0 : -1;
    }

    @Override // p000.U51
    /* renamed from: f */
    public long mo5856f(int i) {
        YN1.m9278c(i == 0);
        return 0L;
    }

    @Override // p000.U51
    /* renamed from: h */
    public List mo5857h(long j) {
        return j >= 0 ? this.f9295a : Collections.emptyList();
    }

    @Override // p000.U51
    /* renamed from: j */
    public int mo5858j() {
        return 1;
    }
}
