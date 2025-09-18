package p000;

import android.content.Context;
import java.util.Map;

/* renamed from: fU0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9375fU0 {

    /* renamed from: a */
    public final C8165Qj1 f27217a;

    public C9375fU0(Context context, Map map) {
        C10030kb1 c10030kb1;
        this.f27217a = new C8165Qj1(context);
        synchronized (AbstractC9426ft1.class) {
            c10030kb1 = C10030kb1.f36560h;
            if (c10030kb1 == null) {
                c10030kb1 = new C10030kb1(context, map);
                C10030kb1.f36560h = c10030kb1;
            }
        }
        C9684hu1 c9684hu1 = (C9684hu1) ((F71) c10030kb1.f36563c).getValue();
        C11857yu1 c11857yu1 = new C11857yu1((Map) c9684hu1.f28673c.getValue());
        C7825Jv1 c7825Jv1 = c9684hu1.f28671a;
        c7825Jv1.getClass();
        AbstractC10396nS1.m23145a(new C9571h11(AbstractC10780qS1.m24004c(new C9699i11(new C9059d11(new C8447Vu1(c7825Jv1, 0, c11857yu1)), new C10115lG0(22, c7825Jv1), 1), AbstractC0336FK.m2578a()), C8237Rt1.f10479o), C6228jI.f35045w, C8237Rt1.f10478n);
    }
}
