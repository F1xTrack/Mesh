package defpackage;

/* renamed from: kr0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5581kr0 extends AbstractC0447Fm0 {
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5581kr0(AbstractC6464pT0 abstractC6464pT0, int i) {
        super(abstractC6464pT0);
        this.e = i;
    }

    @Override // defpackage.AbstractC0447Fm0
    public final String d() {
        switch (this.e) {
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

    public void g(C3414dZ c3414dZ, Object obj) throws Throwable {
        int i;
        C1623Uo1 c1623Uo1 = (C1623Uo1) obj;
        int i2 = 1;
        String str = c1623Uo1.a;
        if (str == null) {
            c3414dZ.V(1);
        } else {
            c3414dZ.d(1, str);
        }
        c3414dZ.E(2, AbstractC5997n12.m(c1623Uo1.b));
        String str2 = c1623Uo1.c;
        if (str2 == null) {
            c3414dZ.V(3);
        } else {
            c3414dZ.d(3, str2);
        }
        String str3 = c1623Uo1.d;
        if (str3 == null) {
            c3414dZ.V(4);
        } else {
            c3414dZ.d(4, str3);
        }
        byte[] bArrC = C8317zC.c(c1623Uo1.e);
        if (bArrC == null) {
            c3414dZ.V(5);
        } else {
            c3414dZ.I(5, bArrC);
        }
        byte[] bArrC2 = C8317zC.c(c1623Uo1.f);
        if (bArrC2 == null) {
            c3414dZ.V(6);
        } else {
            c3414dZ.I(6, bArrC2);
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
        } else {
            c3414dZ.V(20);
            c3414dZ.V(21);
            c3414dZ.V(22);
            c3414dZ.V(23);
            c3414dZ.V(24);
            c3414dZ.V(25);
            c3414dZ.V(26);
            c3414dZ.V(27);
        }
        if (str == null) {
            c3414dZ.V(28);
        } else {
            c3414dZ.d(28, str);
        }
    }
}
