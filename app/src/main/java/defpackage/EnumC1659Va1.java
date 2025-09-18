package defpackage;

import java.math.BigDecimal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: Va1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class EnumC1659Va1 {
    public static final C1347Ra1 a;
    public static final C1503Ta1 b;
    public static final /* synthetic */ EnumC1659Va1[] c;

    static {
        C1347Ra1 c1347Ra1 = new C1347Ra1();
        a = c1347Ra1;
        EnumC1659Va1 enumC1659Va1 = new EnumC1659Va1() { // from class: Sa1
            @Override // defpackage.EnumC1659Va1
            public final Number a(C8206yc0 c8206yc0) {
                return new C6315oh0(c8206yc0.n0());
            }
        };
        C1503Ta1 c1503Ta1 = new C1503Ta1();
        b = c1503Ta1;
        c = new EnumC1659Va1[]{c1347Ra1, enumC1659Va1, c1503Ta1, new EnumC1659Va1() { // from class: Ua1
            @Override // defpackage.EnumC1659Va1
            public final Number a(C8206yc0 c8206yc0) {
                String strN0 = c8206yc0.n0();
                try {
                    return new BigDecimal(strN0);
                } catch (NumberFormatException e) {
                    StringBuilder sbQ = AbstractC8235ym.q("Cannot parse ", strN0, "; at path ");
                    sbQ.append(c8206yc0.D(true));
                    throw new C7074sg(sbQ.toString(), e);
                }
            }
        }};
    }

    public static EnumC1659Va1 valueOf(String str) {
        return (EnumC1659Va1) Enum.valueOf(EnumC1659Va1.class, str);
    }

    public static EnumC1659Va1[] values() {
        return (EnumC1659Va1[]) c.clone();
    }

    public abstract Number a(C8206yc0 c8206yc0);
}
