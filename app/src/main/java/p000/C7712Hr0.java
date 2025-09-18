package p000;

import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;

/* renamed from: Hr0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7712Hr0 {

    /* renamed from: a */
    public final C9108dO1 f4555a;

    /* renamed from: b */
    public final C3974eB f4556b;

    /* renamed from: c */
    public final HashMap f4557c;

    public C7712Hr0(Context context, C3974eB c3974eB) {
        C9108dO1 c9108dO1 = new C9108dO1(context, 17);
        this.f4557c = new HashMap();
        this.f4555a = c9108dO1;
        this.f4556b = c3974eB;
    }

    /* renamed from: a */
    public final synchronized InterfaceC8255Sc1 m3635a(String str) {
        if (this.f4557c.containsKey(str)) {
            return (InterfaceC8255Sc1) this.f4557c.get(str);
        }
        CctBackendFactory cctBackendFactoryM17580y = this.f4555a.m17580y(str);
        if (cctBackendFactoryM17580y == null) {
            return null;
        }
        C3974eB c3974eB = this.f4556b;
        InterfaceC8255Sc1 interfaceC8255Sc1Create = cctBackendFactoryM17580y.create(new C6898td(c3974eB.f26583a, c3974eB.f26584b, c3974eB.f26585c, str));
        this.f4557c.put(str, interfaceC8255Sc1Create);
        return interfaceC8255Sc1Create;
    }
}
