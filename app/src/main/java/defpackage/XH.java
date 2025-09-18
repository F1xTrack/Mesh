package defpackage;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class XH implements SH {
    public final AbstractC6716qn1 d;
    public int f;
    public int g;
    public AbstractC6716qn1 a = null;
    public boolean b = false;
    public boolean c = false;
    public int e = 1;
    public int h = 1;
    public MJ i = null;
    public boolean j = false;
    public final ArrayList k = new ArrayList();
    public final ArrayList l = new ArrayList();

    public XH(AbstractC6716qn1 abstractC6716qn1) {
        this.d = abstractC6716qn1;
    }

    @Override // defpackage.SH
    public final void a(SH sh) {
        ArrayList arrayList = this.l;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((XH) it.next()).j) {
                return;
            }
        }
        this.c = true;
        AbstractC6716qn1 abstractC6716qn1 = this.a;
        if (abstractC6716qn1 != null) {
            abstractC6716qn1.a(this);
        }
        if (this.b) {
            this.d.a(this);
            return;
        }
        Iterator it2 = arrayList.iterator();
        XH xh = null;
        int i = 0;
        while (it2.hasNext()) {
            XH xh2 = (XH) it2.next();
            if (!(xh2 instanceof MJ)) {
                i++;
                xh = xh2;
            }
        }
        if (xh != null && i == 1 && xh.j) {
            MJ mj = this.i;
            if (mj != null) {
                if (!mj.j) {
                    return;
                } else {
                    this.f = this.h * mj.g;
                }
            }
            d(xh.g + this.f);
        }
        AbstractC6716qn1 abstractC6716qn12 = this.a;
        if (abstractC6716qn12 != null) {
            abstractC6716qn12.a(this);
        }
    }

    public final void b(AbstractC6716qn1 abstractC6716qn1) {
        this.k.add(abstractC6716qn1);
        if (this.j) {
            abstractC6716qn1.a(abstractC6716qn1);
        }
    }

    public final void c() {
        this.l.clear();
        this.k.clear();
        this.j = false;
        this.g = 0;
        this.c = false;
        this.b = false;
    }

    public void d(int i) {
        if (this.j) {
            return;
        }
        this.j = true;
        this.g = i;
        Iterator it = this.k.iterator();
        while (it.hasNext()) {
            SH sh = (SH) it.next();
            sh.a(sh);
        }
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.d.b.W);
        sb.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
        switch (this.e) {
            case 1:
                str = GrsBaseInfo.CountryCodeSource.UNKNOWN;
                break;
            case 2:
                str = "HORIZONTAL_DIMENSION";
                break;
            case 3:
                str = "VERTICAL_DIMENSION";
                break;
            case 4:
                str = "LEFT";
                break;
            case 5:
                str = "RIGHT";
                break;
            case 6:
                str = "TOP";
                break;
            case 7:
                str = "BOTTOM";
                break;
            case 8:
                str = "BASELINE";
                break;
            default:
                str = "null";
                break;
        }
        sb.append(str);
        sb.append("(");
        sb.append(this.j ? Integer.valueOf(this.g) : "unresolved");
        sb.append(") <t=");
        sb.append(this.l.size());
        sb.append(":d=");
        sb.append(this.k.size());
        sb.append(">");
        return sb.toString();
    }
}
