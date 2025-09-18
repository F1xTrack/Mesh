package io.sentry.android.replay;

import defpackage.AbstractC1676Vg0;
import defpackage.AbstractC7538v51;
import defpackage.C1151On0;
import defpackage.InterfaceC6099nZ;
import defpackage.O90;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes2.dex */
public final class b extends AbstractC1676Vg0 implements InterfaceC6099nZ {
    public static final b f = new b(1, 0);
    public static final b g = new b(1, 1);
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i, int i2) {
        super(i);
        this.e = i2;
    }

    @Override // defpackage.InterfaceC6099nZ
    public final Object invoke(Object obj) {
        switch (this.e) {
            case 0:
                C1151On0 c1151On0 = (C1151On0) obj;
                O90.f(c1151On0, "it");
                String strGroup = c1151On0.a.group();
                O90.e(strGroup, "group(...)");
                String strValueOf = String.valueOf(AbstractC7538v51.D(strGroup));
                O90.d(strValueOf, "null cannot be cast to non-null type java.lang.String");
                String upperCase = strValueOf.toUpperCase(Locale.ROOT);
                O90.e(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                return upperCase;
            default:
                Map.Entry entry = (Map.Entry) obj;
                O90.f(entry, "<name for destructuring parameter 0>");
                return ((String) entry.getKey()) + '=' + ((String) entry.getValue());
        }
    }
}
