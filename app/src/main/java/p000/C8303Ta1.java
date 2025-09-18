package p000;

/* renamed from: Ta1 */
/* loaded from: classes2.dex */
public enum C8303Ta1 extends EnumC8407Va1 {
    public C8303Ta1() {
        super("LONG_OR_DOUBLE", 2);
    }

    @Override // p000.EnumC8407Va1
    /* renamed from: a */
    public final Number mo7044a(C11820yc0 c11820yc0) throws C8014Nm0, NumberFormatException {
        String strM26190n0 = c11820yc0.m26190n0();
        try {
            return Long.valueOf(Long.parseLong(strM26190n0));
        } catch (NumberFormatException unused) {
            try {
                Double dValueOf = Double.valueOf(strM26190n0);
                if (dValueOf.isInfinite() || dValueOf.isNaN()) {
                    if (!c11820yc0.f46342b) {
                        throw new C8014Nm0("JSON forbids NaN and infinities: " + dValueOf + "; at path " + c11820yc0.m26176D(true));
                    }
                }
                return dValueOf;
            } catch (NumberFormatException e) {
                StringBuilder sbM26240q = AbstractC7222ym.m26240q("Cannot parse ", strM26190n0, "; at path ");
                sbM26240q.append(c11820yc0.m26176D(true));
                throw new C6838sg(sbM26240q.toString(), e);
            }
        }
    }
}
