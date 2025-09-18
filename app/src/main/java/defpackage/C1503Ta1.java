package defpackage;

/* renamed from: Ta1 */
/* loaded from: classes2.dex */
public enum C1503Ta1 extends EnumC1659Va1 {
    public C1503Ta1() {
        super("LONG_OR_DOUBLE", 2);
    }

    @Override // defpackage.EnumC1659Va1
    public final Number a(C8206yc0 c8206yc0) throws C1070Nm0, NumberFormatException {
        String strN0 = c8206yc0.n0();
        try {
            return Long.valueOf(Long.parseLong(strN0));
        } catch (NumberFormatException unused) {
            try {
                Double dValueOf = Double.valueOf(strN0);
                if (dValueOf.isInfinite() || dValueOf.isNaN()) {
                    if (!c8206yc0.b) {
                        throw new C1070Nm0("JSON forbids NaN and infinities: " + dValueOf + "; at path " + c8206yc0.D(true));
                    }
                }
                return dValueOf;
            } catch (NumberFormatException e) {
                StringBuilder sbQ = AbstractC8235ym.q("Cannot parse ", strN0, "; at path ");
                sbQ.append(c8206yc0.D(true));
                throw new C7074sg(sbQ.toString(), e);
            }
        }
    }
}
