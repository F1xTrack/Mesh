package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.HashMap;

/* renamed from: io.appmetrica.analytics.impl.m5 */
/* loaded from: classes2.dex */
public final class C5289m5 {

    /* renamed from: a */
    public final HashMap f32167a = new HashMap();

    /* renamed from: b */
    public final HashMap f32168b = new HashMap();

    /* renamed from: c */
    public final Context f32169c;

    public C5289m5(Context context) {
        this.f32169c = context.getApplicationContext();
    }

    /* renamed from: a */
    public final InterfaceC4442Da m20697a(C4964Z4 c4964z4, C4436D4 c4436d4, InterfaceC4632L7 interfaceC4632L7, HashMap map) {
        InterfaceC4442Da interfaceC4442Da = (InterfaceC4442Da) map.get(c4964z4.toString());
        if (interfaceC4442Da != null) {
            interfaceC4442Da.mo19322a(c4436d4);
            return interfaceC4442Da;
        }
        InterfaceC4442Da interfaceC4442DaMo19594a = interfaceC4632L7.mo19594a(this.f32169c, c4964z4, c4436d4);
        map.put(c4964z4.toString(), interfaceC4442DaMo19594a);
        return interfaceC4442DaMo19594a;
    }
}
