package p000;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: XH */
/* loaded from: classes.dex */
public class C1465XH implements InterfaceC1150SH {

    /* renamed from: d */
    public final AbstractC10822qn1 f13654d;

    /* renamed from: f */
    public int f13656f;

    /* renamed from: g */
    public int f13657g;

    /* renamed from: a */
    public AbstractC10822qn1 f13651a = null;

    /* renamed from: b */
    public boolean f13652b = false;

    /* renamed from: c */
    public boolean f13653c = false;

    /* renamed from: e */
    public int f13655e = 1;

    /* renamed from: h */
    public int f13658h = 1;

    /* renamed from: i */
    public C0775MJ f13659i = null;

    /* renamed from: j */
    public boolean f13660j = false;

    /* renamed from: k */
    public final ArrayList f13661k = new ArrayList();

    /* renamed from: l */
    public final ArrayList f13662l = new ArrayList();

    public C1465XH(AbstractC10822qn1 abstractC10822qn1) {
        this.f13654d = abstractC10822qn1;
    }

    @Override // p000.InterfaceC1150SH
    /* renamed from: a */
    public final void mo3126a(InterfaceC1150SH interfaceC1150SH) {
        ArrayList arrayList = this.f13662l;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((C1465XH) it.next()).f13660j) {
                return;
            }
        }
        this.f13653c = true;
        AbstractC10822qn1 abstractC10822qn1 = this.f13651a;
        if (abstractC10822qn1 != null) {
            abstractC10822qn1.mo3126a(this);
        }
        if (this.f13652b) {
            this.f13654d.mo3126a(this);
            return;
        }
        Iterator it2 = arrayList.iterator();
        C1465XH c1465xh = null;
        int i = 0;
        while (it2.hasNext()) {
            C1465XH c1465xh2 = (C1465XH) it2.next();
            if (!(c1465xh2 instanceof C0775MJ)) {
                i++;
                c1465xh = c1465xh2;
            }
        }
        if (c1465xh != null && i == 1 && c1465xh.f13660j) {
            C0775MJ c0775mj = this.f13659i;
            if (c0775mj != null) {
                if (!c0775mj.f13660j) {
                    return;
                } else {
                    this.f13656f = this.f13658h * c0775mj.f13657g;
                }
            }
            mo5302d(c1465xh.f13657g + this.f13656f);
        }
        AbstractC10822qn1 abstractC10822qn12 = this.f13651a;
        if (abstractC10822qn12 != null) {
            abstractC10822qn12.mo3126a(this);
        }
    }

    /* renamed from: b */
    public final void m8962b(AbstractC10822qn1 abstractC10822qn1) {
        this.f13661k.add(abstractC10822qn1);
        if (this.f13660j) {
            abstractC10822qn1.mo3126a(abstractC10822qn1);
        }
    }

    /* renamed from: c */
    public final void m8963c() {
        this.f13662l.clear();
        this.f13661k.clear();
        this.f13660j = false;
        this.f13657g = 0;
        this.f13653c = false;
        this.f13652b = false;
    }

    /* renamed from: d */
    public void mo5302d(int i) {
        if (this.f13660j) {
            return;
        }
        this.f13660j = true;
        this.f13657g = i;
        Iterator it = this.f13661k.iterator();
        while (it.hasNext()) {
            InterfaceC1150SH interfaceC1150SH = (InterfaceC1150SH) it.next();
            interfaceC1150SH.mo3126a(interfaceC1150SH);
        }
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f13654d.f41157b.f26424W);
        sb.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
        switch (this.f13655e) {
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
        sb.append(this.f13660j ? Integer.valueOf(this.f13657g) : "unresolved");
        sb.append(") <t=");
        sb.append(this.f13662l.size());
        sb.append(":d=");
        sb.append(this.f13661k.size());
        sb.append(">");
        return sb.toString();
    }
}
