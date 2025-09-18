package p000;

import android.content.ContentValues;
import android.database.SQLException;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* renamed from: Vr0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8440Vr0 extends AbstractC8388Ur0 {

    /* renamed from: d */
    public static final C8440Vr0 f12825d = new C8440Vr0(11, 12, 0);

    /* renamed from: e */
    public static final C8440Vr0 f12826e = new C8440Vr0(12, 13, 1);

    /* renamed from: f */
    public static final C8440Vr0 f12827f = new C8440Vr0(15, 16, 2);

    /* renamed from: g */
    public static final C8440Vr0 f12828g = new C8440Vr0(1, 2, 3);

    /* renamed from: h */
    public static final C8440Vr0 f12829h = new C8440Vr0(3, 4, 4);

    /* renamed from: i */
    public static final C8440Vr0 f12830i = new C8440Vr0(4, 5, 5);

    /* renamed from: j */
    public static final C8440Vr0 f12831j = new C8440Vr0(6, 7, 6);

    /* renamed from: k */
    public static final C8440Vr0 f12832k = new C8440Vr0(7, 8, 7);

    /* renamed from: l */
    public static final C8440Vr0 f12833l = new C8440Vr0(8, 9, 8);

    /* renamed from: c */
    public final /* synthetic */ int f12834c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8440Vr0(int i, int i2, int i3) {
        super(i, i2);
        this.f12834c = i3;
    }

    @Override // p000.AbstractC8388Ur0
    /* renamed from: a */
    public final void mo8194a(C1482XY c1482xy) throws SQLException {
        switch (this.f12834c) {
            case 0:
                c1482xy.m9081w("ALTER TABLE workspec ADD COLUMN `out_of_quota_policy` INTEGER NOT NULL DEFAULT 0");
                return;
            case 1:
                c1482xy.m9081w("UPDATE workspec SET required_network_type = 0 WHERE required_network_type IS NULL ");
                c1482xy.m9081w("UPDATE workspec SET content_uri_triggers = x'' WHERE content_uri_triggers is NULL");
                return;
            case 2:
                c1482xy.m9081w("DELETE FROM SystemIdInfo WHERE work_spec_id IN (SELECT work_spec_id FROM SystemIdInfo LEFT JOIN WorkSpec ON work_spec_id = id WHERE WorkSpec.id IS NULL)");
                c1482xy.m9081w("ALTER TABLE `WorkSpec` ADD COLUMN `generation` INTEGER NOT NULL DEFAULT 0");
                c1482xy.m9081w("CREATE TABLE IF NOT EXISTS `_new_SystemIdInfo` (\n            `work_spec_id` TEXT NOT NULL, \n            `generation` INTEGER NOT NULL DEFAULT 0, \n            `system_id` INTEGER NOT NULL, \n            PRIMARY KEY(`work_spec_id`, `generation`), \n            FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) \n                ON UPDATE CASCADE ON DELETE CASCADE )");
                c1482xy.m9081w("INSERT INTO `_new_SystemIdInfo` (`work_spec_id`,`system_id`) SELECT `work_spec_id`,`system_id` FROM `SystemIdInfo`");
                c1482xy.m9081w("DROP TABLE `SystemIdInfo`");
                c1482xy.m9081w("ALTER TABLE `_new_SystemIdInfo` RENAME TO `SystemIdInfo`");
                return;
            case 3:
                c1482xy.m9081w("\n    CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id`\n    INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`)\n    REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )\n    ");
                c1482xy.m9081w("\n    INSERT INTO SystemIdInfo(work_spec_id, system_id)\n    SELECT work_spec_id, alarm_id AS system_id FROM alarmInfo\n    ");
                c1482xy.m9081w("DROP TABLE IF EXISTS alarmInfo");
                c1482xy.m9081w("\n                INSERT OR IGNORE INTO worktag(tag, work_spec_id)\n                SELECT worker_class_name AS tag, id AS work_spec_id FROM workspec\n                ");
                return;
            case 4:
                c1482xy.m9081w("\n    UPDATE workspec SET schedule_requested_at = 0\n    WHERE state NOT IN (2, 3, 5)\n        AND schedule_requested_at = -1\n        AND interval_duration <> 0\n    ");
                return;
            case 5:
                c1482xy.m9081w("ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1");
                c1482xy.m9081w("ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1");
                return;
            case 6:
                c1482xy.m9081w("\n    CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress`\n    BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`)\n    REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )\n    ");
                return;
            case 7:
                c1482xy.m9081w("\n    CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `workspec`(`period_start_time`)\n    ");
                return;
            case 8:
                c1482xy.m9081w("ALTER TABLE workspec ADD COLUMN `run_in_foreground` INTEGER NOT NULL DEFAULT 0");
                return;
            case 9:
                c1482xy.m9081w("CREATE TABLE IF NOT EXISTS `_new_WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `period_start_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `required_network_type` INTEGER NOT NULL, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
                c1482xy.m9081w("INSERT INTO `_new_WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) SELECT `id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers` FROM `WorkSpec`");
                c1482xy.m9081w("DROP TABLE `WorkSpec`");
                c1482xy.m9081w("ALTER TABLE `_new_WorkSpec` RENAME TO `WorkSpec`");
                c1482xy.m9081w("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
                c1482xy.m9081w("CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `WorkSpec` (`period_start_time`)");
                return;
            default:
                c1482xy.m9081w("CREATE TABLE IF NOT EXISTS `_new_WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `required_network_type` INTEGER NOT NULL, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
                c1482xy.m9081w("INSERT INTO `_new_WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) SELECT `id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers` FROM `WorkSpec`");
                c1482xy.m9081w("DROP TABLE `WorkSpec`");
                c1482xy.m9081w("ALTER TABLE `_new_WorkSpec` RENAME TO `WorkSpec`");
                c1482xy.m9081w("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
                c1482xy.m9081w("CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
                c1482xy.m9081w("UPDATE workspec SET period_count = 1 WHERE last_enqueue_time <> 0 AND interval_duration <> 0");
                ContentValues contentValues = new ContentValues(1);
                contentValues.put("last_enqueue_time", Long.valueOf(System.currentTimeMillis()));
                Object[] objArr = new Object[0];
                c1482xy.getClass();
                if (contentValues.size() == 0) {
                    throw new IllegalArgumentException("Empty values");
                }
                int size = contentValues.size();
                int length = objArr.length + size;
                Object[] objArr2 = new Object[length];
                StringBuilder sb = new StringBuilder("UPDATE ");
                sb.append(C1482XY.f13841d[3]);
                sb.append("WorkSpec SET ");
                int i = 0;
                for (String str : contentValues.keySet()) {
                    sb.append(i > 0 ? StringUtils.COMMA : "");
                    sb.append(str);
                    objArr2[i] = contentValues.get(str);
                    sb.append("=?");
                    i++;
                }
                for (int i2 = size; i2 < length; i2++) {
                    objArr2[i2] = objArr[i2 - size];
                }
                if (!TextUtils.isEmpty("last_enqueue_time = 0 AND interval_duration <> 0 ")) {
                    sb.append(" WHERE last_enqueue_time = 0 AND interval_duration <> 0 ");
                }
                String string = sb.toString();
                O90.m5967e(string, "StringBuilder().apply(builderAction).toString()");
                C3936dZ c3936dZM9079o = c1482xy.m9079o(string);
                int length2 = objArr2.length;
                int i3 = 0;
                while (i3 < length2) {
                    Object obj = objArr2[i3];
                    i3++;
                    if (obj == null) {
                        c3936dZM9079o.mo2032V(i3);
                    } else if (obj instanceof byte[]) {
                        c3936dZM9079o.mo2031I(i3, (byte[]) obj);
                    } else if (obj instanceof Float) {
                        c3936dZM9079o.mo2034h(i3, ((Number) obj).floatValue());
                    } else if (obj instanceof Double) {
                        c3936dZM9079o.mo2034h(i3, ((Number) obj).doubleValue());
                    } else if (obj instanceof Long) {
                        c3936dZM9079o.mo2030E(i3, ((Number) obj).longValue());
                    } else if (obj instanceof Integer) {
                        c3936dZM9079o.mo2030E(i3, ((Number) obj).intValue());
                    } else if (obj instanceof Short) {
                        c3936dZM9079o.mo2030E(i3, ((Number) obj).shortValue());
                    } else if (obj instanceof Byte) {
                        c3936dZM9079o.mo2030E(i3, ((Number) obj).byteValue());
                    } else if (obj instanceof String) {
                        c3936dZM9079o.mo2033d(i3, (String) obj);
                    } else {
                        if (!(obj instanceof Boolean)) {
                            throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i3 + " Supported types: Null, ByteArray, Float, Double, Long, Int, Short, Byte, String");
                        }
                        c3936dZM9079o.mo2030E(i3, ((Boolean) obj).booleanValue() ? 1L : 0L);
                    }
                }
                c3936dZM9079o.f26138b.executeUpdateDelete();
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8440Vr0() {
        super(14, 15);
        this.f12834c = 10;
    }
}
