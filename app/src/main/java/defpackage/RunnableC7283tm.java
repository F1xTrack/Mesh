package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/* renamed from: tm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC7283tm implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ C0212Cm b;
    public final /* synthetic */ String c;
    public final /* synthetic */ C8194yY0 d;
    public final /* synthetic */ InterfaceC5361jh1 e;
    public final /* synthetic */ C0500Ge f;
    public final /* synthetic */ ArrayList g;

    public /* synthetic */ RunnableC7283tm(C0212Cm c0212Cm, String str, C8194yY0 c8194yY0, InterfaceC5361jh1 interfaceC5361jh1, C0500Ge c0500Ge, ArrayList arrayList, int i) {
        this.a = i;
        this.b = c0212Cm;
        this.c = str;
        this.d = c8194yY0;
        this.e = interfaceC5361jh1;
        this.f = c0500Ge;
        this.g = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                C0212Cm c0212Cm = this.b;
                c0212Cm.getClass();
                StringBuilder sb = new StringBuilder("Use case ");
                String str = this.c;
                sb.append(str);
                sb.append(" UPDATED");
                c0212Cm.u(sb.toString());
                c0212Cm.a.j(str, this.d, this.e, this.f, this.g);
                c0212Cm.L();
                break;
            default:
                C0212Cm c0212Cm2 = this.b;
                c0212Cm2.getClass();
                StringBuilder sb2 = new StringBuilder("Use case ");
                String str2 = this.c;
                sb2.append(str2);
                sb2.append(" ACTIVE");
                c0212Cm2.u(sb2.toString());
                LinkedHashMap linkedHashMap = (LinkedHashMap) c0212Cm2.a.a;
                C4012gh1 c4012gh1 = (C4012gh1) linkedHashMap.get(str2);
                C8194yY0 c8194yY0 = this.d;
                InterfaceC5361jh1 interfaceC5361jh1 = this.e;
                C0500Ge c0500Ge = this.f;
                ArrayList arrayList = this.g;
                if (c4012gh1 == null) {
                    c4012gh1 = new C4012gh1(c8194yY0, interfaceC5361jh1, c0500Ge, arrayList);
                    linkedHashMap.put(str2, c4012gh1);
                }
                c4012gh1.f = true;
                c0212Cm2.a.j(str2, c8194yY0, interfaceC5361jh1, c0500Ge, arrayList);
                c0212Cm2.L();
                break;
        }
    }
}
