package defpackage;

import com.my.tracker.obfuscated.e;
import java.util.List;
import java.util.Map;

/* renamed from: um, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC7474um implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ RunnableC7474um(e eVar, Object obj, String str, String str2, String str3, Map map) {
        this.a = 2;
        this.b = eVar;
        this.d = obj;
        this.c = str;
        this.e = str2;
        this.f = str3;
        this.g = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                C0212Cm c0212Cm = (C0212Cm) this.b;
                String str = (String) this.c;
                C8194yY0 c8194yY0 = (C8194yY0) this.d;
                InterfaceC5361jh1 interfaceC5361jh1 = (InterfaceC5361jh1) this.e;
                C0500Ge c0500Ge = (C0500Ge) this.f;
                List list = (List) this.g;
                c0212Cm.getClass();
                c0212Cm.u("Use case " + str + " RESET");
                c0212Cm.a.j(str, c8194yY0, interfaceC5361jh1, c0500Ge, list);
                c0212Cm.q();
                c0212Cm.E();
                c0212Cm.L();
                if (c0212Cm.L == 9) {
                    c0212Cm.C();
                    break;
                }
                break;
            case 1:
                ((C6045nH) this.b).c((InterfaceC7480uo) this.c, (InterfaceC7480uo) this.d, (R61) this.e, (R61) this.f, (Map.Entry) this.g);
                break;
            default:
                ((e) this.b).a(this.d, (String) this.c, (String) this.e, (String) this.f, (Map) this.g);
                break;
        }
    }

    public /* synthetic */ RunnableC7474um(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
        this.g = obj6;
    }
}
