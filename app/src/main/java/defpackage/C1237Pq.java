package defpackage;

import java.util.Collections;
import java.util.List;

/* renamed from: Pq */
/* loaded from: classes.dex */
public final class C1237Pq implements U51 {
    public final List a;

    public /* synthetic */ C1237Pq(List list) {
        this.a = list;
    }

    public U0 a(String str, boolean z, boolean z2, Character ch) throws C0254Da {
        AbstractC7711w02 c1992Zh1;
        if (str.length() == 0) {
            return new SM(10, null);
        }
        char cW = AbstractC7538v51.w(str);
        if (cW != '{') {
            if (cW != '}') {
                switch (cW) {
                    case '[':
                        if (ch == null || '\\' != ch.charValue()) {
                            return a(AbstractC7538v51.s(1, str), true, false, Character.valueOf(cW));
                        }
                        break;
                    case '\\':
                        if (ch == null || '\\' != ch.charValue()) {
                            return a(AbstractC7538v51.s(1, str), z, z2, Character.valueOf(cW));
                        }
                        break;
                    case ']':
                        if (ch == null || '\\' != ch.charValue()) {
                            return a(AbstractC7538v51.s(1, str), false, false, Character.valueOf(cW));
                        }
                        break;
                }
            } else if (ch == null || '\\' != ch.charValue()) {
                return a(AbstractC7538v51.s(1, str), false, false, Character.valueOf(cW));
            }
        } else if (ch == null || '\\' != ch.charValue()) {
            return a(AbstractC7538v51.s(1, str), false, true, Character.valueOf(cW));
        }
        if (!z) {
            return z2 ? new OV(a(AbstractC7538v51.s(1, str), false, true, Character.valueOf(cW)), cW) : new C3604eZ(a(AbstractC7538v51.s(1, str), false, false, Character.valueOf(cW)), cW);
        }
        if (cW == '-') {
            return new C0639Hy0(a(AbstractC7538v51.s(1, str), true, false, Character.valueOf(cW)), new C0327Dy0());
        }
        if (cW == '0') {
            return new C3443di1(a(AbstractC7538v51.s(1, str), true, false, Character.valueOf(cW)), new C2567ci1());
        }
        if (cW == '9') {
            return new C0639Hy0(a(AbstractC7538v51.s(1, str), true, false, Character.valueOf(cW)), new C0561Gy0());
        }
        if (cW == 'A') {
            return new C3443di1(a(AbstractC7538v51.s(1, str), true, false, Character.valueOf(cW)), new C2377bi1());
        }
        if (cW == '_') {
            return new C3443di1(a(AbstractC7538v51.s(1, str), true, false, Character.valueOf(cW)), new C1914Yh1());
        }
        if (cW == 'a') {
            return new C0639Hy0(a(AbstractC7538v51.s(1, str), true, false, Character.valueOf(cW)), new C0483Fy0());
        }
        List<C1643Uv0> list = this.a;
        if (cW != 8230) {
            for (C1643Uv0 c1643Uv0 : list) {
                if (c1643Uv0.a == cW) {
                    String str2 = c1643Uv0.b;
                    return c1643Uv0.c ? new C0639Hy0(a(AbstractC7538v51.s(1, str), true, false, Character.valueOf(cW)), new C0405Ey0(str2, cW)) : new C3443di1(a(AbstractC7538v51.s(1, str), true, false, Character.valueOf(cW)), new C1992Zh1(str2, cW));
                }
            }
            throw new C0254Da(2);
        }
        if ((ch != null && ch.charValue() == '0') || (ch != null && ch.charValue() == '9')) {
            c1992Zh1 = new C2567ci1();
        } else if ((ch != null && ch.charValue() == 'A') || (ch != null && ch.charValue() == 'a')) {
            c1992Zh1 = new C2377bi1();
        } else if ((ch != null && ch.charValue() == '_') || (ch != null && ch.charValue() == '-')) {
            c1992Zh1 = new C1914Yh1();
        } else if (ch != null && ch.charValue() == 8230) {
            c1992Zh1 = new C1914Yh1();
        } else {
            if (ch == null || ch.charValue() != '[') {
                for (C1643Uv0 c1643Uv02 : list) {
                    char c = c1643Uv02.a;
                    if (ch != null && c == ch.charValue()) {
                        c1992Zh1 = new C1992Zh1(c1643Uv02.b, ch.charValue());
                    }
                }
                throw new C0254Da(2);
            }
            c1992Zh1 = new C1914Yh1();
        }
        return new C3443di1(c1992Zh1);
    }

    @Override // defpackage.U51
    public int c(long j) {
        return j < 0 ? 0 : -1;
    }

    @Override // defpackage.U51
    public long f(int i) {
        YN1.c(i == 0);
        return 0L;
    }

    @Override // defpackage.U51
    public List h(long j) {
        return j >= 0 ? this.a : Collections.emptyList();
    }

    @Override // defpackage.U51
    public int j() {
        return 1;
    }
}
