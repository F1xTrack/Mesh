package defpackage;

import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;

/* renamed from: Hr0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0618Hr0 {
    public final C3383dO1 a;
    public final C3532eB b;
    public final HashMap c;

    public C0618Hr0(Context context, C3532eB c3532eB) {
        C3383dO1 c3383dO1 = new C3383dO1(context, 17);
        this.c = new HashMap();
        this.a = c3383dO1;
        this.b = c3532eB;
    }

    public final synchronized InterfaceC1431Sc1 a(String str) {
        if (this.c.containsKey(str)) {
            return (InterfaceC1431Sc1) this.c.get(str);
        }
        CctBackendFactory cctBackendFactoryY = this.a.y(str);
        if (cctBackendFactoryY == null) {
            return null;
        }
        C3532eB c3532eB = this.b;
        InterfaceC1431Sc1 interfaceC1431Sc1Create = cctBackendFactoryY.create(new C7256td(c3532eB.a, c3532eB.b, c3532eB.c, str));
        this.c.put(str, interfaceC1431Sc1Create);
        return interfaceC1431Sc1Create;
    }
}
