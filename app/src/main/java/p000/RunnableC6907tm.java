package p000;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/* renamed from: tm */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC6907tm implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f43240a;

    /* renamed from: b */
    public final /* synthetic */ C0175Cm f43241b;

    /* renamed from: c */
    public final /* synthetic */ String f43242c;

    /* renamed from: d */
    public final /* synthetic */ C11812yY0 f43243d;

    /* renamed from: e */
    public final /* synthetic */ InterfaceC9914jh1 f43244e;

    /* renamed from: f */
    public final /* synthetic */ C0419Ge f43245f;

    /* renamed from: g */
    public final /* synthetic */ ArrayList f43246g;

    public /* synthetic */ RunnableC6907tm(C0175Cm c0175Cm, String str, C11812yY0 c11812yY0, InterfaceC9914jh1 interfaceC9914jh1, C0419Ge c0419Ge, ArrayList arrayList, int i) {
        this.f43240a = i;
        this.f43241b = c0175Cm;
        this.f43242c = str;
        this.f43243d = c11812yY0;
        this.f43244e = interfaceC9914jh1;
        this.f43245f = c0419Ge;
        this.f43246g = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f43240a) {
            case 0:
                C0175Cm c0175Cm = this.f43241b;
                c0175Cm.getClass();
                StringBuilder sb = new StringBuilder("Use case ");
                String str = this.f43242c;
                sb.append(str);
                sb.append(" UPDATED");
                c0175Cm.m1347u(sb.toString());
                c0175Cm.f1622a.m25191j(str, this.f43243d, this.f43244e, this.f43245f, this.f43246g);
                c0175Cm.m1325L();
                break;
            default:
                C0175Cm c0175Cm2 = this.f43241b;
                c0175Cm2.getClass();
                StringBuilder sb2 = new StringBuilder("Use case ");
                String str2 = this.f43242c;
                sb2.append(str2);
                sb2.append(" ACTIVE");
                c0175Cm2.m1347u(sb2.toString());
                LinkedHashMap linkedHashMap = (LinkedHashMap) c0175Cm2.f1622a.f43693a;
                C9530gh1 c9530gh1 = (C9530gh1) linkedHashMap.get(str2);
                C11812yY0 c11812yY0 = this.f43243d;
                InterfaceC9914jh1 interfaceC9914jh1 = this.f43244e;
                C0419Ge c0419Ge = this.f43245f;
                ArrayList arrayList = this.f43246g;
                if (c9530gh1 == null) {
                    c9530gh1 = new C9530gh1(c11812yY0, interfaceC9914jh1, c0419Ge, arrayList);
                    linkedHashMap.put(str2, c9530gh1);
                }
                c9530gh1.f27940f = true;
                c0175Cm2.f1622a.m25191j(str2, c11812yY0, interfaceC9914jh1, c0419Ge, arrayList);
                c0175Cm2.m1325L();
                break;
        }
    }
}
