package p000;

/* renamed from: UH */
/* loaded from: classes.dex */
public final class C1276UH extends AbstractC7598Fm0 {

    /* renamed from: e */
    public final /* synthetic */ int f11714e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1276UH(AbstractC10653pT0 abstractC10653pT0, int i) {
        super(abstractC10653pT0);
        this.f11714e = i;
    }

    @Override // p000.AbstractC7598Fm0
    /* renamed from: d */
    public final String mo2774d() {
        switch (this.f11714e) {
            case 0:
                return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
            case 1:
                return "INSERT OR IGNORE INTO `message_table` (`id`,`message`) VALUES (nullif(?, 0),?)";
            case 2:
                return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
            case 3:
                return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`generation`,`system_id`) VALUES (?,?,?)";
            case 4:
                return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
            case 5:
                return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
            case 6:
                return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            default:
                return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
        }
    }

    /* renamed from: g */
    public final void m7953g(C3936dZ c3936dZ, Object obj) throws Throwable {
        int i;
        switch (this.f11714e) {
            case 0:
                C1025QH c1025qh = (C1025QH) obj;
                c3936dZ.mo2033d(1, c1025qh.f9554a);
                String str = c1025qh.f9555b;
                if (str == null) {
                    c3936dZ.mo2032V(2);
                    return;
                } else {
                    c3936dZ.mo2033d(2, str);
                    return;
                }
            case 1:
                C9933jr0 c9933jr0 = (C9933jr0) obj;
                c3936dZ.mo2030E(1, c9933jr0.f35427a);
                String str2 = c9933jr0.f35428b;
                if (str2 == null) {
                    c3936dZ.mo2032V(2);
                    return;
                } else {
                    c3936dZ.mo2033d(2, str2);
                    return;
                }
            case 2:
                BC0 bc0 = (BC0) obj;
                c3936dZ.mo2033d(1, bc0.f652a);
                c3936dZ.mo2030E(2, bc0.f653b.longValue());
                return;
            case 3:
                String str3 = ((S71) obj).f10588a;
                if (str3 == null) {
                    c3936dZ.mo2032V(1);
                } else {
                    c3936dZ.mo2033d(1, str3);
                }
                c3936dZ.mo2030E(2, r12.f10589b);
                c3936dZ.mo2030E(3, r12.f10590c);
                return;
            case 4:
                C7915Lo1 c7915Lo1 = (C7915Lo1) obj;
                String str4 = c7915Lo1.f6877a;
                if (str4 == null) {
                    c3936dZ.mo2032V(1);
                } else {
                    c3936dZ.mo2033d(1, str4);
                }
                c3936dZ.mo2033d(2, c7915Lo1.f6878b);
                return;
            case 5:
                C8019No1 c8019No1 = (C8019No1) obj;
                String str5 = c8019No1.f8017a;
                if (str5 == null) {
                    c3936dZ.mo2032V(1);
                } else {
                    c3936dZ.mo2033d(1, str5);
                }
                byte[] bArrM26327c = C7249zC.m26327c(c8019No1.f8018b);
                if (bArrM26327c == null) {
                    c3936dZ.mo2032V(2);
                    return;
                } else {
                    c3936dZ.mo2031I(2, bArrM26327c);
                    return;
                }
            case 6:
                C8383Uo1 c8383Uo1 = (C8383Uo1) obj;
                int i2 = 1;
                String str6 = c8383Uo1.f12134a;
                if (str6 == null) {
                    c3936dZ.mo2032V(1);
                } else {
                    c3936dZ.mo2033d(1, str6);
                }
                c3936dZ.mo2030E(2, AbstractC10340n12.m23058m(c8383Uo1.f12135b));
                String str7 = c8383Uo1.f12136c;
                if (str7 == null) {
                    c3936dZ.mo2032V(3);
                } else {
                    c3936dZ.mo2033d(3, str7);
                }
                String str8 = c8383Uo1.f12137d;
                if (str8 == null) {
                    c3936dZ.mo2032V(4);
                } else {
                    c3936dZ.mo2033d(4, str8);
                }
                byte[] bArrM26327c2 = C7249zC.m26327c(c8383Uo1.f12138e);
                if (bArrM26327c2 == null) {
                    c3936dZ.mo2032V(5);
                } else {
                    c3936dZ.mo2031I(5, bArrM26327c2);
                }
                byte[] bArrM26327c3 = C7249zC.m26327c(c8383Uo1.f12139f);
                if (bArrM26327c3 == null) {
                    c3936dZ.mo2032V(6);
                } else {
                    c3936dZ.mo2031I(6, bArrM26327c3);
                }
                c3936dZ.mo2030E(7, c8383Uo1.f12140g);
                c3936dZ.mo2030E(8, c8383Uo1.f12141h);
                c3936dZ.mo2030E(9, c8383Uo1.f12142i);
                c3936dZ.mo2030E(10, c8383Uo1.f12144k);
                int i3 = c8383Uo1.f12145l;
                AbstractC0852NX.m5764m(i3, "backoffPolicy");
                int iM26247x = AbstractC7222ym.m26247x(i3);
                if (iM26247x == 0) {
                    i = 0;
                } else {
                    if (iM26247x != 1) {
                        throw new C6838sg();
                    }
                    i = 1;
                }
                c3936dZ.mo2030E(11, i);
                c3936dZ.mo2030E(12, c8383Uo1.f12146m);
                c3936dZ.mo2030E(13, c8383Uo1.f12147n);
                c3936dZ.mo2030E(14, c8383Uo1.f12148o);
                c3936dZ.mo2030E(15, c8383Uo1.f12149p);
                c3936dZ.mo2030E(16, c8383Uo1.f12150q ? 1L : 0L);
                int i4 = c8383Uo1.f12151r;
                AbstractC0852NX.m5764m(i4, "policy");
                int iM26247x2 = AbstractC7222ym.m26247x(i4);
                if (iM26247x2 == 0) {
                    i2 = 0;
                } else if (iM26247x2 != 1) {
                    throw new C6838sg();
                }
                c3936dZ.mo2030E(17, i2);
                c3936dZ.mo2030E(18, c8383Uo1.f12152s);
                c3936dZ.mo2030E(19, c8383Uo1.f12153t);
                C4149gy c4149gy = c8383Uo1.f12143j;
                if (c4149gy != null) {
                    c3936dZ.mo2030E(20, AbstractC10340n12.m23056k(c4149gy.f28116a));
                    c3936dZ.mo2030E(21, c4149gy.f28117b ? 1L : 0L);
                    c3936dZ.mo2030E(22, c4149gy.f28118c ? 1L : 0L);
                    c3936dZ.mo2030E(23, c4149gy.f28119d ? 1L : 0L);
                    c3936dZ.mo2030E(24, c4149gy.f28120e ? 1L : 0L);
                    c3936dZ.mo2030E(25, c4149gy.f28121f);
                    c3936dZ.mo2030E(26, c4149gy.f28122g);
                    c3936dZ.mo2031I(27, AbstractC10340n12.m23057l(c4149gy.f28123h));
                    return;
                }
                c3936dZ.mo2032V(20);
                c3936dZ.mo2032V(21);
                c3936dZ.mo2032V(22);
                c3936dZ.mo2032V(23);
                c3936dZ.mo2032V(24);
                c3936dZ.mo2032V(25);
                c3936dZ.mo2032V(26);
                c3936dZ.mo2032V(27);
                return;
            default:
                C8487Wo1 c8487Wo1 = (C8487Wo1) obj;
                String str9 = c8487Wo1.f13412a;
                if (str9 == null) {
                    c3936dZ.mo2032V(1);
                } else {
                    c3936dZ.mo2033d(1, str9);
                }
                String str10 = c8487Wo1.f13413b;
                if (str10 == null) {
                    c3936dZ.mo2032V(2);
                    return;
                } else {
                    c3936dZ.mo2033d(2, str10);
                    return;
                }
        }
    }

    /* renamed from: h */
    public final void m7954h(Object obj) {
        C3936dZ c3936dZM2771a = m2771a();
        try {
            m7953g(c3936dZM2771a, obj);
            c3936dZM2771a.f26138b.executeInsert();
        } finally {
            m2776f(c3936dZM2771a);
        }
    }
}
