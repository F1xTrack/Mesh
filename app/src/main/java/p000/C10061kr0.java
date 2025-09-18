package p000;

/* renamed from: kr0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10061kr0 extends AbstractC7598Fm0 {

    /* renamed from: e */
    public final /* synthetic */ int f36727e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C10061kr0(AbstractC10653pT0 abstractC10653pT0, int i) {
        super(abstractC10653pT0);
        this.f36727e = i;
    }

    @Override // p000.AbstractC7598Fm0
    /* renamed from: d */
    public final String mo2774d() {
        switch (this.f36727e) {
            case 0:
                return "DELETE FROM message_table";
            case 1:
                return "DELETE FROM message_table WHERE message = ?";
            case 2:
                return "DELETE FROM SystemIdInfo where work_spec_id=? AND generation=?";
            case 3:
                return "DELETE FROM SystemIdInfo where work_spec_id=?";
            case 4:
                return "DELETE from WorkProgress where work_spec_id=?";
            case 5:
                return "DELETE FROM WorkProgress";
            case 6:
                return "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
            case 7:
                return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
            case 8:
                return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
            case 9:
                return "UPDATE workspec SET generation=generation+1 WHERE id=?";
            case 10:
                return "UPDATE OR ABORT `WorkSpec` SET `id` = ?,`state` = ?,`worker_class_name` = ?,`input_merger_class_name` = ?,`input` = ?,`output` = ?,`initial_delay` = ?,`interval_duration` = ?,`flex_duration` = ?,`run_attempt_count` = ?,`backoff_policy` = ?,`backoff_delay_duration` = ?,`last_enqueue_time` = ?,`minimum_retention_duration` = ?,`schedule_requested_at` = ?,`run_in_foreground` = ?,`out_of_quota_policy` = ?,`period_count` = ?,`generation` = ?,`required_network_type` = ?,`requires_charging` = ?,`requires_device_idle` = ?,`requires_battery_not_low` = ?,`requires_storage_not_low` = ?,`trigger_content_update_delay` = ?,`trigger_max_content_delay` = ?,`content_uri_triggers` = ? WHERE `id` = ?";
            case 11:
                return "DELETE FROM workspec WHERE id=?";
            case 12:
                return "UPDATE workspec SET state=? WHERE id=?";
            case 13:
                return "UPDATE workspec SET period_count=period_count+1 WHERE id=?";
            case 14:
                return "UPDATE workspec SET output=? WHERE id=?";
            case 15:
                return "UPDATE workspec SET last_enqueue_time=? WHERE id=?";
            case 16:
                return "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
            case 17:
                return "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
            default:
                return "DELETE FROM worktag WHERE work_spec_id=?";
        }
    }

    /* renamed from: g */
    public void m22274g(C3936dZ c3936dZ, Object obj) throws Throwable {
        int i;
        C8383Uo1 c8383Uo1 = (C8383Uo1) obj;
        int i2 = 1;
        String str = c8383Uo1.f12134a;
        if (str == null) {
            c3936dZ.mo2032V(1);
        } else {
            c3936dZ.mo2033d(1, str);
        }
        c3936dZ.mo2030E(2, AbstractC10340n12.m23058m(c8383Uo1.f12135b));
        String str2 = c8383Uo1.f12136c;
        if (str2 == null) {
            c3936dZ.mo2032V(3);
        } else {
            c3936dZ.mo2033d(3, str2);
        }
        String str3 = c8383Uo1.f12137d;
        if (str3 == null) {
            c3936dZ.mo2032V(4);
        } else {
            c3936dZ.mo2033d(4, str3);
        }
        byte[] bArrM26327c = C7249zC.m26327c(c8383Uo1.f12138e);
        if (bArrM26327c == null) {
            c3936dZ.mo2032V(5);
        } else {
            c3936dZ.mo2031I(5, bArrM26327c);
        }
        byte[] bArrM26327c2 = C7249zC.m26327c(c8383Uo1.f12139f);
        if (bArrM26327c2 == null) {
            c3936dZ.mo2032V(6);
        } else {
            c3936dZ.mo2031I(6, bArrM26327c2);
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
        } else {
            c3936dZ.mo2032V(20);
            c3936dZ.mo2032V(21);
            c3936dZ.mo2032V(22);
            c3936dZ.mo2032V(23);
            c3936dZ.mo2032V(24);
            c3936dZ.mo2032V(25);
            c3936dZ.mo2032V(26);
            c3936dZ.mo2032V(27);
        }
        if (str == null) {
            c3936dZ.mo2032V(28);
        } else {
            c3936dZ.mo2033d(28, str);
        }
    }
}
