package defpackage;

/* loaded from: classes.dex */
public final class UH extends AbstractC0447Fm0 {
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ UH(AbstractC6464pT0 abstractC6464pT0, int i) {
        super(abstractC6464pT0);
        this.e = i;
    }

    @Override // defpackage.AbstractC0447Fm0
    public final String d() {
        switch (this.e) {
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

    public final void g(C3414dZ c3414dZ, Object obj) throws Throwable {
        int i;
        switch (this.e) {
            case 0:
                QH qh = (QH) obj;
                c3414dZ.d(1, qh.a);
                String str = qh.b;
                if (str == null) {
                    c3414dZ.V(2);
                    return;
                } else {
                    c3414dZ.d(2, str);
                    return;
                }
            case 1:
                C5390jr0 c5390jr0 = (C5390jr0) obj;
                c3414dZ.E(1, c5390jr0.a);
                String str2 = c5390jr0.b;
                if (str2 == null) {
                    c3414dZ.V(2);
                    return;
                } else {
                    c3414dZ.d(2, str2);
                    return;
                }
            case 2:
                BC0 bc0 = (BC0) obj;
                c3414dZ.d(1, bc0.a);
                c3414dZ.E(2, bc0.b.longValue());
                return;
            case 3:
                String str3 = ((S71) obj).a;
                if (str3 == null) {
                    c3414dZ.V(1);
                } else {
                    c3414dZ.d(1, str3);
                }
                c3414dZ.E(2, r12.b);
                c3414dZ.E(3, r12.c);
                return;
            case 4:
                C0922Lo1 c0922Lo1 = (C0922Lo1) obj;
                String str4 = c0922Lo1.a;
                if (str4 == null) {
                    c3414dZ.V(1);
                } else {
                    c3414dZ.d(1, str4);
                }
                c3414dZ.d(2, c0922Lo1.b);
                return;
            case 5:
                C1077No1 c1077No1 = (C1077No1) obj;
                String str5 = c1077No1.a;
                if (str5 == null) {
                    c3414dZ.V(1);
                } else {
                    c3414dZ.d(1, str5);
                }
                byte[] bArrC = C8317zC.c(c1077No1.b);
                if (bArrC == null) {
                    c3414dZ.V(2);
                    return;
                } else {
                    c3414dZ.I(2, bArrC);
                    return;
                }
            case 6:
                C1623Uo1 c1623Uo1 = (C1623Uo1) obj;
                int i2 = 1;
                String str6 = c1623Uo1.a;
                if (str6 == null) {
                    c3414dZ.V(1);
                } else {
                    c3414dZ.d(1, str6);
                }
                c3414dZ.E(2, AbstractC5997n12.m(c1623Uo1.b));
                String str7 = c1623Uo1.c;
                if (str7 == null) {
                    c3414dZ.V(3);
                } else {
                    c3414dZ.d(3, str7);
                }
                String str8 = c1623Uo1.d;
                if (str8 == null) {
                    c3414dZ.V(4);
                } else {
                    c3414dZ.d(4, str8);
                }
                byte[] bArrC2 = C8317zC.c(c1623Uo1.e);
                if (bArrC2 == null) {
                    c3414dZ.V(5);
                } else {
                    c3414dZ.I(5, bArrC2);
                }
                byte[] bArrC3 = C8317zC.c(c1623Uo1.f);
                if (bArrC3 == null) {
                    c3414dZ.V(6);
                } else {
                    c3414dZ.I(6, bArrC3);
                }
                c3414dZ.E(7, c1623Uo1.g);
                c3414dZ.E(8, c1623Uo1.h);
                c3414dZ.E(9, c1623Uo1.i);
                c3414dZ.E(10, c1623Uo1.k);
                int i3 = c1623Uo1.l;
                NX.m(i3, "backoffPolicy");
                int iX = AbstractC8235ym.x(i3);
                if (iX == 0) {
                    i = 0;
                } else {
                    if (iX != 1) {
                        throw new C7074sg();
                    }
                    i = 1;
                }
                c3414dZ.E(11, i);
                c3414dZ.E(12, c1623Uo1.m);
                c3414dZ.E(13, c1623Uo1.n);
                c3414dZ.E(14, c1623Uo1.o);
                c3414dZ.E(15, c1623Uo1.p);
                c3414dZ.E(16, c1623Uo1.q ? 1L : 0L);
                int i4 = c1623Uo1.r;
                NX.m(i4, "policy");
                int iX2 = AbstractC8235ym.x(i4);
                if (iX2 == 0) {
                    i2 = 0;
                } else if (iX2 != 1) {
                    throw new C7074sg();
                }
                c3414dZ.E(17, i2);
                c3414dZ.E(18, c1623Uo1.s);
                c3414dZ.E(19, c1623Uo1.t);
                C4061gy c4061gy = c1623Uo1.j;
                if (c4061gy != null) {
                    c3414dZ.E(20, AbstractC5997n12.k(c4061gy.a));
                    c3414dZ.E(21, c4061gy.b ? 1L : 0L);
                    c3414dZ.E(22, c4061gy.c ? 1L : 0L);
                    c3414dZ.E(23, c4061gy.d ? 1L : 0L);
                    c3414dZ.E(24, c4061gy.e ? 1L : 0L);
                    c3414dZ.E(25, c4061gy.f);
                    c3414dZ.E(26, c4061gy.g);
                    c3414dZ.I(27, AbstractC5997n12.l(c4061gy.h));
                    return;
                }
                c3414dZ.V(20);
                c3414dZ.V(21);
                c3414dZ.V(22);
                c3414dZ.V(23);
                c3414dZ.V(24);
                c3414dZ.V(25);
                c3414dZ.V(26);
                c3414dZ.V(27);
                return;
            default:
                C1779Wo1 c1779Wo1 = (C1779Wo1) obj;
                String str9 = c1779Wo1.a;
                if (str9 == null) {
                    c3414dZ.V(1);
                } else {
                    c3414dZ.d(1, str9);
                }
                String str10 = c1779Wo1.b;
                if (str10 == null) {
                    c3414dZ.V(2);
                    return;
                } else {
                    c3414dZ.d(2, str10);
                    return;
                }
        }
    }

    public final void h(Object obj) {
        C3414dZ c3414dZA = a();
        try {
            g(c3414dZA, obj);
            c3414dZA.b.executeInsert();
        } finally {
            f(c3414dZA);
        }
    }
}
