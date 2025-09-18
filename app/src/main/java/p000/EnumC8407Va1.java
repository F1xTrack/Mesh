package p000;

import java.math.BigDecimal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: Va1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class EnumC8407Va1 {

    /* renamed from: a */
    public static final C8199Ra1 f12624a;

    /* renamed from: b */
    public static final C8303Ta1 f12625b;

    /* renamed from: c */
    public static final /* synthetic */ EnumC8407Va1[] f12626c;

    static {
        C8199Ra1 c8199Ra1 = new C8199Ra1();
        f12624a = c8199Ra1;
        EnumC8407Va1 enumC8407Va1 = new EnumC8407Va1() { // from class: Sa1
            @Override // p000.EnumC8407Va1
            /* renamed from: a */
            public final Number mo7044a(C11820yc0 c11820yc0) {
                return new C10553oh0(c11820yc0.m26190n0());
            }
        };
        C8303Ta1 c8303Ta1 = new C8303Ta1();
        f12625b = c8303Ta1;
        f12626c = new EnumC8407Va1[]{c8199Ra1, enumC8407Va1, c8303Ta1, new EnumC8407Va1() { // from class: Ua1
            @Override // p000.EnumC8407Va1
            /* renamed from: a */
            public final Number mo7044a(C11820yc0 c11820yc0) {
                String strM26190n0 = c11820yc0.m26190n0();
                try {
                    return new BigDecimal(strM26190n0);
                } catch (NumberFormatException e) {
                    StringBuilder sbM26240q = AbstractC7222ym.m26240q("Cannot parse ", strM26190n0, "; at path ");
                    sbM26240q.append(c11820yc0.m26176D(true));
                    throw new C6838sg(sbM26240q.toString(), e);
                }
            }
        }};
    }

    public static EnumC8407Va1 valueOf(String str) {
        return (EnumC8407Va1) Enum.valueOf(EnumC8407Va1.class, str);
    }

    public static EnumC8407Va1[] values() {
        return (EnumC8407Va1[]) f12626c.clone();
    }

    /* renamed from: a */
    public abstract Number mo7044a(C11820yc0 c11820yc0);
}
