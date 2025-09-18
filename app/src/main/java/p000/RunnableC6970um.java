package p000;

import com.p018my.tracker.obfuscated.C2308e;
import java.util.List;
import java.util.Map;

/* renamed from: um */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC6970um implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f43848a;

    /* renamed from: b */
    public final /* synthetic */ Object f43849b;

    /* renamed from: c */
    public final /* synthetic */ Object f43850c;

    /* renamed from: d */
    public final /* synthetic */ Object f43851d;

    /* renamed from: e */
    public final /* synthetic */ Object f43852e;

    /* renamed from: f */
    public final /* synthetic */ Object f43853f;

    /* renamed from: g */
    public final /* synthetic */ Object f43854g;

    public /* synthetic */ RunnableC6970um(C2308e c2308e, Object obj, String str, String str2, String str3, Map map) {
        this.f43848a = 2;
        this.f43849b = c2308e;
        this.f43851d = obj;
        this.f43850c = str;
        this.f43852e = str2;
        this.f43853f = str3;
        this.f43854g = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f43848a) {
            case 0:
                C0175Cm c0175Cm = (C0175Cm) this.f43849b;
                String str = (String) this.f43850c;
                C11812yY0 c11812yY0 = (C11812yY0) this.f43851d;
                InterfaceC9914jh1 interfaceC9914jh1 = (InterfaceC9914jh1) this.f43852e;
                C0419Ge c0419Ge = (C0419Ge) this.f43853f;
                List list = (List) this.f43854g;
                c0175Cm.getClass();
                c0175Cm.m1347u("Use case " + str + " RESET");
                c0175Cm.f1622a.m25191j(str, c11812yY0, interfaceC9914jh1, c0419Ge, list);
                c0175Cm.m1343q();
                c0175Cm.m1318E();
                c0175Cm.m1325L();
                if (c0175Cm.f1621L == 9) {
                    c0175Cm.m1316C();
                    break;
                }
                break;
            case 1:
                ((C6479nH) this.f43849b).m23117c((InterfaceC6972uo) this.f43850c, (InterfaceC6972uo) this.f43851d, (R61) this.f43852e, (R61) this.f43853f, (Map.Entry) this.f43854g);
                break;
            default:
                ((C2308e) this.f43849b).m12872a(this.f43851d, (String) this.f43850c, (String) this.f43852e, (String) this.f43853f, (Map) this.f43854g);
                break;
        }
    }

    public /* synthetic */ RunnableC6970um(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i) {
        this.f43848a = i;
        this.f43849b = obj;
        this.f43850c = obj2;
        this.f43851d = obj3;
        this.f43852e = obj4;
        this.f43853f = obj5;
        this.f43854g = obj6;
    }
}
