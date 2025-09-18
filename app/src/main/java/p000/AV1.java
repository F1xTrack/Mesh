package p000;

import android.content.Context;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class AV1 extends AbstractC1259U0 {

    /* renamed from: c */
    public final /* synthetic */ int f216c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AV1(int i) {
        super(8);
        this.f216c = i;
    }

    @Override // p000.AbstractC1259U0
    /* renamed from: f1 */
    public final Object mo198f1(Object obj) {
        switch (this.f216c) {
            case 0:
                C8906bs0 c8906bs0M10530c = C8906bs0.m10530c();
                return new C10274mV1(c8906bs0M10530c.m10533b(), (C10848r01) c8906bs0M10530c.m10532a(C10848r01.class), new C9250eV1(C8906bs0.m10530c().m10533b(), (RU1) obj));
            case 1:
                C8906bs0 c8906bs0M10530c2 = C8906bs0.m10530c();
                Context contextM10533b = C8906bs0.m10530c().m10533b();
                ArrayList arrayList = new ArrayList();
                C11140tG1 c11140tG1 = new C11140tG1(4);
                C0928Ok c0928Ok = C0928Ok.f8587e;
                C8877bd1.m10476b(contextM10533b);
                C8877bd1.m10475a().m10477c(c0928Ok);
                C0928Ok.f8586d.contains(new C7135xO("json"));
                arrayList.add(c11140tG1);
                return new V02(c8906bs0M10530c2.m10533b(), (C10848r01) c8906bs0M10530c2.m10532a(C10848r01.class));
            default:
                C9706i32 c9706i32 = (C9706i32) obj;
                C8906bs0 c8906bs0M10530c3 = C8906bs0.m10530c();
                return new C10218m32(c8906bs0M10530c3.m10533b(), (C10848r01) c8906bs0M10530c3.m10532a(C10848r01.class), new C9962k32(C8906bs0.m10530c().m10533b(), c9706i32), c9706i32.f28799a);
        }
    }
}
