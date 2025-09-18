package defpackage;

import android.view.View;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class EY implements InterfaceC0340Ec1 {
    public final /* synthetic */ View a;
    public final /* synthetic */ ArrayList b;

    public EY(View view, ArrayList arrayList) {
        this.a = view;
        this.b = arrayList;
    }

    @Override // defpackage.InterfaceC0340Ec1
    public final void a(AbstractC0418Fc1 abstractC0418Fc1) {
        abstractC0418Fc1.z(this);
        abstractC0418Fc1.a(this);
    }

    @Override // defpackage.InterfaceC0340Ec1
    public final void c(AbstractC0418Fc1 abstractC0418Fc1) {
        abstractC0418Fc1.z(this);
        this.a.setVisibility(8);
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((View) arrayList.get(i)).setVisibility(0);
        }
    }

    @Override // defpackage.InterfaceC0340Ec1
    public final void d(AbstractC0418Fc1 abstractC0418Fc1) {
        a(abstractC0418Fc1);
    }

    @Override // defpackage.InterfaceC0340Ec1
    public final void e(AbstractC0418Fc1 abstractC0418Fc1) {
        c(abstractC0418Fc1);
    }

    @Override // defpackage.InterfaceC0340Ec1
    public final void b() {
    }

    @Override // defpackage.InterfaceC0340Ec1
    public final void f() {
    }

    @Override // defpackage.InterfaceC0340Ec1
    public final void g(AbstractC0418Fc1 abstractC0418Fc1) {
    }
}
