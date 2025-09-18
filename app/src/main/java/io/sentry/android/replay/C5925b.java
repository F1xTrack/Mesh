package io.sentry.android.replay;

import java.util.Locale;
import java.util.Map;
import p000.AbstractC11374v51;
import p000.AbstractC8418Vg0;
import p000.C8068On0;
import p000.InterfaceC6497nZ;
import p000.O90;

/* renamed from: io.sentry.android.replay.b */
/* loaded from: classes2.dex */
public final class C5925b extends AbstractC8418Vg0 implements InterfaceC6497nZ {

    /* renamed from: f */
    public static final C5925b f33905f = new C5925b(1, 0);

    /* renamed from: g */
    public static final C5925b f33906g = new C5925b(1, 1);

    /* renamed from: e */
    public final /* synthetic */ int f33907e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5925b(int i, int i2) {
        super(i);
        this.f33907e = i2;
    }

    @Override // p000.InterfaceC6497nZ
    public final Object invoke(Object obj) {
        switch (this.f33907e) {
            case 0:
                C8068On0 c8068On0 = (C8068On0) obj;
                O90.m5968f(c8068On0, "it");
                String strGroup = c8068On0.f8621a.group();
                O90.m5967e(strGroup, "group(...)");
                String strValueOf = String.valueOf(AbstractC11374v51.m25329D(strGroup));
                O90.m5966d(strValueOf, "null cannot be cast to non-null type java.lang.String");
                String upperCase = strValueOf.toUpperCase(Locale.ROOT);
                O90.m5967e(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                return upperCase;
            default:
                Map.Entry entry = (Map.Entry) obj;
                O90.m5968f(entry, "<name for destructuring parameter 0>");
                return ((String) entry.getKey()) + '=' + ((String) entry.getValue());
        }
    }
}
